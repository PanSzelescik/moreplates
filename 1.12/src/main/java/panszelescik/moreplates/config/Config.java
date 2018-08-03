package panszelescik.moreplates.config;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
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
	
	private static final List <String> CATEGORIES = Arrays.asList(CATEGORY_GENERAL, CATEGORY_PLUGINS, CATEGORY_ACTUALLY, CATEGORY_BOTANIA, CATEGORY_IMMERSIVE, CATEGORY_IC2, CATEGORY_TECHREBORN, CATEGORY_THERMAL);
	
	//Booleans
	public static boolean centerMetals = true;
	
	public static boolean ActuallyAdditions = true;
	public static boolean ActuallyAdditionsRecipes = true;
	public static boolean AppliedEnergistics2 = true;
	public static boolean Avaritia = true;
	public static boolean Botania = true;
	public static boolean BotaniaRecipes = true;
	public static boolean Calculator = true;
	public static boolean DraconicEvolution = true;
	public static boolean EnderIO = true;
	public static boolean EnderIOEndergy = true;
	public static boolean ExtraUtilities = true;
	public static boolean ImmersiveEngineeringRecipes = true;
	public static boolean IndustrialCraft2Recipes = true;
	public static boolean Mekanism = true;
	public static boolean Minecraft = true;
	public static boolean MysticalAgradditions = true;
	public static boolean MysticalAgriculture = true;
	public static boolean PlusTiC = true;
	public static boolean PneumaticCraft = true;
	public static boolean ProjectE = true;
	public static boolean ProjectRed = true;
	public static boolean RefinedStorage = true;
	public static boolean TechRebornRecipes = true;
	public static boolean Thaumcraft = true;
	public static boolean ThermalExpansionRecipes = true;
	public static boolean TinkersConstruct = true;
	public static boolean TwilightForest = true;
	
	public static boolean enableIC2Hammer = true;
	public static boolean enableIEHammer = true;
	
	//Ints
	public static int durabilityHammer = 150;
	public static int energyCompactor = 4000;
	public static int energyCompressor = 4;
	public static int energyEmpowerer = 5000;
	public static int energyInductionSmelter = 2000;
	public static int energyMetalPress = 2400;
	public static int energyDiamantineReconstructor = 60;
	public static int energyEmeradicReconstructor = 100;
	public static int energyEnoriReconstructor = 80;
	public static int energyPalisReconstructor = 40;
	public static int energyRestoniaReconstructor = 40;
	public static int energyVoidReconstructor = 60;
	public static int manasteelMana = 3000;
	public static int timeCompressor = 300;
	public static int timeEmpowerer = 50;
	
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
			
			ActuallyAdditions = getBoolean("Actually Additions", category, ActuallyAdditions, comment);
			ActuallyAdditionsRecipes = getBoolean("Actually Additions recipes", category, ActuallyAdditionsRecipes, LOADACTUALLY_COMMENT);
			AppliedEnergistics2 = getBoolean("Applied Energistics 2", category, AppliedEnergistics2, comment);
			Avaritia = getBoolean("Avaritia", category, Avaritia, comment);
			Botania = getBoolean("Botania", category, Botania, comment);
			BotaniaRecipes = getBoolean("Botania recipes", category, BotaniaRecipes, LOADBOTANIA_COMMENT);
			Calculator = getBoolean("Calculator", category, Calculator, comment);			
			DraconicEvolution = getBoolean("Draconic Evolution", category, DraconicEvolution, comment);
			EnderIO = getBoolean("Ender IO", category, EnderIO, comment);
			EnderIOEndergy = getBoolean("Ender IO Endergy", category, EnderIOEndergy, comment);
			ExtraUtilities = getBoolean("Extra Utilities", category, ExtraUtilities, comment);
			ImmersiveEngineeringRecipes = getBoolean("Immersive Engineering recipes", category, ImmersiveEngineeringRecipes, LOADIMMERSIVE_COMMENT);
			IndustrialCraft2Recipes = getBoolean("Industrial Craft 2 recipes", category, IndustrialCraft2Recipes, LOADIC2_COMMENT);
			Mekanism = getBoolean("Mekanism", category, Mekanism, comment);
			Minecraft = getBoolean("Minecraft", category, Minecraft, comment);
			MysticalAgradditions = getBoolean("Mystical Agradditions", category, MysticalAgradditions, comment);
			MysticalAgriculture = getBoolean("Mystical Agriculture", category, MysticalAgriculture, comment);
			PlusTiC = getBoolean("PlusTiC", category, PlusTiC, comment);
			PneumaticCraft = getBoolean("PneumaticCraft", category, PneumaticCraft, comment);
			ProjectE = getBoolean("ProjectE", category, ProjectE, comment);
			ProjectRed = getBoolean("Project Red", category, ProjectRed, comment);
			RefinedStorage = getBoolean("Refined Storage", category, RefinedStorage, comment);
			TechRebornRecipes = getBoolean("Tech Reborn recipes", category, TechRebornRecipes, LOADTECHREBORN_COMMENT);
			Thaumcraft = getBoolean("Thaumcraft", category, Thaumcraft, comment);
			ThermalExpansionRecipes = getBoolean("Thermal Expansion recipes", category, ThermalExpansionRecipes, LOADTHERMAL_COMMENT);
			TinkersConstruct = getBoolean("Tinkers' Construct", category, TinkersConstruct, comment);
			TwilightForest = getBoolean("Twilight Forest", category, TwilightForest, comment);
		}
		
		{	//Actually Additions Recipes
			String category = CATEGORY_ACTUALLY;
			cfg.addCustomCategoryComment(category, "Actually Additions recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			energyEmpowerer = getInt("Energy in Empowerer", category, energyEmpowerer, ENERGYEMPOWERER_COMMENT);
			timeEmpowerer = getInt("Time in Empowerer", category, timeEmpowerer, TIMEEMPOWERER_COMMENT);
			
			energyDiamantineReconstructor = getInt("Energy for Diamantine in Reconstructor", category, energyDiamantineReconstructor, ENERGYRECONSTRUCTOR_1_COMMENT + "Diamatine" + ENERGYRECONSTRUCTOR_2_COMMENT);
			energyEmeradicReconstructor = getInt("Energy for Emeradic in Reconstructor", category, energyEmeradicReconstructor, ENERGYRECONSTRUCTOR_1_COMMENT + "Emeradic" + ENERGYRECONSTRUCTOR_2_COMMENT );
			energyEnoriReconstructor = getInt("Energy for Enori in Reconstructor", category, energyEnoriReconstructor, ENERGYRECONSTRUCTOR_1_COMMENT + "Enori" + ENERGYRECONSTRUCTOR_2_COMMENT);
			energyPalisReconstructor = getInt("Energy for Palis in Reconstructor", category, energyPalisReconstructor, ENERGYRECONSTRUCTOR_1_COMMENT + "Palis" + ENERGYRECONSTRUCTOR_2_COMMENT);
			energyRestoniaReconstructor = getInt("Energy for Restonia in Reconstructor", category, energyRestoniaReconstructor, ENERGYRECONSTRUCTOR_1_COMMENT + "Restonia" + ENERGYRECONSTRUCTOR_2_COMMENT);
			energyVoidReconstructor = getInt("Energy for Void in Reconstructor", category, energyVoidReconstructor, ENERGYRECONSTRUCTOR_1_COMMENT + "Void" + ENERGYRECONSTRUCTOR_2_COMMENT);
		}
		
		{	//Botania
			String category = CATEGORY_BOTANIA;
			cfg.addCustomCategoryComment(category, "Botania recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			manasteelMana = getInt("Mana for Manasteel", category, manasteelMana, MANASTEELMANA_COMMENT);
		}
		
		{	//Immersive Engineering Recipes
			String category = CATEGORY_IMMERSIVE;
			cfg.addCustomCategoryComment(category, "Immersive Engineering recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			enableIEHammer = getBoolean("Enable IE Hammer", category, enableIEHammer, IE_HAMMER_COMMENT);
			energyMetalPress = getInt("Energy in Metal Press", category, energyMetalPress, ENERGYMETALPRESS_COMMENT);
		}
		
		{	//Industrial Craft 2 Recipes
			String category = CATEGORY_IC2;
			cfg.addCustomCategoryComment(category, "Industrial Craft 2 recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			enableIC2Hammer = getBoolean("Enable IC2 Hammer", category, enableIC2Hammer, IC2_HAMMER_COMMENT);
		}
		
		{	//Tech Reborn Recipes
			String category = CATEGORY_TECHREBORN;
			cfg.addCustomCategoryComment(category, "Tech Reborn recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			energyCompressor = getInt("Energy in Compressor", category, energyCompressor, ENERGYCOMPRESSOR_COMMENT);
			timeCompressor = getInt("Time in Compressor", category, timeCompressor, TIMECOMPRESSOR_COMMENT);
		}
		
		{	//Thermal Expansion Recipes
			String category = CATEGORY_THERMAL;
			cfg.addCustomCategoryComment(category, "Thermal Expansion recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			energyCompactor = getInt("Energy in Compactor", category, energyCompactor, ENERGYCOMPACTOR_COMMENT);
			energyInductionSmelter = getInt("Energy in Induction Smelter", category, energyInductionSmelter, ENERGYINDUCTIONSMELTER_COMMENT);
		}
		
		{	//General
			String category = CATEGORY_GENERAL;
			cfg.addCustomCategoryComment(category, "General settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			centerMetals = getBoolean("Center metals in recipes", category, centerMetals, CENTER_IN_GEAR_COMMENT);
			durabilityHammer = getInt("Hammer's durability", category, durabilityHammer, DURABILITYHAMMER_COMMENT);
		}
		
		if (cfg.hasChanged())
			cfg.save();
	}
	
	@SuppressWarnings("unchecked")
	public List<IConfigElement> getConfigElements() {
		List<IConfigElement> list = new ArrayList<>();		
		for (String category : CATEGORIES) {
			list.add(new ConfigElement(cfg.getCategory(category)));
		}
		return list;
	}
	
	private int getInt(String name, String category, int intName, String comment) {
		return cfg.getInt(name, category, intName, 1, Integer.MAX_VALUE, comment);
	}
	
	private boolean getBoolean(String name, String category, boolean booleanName, String comment) {
		return cfg.getBoolean(name, category, booleanName, comment);
	}
}