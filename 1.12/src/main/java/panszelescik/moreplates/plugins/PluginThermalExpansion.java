package panszelescik.moreplates.plugins;

import cofh.core.util.helpers.ItemHelper;
import cofh.thermalexpansion.util.managers.machine.CompactorManager;
import cofh.thermalexpansion.util.managers.machine.CompactorManager.Mode;
import panszelescik.moreplates.ModChecker;
import panszelescik.moreplates.config.Config;
import panszelescik.moreplates.helpers.ItemStacks;

public class PluginThermalExpansion {
	
	public static void postInit() {
		if (ModChecker.isAppliedEnergisticsLoaded & Config.loadAppliedEnergistics2) {
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.certus_4,				ItemStacks.certus_quartz_gear,			Mode.GEAR);
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.pure_certus_4,			ItemStacks.certus_quartz_gear,			Mode.GEAR);
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.fluix_4,					ItemStacks.fluix_gear,					Mode.GEAR);
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.pure_fluix_4,			ItemStacks.fluix_gear,					Mode.GEAR);
			
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.certus,					ItemStacks.certus_quartz_plate,			Mode.PLATE);
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.pure_certus,				ItemStacks.certus_quartz_plate,			Mode.PLATE);
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.fluix,					ItemStacks.fluix_plate,					Mode.PLATE);
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.pure_fluix,				ItemStacks.fluix_plate,					Mode.PLATE);
		}
		if (ModChecker.isBotaniaLoaded & Config.loadBotania) {
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.gaia_4,					ItemStacks.gaia_spirit_gear,			Mode.GEAR);
			
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.gaia,					ItemStacks.gaia_spirit_plate,			Mode.PLATE);
		}
		if (ModChecker.isCalculatorLoaded & Config.loadCalculator) {
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.redstone_4,				ItemStacks.redstone_gear,				Mode.GEAR);
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.reinforced_iron_4,		ItemStacks.reinforced_iron_gear,		Mode.GEAR);
			
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.redstone,				ItemStacks.redstone_plate,				Mode.PLATE);
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.reinforced_iron,			ItemStacks.reinforced_iron_plate,		Mode.PLATE);
		}
		if (ModChecker.isExtraUtilitiesLoaded & Config.loadExtraUtilities) {
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.demon_4,					ItemStacks.demon_gear,					Mode.GEAR);
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.enchanted_4,				ItemStacks.enchanted_gear,				Mode.GEAR);
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.evil_infused_iron_4,		ItemStacks.evil_infused_iron_gear,		Mode.GEAR);
			
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.demon,					ItemStacks.demon_plate,					Mode.PLATE);
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.enchanted,				ItemStacks.enchanted_plate,				Mode.PLATE);
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.evil_infused_iron,		ItemStacks.evil_infused_iron_plate,		Mode.PLATE);
		}
		if (ModChecker.isProjectELoaded & Config.loadProjectE) {
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.dark_matter_4,			ItemStacks.dark_matter_gear,			Mode.GEAR);
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.red_matter_4,			ItemStacks.red_matter_gear,				Mode.GEAR);
			
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.dark_matter,				ItemStacks.dark_matter_plate,			Mode.PLATE);
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.red_matter,				ItemStacks.red_matter_plate,			Mode.PLATE);
		}
		if (ModChecker.isRefinedStorageLoaded & Config.loadRefinedStorage) {
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.quartz_enriched_iron_4,	ItemStacks.quartz_enriched_iron_gear,	Mode.GEAR);
			
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.quartz_enriched_iron,	ItemStacks.quartz_enriched_iron_plate,	Mode.PLATE);
		}
		if (ItemHelper.oreNameExists("itemSilicon")) {
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.silicon_4,				ItemStacks.silicon_gear,				Mode.GEAR);
			
			CompactorManager.addRecipe(Config.energyCompactor,	ItemStacks.silicon,					ItemStacks.silicon_plate,				Mode.PLATE);
		}
	}
}