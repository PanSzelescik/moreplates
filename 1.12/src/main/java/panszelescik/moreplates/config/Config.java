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

import static panszelescik.moreplates.Reference.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class Config {
	
	private Configuration cfg;
	
	//Categories
	private static final String CATEGORY_GENERAL = "General";
	private static final String CATEGORY_PLUGINS = "Plugins";
	
	private static final String CATEGORY_ACTUALLY = ACTUALLY_MODNAME;
	private static final String CATEGORY_BOTANIA = BOTANIA_MODNAME;
	private static final String CATEGORY_IMMERSIVE = IMMERSIVE_MODNAME;
	private static final String CATEGORY_IC2 = IC2_MODNAME;
	private static final String CATEGORY_TECHREBORN = TECHREBORN_MODNAME;
	private static final String CATEGORY_THERMAL = THERMAL_MODNAME;
	
	//Booleans
	public static boolean centerMetals = true;
	
	public static boolean loadActuallyAdditions = true;
	public static boolean loadActuallyAdditionsRecipes = true;
	public static boolean loadAppliedEnergistics2 = true;
	public static boolean loadAvaritia = true;
	public static boolean loadBotania = true;
	public static boolean loadBotaniaRecipes = true;
	public static boolean loadCalculator = true;
	public static boolean loadDraconicEvolution = true;
	public static boolean loadEnderIO = true;
	public static boolean loadExtraUtilities = true;
	public static boolean loadImmersiveEngineeringRecipes = true;
	public static boolean loadIndustrialCraft2Recipes = true;
	public static boolean loadMekanism = true;
	public static boolean loadMysticalAgradditions = true;
	public static boolean loadMysticalAgriculture = true;
	public static boolean loadPlusTiC = true;
	public static boolean loadPneumaticCraft = true;
	public static boolean loadProjectE = true;
	public static boolean loadProjectRed = true;
	public static boolean loadRefinedStorage = true;
	public static boolean loadTechRebornRecipes = true;
	public static boolean loadThaumcraft = true;
	public static boolean loadThermalExpansionRecipes = true;
	public static boolean loadTinkersConstruct = true;
	public static boolean loadTwilightForest = true;
	public static boolean loadVanilla = true;
	
	public static boolean enableIC2Hammer = true;
	public static boolean enableIEHammer = true;
	
	//Ints
	public static int durabilityHammer = 150;
	private static int minDurabilityHammer = 50;
	private static int maxDurabilityHammer = 1000;
	
	public static int energyCompactor = 4000;
	private static int minEnergyCompactor = 1;
	private static int maxEnergyCompactor = 60000;
	
	public static int energyCompressor = 4;
	private static int minEnergyCompressor = 1;
	private static int maxEnergyCompressor = 2048;
	
	public static int energyEmpowerer = 5000;
	private static int minEnergyEmpowerer = 1;
	private static int maxEnergyEmpowerer = 1000000;
	
	public static int energyInductionSmelter = 2000;
	private static int minEnergyInductionSmelter = 1;
	private static int maxEnergyInductionSmelter = 60000;
	
	public static int energyMetalPress = 2400;
	private static int minEnergyMetalPress = 1;
	private static int maxEnergyMetalPress = 16000;
	
	public static int energyDiamantineReconstructor = 60;
	public static int energyEmeradicReconstructor = 100;
	public static int energyEnoriReconstructor = 80;
	public static int energyPalisReconstructor = 40;
	public static int energyRestoniaReconstructor = 40;
	public static int energyVoidReconstructor = 60;
	private static int minEnergyReconstructor = 1;
	private static int maxEnergyReconstructor = 100000;
	
	
	public static int manasteelMana = 3000;
	private static int minManasteelMana = 1;
	private static int maxManasteelMana = 100000;
	
	
	public static int timeCompressor = 300;
	private static int minTimeCompressor = 10;
	private static int maxTimeCompressor = 600;
	
	public static int timeEmpowerer = 50;
	private static int minTimeEmpowerer = 1;
	private static int maxTimeEmpowerer = 600;
	
	//Comments
	private static final String CENTER_IN_GEAR_COMMENT = "Enable this to add option to make Gears with Bronze, Copper, Iron and Tin";
	private static final String DURABILITYHAMMER_COMMENT = "Durability of Hammer";
	private static final String ENERGYCOMPACTOR_COMMENT = "Energy used to make Gears and Plates in Compactor when support is loaded";
	private static final String ENERGYCOMPRESSOR_COMMENT = "Energy used to make some Plates in Compressor when support is loaded (in EU/t)";
	private static final String ENERGYEMPOWERER_COMMENT = "Energy per Display Stand used to make Empowered Gears and Plates in Empowerer when support is loaded";
	private static final String ENERGYINDUCTIONSMELTER_COMMENT = "Energy used to make ingots from Gears and Plates when support is loaded";
	private static final String ENERGYMETALPRESS_COMMENT = "Energy used to make Gears and Plates in Metal Press when support is loaded";
	private static final String ENERGYRECONSTRUCTOR_1_COMMENT = "Energy used to make ";
	private static final String ENERGYRECONSTRUCTOR_2_COMMENT = " Gear and Plate in Atomic Reconstructor when support is loaded";
	private static final String IC2_HAMMER_COMMENT = "Enable this to add option to make all Plates with Forge Hammer";
	private static final String IE_HAMMER_COMMENT = "Enable this to add option to make all Plates with Engineer's Hammer";
	private static final String LOADACTUALLY_COMMENT = "Enable this to add recipes for Non-Empowered Gears and Plates to Atomic Reconstructor and Empowered Gears and Plates to Empowerer";
	private static final String LOADBOTANIA_COMMENT = "Enable this to add recipes for Manasteel and Elementium Gears and Plates in Mana Pool and Elven Trade";
	private static final String LOADIMMERSIVE_COMMENT = "Enable this to add recipes for some Gears and Plates to Metal Press (not all, because Immersive Engineering adds)";
	private static final String LOADIC2_COMMENT = "Enable this to add recipes for all Plates to Block Cutting Machine and Metal Former";
	private static final String LOADPLUGIN_COMMENT = "Enable this to load Gears and Plates from this mod when is loaded";
	private static final String LOADTECHREBORN_COMMENT = "Enable this to add recipes for some Plates to Compressor (not all, because Tech Reborn adds)";
	private static final String LOADTHERMAL_COMMENT = "Enable this to add recipes for some Gears and Plates to Compactor (not all, because Thermal Expansion adds) and for theirs ingredients in Induction Smelter";
	private static final String MANASTEELMANA_COMMENT = "Amount of mana used to make Manasteel Gear and Plate";
	private static final String TIMECOMPRESSOR_COMMENT = "Time in ticks to craft some Plates in Compressor when support is loaded";
	private static final String TIMEEMPOWERER_COMMENT = "Time in seconds to craft Empowered Gears and Plates in Empowerer when support is loaded";
	
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
		if (event.getModID().equalsIgnoreCase(MODID))
			loadConfig();
	}
	
	public void loadConfig() {
		{	//Plugins
			String category = CATEGORY_PLUGINS;
			String comment = LOADPLUGIN_COMMENT;
			cfg.addCustomCategoryComment(category, "Loading plugins settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			loadActuallyAdditions = cfg.getBoolean("loadActuallyAdditions", category, loadActuallyAdditions, comment);
			loadActuallyAdditionsRecipes = cfg.getBoolean("loadActuallyAdditionsRecipes", category, loadActuallyAdditionsRecipes, LOADACTUALLY_COMMENT);
			loadAppliedEnergistics2 = cfg.getBoolean("loadAppliedEnergistics2", category, loadAppliedEnergistics2, comment);
			loadAvaritia = cfg.getBoolean("loadAvaritia", category, loadAvaritia, comment);
			loadBotania = cfg.getBoolean("loadBotania", category, loadBotania, comment);
			loadBotaniaRecipes = cfg.getBoolean("loadBotaniaRecipes", category, loadBotaniaRecipes, LOADBOTANIA_COMMENT);
			loadCalculator = cfg.getBoolean("loadCalculator", category, loadCalculator, comment);			
			loadDraconicEvolution = cfg.getBoolean("loadDraconicEvolution", category, loadDraconicEvolution, comment);
			loadEnderIO = cfg.getBoolean("loadEnderIO", category, loadEnderIO, comment);
			loadExtraUtilities = cfg.getBoolean("loadExtraUtilities", category, loadExtraUtilities, comment);
			loadImmersiveEngineeringRecipes = cfg.getBoolean("loadImmersiveEngineeringRecipes", category, loadImmersiveEngineeringRecipes, LOADIMMERSIVE_COMMENT);
			loadIndustrialCraft2Recipes = cfg.getBoolean("loadIndustrialCraft2Recipes", category, loadIndustrialCraft2Recipes, LOADIC2_COMMENT);
			loadMekanism = cfg.getBoolean("loadMekanism", category, loadMekanism, comment);
			loadMysticalAgradditions = cfg.getBoolean("loadMysticalAgradditions", category, loadMysticalAgradditions, comment);
			loadMysticalAgriculture = cfg.getBoolean("loadMysticalAgriculture", category, loadMysticalAgriculture, comment);
			loadPlusTiC = cfg.getBoolean("loadPlusTiC", category, loadPlusTiC, comment);
			loadPneumaticCraft = cfg.getBoolean("loadPneumaticCraft", category, loadPneumaticCraft, comment);
			loadProjectE = cfg.getBoolean("loadProjectE", category, loadProjectE, comment);
			loadProjectRed = cfg.getBoolean("loadProjectRed", category, loadProjectRed, comment);
			loadRefinedStorage = cfg.getBoolean("loadRefinedStorage", category, loadRefinedStorage, comment);
			loadTechRebornRecipes = cfg.getBoolean("loadTechRebornRecipes", category, loadTechRebornRecipes, LOADTECHREBORN_COMMENT);
			loadThaumcraft = cfg.getBoolean("loadThaumcraft", category, loadThaumcraft, comment);
			loadThermalExpansionRecipes = cfg.getBoolean("loadThermalExpansionRecipes", category, loadThermalExpansionRecipes, LOADTHERMAL_COMMENT);
			loadTinkersConstruct = cfg.getBoolean("loadTinkersConstruct", category, loadTinkersConstruct, comment);
			loadTwilightForest = cfg.getBoolean("loadTwilightForest", category, loadTwilightForest, comment);
			loadVanilla = cfg.getBoolean("loadVanilla", category, loadVanilla, comment);
		}
		
		{	//Actually Additions Recipes
			String category = CATEGORY_ACTUALLY;
			cfg.addCustomCategoryComment(category, "Actually Additions recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			energyEmpowerer = cfg.getInt("energyEmpowerer", category, energyEmpowerer, minEnergyEmpowerer, maxEnergyEmpowerer, ENERGYEMPOWERER_COMMENT);
			timeEmpowerer = cfg.getInt("timeEmpowerer", category, timeEmpowerer, minTimeEmpowerer, maxTimeEmpowerer, TIMEEMPOWERER_COMMENT);
			
			energyDiamantineReconstructor = cfg.getInt("energyDiamantineReconstructor", category, energyDiamantineReconstructor, minEnergyReconstructor, maxEnergyReconstructor, ENERGYRECONSTRUCTOR_1_COMMENT + "Diamatine" + ENERGYRECONSTRUCTOR_2_COMMENT);
			energyEmeradicReconstructor = cfg.getInt("energyEmeradicReconstructor", category, energyEmeradicReconstructor, minEnergyReconstructor, maxEnergyReconstructor, ENERGYRECONSTRUCTOR_1_COMMENT + "Emeradic" + ENERGYRECONSTRUCTOR_2_COMMENT );
			energyEnoriReconstructor = cfg.getInt("energyEnoriReconstructor", category, energyEnoriReconstructor, minEnergyReconstructor, maxEnergyReconstructor, ENERGYRECONSTRUCTOR_1_COMMENT + "Enori" + ENERGYRECONSTRUCTOR_2_COMMENT);
			energyPalisReconstructor = cfg.getInt("energyPalisReconstructor", category, energyPalisReconstructor, minEnergyReconstructor, maxEnergyReconstructor, ENERGYRECONSTRUCTOR_1_COMMENT + "Palis" + ENERGYRECONSTRUCTOR_2_COMMENT);
			energyRestoniaReconstructor = cfg.getInt("energyRestoniaReconstructor", category, energyRestoniaReconstructor, minEnergyReconstructor, maxEnergyReconstructor, ENERGYRECONSTRUCTOR_1_COMMENT + "Restonia" + ENERGYRECONSTRUCTOR_2_COMMENT);
			energyVoidReconstructor = cfg.getInt("energyVoidReconstructor", category, energyVoidReconstructor, minEnergyReconstructor, maxEnergyReconstructor, ENERGYRECONSTRUCTOR_1_COMMENT + "Void" + ENERGYRECONSTRUCTOR_2_COMMENT);
		}
		
		{	//Botania
			String category = CATEGORY_BOTANIA;
			cfg.addCustomCategoryComment(category, "Botania recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			manasteelMana = cfg.getInt("manasteelMana", category, manasteelMana, minManasteelMana, maxManasteelMana, MANASTEELMANA_COMMENT);
		}
		
		{	//Immersive Engineering Recipes
			String category = CATEGORY_IMMERSIVE;
			cfg.addCustomCategoryComment(category, "Immersive Engineering recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			enableIEHammer = cfg.getBoolean("enableIEHammer", category, enableIEHammer, IE_HAMMER_COMMENT);
			energyMetalPress = cfg.getInt("energyMetalPress", category, energyMetalPress, minEnergyMetalPress, maxEnergyMetalPress, ENERGYMETALPRESS_COMMENT);
		}
		
		{	//Industrial Craft 2 Recipes
			String category = CATEGORY_IC2;
			cfg.addCustomCategoryComment(category, "Industrial Craft 2 recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			enableIC2Hammer = cfg.getBoolean("enableIC2Hammer", category, enableIC2Hammer, IC2_HAMMER_COMMENT);
		}
		
		{	//Tech Reborn Recipes
			String category = CATEGORY_TECHREBORN;
			cfg.addCustomCategoryComment(category, "Tech Reborn recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			energyCompressor = cfg.getInt("energyCompressor", category, energyCompressor, minEnergyCompressor, maxEnergyCompressor, ENERGYCOMPRESSOR_COMMENT);
			timeCompressor = cfg.getInt("timeCompressor", category, timeCompressor, minTimeCompressor, maxTimeCompressor, TIMECOMPRESSOR_COMMENT);
		}
		
		{	//Thermal Expansion Recipes
			String category = CATEGORY_THERMAL;
			cfg.addCustomCategoryComment(category, "Thermal Expansion recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			energyCompactor = cfg.getInt("energyCompactor", category, energyCompactor, minEnergyCompactor, maxEnergyCompactor, ENERGYCOMPACTOR_COMMENT);
			energyInductionSmelter = cfg.getInt("energyInductionSmelter", category, energyInductionSmelter, minEnergyInductionSmelter, maxEnergyInductionSmelter, ENERGYINDUCTIONSMELTER_COMMENT);
		}
		
		{	//General
			String category = CATEGORY_GENERAL;
			cfg.addCustomCategoryComment(category, "General settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			centerMetals = cfg.getBoolean("centerMetals", category, centerMetals, CENTER_IN_GEAR_COMMENT);
			durabilityHammer = cfg.getInt("durabilityHammer", category, durabilityHammer, minDurabilityHammer, maxDurabilityHammer, DURABILITYHAMMER_COMMENT);
		}
		
		if (cfg.hasChanged())
			cfg.save();
	}
	
	@SuppressWarnings("unchecked")
	public List<IConfigElement> getConfigElements() {
		List<IConfigElement> list = new ArrayList<>();
		
		list.add(new ConfigElement(cfg.getCategory(CATEGORY_PLUGINS)));
		list.add(new ConfigElement(cfg.getCategory(CATEGORY_GENERAL)));
		list.add(new ConfigElement(cfg.getCategory(CATEGORY_ACTUALLY)));
		list.add(new ConfigElement(cfg.getCategory(CATEGORY_BOTANIA)));
		list.add(new ConfigElement(cfg.getCategory(CATEGORY_IMMERSIVE)));
		list.add(new ConfigElement(cfg.getCategory(CATEGORY_IC2)));
		list.add(new ConfigElement(cfg.getCategory(CATEGORY_TECHREBORN)));
		list.add(new ConfigElement(cfg.getCategory(CATEGORY_THERMAL)));
		
		return list;
	}
}