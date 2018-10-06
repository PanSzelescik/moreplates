package panszelescik.moreplates;

import static panszelescik.moreplates.Reference.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import panszelescik.moreplates.config.Config;
import panszelescik.moreplates.config.ConfigItems;
import panszelescik.moreplates.init.Items;
import panszelescik.moreplates.init.PluginLoader;

@Mod(
		modid = MODID, 
		name = NAME, 
		version = VERSION, 
		dependencies = DEPENDENCIES, 
		guiFactory = GUI_FACTORY, 
		acceptedMinecraftVersions = ACCEPTED_MINECRAFT_VERSIONS, 
		updateJSON = UPDATE_JSON
	)
public class MorePlates {
	
	public static final CreativeTabs TAB = new CreativeTabs(MODID) {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(Items.hammer);
		}
	};
	
	@Mod.Instance(MODID)
	public static MorePlates instance;
	public Config config;
	public ConfigItems config2;
	public static final Logger logger = LogManager.getFormatterLogger(MODID);
	
	@Mod.EventHandler
	public void construction(FMLConstructionEvent event) {
		logger.info("Started Construction.");
		config = new Config();
		config2 = new ConfigItems();
		saveConfig();
		logger.info("Completed Construction.");
	}
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger.info("Started PreInitialization.");
		Items.preInit();
		PluginLoader.preInit();
		saveConfig();
		logger.info("Completed PreInitialization.");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		logger.info("Started Initialization.");
		saveConfig();
		logger.info("Completed Initialization.");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		logger.info("Started PostInitialization.");
		PluginLoader.postInit();
		saveConfig();
		logger.info("Completed PostInitialization.");
	}
	
	private void saveConfig() {
		if (Config.cfg.hasChanged())
			Config.cfg.save();
		if (ConfigItems.cfg.hasChanged())
			ConfigItems.cfg.save();
	}
}