package panszelescik.moreplates;

import static panszelescik.moreplates.Reference.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
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
	
	@Instance(MODID)
	public static MorePlates instance;
	public Config config;
	public ConfigItems config2;
	public static final Logger logger = LogManager.getFormatterLogger(MODID);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		logger.info("Started PreInitialization.");
		config = new Config();
		config2 = new ConfigItems();
		Items.preInit();
		PluginLoader.preInit();
		if (Config.cfg.hasChanged())
			Config.cfg.save();
		if (ConfigItems.cfg.hasChanged())
			ConfigItems.cfg.save();
		logger.info("Completed PreInitialization.");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		logger.info("Started PostInitialization.");
		PluginLoader.postInit();
		logger.info("Completed PostInitialization.");
	}
}