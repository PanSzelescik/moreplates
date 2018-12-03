package panszelescik.moreplates;

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

@Mod(modid = MorePlates.MODID, name = MorePlates.NAME, version = MorePlates.VERSION, dependencies = MorePlates.DEPENDENCIES, guiFactory = MorePlates.GUI_FACTORY, acceptedMinecraftVersions = MorePlates.ACCEPTED_MINECRAFT_VERSIONS, updateJSON = MorePlates.UPDATE_JSON)
public class MorePlates {
	
	public static final String
		MODID = "moreplates",
		NAME = "More Plates",
		VERSION = "@version@",
		UPDATE_JSON = "https://raw.githubusercontent.com/PanSzelescik/moreplates/master/update.json",
		ACCEPTED_MINECRAFT_VERSIONS = "[1.12.2,1.13)",
		GUI_FACTORY = "panszelescik.moreplates.config.ModGuiFactory";
	
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
		if (Config.getCfg().hasChanged())
			Config.getCfg().save();
		if (ConfigItems.getCfg().hasChanged())
			ConfigItems.getCfg().save();
	}
	
	public static final String DEPENDENCIES = 
			  "required-after:morelibs@[1.0.8,);"
			+ "after:actuallyadditions@[1.12.2-r136,);"
			+ "after:appliedenergistics2;"
			+ "after:avaritia;"
			+ "after:botania;"
			+ "after:calculator;"
			+ "after:draconicevolution;"
			+ "after:enderio@[5.0.36,);"
			+ "after:extrautils2;"
			+ "after:immersiveengineering;"
			+ "after:ic2;"
			+ "after:mekanism;"
			+ "after:mysticalagradditions;"
			+ "after:mysticalagriculture;"
			+ "after:plustic;"
			+ "after:pneumaticcraft;"
			+ "after:projecte;"
			+ "after:projectred-core;"
			+ "after:refinedstorage;"
			+ "after:soulshardstow;"
			+ "after:techreborn;"
			+ "after:thaumcraft;"
			+ "after:thermalexpansion;"
			+ "after:tconstruct;"
			+ "after:twilightforest";
}