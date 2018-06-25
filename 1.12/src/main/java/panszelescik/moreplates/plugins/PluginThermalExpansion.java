package panszelescik.moreplates.plugins;

import cofh.thermalexpansion.util.managers.machine.CompactorManager;
import cofh.thermalexpansion.util.managers.machine.CompactorManager.Mode;
import cofh.thermalexpansion.util.managers.machine.SmelterManager;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;

import static panszelescik.moreplates.ModChecker.*;
import static panszelescik.moreplates.config.Config.*;
import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;
import static panszelescik.moreplates.plugins.PluginVanilla.*;

import java.util.List;

public class PluginThermalExpansion {
	
	private static ItemStack sand = new ItemStack(Blocks.SAND);
	private static ItemStack slag = getItemStack("thermalfoundation", "material", 1, 864);
	
	public static void postInit() {
		if (loadVanilla) {
			add(COAL, "coal", gearCoal, plateCoal);
			add(DIAMOND, GEM + DIAMOND, gearDiamond, plateDiamond);
			add(EMERALD, GEM + EMERALD, gearEmerald, plateEmerald);
			add(GLOWSTONE, DUST + GLOWSTONE, gearGlowstone, plateGlowstone);
			/*add(GOLD, INGOT + GOLD, gearGold, plateGold);
			add(IRON, INGOT + IRON, gearIron, plateIron);*/
			add(LAPIS, GEM + LAPIS, gearLapisLazuli, plateLapisLazuli);
			add(QUARTZ, GEM + QUARTZ, gearNetherQuartz, plateNetherQuartz);
			add(REDSTONE, DUST + REDSTONE, gearRedstone, plateRedstone);
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
		}
		if (isAppliedEnergisticsLoaded & loadAppliedEnergistics2) {	
			String id = AE2_MODID;
			add(CERTUS_QUARTZ, CRYSTAL + CERTUS_QUARTZ);
			add(CERTUS_QUARTZ, PURE_CERTUS_QUARTZ_NAME, id, PURE_CERTUS_QUARTZ_META);
			add(FLUIX, CRYSTAL + FLUIX);
			add(FLUIX, CRYSTAL + PURE_FLUIX);
		}
		if (isAvaritiaLoaded & loadAvaritia) {
			add(CRYSTAL_MATRIX, INGOT + CRYSTAL_MATRIX);
			add(INFINITY, INGOT + INFINITY);
			add(NEUTRONIUM, INGOT + NEUTRONIUM);
		}
		if (isBotaniaLoaded & loadBotania) {
			add(ELEMENTIUM, INGOT + ELEMENTIUM);
			addGaia(GAIA_SPIRIT, GAIA_SPIRIT + "Ingot");
			add(MANASTEEL, INGOT + MANASTEEL);
			add(TERRASTEEL, INGOT + TERRASTEEL);
		}
		if (isCalculatorLoaded & loadCalculator) {
			String id = CALCULATOR_MODID;
			add(AMETHYST, GEM + AMETHYST);
			add(ENRICHED_GOLD, INGOT + ENRICHED_GOLD);
			add(REDSTONE, REDSTONE_NAME, id);
			add(REINFORCED_IRON, REINFORCED_IRON_NAME, id);
			add(TANZANITE, GEM + TANZANITE);
		}
		if (isDraconicEvolutionLoaded & loadDraconicEvolution) {
			add(AWAKENED_DRACONIUM, INGOT + AWAKENED_DRACONIUM);
			add(DRACONIUM, INGOT + DRACONIUM);
		}
		if (isEnderIOLoaded & loadEnderIO) {
			add(CONDUCTIVE_IRON, INGOT + CONDUCTIVE_IRON);
			add(DARK_STEEL, INGOT + DARK_STEEL);
			add(ELECTRICAL_STEEL, INGOT + ELECTRICAL_STEEL);
			add(END_STEEL, INGOT + END_STEEL);
			add(ENERGETIC_ALLOY, INGOT + ENERGETIC_ALLOY);
			add(PULSATING_IRON, INGOT + PULSATING_IRON);
			add(REDSTONE_ALLOY, INGOT + REDSTONE_ALLOY);
			add(SOULARIUM, INGOT + SOULARIUM);
			add(VIBRANT_ALLOY, INGOT + VIBRANT_ALLOY);
		}
		if (isExtraUtilitiesLoaded & loadExtraUtilities) {
			add(DEMON, INGOT + DEMON);
			add(ENCHANTED, INGOT + ENCHANTED);
			add(EVIL_INFUSED_IRON, INGOT + EVIL_INFUSED_IRON);
		}
		if (isMekanismLoaded & loadMekanism) {
			add(GLOWSTONE, INGOT + GLOWSTONE);
			add(OSMIUM, INGOT + OSMIUM);
			add(REFINED_OBSIDIAN, INGOT + REFINED_OBSIDIAN);
		}
		if (isMysticalAgradditionsLoaded & loadMysticalAgradditions) {
			add(INSANIUM, INGOT + INSANIUM);
		}
		if (isMysticalAgricultureLoaded & loadMysticalAgriculture) {
			add(INFERIUM, INGOT + INFERIUM);
			add(INTERMEDIUM, INGOT + INTERMEDIUM);
			add(PRUDENTIUM, INGOT + PRUDENTIUM);
			add(SOULIUM, INGOT + SOULIUM);
			add(SUPERIUM, INGOT + SUPERIUM);
			add(SUPREMIUM, INGOT + SUPREMIUM);
		}
		if (isPlusTiCLoaded & loadPlusTiC) {
			add(ALUMITE, INGOT + ALUMITE);
			if (isBotaniaLoaded)
				add(MIRION, INGOT + MIRION);
			if (isMekanismLoaded)
				add(OSGLOGLAS, INGOT + OSGLOGLAS);
			if (isMekanismLoaded & isThermalExpansionLoaded)
				add(OSMIRIDIUM, INGOT + OSMIRIDIUM);
		}
		if (isPneumaticCraftLoaded & loadPneumaticCraft) {
			add(COMPRESSED_IRON, INGOT + COMPRESSED_IRON);
		}
		if (isProjectELoaded & loadProjectE) {
			String id = PROJECTE_MODID;
			add(DARK_MATTER, MATTER_NAME, id, DARK_MATTER_META);
			add(RED_MATTER, MATTER_NAME, id, RED_MATTER_META);
		}
		if (isProjectRedLoaded & loadProjectRed) {
			add(ELECTROTINE, INGOT + ELECTROTINE);
			add(RED_ALLOY, INGOT + RED_ALLOY);
		}
		if (isRefinedStorageLoaded & loadRefinedStorage) {
			String id = REFINED_STORAGE_MODID;
			add(QUARTZ_ENRICHED_IRON, QUARTZ_ENRICHED_IRON_NAME, id);
		}
		if (isThaumcraftLoaded & loadThaumcraft) {
			add(AMBER, GEM + AMBER);
			add(QUICKSILVER, "quicksilver");
		}
		if (isTinkersConstructLoaded & loadTinkersConstruct) {
			add(ARDITE, INGOT + ARDITE);
			add(COBALT, INGOT + COBALT);
			add(KNIGHTSLIME, INGOT + KNIGHTSLIME);
			add(MANYULLYN, INGOT + MANYULLYN);
			add(PIG_IRON, INGOT + PIG_IRON);
		}
		if (isTwilightForestLoaded & loadTwilightForest) {
			add(FIERY, INGOT + FIERY);
			add(IRONWOOD, INGOT + IRONWOOD);
			add(KNIGHTMETAL, INGOT + KNIGHTMETAL);
		}
		if (oreNameExists(ITEM + SILICON)) {
			add(SILICON, ITEM + SILICON);
		}
	}
	/**
     * Adds a recipe to the Compactor and Induction Smelter,
     * 
     * special for Vanilla Gears and Plates
     *
     * @param output        The output as a String without gear and plate
     * @param inputOre      The input as a String
     * @param gear          The gear as a boolean
     * @param plate         The plate as a boolean
     */
	private static void add(String output, String inputOre, boolean gear, boolean plate) {
		List<ItemStack> inputs = OreDictionary.getOres(inputOre);
		for (ItemStack input : inputs) {
			if (gear) {
				MorePlates.logger.debug(INFO_COMPACTOR + getItemNameFromOre(GEAR + output) + INFO_3 + getItemName(input) + " x4");
				CompactorManager.addRecipe(energyCompactor, cloneStack(input, 4), getOre(GEAR + output), Mode.GEAR);
				MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(inputOre) + " x4" + INFO_3 + getItemNameFromOre(GEAR + output));
				SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(GEAR + output), cloneStack(getOre(inputOre), 4), slag, 10);
			}
			if (plate) {
				MorePlates.logger.debug(INFO_COMPACTOR + getItemNameFromOre(PLATE + output) + INFO_3 + getItemName(input));
				CompactorManager.addRecipe(energyCompactor, input, getOre(PLATE + output), Mode.PLATE);
				MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(inputOre) + INFO_3 + getItemNameFromOre(PLATE + output));
				SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(PLATE + output), getOre(inputOre), slag, 10);
			}
		}
	}
	
	/**
     * Adds a recipe to the Compactor and Induction Smelter
     *
     * @param output        The output as a String without gear and plate
     * @param inputOre      The input as a String
     */
	private static void add(String output, String inputOre) {
		List<ItemStack> inputs = OreDictionary.getOres(inputOre);
		for (ItemStack input : inputs) {
			MorePlates.logger.debug(INFO_COMPACTOR + getItemNameFromOre(GEAR + output) + INFO_3 + getItemName(input) + " x4");
			CompactorManager.addRecipe(energyCompactor, cloneStack(input, 4), getOre(GEAR + output), Mode.GEAR);
			MorePlates.logger.debug(INFO_COMPACTOR + getItemNameFromOre(PLATE + output) + INFO_3 + getItemName(input));
			CompactorManager.addRecipe(energyCompactor, input, getOre(PLATE + output), Mode.PLATE);
			MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(inputOre) + " x4" + INFO_3 + getItemNameFromOre(GEAR + output));
			SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(GEAR + output), cloneStack(getOre(inputOre), 4), slag, 10);
			MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(inputOre) + INFO_3 + getItemNameFromOre(PLATE + output));
			SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(PLATE + output), getOre(inputOre), slag, 10);
		}
	}
	
	/**
     * Adds a recipe to the Compactor and Induction Smelter
     *
     * @param output        The output as a String without gear and plate
     * @param input         The input as a String - Unlocalized Name
     * @param id            The id as a String - ModID
     */
	private static void add(String output, String input, String id) {
		MorePlates.logger.debug(INFO_COMPACTOR + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromItemStack(id, input) + " x4");
		CompactorManager.addRecipe(energyCompactor, getItemStack(id, input, 4), getOre(GEAR + output), Mode.GEAR);
		MorePlates.logger.debug(INFO_COMPACTOR + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input));
		CompactorManager.addRecipe(energyCompactor, getItemStack(id, input), getOre(PLATE + output), Mode.PLATE);
		MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromItemStack(id, input) + " x4" + INFO_3 + getItemNameFromOre(GEAR + output));
		SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(GEAR + output), getItemStack(id, input, 4), slag, 10);
		MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromItemStack(id, input) + INFO_3 + getItemNameFromOre(PLATE + output));
		SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(PLATE + output), getItemStack(id, input), slag, 10);
	}
	
	/**
     * Adds a recipe to the Compactor and Induction Smelter
     *
     * @param output        The output as a String without gear and plate
     * @param input         The input as a String - Unlocalized Name
     * @param id            The id as an String - ModID
     * @param meta          The meta as an Int - Metadata
     */
	private static void add(String output, String input, String id, int meta) {
		MorePlates.logger.debug(INFO_COMPACTOR + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromItemStack(id, input, 1, meta) + " x4");
		CompactorManager.addRecipe(energyCompactor, getItemStack(id, input, 4, meta), getOre(GEAR + output), Mode.GEAR);
		MorePlates.logger.debug(INFO_COMPACTOR + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input, 1, meta));
		CompactorManager.addRecipe(energyCompactor, getItemStack(id, input, 1, meta), getOre(PLATE + output), Mode.PLATE);
		MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromItemStack(id, input, 1, meta) + " x4" + INFO_3 + getItemNameFromOre(GEAR + output));
		SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(GEAR + output), getItemStack(id, input, 4, meta), slag, 10);
		MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromItemStack(id, input, 1, meta) + INFO_3 + getItemNameFromOre(PLATE + output));
		SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(PLATE + output), getItemStack(id, input, 1, meta), slag, 10);
	}
	
	/**
     * Adds a recipe to the Compactor and Induction Smelter,
     * 
     * special for Gaia Spirit Gear and Plate
     *
     * @param output        The output as a String without Gear and Plate
     * @param input         The input as a String without Gear and Plate
     */
	private static void addGaia(String output, String input) {
		MorePlates.logger.debug(INFO_COMPACTOR + getItemNameFromOre(output + "Gear") + INFO_3 + getItemNameFromOre(input) + " x4");
		CompactorManager.addRecipe(energyCompactor, getOre(input, 4), getOre(output + "Gear"), Mode.GEAR);
		MorePlates.logger.debug(INFO_COMPACTOR + getItemNameFromOre(output + "Plate") + INFO_3 + getItemNameFromOre(input));
		CompactorManager.addRecipe(energyCompactor, getOre(input), getOre(output + "Plate"), Mode.PLATE);
		MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(input) + " x4" + INFO_3 + getItemNameFromOre(output + "Gear"));
		SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(output + "Gear"), cloneStack(getOre(input), 4), slag, 10);
		MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(input) + INFO_3 + getItemNameFromOre(output + "Plate"));
		SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(output + "Plate"), getOre(input), slag, 10);
	}
}