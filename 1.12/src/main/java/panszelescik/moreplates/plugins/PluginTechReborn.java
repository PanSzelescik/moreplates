package panszelescik.moreplates.plugins;

import reborncore.api.recipe.RecipeHandler;
import techreborn.api.recipe.machines.CompressorRecipe;

import static panszelescik.moreplates.ModChecker.*;
import static panszelescik.moreplates.config.Config.*;
import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;
import static panszelescik.moreplates.plugins.PluginVanilla.plateCoal;
import static panszelescik.moreplates.plugins.PluginVanilla.plateDiamond;
import static panszelescik.moreplates.plugins.PluginVanilla.plateEmerald;
import static panszelescik.moreplates.plugins.PluginVanilla.plateGlowstone;
import static panszelescik.moreplates.plugins.PluginVanilla.plateGold;
import static panszelescik.moreplates.plugins.PluginVanilla.plateIron;
import static panszelescik.moreplates.plugins.PluginVanilla.plateLapisLazuli;
import static panszelescik.moreplates.plugins.PluginVanilla.plateNetherQuartz;
import static panszelescik.moreplates.plugins.PluginVanilla.plateRedstone;

import panszelescik.moreplates.MorePlates;

public class PluginTechReborn {
	
	public static void postInit() {
		if (loadVanilla) {
			/*add(COAL, "coal", plateCoal);
			add(DIAMOND, GEM + DIAMOND, plateDiamond);
			add(EMERALD, GEM + EMERALD, plateEmerald);*/
			add(GLOWSTONE, DUST + GLOWSTONE, plateGlowstone);
			/*add(GOLD, INGOT + GOLD, plateGold);
			add(IRON, INGOT + IRON, plateIron);
			add(LAPIS, GEM + LAPIS, plateLapisLazuli);
			add(QUARTZ, GEM + QUARTZ, plateNetherQuartz);
			add(REDSTONE, DUST + REDSTONE, plateRedstone);*/
			
			/*addBlock(COAL, 9, plateCoal);
			addBlock(DIAMOND, 9, plateDiamond);
			addBlock(EMERALD, 9, plateEmerald);*/
			addBlock(GLOWSTONE, 4, plateGlowstone);
			/*addBlock(GOLD, 9, plateGold);
			addBlock(IRON, 9, plateIron);
			addBlock(LAPIS, 9, plateLapisLazuli);
			addBlock(QUARTZ, 4, plateNetherQuartz);
			addBlock(REDSTONE, 9, plateRedstone);*/
		}
		if (isActuallyAdditionsLoaded & loadActuallyAdditions) {
			String id = ACTUALLY_MODID;
			add(BLACK_QUARTZ, GEM + BLACK_QUARTZ);
			add(DIAMATINE, CRYSTAL_NAME, id, DIAMATINE_META);
			add(EMERADIC, CRYSTAL_NAME, id, EMERADIC_META);
			add(ENORI, CRYSTAL_NAME, id, ENORI_META);
			add(PALIS, CRYSTAL_NAME, id, PALIS_META);
			add(RESTONIA, CRYSTAL_NAME, id, RESTONIA_META);
			add(VOID, CRYSTAL_NAME, id, VOID_META);
			
			add(EMPOWERED_DIAMATINE, EMPOWERED_CRYSTAL_NAME, id, DIAMATINE_META);
			add(EMPOWERED_EMERADIC, EMPOWERED_CRYSTAL_NAME, id, EMERADIC_META);
			add(EMPOWERED_ENORI, EMPOWERED_CRYSTAL_NAME, id, ENORI_META);
			add(EMPOWERED_PALIS, EMPOWERED_CRYSTAL_NAME, id, PALIS_META);
			add(EMPOWERED_RESTONIA, EMPOWERED_CRYSTAL_NAME, id, RESTONIA_META);
			add(EMPOWERED_VOID, EMPOWERED_CRYSTAL_NAME, id, VOID_META);
			
			addBlock(BLACK_QUARTZ, BLACK_QUARTZ_BLOCK_NAME, 4, id, 2);
			addBlock(DIAMATINE, CRYSTAL_BLOCK_NAME, 9, id, DIAMATINE_META);
			addBlock(EMERADIC, CRYSTAL_BLOCK_NAME, 9, id, EMERADIC_META);
			addBlock(ENORI, CRYSTAL_BLOCK_NAME, 9, id, ENORI_META);
			addBlock(PALIS, CRYSTAL_BLOCK_NAME, 9, id, PALIS_META);
			addBlock(RESTONIA, CRYSTAL_BLOCK_NAME, 9, id, RESTONIA_META);
			addBlock(VOID, CRYSTAL_BLOCK_NAME, 9, id, VOID_META);
			
			addBlock(EMPOWERED_DIAMATINE, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, DIAMATINE_META);
			addBlock(EMPOWERED_EMERADIC, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, EMERADIC_META);
			addBlock(EMPOWERED_ENORI, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, ENORI_META);
			addBlock(EMPOWERED_PALIS, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, PALIS_META);
			addBlock(EMPOWERED_RESTONIA, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, RESTONIA_META);
			addBlock(EMPOWERED_VOID, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, VOID_META);
		}
		if (isAppliedEnergisticsLoaded & loadAppliedEnergistics2) {	
			String id = AE2_MODID;
			add(CERTUS_QUARTZ, CRYSTAL + CERTUS_QUARTZ);
			add(CERTUS_QUARTZ, PURE_CERTUS_QUARTZ_NAME, id, PURE_CERTUS_QUARTZ_META);
			add(FLUIX, CRYSTAL + FLUIX);
			add(FLUIX, CRYSTAL + PURE_FLUIX);
			
			addBlock(CERTUS_QUARTZ, CERTUS_QUARTZ_BLOCK_NAME, 4, id);
			addBlock(FLUIX, FLUIX_BLOCK_NAME, 4, id);
		}
		if (isAvaritiaLoaded & loadAvaritia) {
			add(CRYSTAL_MATRIX, INGOT + CRYSTAL_MATRIX);
			//add(INFINITY, INGOT + INFINITY);
			add(NEUTRONIUM, INGOT + NEUTRONIUM);
			
			addBlock(CRYSTAL_MATRIX, 9);
			//addBlock(INFINITY, 9);
			addBlock(NEUTRONIUM, 9);
		}
		if (isBotaniaLoaded & loadBotania) {
			String id = BOTANIA_MODID;
			add(ELEMENTIUM, INGOT + ELEMENTIUM);
			addGaia(GAIA_SPIRIT, GAIA_SPIRIT + "Ingot");
			//add(MANASTEEL, INGOT + MANASTEEL);
			//add(TERRASTEEL, INGOT + TERRASTEEL);
			
			addBlock(ELEMENTIUM, BOTANIA_NAME, 9, id, ELEMENTIUM_META);
			addBlock(MANASTEEL, BOTANIA_NAME, 9, id, MANASTEEL_META);
			addBlock(TERRASTEEL, BOTANIA_NAME, 9, id, TERRASTEEL_META);
		}
		if (isCalculatorLoaded & loadCalculator) {
			String id = CALCULATOR_MODID;
			add(AMETHYST, GEM + AMETHYST);
			add(ENRICHED_GOLD, INGOT + ENRICHED_GOLD);
			add(REDSTONE_CALCULATOR, REDSTONE_NAME, id);
			add(REINFORCED_IRON, REINFORCED_IRON_NAME, id);
			add(TANZANITE, GEM + TANZANITE);
			
			addBlock(ENRICHED_GOLD, CALCULATOR_NAME, 9, id, ENRICHED_GOLD_BLOCK_META);
			addBlock(REDSTONE_CALCULATOR, CALCULATOR_NAME, 9, id, REDSTONE_BLOCK_META);
			addBlock(REINFORCED_IRON, CALCULATOR_NAME, 9, id, REINFORCED_IRON_BLOCK_META);
		}
		if (isDraconicEvolutionLoaded & loadDraconicEvolution) {
			add(AWAKENED_DRACONIUM, INGOT + AWAKENED_DRACONIUM);
			//add(DRACONIUM, INGOT + DRACONIUM);
			
			addBlock(AWAKENED_DRACONIUM, 9);
			//addBlock(DRACONIUM, 9);
		}
		if (isEnderIOLoaded & loadEnderIO) {
			add(CONDUCTIVE_IRON, INGOT + CONDUCTIVE_IRON);
			add(DARK_STEEL, INGOT + DARK_STEEL);
			add(ELECTRICAL_STEEL, INGOT + ELECTRICAL_STEEL);
			add(END_STEEL, INGOT + END_STEEL);
			add(ENERGETIC_ALLOY, INGOT + ENERGETIC_ALLOY);
			add(PULSATING_IRON, INGOT + PULSATING_IRON);
			add(REDSTONE_ALLOY, INGOT + REDSTONE_ALLOY);
			//add(SOULARIUM, INGOT + SOULARIUM);
			add(VIBRANT_ALLOY, INGOT + VIBRANT_ALLOY);
			
			addBlock(CONDUCTIVE_IRON, 9);
			addBlock(DARK_STEEL, 9);
			addBlock(ELECTRICAL_STEEL, 9);
			addBlock(END_STEEL, 9);
			addBlock(ENERGETIC_ALLOY, 9);
			addBlock(PULSATING_IRON, 9);
			addBlock(REDSTONE_ALLOY, 9);
			//addBlock(SOULARIUM, 9);
			addBlock(VIBRANT_ALLOY, 9);
		}
		if (isExtraUtilitiesLoaded & loadExtraUtilities) {
			add(DEMON, INGOT + DEMON);
			add(ENCHANTED, INGOT + ENCHANTED);
			add(EVIL_INFUSED_IRON, INGOT + EVIL_INFUSED_IRON);
			
			addBlock(DEMON, 9);
			addBlock(ENCHANTED, 9);
			addBlock(EVIL_INFUSED_IRON, 9);
		}
		if (isMekanismLoaded & loadMekanism) {
			add(REFINED_GLOWSTONE, INGOT + REFINED_GLOWSTONE);
			//add(OSMIUM, INGOT + OSMIUM);
			add(REFINED_OBSIDIAN, INGOT + REFINED_OBSIDIAN);
			
			addBlock(REFINED_GLOWSTONE, 9);
			//addBlock(OSMIUM, 9);
			addBlock(REFINED_OBSIDIAN, 9);
		}
		/*if (isMysticalAgradditionsLoaded & loadMysticalAgradditions) {
			add(INSANIUM, INGOT + INSANIUM);
			
			addBlock(INSANIUM, 9);
		}*/
		/*if (isMysticalAgricultureLoaded & loadMysticalAgriculture) {
			add(INFERIUM, INGOT + INFERIUM);
			add(INTERMEDIUM, INGOT + INTERMEDIUM);
			add(PRUDENTIUM, INGOT + PRUDENTIUM);
			add(SOULIUM, INGOT + SOULIUM);
			add(SUPERIUM, INGOT + SUPERIUM);
			add(SUPREMIUM, INGOT + SUPREMIUM);
			
			addBlock(INFERIUM, 9);
			addBlock(INTERMEDIUM, 9);
			addBlock(PRUDENTIUM, 9);
			addBlock(SOULIUM, 9);
			addBlock(SUPERIUM, 9);
			addBlock(SUPREMIUM, 9);
		}*/
		/*if (isPlusTiCLoaded & loadPlusTiC) {
			add(ALUMITE, INGOT + ALUMITE);
			
			addBlock(ALUMITE, 9);
			if (isBotaniaLoaded) {
				add(MIRION, INGOT + MIRION);
				
				addBlock(MIRION, 9);
			}
			if (isMekanismLoaded) {
				add(OSGLOGLAS, INGOT + OSGLOGLAS);
				
				addBlock(OSGLOGLAS, 9);
			}
			if (isMekanismLoaded & isThermalExpansionLoaded) {
				add(OSMIRIDIUM, INGOT + OSMIRIDIUM);
				
				addBlock(OSMIRIDIUM, 9);
			}
		}*/
		if (isPneumaticCraftLoaded & loadPneumaticCraft) {
			add(COMPRESSED_IRON, INGOT + COMPRESSED_IRON);
			
			addBlock(COMPRESSED_IRON, 9);
		}
		if (isProjectELoaded & loadProjectE) {
			String id = PROJECTE_MODID;
			add(DARK_MATTER, MATTER_NAME, id, DARK_MATTER_META);
			add(RED_MATTER, MATTER_NAME, id, RED_MATTER_META);
			
			addBlock(DARK_MATTER, MATTER_BLOCK_NAME, 4, id, DARK_MATTER_META);
			addBlock(RED_MATTER, MATTER_BLOCK_NAME, 4, id, RED_MATTER_META);
		}
		if (isProjectRedLoaded & loadProjectRed) {
			add(ELECTROTINE, INGOT + ELECTROTINE);
			add(RED_ALLOY, INGOT + RED_ALLOY);
		}
		if (isRefinedStorageLoaded & loadRefinedStorage) {
			String id = REFINED_STORAGE_MODID;
			add(QUARTZ_ENRICHED_IRON, QUARTZ_ENRICHED_IRON_NAME, id);
			
			addBlock(QUARTZ_ENRICHED_IRON, QUARTZ_ENRICHED_IRON_BLOCK_NAME, 9, id);
		}
		if (isThaumcraftLoaded & loadThaumcraft) {
			String id = THAUMCRAFT_MODID;
			add(AMBER, GEM + AMBER);
			add(QUICKSILVER, "quicksilver");
			
			addBlock(AMBER, AMBER_BLOCK_NAME, 9, id);
		}
		/*if (isTinkersConstructLoaded & loadTinkersConstruct) {
			add(ARDITE, INGOT + ARDITE);
			add(COBALT, INGOT + COBALT);
			add(KNIGHTSLIME, INGOT + KNIGHTSLIME);
			add(MANYULLYN, INGOT + MANYULLYN);
			add(PIG_IRON, INGOT + PIG_IRON);
			
			addBlock(ARDITE, 9);
			addBlock(COBALT, 9);
			addBlock(KNIGHTSLIME, 9);
			addBlock(MANYULLYN, 9);
			addBlock(PIG_IRON, 9);
		}*/
		if (isTwilightForestLoaded & loadTwilightForest) {
			String id = TWILIGHT_MODID;
			add(FIERY, INGOT + FIERY);
			//add(IRONWOOD, INGOT + IRONWOOD);
			add(KNIGHTMETAL, INGOT + KNIGHTMETAL);
			
			addBlock(FIERY, 9);
			addBlock(IRONWOOD, IRONWOOD_BLOCK_NAME, 9, id);
			addBlock(KNIGHTMETAL, 9);
		}
		if (oreNameExists(ITEM + SILICON)) {
			add(SILICON, ITEM + SILICON);
		}
	}
	
	/**
     * Adds a recipe to the Compressor,
     * 
     * special for Vanilla Gears and Plates
     *
     * @param output        The output as a String without gear and plate
     * @param input         The input as a String
     * @param plate         The plate as a boolean
     */
	private static void add(String output, String input, boolean plate) {
		if (plate) {
			MorePlates.logger.debug(INFO_TECHREBORN + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(input));
			RecipeHandler.addRecipe(new CompressorRecipe(input, getOre(PLATE + output), timeCompressor, energyCompressor));
		}
	}
	
	/**
     * Adds a recipe to the Compressor
     *
     * @param output        The output as a String without gear and plate
     * @param input         The input as a String
     */
	private static void add(String output, String input) {
		MorePlates.logger.debug(INFO_TECHREBORN + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(input));
		RecipeHandler.addRecipe(new CompressorRecipe(input, getOre(PLATE + output), timeCompressor, energyCompressor));
	}
	
	/**
     * Adds a recipe to the Compressor
     *
     * @param output        The output as a String without gear and plate
     * @param input         The input as a String - Unlocalized Name
     * @param id            The id as a String - ModID
     */
	private static void add(String output, String input, String id) {
		MorePlates.logger.debug(INFO_TECHREBORN + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input));
		RecipeHandler.addRecipe(new CompressorRecipe(getItemStack(id, input), getOre(PLATE + output), timeCompressor, energyCompressor));
	}
	
	/**
     * Adds a recipe to the Compressor
     *
     * @param output        The output as a String without gear and plate
     * @param input         The input as a String - Unlocalized Name
     * @param id            The id as an String - ModID
     * @param meta          The meta as an Int - Metadata
     */
	private static void add(String output, String input, String id, int meta) {
		MorePlates.logger.debug(INFO_TECHREBORN + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input, 1, meta));
		RecipeHandler.addRecipe(new CompressorRecipe(getItemStack(id, input, 1, meta), getOre(PLATE + output), timeCompressor, energyCompressor));
	}
	
	/**
     * Adds a recipe to the Compressor,
     * 
     * special for Gaia Spirit Gear and Plate
     *
     * @param output        The output as a String without Gear and Plate
     * @param input         The input as a String without Gear and Plate
     */
	private static void addGaia(String output, String input) {
		MorePlates.logger.debug(INFO_TECHREBORN + getItemNameFromOre(output + "Plate") + INFO_3 + getItemNameFromOre(input));
		RecipeHandler.addRecipe(new CompressorRecipe(input, getOre(output + "Plate"), timeCompressor, energyCompressor));
	}
	
	/**
     * Adds a recipe to the Compressor,
     * 
     * special for Vanilla Gears and Plates
     *
     * @param name          The output and input as a String without block and plate
     * @param amount        The amount of output as an Int
     * @param plate         The plate as a boolean
     */
	private static void addBlock(String name, int amount, boolean plate) {
		if (plate) {
			MorePlates.logger.debug(INFO_TECHREBORN + getItemNameFromOre(PLATE + name) + " x" + amount + INFO_3 + getItemNameFromOre(BLOCK + name));
			RecipeHandler.addRecipe(new CompressorRecipe(BLOCK + name, getOre(PLATE + name, amount), timeCompressor, energyCompressor));
		}
	}
	
	/**
     * Adds a recipe to the Compressor
     *
     * @param name          The output and input as a String without block and plate
     * @param amount        The amount of output as an Int
     */
	private static void addBlock(String name, int amount) {
		MorePlates.logger.debug(INFO_TECHREBORN + getItemNameFromOre(PLATE + name) + " x" + amount + INFO_3 + getItemNameFromOre(BLOCK + name));
		RecipeHandler.addRecipe(new CompressorRecipe(BLOCK + name, getOre(PLATE + name, amount), timeCompressor, energyCompressor));
	}
	
	/**
     * Adds a recipe to the Compressor
     *
     * @param output        The output as a String without plate
     * @param input         The input as a String - Unlocalized Name
     * @param amount        The amount of output as an Int
     * @param id            The id as an String - ModID
     */
	private static void addBlock(String output, String input, int amount, String id) {
		MorePlates.logger.debug(INFO_TECHREBORN + getItemNameFromOre(PLATE + output) + " x" + amount + INFO_3 + getItemNameFromItemStack(id, input));
		RecipeHandler.addRecipe(new CompressorRecipe(getItemStack(id, input), getOre(PLATE + output, amount), timeCompressor, energyCompressor));
	}
	
	/**
     * Adds a recipe to the Compressor
     *
     * @param output        The output as a String without plate
     * @param input         The input as a String - Unlocalized Name
     * @param amount        The amount of output as an Int
     * @param id            The id as an String - ModID
     * @param meta          The meta as an Int - Metadata
     */
	private static void addBlock(String output, String input, int amount, String id, int meta) {
		MorePlates.logger.debug(INFO_TECHREBORN + getItemNameFromOre(PLATE + output) + " x" + amount + INFO_3 + getItemNameFromItemStack(id, input, 1, meta));
		RecipeHandler.addRecipe(new CompressorRecipe(getItemStack(id, input, 1, meta), getOre(PLATE + output, amount), timeCompressor, energyCompressor));
	}
}