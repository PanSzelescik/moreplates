package panszelescik.moreplates.config;

import static panszelescik.moreplates.Reference.*;

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
import panszelescik.moreplates.plugins.*;

public class Config {
	
	public static Configuration cfg;
	
	//Categories
	private static final String CATEGORY_GENERAL = "General";
	private static final String CATEGORY_PLUGINS = "Plugins";
	
	private static final String CATEGORY_ACTUALLY = PluginActuallyAdditions.MODID;
	private static final String CATEGORY_BOTANIA = PluginBotania.MODID;
	private static final String CATEGORY_IMMERSIVE = PluginImmersiveEngineering.MODID;
	private static final String CATEGORY_IC2 = PluginIndustrialCraft2.MODID;
	private static final String CATEGORY_TECHREBORN = PluginTechReborn.MODID;
	private static final String CATEGORY_THERMAL = PluginThermalExpansion.MODID;
	
	private static final List <String> CATEGORIES = Arrays.asList(CATEGORY_GENERAL, CATEGORY_PLUGINS, CATEGORY_ACTUALLY, CATEGORY_BOTANIA, CATEGORY_IMMERSIVE, CATEGORY_IC2, CATEGORY_TECHREBORN, CATEGORY_THERMAL);
	
	//Booleans
	public static boolean centerMetals = true;
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
			cfg.addCustomCategoryComment(category, "Loading plugins settings");
			cfg.setCategoryRequiresMcRestart(category, true);
		}
		
		{	//Actually Additions Recipes
			String category = CATEGORY_ACTUALLY;
			cfg.addCustomCategoryComment(category, CATEGORY_ACTUALLY + " recipes settings");
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
			cfg.addCustomCategoryComment(category, CATEGORY_BOTANIA + " recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			manasteelMana = getInt("Mana for Manasteel", category, manasteelMana, MANASTEELMANA_COMMENT);
		}
		
		{	//Immersive Engineering Recipes
			String category = CATEGORY_IMMERSIVE;
			cfg.addCustomCategoryComment(category, CATEGORY_IMMERSIVE + " recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			enableIEHammer = getBoolean("Enable IE Hammer", category, IE_HAMMER_COMMENT);
			energyMetalPress = getInt("Energy in Metal Press", category, energyMetalPress, ENERGYMETALPRESS_COMMENT);
		}
		
		{	//Industrial Craft 2 Recipes
			String category = CATEGORY_IC2;
			cfg.addCustomCategoryComment(category, CATEGORY_IC2 + " recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			enableIC2Hammer = getBoolean("Enable IC2 Hammer", category, IC2_HAMMER_COMMENT);
		}
		
		{	//Tech Reborn Recipes
			String category = CATEGORY_TECHREBORN;
			cfg.addCustomCategoryComment(category, CATEGORY_TECHREBORN + " recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			energyCompressor = getInt("Energy in Compressor", category, energyCompressor, ENERGYCOMPRESSOR_COMMENT);
			timeCompressor = getInt("Time in Compressor", category, timeCompressor, TIMECOMPRESSOR_COMMENT);
		}
		
		{	//Thermal Expansion Recipes
			String category = CATEGORY_THERMAL;
			cfg.addCustomCategoryComment(category, CATEGORY_THERMAL + " recipes settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			energyCompactor = getInt("Energy in Compactor", category, energyCompactor, ENERGYCOMPACTOR_COMMENT);
			energyInductionSmelter = getInt("Energy in Induction Smelter", category, energyInductionSmelter, ENERGYINDUCTIONSMELTER_COMMENT);
		}
		
		{	//General
			String category = CATEGORY_GENERAL;
			cfg.addCustomCategoryComment(category, "General settings");
			cfg.setCategoryRequiresMcRestart(category, true);
			
			centerMetals = getBoolean("Center metals in recipes", category, CENTER_IN_GEAR_COMMENT);
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
	
	public static boolean getBoolean(String name, String category, String comment) {
		return cfg.getBoolean(name, category, true, comment);
	}
}