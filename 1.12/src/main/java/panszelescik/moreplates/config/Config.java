package panszelescik.moreplates.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.IConfigElement;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.Reference;

public class Config {
	
	private Configuration cfg;
	
	//Categories
	private static final String CATEGORY_GENERAL = "general";
	private static final String CATEGORY_PLUGINS = "plugins";
	
	//Booleans
	public static boolean loadAppliedEnergistics2 = true;
	public static boolean loadBotania = true;
	public static boolean loadCalculator = true;
	public static boolean loadDraconicEvolution = true;
	public static boolean loadEnderIO = true;
	public static boolean loadExtraUtilities = true;
	public static boolean loadImmersiveEngineering = true;
	public static boolean loadMekanism = true;
	public static boolean loadMysticalAgradditions = true;
	public static boolean loadMysticalAgriculture = true;
	public static boolean loadPlusTiC = true;
	public static boolean loadPneumaticCraft = true;
	public static boolean loadProjectE = true;
	public static boolean loadProjectRed = true;
	public static boolean loadRefinedStorage = true;
	public static boolean loadThaumcraft = true;
	public static boolean loadThermalExpansion = true;
	public static boolean loadTinkersConstruct = true;
	public static boolean loadTwilightForest = true;
	
	//Ints
	public static int durabilityHammer = 150;
	private static int minDurabilityHammer = 50;
	private static int maxDurabilityHammer = 1000;
	
	public static int energyCompactor = 4000;
	private static int minEnergyCompactor = 1;
	private static int maxEnergyCompactor = 60000;
	
	public static int energyMetalPress = 2400;
	private static int minEnergyMetalPress = 1;
	private static int maxEnergyMetalPress = 16000;
	
	//Comments
	private static final String DURABILITYHAMMER_COMMENT = "Durability of Hammer.";
	private static final String ENERGYCOMPACTOR_COMMENT = "Energy used to make Gears and Plates in Compactor from Thermal Expansion when support is loaded.";
	private static final String ENERGYMETALPRESS_COMMENT = "Energy used to make Gears and Plates in Metal Press from Immersive Engineering when support is loaded.";
	private static final String LOADIMMERSIVEENGINEERING_COMMENT = "Enable this to add recipes for some Gears and Plates to Metal Press (not all, because Immersive Engineering adds).";
	private static final String LOADPLUGIN_COMMENT = "Enable this to load this plugin when mod is loaded.";
	private static final String LOADTHERMALEXPANSION_COMMENT = "Enable this to add recipes for some Gears and Plates to Compactor (not all, because Thermal Expansion adds).";
	
	public Config(File configFile) {
		cfg = new Configuration(configFile);
		MinecraftForge.EVENT_BUS.register(this);
		loadConfig();
	}
	
	public Configuration getConfig() {
		return cfg;
	}
	
	@SubscribeEvent
	public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.getModID().equalsIgnoreCase(Reference.MODID))
			loadConfig();
	}
	
	public void loadConfig() {
		//Plugins
		cfg.addCustomCategoryComment(CATEGORY_PLUGINS, "Loading plugins.");
		cfg.setCategoryRequiresMcRestart(CATEGORY_PLUGINS, true);
		
		loadAppliedEnergistics2 = cfg.getBoolean("loadAppliedEnergistics2", CATEGORY_PLUGINS, loadAppliedEnergistics2, LOADPLUGIN_COMMENT);
		loadBotania = cfg.getBoolean("loadBotania", CATEGORY_PLUGINS, loadBotania, LOADPLUGIN_COMMENT);
		loadCalculator = cfg.getBoolean("loadCalculator", CATEGORY_PLUGINS, loadCalculator, LOADPLUGIN_COMMENT);			
		loadDraconicEvolution = cfg.getBoolean("loadDraconicEvolution", CATEGORY_PLUGINS, loadDraconicEvolution, LOADPLUGIN_COMMENT);
		loadEnderIO = cfg.getBoolean("loadEnderIO", CATEGORY_PLUGINS, loadEnderIO, LOADPLUGIN_COMMENT);
		loadExtraUtilities = cfg.getBoolean("loadExtraUtilities", CATEGORY_PLUGINS, loadExtraUtilities, LOADPLUGIN_COMMENT);
		loadImmersiveEngineering = cfg.getBoolean("loadImmersiveEngineering", CATEGORY_PLUGINS, loadImmersiveEngineering, LOADIMMERSIVEENGINEERING_COMMENT);
		loadMekanism = cfg.getBoolean("loadMekanism", CATEGORY_PLUGINS, loadMekanism, LOADPLUGIN_COMMENT);
		loadMysticalAgradditions = cfg.getBoolean("loadMysticalAgradditions", CATEGORY_PLUGINS, loadMysticalAgradditions, LOADPLUGIN_COMMENT);
		loadMysticalAgriculture = cfg.getBoolean("loadMysticalAgriculture", CATEGORY_PLUGINS, loadMysticalAgriculture, LOADPLUGIN_COMMENT);
		loadPlusTiC = cfg.getBoolean("loadPlusTiC", CATEGORY_PLUGINS, loadPlusTiC, LOADPLUGIN_COMMENT);
		loadPneumaticCraft = cfg.getBoolean("loadPneumaticCraft", CATEGORY_PLUGINS, loadPneumaticCraft, LOADPLUGIN_COMMENT);
		loadProjectE = cfg.getBoolean("loadProjectE", CATEGORY_PLUGINS, loadProjectE, LOADPLUGIN_COMMENT);
		loadProjectRed = cfg.getBoolean("loadProjectRed", CATEGORY_PLUGINS, loadProjectRed, LOADPLUGIN_COMMENT);
		loadRefinedStorage = cfg.getBoolean("loadRefinedStorage", CATEGORY_PLUGINS, loadRefinedStorage, LOADPLUGIN_COMMENT);
		loadThaumcraft = cfg.getBoolean("loadThaumcraft", CATEGORY_PLUGINS, loadThaumcraft, LOADPLUGIN_COMMENT);
		loadThermalExpansion = cfg.getBoolean("loadThermalExpansion", CATEGORY_PLUGINS, loadThermalExpansion, LOADTHERMALEXPANSION_COMMENT);
		loadTinkersConstruct = cfg.getBoolean("loadTinkersConstruct", CATEGORY_PLUGINS, loadTinkersConstruct, LOADPLUGIN_COMMENT);
		loadTwilightForest = cfg.getBoolean("loadTwilightForest", CATEGORY_PLUGINS, loadTwilightForest, LOADPLUGIN_COMMENT);
		
		energyMetalPress = cfg.getInt("energyMetalPress", CATEGORY_PLUGINS, energyMetalPress, minEnergyMetalPress, maxEnergyMetalPress, ENERGYMETALPRESS_COMMENT);
		energyCompactor = cfg.getInt("energyCompactor", CATEGORY_PLUGINS, energyCompactor, minEnergyCompactor, maxEnergyCompactor, ENERGYCOMPACTOR_COMMENT);
		
		//General
		cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General settings.");
		cfg.setCategoryRequiresMcRestart(CATEGORY_GENERAL, true);
		
		durabilityHammer = cfg.getInt("durabilityHammer", CATEGORY_GENERAL, durabilityHammer, minDurabilityHammer, maxDurabilityHammer, DURABILITYHAMMER_COMMENT);
		
		if (cfg.hasChanged())
			cfg.save();
	}
	
	@SuppressWarnings("unchecked")
	public List<IConfigElement> getConfigElements() {
		List<IConfigElement> list = new ArrayList<>();
		
		list.add(new ConfigElement(cfg.getCategory(CATEGORY_GENERAL)));
		list.add(new ConfigElement(cfg.getCategory(CATEGORY_PLUGINS)));
		
		return list;
	}
}