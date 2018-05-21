package panszelescik.moreplates.plugins;

import java.util.Collections;

import ic2.api.recipe.IRecipeInput;
import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;
import panszelescik.moreplates.MorePlates;

import static panszelescik.moreplates.ModChecker.*;
import static panszelescik.moreplates.config.Config.*;
import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginIndustrialCraft2 {
	
	public static void postInit() {
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
			String id = EXTRA_UTILITIES_MODID;
			add(DEMON, EXU2_NAME, id, DEMON_META);
			add(ENCHANTED, EXU2_NAME, id, ENCHANTED_META);
			add(EVIL_INFUSED_IRON, EXU2_NAME, id, EVIL_INFUSED_IRON_META);
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
			add(DARK_MATTER, DARK_MATTER_NAME, id, DARK_MATTER_META);
			add(RED_MATTER, RED_MATTER_NAME, id, RED_MATTER_META);
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
	private static void add(String output, String input) {
		Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forOreDict(input), Collections.singletonList(getOre(PLATE + output)), null, false);
		MorePlates.logger.debug(INFO_IC2 + getItemName(getOre(PLATE + output)) + INFO_3 + getItemName(getOre(input)));
	}
	private static void add(String output, String input, String id) {
		Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forStack(getItemStack(id, input)), Collections.singletonList(getOre(PLATE + output)), null, false);
		MorePlates.logger.debug(INFO_IC2 + getItemName(getOre(PLATE + output)) + INFO_3 + getItemName(getItemStack(id, input)));
	}
	private static void add(String output, String input, String id, int meta) {
		Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forStack(getItemStack(id, input, 1, meta)), Collections.singletonList(getOre(PLATE + output)), null, false);
		MorePlates.logger.debug(INFO_IC2 + getItemName(getOre(PLATE + output)) + INFO_3 + getItemName(getItemStack(id, input, 1, meta)));
	}
	private static void addGaia(String output, String input) {
		Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forOreDict(input), Collections.singletonList(getOre(output + "Plate")), null, false);
		MorePlates.logger.debug(INFO_IC2 + getItemName(getOre(output + "Plate")) + INFO_3 + getItemName(getOre(input)));
	}
}