package panszelescik.moreplates.plugins;

import blusunrize.immersiveengineering.api.crafting.MetalPressRecipe;
import net.minecraft.item.ItemStack;
import panszelescik.moreplates.MorePlates;

import static panszelescik.moreplates.ModChecker.*;
import static panszelescik.moreplates.config.Config.*;
import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;
import static panszelescik.moreplates.plugins.PluginMinecraft.*;

import javax.annotation.Nonnull;

public class PluginImmersiveEngineering {
	
	static int energy = energyMetalPress;
	static int MetalPressRecipes = 0;

	static ItemStack mold_gear = getItemStack(IMMERSIVE_MODID, "mold", 1, 1);
	static ItemStack mold_plate = getItemStack(IMMERSIVE_MODID, "mold", 1, 0);
	
	public static void postInit() {
		if (Minecraft) {
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
		if (isActuallyAdditionsLoaded & ActuallyAdditions) {
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
		if (isAppliedEnergisticsLoaded & AppliedEnergistics2) {	
			String id = AE2_MODID;
			add(CERTUS_QUARTZ, CRYSTAL + CERTUS_QUARTZ);
			add(CERTUS_QUARTZ, PURE_CERTUS_QUARTZ_NAME, id, PURE_CERTUS_QUARTZ_META);
			add(FLUIX, CRYSTAL + FLUIX);
			add(FLUIX, CRYSTAL + PURE_FLUIX);
		}
		/*if (isAvaritiaLoaded & Avaritia) {
			add(CRYSTAL_MATRIX, INGOT + CRYSTAL_MATRIX);
			add(INFINITY, INGOT + INFINITY);
			add(NEUTRONIUM, INGOT + NEUTRONIUM);
		}*/
		if (isBotaniaLoaded & Botania) {
			//add(ELEMENTIUM, INGOT + ELEMENTIUM);
			addGaia(GAIA_SPIRIT, GAIA_SPIRIT + "Ingot");
			//add(MANASTEEL, INGOT + MANASTEEL);
			//add(TERRASTEEL, INGOT + TERRASTEEL);
		}
		if (isCalculatorLoaded & Calculator) {
			String id = CALCULATOR_MODID;
			add(AMETHYST, GEM + AMETHYST);
			add(ENRICHED_GOLD, INGOT + ENRICHED_GOLD);
			add(REINFORCED_IRON, REINFORCED_IRON_NAME, id);
			add(TANZANITE, GEM + TANZANITE);
		}
		/*if (isDraconicEvolutionLoaded & DraconicEvolution) {
			add(AWAKENED_DRACONIUM, INGOT + AWAKENED_DRACONIUM);
			add(DRACONIUM, INGOT + DRACONIUM);
		}*/
		/*if (isEnderIOLoaded & EnderIO) {
			add(CONDUCTIVE_IRON, INGOT + CONDUCTIVE_IRON);
			add(DARK_STEEL, INGOT + DARK_STEEL);
			add(ELECTRICAL_STEEL, INGOT + ELECTRICAL_STEEL);
			add(END_STEEL, INGOT + END_STEEL);
			add(ENERGETIC_ALLOY, INGOT + ENERGETIC_ALLOY);
			add(PULSATING_IRON, INGOT + PULSATING_IRON);
			add(REDSTONE_ALLOY, INGOT + REDSTONE_ALLOY);
			add(SOULARIUM, INGOT + SOULARIUM);
			add(VIBRANT_ALLOY, INGOT + VIBRANT_ALLOY);
		}*/
		/*if (isExtraUtilitiesLoaded & ExtraUtilities) {
			add(DEMON, INGOT + DEMON);
			add(ENCHANTED, INGOT + ENCHANTED);
			add(EVIL_INFUSED_IRON, INGOT + EVIL_INFUSED_IRON);
		}*/
		/*if (isMekanismLoaded & Mekanism) {
			add(GLOWSTONE, INGOT + GLOWSTONE);
			add(OSMIUM, INGOT + OSMIUM);
			add(REFINED_OBSIDIAN, INGOT + REFINED_OBSIDIAN);
		}*/
		/*if (isMysticalAgradditionsLoaded & MysticalAgradditions) {
			add(INSANIUM, INGOT + INSANIUM);
		}*/
		/*if (isMysticalAgricultureLoaded & MysticalAgriculture) {
			add(INFERIUM, INGOT + INFERIUM);
			add(INTERMEDIUM, INGOT + INTERMEDIUM);
			add(PRUDENTIUM, INGOT + PRUDENTIUM);
			add(SOULIUM, INGOT + SOULIUM);
			add(SUPERIUM, INGOT + SUPERIUM);
			add(SUPREMIUM, INGOT + SUPREMIUM);
		}*/
		/*if (isPlusTiCLoaded & PlusTiC) {
			add(ALUMITE, INGOT + ALUMITE);
			if (isBotaniaLoaded)
				add(MIRION, INGOT + MIRION);
			if (isMekanismLoaded)
				add(OSGLOGLAS, INGOT + OSGLOGLAS);
			if (isMekanismLoaded & isThermalExpansionLoaded)
				add(OSMIRIDIUM, INGOT + OSMIRIDIUM);
		}*/
		if (isPneumaticCraftLoaded & PneumaticCraft) {
			add(COMPRESSED_IRON, INGOT + COMPRESSED_IRON);
		}
		if (isProjectELoaded & ProjectE) {
			String id = PROJECTE_MODID;
			add(DARK_MATTER, MATTER_NAME, id, DARK_MATTER_META);
			add(RED_MATTER, MATTER_NAME, id, RED_MATTER_META);
		}
		if (isProjectRedLoaded & ProjectRed) {
			add(ELECTROTINE, INGOT + ELECTROTINE);
			add(RED_ALLOY, INGOT + RED_ALLOY);
		}
		if (isRefinedStorageLoaded & RefinedStorage) {
			String id = REFINED_STORAGE_MODID;
			add(QUARTZ_ENRICHED_IRON, QUARTZ_ENRICHED_IRON_NAME, id);
		}
		if (isThaumcraftLoaded & Thaumcraft) {
			add(AMBER, GEM + AMBER);
			add(QUICKSILVER, "quicksilver");
		}
		/*if (isTinkersConstructLoaded & TinkersConstruct) {
			add(ARDITE, INGOT + ARDITE);
			add(COBALT, INGOT + COBALT);
			add(KNIGHTSLIME, INGOT + KNIGHTSLIME);
			add(MANYULLYN, INGOT + MANYULLYN);
			add(PIG_IRON, INGOT + PIG_IRON);
		}*/
		/*if (isTwilightForestLoaded & TwilightForest) {
			add(FIERY, INGOT + FIERY);
			add(IRONWOOD, INGOT + IRONWOOD);
			add(KNIGHTMETAL, INGOT + KNIGHTMETAL);
		}*/
		if (oreNameExists(ITEM + SILICON)) {
			add(SILICON, ITEM + SILICON);
		}
		
		MorePlates.logger.info("Added " + MetalPressRecipes + " recipes to Metal Press");
	}
	
	private static void add(@Nonnull String output, @Nonnull String inputOre, boolean gear, boolean plate) {
		if (gear) {
			MorePlates.logger.debug(INFO_IE + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromOre(inputOre) + " x4");
			MetalPressRecipe.addRecipe(getOre(GEAR + output), inputOre, mold_gear, energyMetalPress).setInputSize(4);
			
			MetalPressRecipes += 1;
		}
		if (plate) {
			MorePlates.logger.debug(INFO_IE + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(inputOre));
			MetalPressRecipe.addRecipe(getOre(PLATE + output), inputOre, mold_plate, energyMetalPress);
			
			MetalPressRecipes += 1;
		}
	}
	
	private static void add(@Nonnull String output, @Nonnull String inputOre) {
		MorePlates.logger.debug(INFO_IE + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromOre(inputOre) + " x4");
		MetalPressRecipe.addRecipe(getOre(GEAR + output), inputOre, mold_gear, energyMetalPress).setInputSize(4);
			
		MetalPressRecipes += 1;
		
		MorePlates.logger.debug(INFO_IE + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(inputOre));
		MetalPressRecipe.addRecipe(getOre(PLATE + output), inputOre, mold_plate, energyMetalPress);
		
		MetalPressRecipes += 1;
	}
	
	private static void add(@Nonnull String output, @Nonnull String input, @Nonnull String id) {
		MorePlates.logger.debug(INFO_IE + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromItemStack(id, input) + " x4");
		MetalPressRecipe.addRecipe(getOre(GEAR + output), getItemStack(id, input), mold_gear, energyMetalPress).setInputSize(4);
		
		MetalPressRecipes += 1;
		
		MorePlates.logger.debug(INFO_IE + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input));
		MetalPressRecipe.addRecipe(getOre(PLATE + output), getItemStack(id, input), mold_plate, energyMetalPress);
		
		MetalPressRecipes += 1;
	}
	
	private static void add(@Nonnull String output, @Nonnull String input, @Nonnull String id, int meta) {
		MorePlates.logger.debug(INFO_IE + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromItemStack(id, input, 1, meta) + " x4");
		MetalPressRecipe.addRecipe(getOre(GEAR + output), getItemStack(id, input, 1, meta), mold_gear, energyMetalPress).setInputSize(4);
		
		MetalPressRecipes += 1;
		
		MorePlates.logger.debug(INFO_IE + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input, 1, meta));
		MetalPressRecipe.addRecipe(getOre(PLATE + output), getItemStack(id, input, 1, meta), mold_plate, energyMetalPress);
		
		MetalPressRecipes += 1;
	}
	
	private static void addGaia(@Nonnull String output, @Nonnull String input) {
		MorePlates.logger.debug(INFO_IE + getItemNameFromOre(output + "Gear") + INFO_3 + getItemNameFromOre(input) + " x4");
		MetalPressRecipe.addRecipe(getOre(output + "Gear"), getOre(input), mold_gear, energyMetalPress).setInputSize(4);
		
		MetalPressRecipes += 1;
		
		MorePlates.logger.debug(INFO_IE + getItemNameFromOre(output + "Plate") + INFO_3 + getItemNameFromOre(input));
		MetalPressRecipe.addRecipe(getOre(output + "Plate"), input, mold_plate, energyMetalPress);
		
		MetalPressRecipes += 1;
	}
}