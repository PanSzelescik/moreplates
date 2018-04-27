package panszelescik.moreplates.plugins;

import blusunrize.immersiveengineering.api.crafting.MetalPressRecipe;
import cofh.core.util.helpers.ItemHelper;
import net.minecraft.item.ItemStack;
import panszelescik.moreplates.ModChecker;
import panszelescik.moreplates.config.Config;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.helpers.ItemStacks;

public class PluginImmersiveEngineering {
	
	static ItemStack mold_gear =	Helper.getItemStack("immersiveengineering", "mold", 1, 1);
	static ItemStack mold_plate =	Helper.getItemStack("immersiveengineering", "mold", 1, 0);
	
	public static void postInit() {
		if (ModChecker.isAppliedEnergisticsLoaded & Config.loadAppliedEnergistics2) {	
			MetalPressRecipe.addRecipe(ItemStacks.certus_quartz_gear,			ItemStacks.certus_4,				mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.certus_quartz_gear,			ItemStacks.pure_certus_4,			mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.fluix_gear,					ItemStacks.fluix_4,					mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.fluix_gear,					ItemStacks.pure_fluix_4,			mold_gear,	Config.energyMetalPress);
			
			MetalPressRecipe.addRecipe(ItemStacks.certus_quartz_plate,			ItemStacks.certus,					mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.certus_quartz_plate,			ItemStacks.pure_certus,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.fluix_plate,					ItemStacks.fluix,					mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.fluix_plate,					ItemStacks.pure_fluix,				mold_plate,	Config.energyMetalPress);
		}
		if (ModChecker.isBotaniaLoaded & Config.loadBotania) {
			MetalPressRecipe.addRecipe(ItemStacks.elementium_gear,				ItemStacks.elementium_4,			mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.gaia_spirit_gear,				ItemStacks.gaia_4,					mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.manasteel_gear,				ItemStacks.manasteel_4,				mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.terrasteel_gear,				ItemStacks.terrasteel_4,			mold_gear,	Config.energyMetalPress);
			
			MetalPressRecipe.addRecipe(ItemStacks.elementium_plate,				ItemStacks.elementium,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.gaia_spirit_plate,			ItemStacks.gaia,					mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.manasteel_plate,				ItemStacks.manasteel,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.terrasteel_plate,				ItemStacks.terrasteel,				mold_plate,	Config.energyMetalPress);
		}
		if (ModChecker.isCalculatorLoaded & Config.loadCalculator) {
			MetalPressRecipe.addRecipe(ItemStacks.amethyst_gear,				ItemStacks.amethyst_4,				mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.enriched_gold_gear,			ItemStacks.enriched_gold_4,			mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.redstone_gear,				ItemStacks.redstone_4,				mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.reinforced_iron_gear,			ItemStacks.reinforced_iron_4,		mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.tanzanite_gear,				ItemStacks.tanzanite_4,				mold_gear,	Config.energyMetalPress);
			
			MetalPressRecipe.addRecipe(ItemStacks.amethyst_plate,				ItemStacks.amethyst,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.enriched_gold_plate,			ItemStacks.enriched_gold,			mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.redstone_plate,				ItemStacks.redstone,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.reinforced_iron_plate,		ItemStacks.reinforced_iron,			mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.tanzanite_plate,				ItemStacks.tanzanite,				mold_plate,	Config.energyMetalPress);
		}
		if (ModChecker.isDraconicEvolutionLoaded & Config.loadDraconicEvolution) {
			MetalPressRecipe.addRecipe(ItemStacks.awakened_draconium_gear,		ItemStacks.awakened_draconium_4,	mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.draconium_gear,				ItemStacks.draconium_4,				mold_gear,	Config.energyMetalPress);
			
			MetalPressRecipe.addRecipe(ItemStacks.awakened_draconium_plate,		ItemStacks.awakened_draconium,		mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.draconium_plate,				ItemStacks.draconium,				mold_plate,	Config.energyMetalPress);
		}
		if (ModChecker.isEnderIOLoaded & Config.loadEnderIO) {
			MetalPressRecipe.addRecipe(ItemStacks.conductive_iron_gear,			ItemStacks.conductive_iron_4,		mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.dark_steel_gear,				ItemStacks.dark_steel_4,			mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.electrical_steel_gear,		ItemStacks.electrical_steel_4,		mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.end_steel_gear,				ItemStacks.end_steel_4,				mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.energetic_alloy_gear,			ItemStacks.energetic_alloy_4,		mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.pulsating_iron_gear,			ItemStacks.pulsating_iron_4,		mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.redstone_alloy_gear,			ItemStacks.redstone_alloy_4,		mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.soularium_gear,				ItemStacks.soularium_4,				mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.vibrant_alloy_gear,			ItemStacks.vibrant_alloy_4,			mold_gear,	Config.energyMetalPress);
			
			MetalPressRecipe.addRecipe(ItemStacks.conductive_iron_plate,		ItemStacks.conductive_iron,			mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.dark_steel_plate,				ItemStacks.dark_steel,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.electrical_steel_plate,		ItemStacks.electrical_steel,		mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.end_steel_plate,				ItemStacks.end_steel,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.energetic_alloy_plate,		ItemStacks.energetic_alloy,			mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.pulsating_iron_plate,			ItemStacks.pulsating_iron,			mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.redstone_alloy_plate,			ItemStacks.redstone_alloy,			mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.soularium_plate,				ItemStacks.soularium,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.vibrant_alloy_plate,			ItemStacks.vibrant_alloy,			mold_plate,	Config.energyMetalPress);
		}
		if (ModChecker.isExtraUtilitiesLoaded & Config.loadExtraUtilities) {
			MetalPressRecipe.addRecipe(ItemStacks.demon_gear,					ItemStacks.demon_4,					mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.enchanted_gear,				ItemStacks.enchanted_4,				mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.evil_infused_iron_gear,		ItemStacks.evil_infused_iron_4,		mold_gear,	Config.energyMetalPress);
			
			MetalPressRecipe.addRecipe(ItemStacks.demon_plate,					ItemStacks.demon,					mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.enchanted_plate,				ItemStacks.enchanted,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.evil_infused_iron_plate,		ItemStacks.evil_infused_iron,		mold_plate,	Config.energyMetalPress);
		}
		if (ModChecker.isMekanismLoaded & Config.loadMekanism) {
			MetalPressRecipe.addRecipe(ItemStacks.glowstone_gear,				ItemStacks.glowstone_4,				mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.osmium_gear,					ItemStacks.osmium_4,				mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.refined_obsidian_gear,		ItemStacks.refined_obsidian_4,		mold_gear,	Config.energyMetalPress);
			
			MetalPressRecipe.addRecipe(ItemStacks.glowstone_plate,				ItemStacks.glowstone,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.osmium_plate,					ItemStacks.osmium,					mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.refined_obsidian_plate,		ItemStacks.refined_obsidian,		mold_plate,	Config.energyMetalPress);
		}
		if (ModChecker.isMysticalAgradditionsLoaded & Config.loadMysticalAgradditions) {
			MetalPressRecipe.addRecipe(ItemStacks.insanium_gear,				ItemStacks.insanium_4,				mold_gear,	Config.energyMetalPress);
			
			MetalPressRecipe.addRecipe(ItemStacks.insanium_plate,				ItemStacks.insanium,				mold_plate,	Config.energyMetalPress);
		}
		if (ModChecker.isMysticalAgricultureLoaded & Config.loadMysticalAgriculture) {
			MetalPressRecipe.addRecipe(ItemStacks.inferium_gear,				ItemStacks.inferium_4,				mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.intermedium_gear,				ItemStacks.intermedium_4,			mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.prudentium_gear,				ItemStacks.prudentium_4,			mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.soulium_gear,					ItemStacks.soulium_4,				mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.superium_gear,				ItemStacks.superium_4,				mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.supremium_gear,				ItemStacks.supremium_4,				mold_gear,	Config.energyMetalPress);
			
			MetalPressRecipe.addRecipe(ItemStacks.inferium_plate,				ItemStacks.inferium,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.intermedium_plate,			ItemStacks.intermedium,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.prudentium_plate,				ItemStacks.prudentium,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.soulium_plate,				ItemStacks.soulium,					mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.superium_plate,				ItemStacks.superium,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.supremium_plate,				ItemStacks.supremium,				mold_plate,	Config.energyMetalPress);
		}
		if (ModChecker.isProjectELoaded & Config.loadProjectE) {
			MetalPressRecipe.addRecipe(ItemStacks.dark_matter_gear,				ItemStacks.dark_matter_4,			mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.red_matter_gear,				ItemStacks.red_matter_4,			mold_gear,	Config.energyMetalPress);
			
			MetalPressRecipe.addRecipe(ItemStacks.dark_matter_plate,			ItemStacks.dark_matter,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.red_matter_plate,				ItemStacks.red_matter,				mold_plate,	Config.energyMetalPress);
		}
		if (ModChecker.isProjectRedLoaded & Config.loadProjectRed) {
			MetalPressRecipe.addRecipe(ItemStacks.electrotine_gear,				ItemStacks.electrotine_4,			mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.red_alloy_gear,				ItemStacks.red_alloy_4,				mold_gear,	Config.energyMetalPress);
			
			MetalPressRecipe.addRecipe(ItemStacks.electrotine_plate,			ItemStacks.electrotine,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.red_alloy_plate,				ItemStacks.red_alloy,				mold_plate,	Config.energyMetalPress);
		}
		if (ModChecker.isRefinedStorageLoaded & Config.loadRefinedStorage) {
			MetalPressRecipe.addRecipe(ItemStacks.quartz_enriched_iron_gear,	ItemStacks.quartz_enriched_iron_4,	mold_gear,	Config.energyMetalPress);
			
			MetalPressRecipe.addRecipe(ItemStacks.quartz_enriched_iron_plate,	ItemStacks.quartz_enriched_iron,	mold_plate,	Config.energyMetalPress);
		}
		if (ModChecker.isTinkersConstructLoaded & Config.loadTinkersConstruct) {
			MetalPressRecipe.addRecipe(ItemStacks.ardite_gear,					ItemStacks.ardite_4,				mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.cobalt_gear,					ItemStacks.cobalt_4,				mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.knightslime_gear,				ItemStacks.knightslime_4,			mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.manyullyn_gear,				ItemStacks.manyullyn_4,				mold_gear,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.pig_iron_gear,				ItemStacks.pig_iron_4,				mold_gear,	Config.energyMetalPress);
			
			MetalPressRecipe.addRecipe(ItemStacks.ardite_plate,					ItemStacks.ardite,					mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.cobalt_plate,					ItemStacks.cobalt,					mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.knightslime_plate,			ItemStacks.knightslime,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.manyullyn_plate,				ItemStacks.manyullyn,				mold_plate,	Config.energyMetalPress);
			MetalPressRecipe.addRecipe(ItemStacks.pig_iron_plate,				ItemStacks.pig_iron,				mold_plate,	Config.energyMetalPress);
		}
		if (ItemHelper.oreNameExists("itemSilicon")) {
			MetalPressRecipe.addRecipe(ItemStacks.silicon_gear,					ItemStacks.silicon_4,				mold_gear,	Config.energyMetalPress);
			
			MetalPressRecipe.addRecipe(ItemStacks.silicon_plate,				ItemStacks.silicon,					mold_plate,	Config.energyMetalPress);
		}
	}
}