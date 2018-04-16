package panszelescik.moreplates.config;

import org.apache.logging.log4j.Level;

import net.minecraftforge.common.config.Configuration;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.proxy.CommonProxy;

public class Config {
	
	//Categories
	private static final String CATEGORY_PLUGIN = "plugins";
	
	//Booleans
	public static boolean loadAppliedEnergistics2 = true;
	public static boolean loadBotania = true;
	public static boolean loadDraconicEvolution = true;
	public static boolean loadEnderIO = true;
	public static boolean loadExtraUtilities = true;
	public static boolean loadMekanism = true;
	public static boolean loadMysticalAgradditions = true;
	public static boolean loadMysticalAgriculture = true;
	public static boolean loadProjectRed = true;
	public static boolean loadRefinedStorage = true;
	public static boolean loadTinkersConstruct = true;
	
	//Tooltips
	private static final String LOAD_PLUGIN_TOOLTIP = "Set to false if you don't load this plugin when mod is loaded.";
	
	public static void readConfig() {
		Configuration cfg = CommonProxy.config;
		try {
			MorePlates.logger.info("Loading config file...");
			cfg.load();
			initPluginConfig(cfg);
		} catch (Exception e1) {
			MorePlates.logger.log(Level.ERROR, "Problem loading config file!", e1);
		} finally {
			if (cfg.hasChanged()) {
				cfg.save();
			}
		}
	}
	
	private static void initPluginConfig(Configuration cfg) {
		cfg.addCustomCategoryComment(CATEGORY_PLUGIN, "Loading plugins");
		cfg.setCategoryRequiresMcRestart(CATEGORY_PLUGIN, true);
		loadAppliedEnergistics2 =	cfg.getBoolean("loadAppliedEnergistics2",	CATEGORY_PLUGIN, loadAppliedEnergistics2,	LOAD_PLUGIN_TOOLTIP);
		loadBotania =				cfg.getBoolean("loadBotania",				CATEGORY_PLUGIN, loadBotania,				LOAD_PLUGIN_TOOLTIP);
		loadDraconicEvolution =		cfg.getBoolean("loadDraconicEvolution",		CATEGORY_PLUGIN, loadDraconicEvolution,		LOAD_PLUGIN_TOOLTIP);
		loadEnderIO =				cfg.getBoolean("loadEnderIO",				CATEGORY_PLUGIN, loadEnderIO,				LOAD_PLUGIN_TOOLTIP);
		loadExtraUtilities =		cfg.getBoolean("loadExtraUtilities",		CATEGORY_PLUGIN, loadExtraUtilities,		LOAD_PLUGIN_TOOLTIP);
		loadMekanism =				cfg.getBoolean("loadMekanism",				CATEGORY_PLUGIN, loadMekanism,				LOAD_PLUGIN_TOOLTIP);
		loadMysticalAgradditions =	cfg.getBoolean("loadMysticalAgradditions",	CATEGORY_PLUGIN, loadMysticalAgradditions,	LOAD_PLUGIN_TOOLTIP);
		loadMysticalAgriculture =	cfg.getBoolean("loadMysticalAgriculture",	CATEGORY_PLUGIN, loadMysticalAgriculture,	LOAD_PLUGIN_TOOLTIP);
		loadProjectRed =			cfg.getBoolean("loadProjectRed",			CATEGORY_PLUGIN, loadProjectRed,			LOAD_PLUGIN_TOOLTIP);
		loadRefinedStorage =		cfg.getBoolean("loadRefinedStorage",		CATEGORY_PLUGIN, loadRefinedStorage,		LOAD_PLUGIN_TOOLTIP);
		loadTinkersConstruct =		cfg.getBoolean("loadTinkersConstruct",		CATEGORY_PLUGIN, loadTinkersConstruct,		LOAD_PLUGIN_TOOLTIP);
	}
	
}