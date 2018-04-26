package panszelescik.moreplates.plugins;

import cofh.core.util.helpers.ItemHelper;
import cofh.thermalexpansion.util.managers.machine.CompactorManager;
import cofh.thermalexpansion.util.managers.machine.CompactorManager.Mode;
import net.minecraft.item.ItemStack;
import panszelescik.moreplates.ModChecker;
import panszelescik.moreplates.config.Config;
import panszelescik.moreplates.helpers.Helper;

public class PluginThermalExpansion {
	
	private static int energy = 4000;
	
	public static void postInit() {
		if (ModChecker.isAppliedEnergisticsLoaded & Config.loadAppliedEnergistics2) {
			ItemStack certus_quartz_gear = ItemHelper.getOre("gearCertusQuartz");
			ItemStack certus_quartz_plate = ItemHelper.getOre("plateCertusQuartz");
			ItemStack fluix_gear = ItemHelper.getOre("gearFluix");
			ItemStack fluix_plate = ItemHelper.getOre("plateFluix");
			
			ItemStack certus_4 = ItemHelper.getOre("crystalCertusQuartz", 4);
			ItemStack pure_certus_4 = Helper.getItemStack("appliedenergistics2", "material", 4, 10);
			ItemStack fluix_4 = ItemHelper.getOre("crystalFluix", 4);
			ItemStack pure_fluix_4 = ItemHelper.getOre("crystalPureFluix", 4);
			
			ItemStack certus = ItemHelper.getOre("crystalCertusQuartz");
			ItemStack pure_certus = Helper.getItemStack("appliedenergistics2", "material", 1, 10);
			ItemStack fluix = ItemHelper.getOre("crystalFluix");
			ItemStack pure_fluix = ItemHelper.getOre("crystalPureFluix");
			
			CompactorManager.addRecipe(energy, certus_4, certus_quartz_gear, Mode.GEAR);
			CompactorManager.addRecipe(energy, pure_certus_4, certus_quartz_gear, Mode.GEAR);
			CompactorManager.addRecipe(energy, fluix_4, fluix_gear, Mode.GEAR);
			CompactorManager.addRecipe(energy, pure_fluix_4, fluix_gear, Mode.GEAR);
			
			CompactorManager.addRecipe(energy, certus, certus_quartz_plate, Mode.PLATE);
			CompactorManager.addRecipe(energy, pure_certus, certus_quartz_plate, Mode.PLATE);
			CompactorManager.addRecipe(energy, fluix, fluix_plate, Mode.PLATE);
			CompactorManager.addRecipe(energy, pure_fluix, fluix_plate, Mode.PLATE);
		}
		if (ModChecker.isBotaniaLoaded & Config.loadBotania) {
			ItemStack gaia_gear = ItemHelper.getOre("gaiaGear");
			ItemStack gaia_plate = ItemHelper.getOre("gaiaPlate");
			
			ItemStack gaia_4 = ItemHelper.getOre("gaiaIngot", 4);
			ItemStack gaia = ItemHelper.getOre("gaiaIngot");
			
			CompactorManager.addRecipe(energy, gaia_4, gaia_gear, Mode.GEAR);
			
			CompactorManager.addRecipe(energy, gaia, gaia_plate, Mode.PLATE);
		}
		if (ModChecker.isCalculatorLoaded & Config.loadCalculator) {
			ItemStack redstone_gear = ItemHelper.getOre("gearRedstone");
			ItemStack redstone_plate = ItemHelper.getOre("plateRedstone");
			ItemStack reinforced_iron_gear = ItemHelper.getOre("gearReinforcedIron");
			ItemStack reinforced_iron_plate = ItemHelper.getOre("plateReinforcedIron");
			
			ItemStack redstone_4 = Helper.getItemStack("calculator", "redstoneingot", 4);
			ItemStack reinforced_iron_4 = Helper.getItemStack("calculator", "reinforcedironingot", 4);
			
			ItemStack redstone = Helper.getItemStack("calculator", "redstoneingot");
			ItemStack reinforced_iron = Helper.getItemStack("calculator", "reinforcedironingot");
			
			CompactorManager.addRecipe(energy, redstone_4, redstone_gear, Mode.GEAR);
			CompactorManager.addRecipe(energy, reinforced_iron_4, reinforced_iron_gear, Mode.GEAR);
			
			CompactorManager.addRecipe(energy, redstone, redstone_plate, Mode.PLATE);
			CompactorManager.addRecipe(energy, reinforced_iron, reinforced_iron_plate, Mode.PLATE);
		}
		if (ModChecker.isExtraUtilitiesLoaded & Config.loadExtraUtilities) {
			ItemStack demon_gear = ItemHelper.getOre("gearDemon");
			ItemStack demon_plate = ItemHelper.getOre("plateDemon");
			ItemStack enchanted_gear = ItemHelper.getOre("gearEnchanted");
			ItemStack enchanted_plate = ItemHelper.getOre("plateEnchanted");
			ItemStack evil_infused_iron_gear = ItemHelper.getOre("gearEvilInfusedIron");
			ItemStack evil_infused_iron_plate = ItemHelper.getOre("plateEvilInfusedIron");
			
			ItemStack demon_4 = Helper.getItemStack("extrautils2", "ingredients", 4, 11);
			ItemStack enchanted_4 = Helper.getItemStack("extrautils2", "ingredients", 4, 12);
			ItemStack evil_infused_iron_4 = Helper.getItemStack("extrautils2", "ingredients", 4, 17);
			
			ItemStack demon = Helper.getItemStack("extrautils2", "ingredients", 1, 11);
			ItemStack enchanted = Helper.getItemStack("extrautils2", "ingredients", 1, 12);
			ItemStack evil_infused_iron = Helper.getItemStack("extrautils2", "ingredients", 1, 17);
			
			CompactorManager.addRecipe(energy, demon_4, demon_gear, Mode.GEAR);
			CompactorManager.addRecipe(energy, enchanted_4, enchanted_gear, Mode.GEAR);
			CompactorManager.addRecipe(energy, evil_infused_iron_4, evil_infused_iron_gear, Mode.GEAR);
			
			CompactorManager.addRecipe(energy, demon, demon_plate, Mode.PLATE);
			CompactorManager.addRecipe(energy, enchanted, enchanted_plate, Mode.PLATE);
			CompactorManager.addRecipe(energy, evil_infused_iron, evil_infused_iron_plate, Mode.PLATE);
		}
		if (ModChecker.isProjectELoaded & Config.loadProjectE) {
			ItemStack dark_matter_gear = ItemHelper.getOre("gearDarkMatter");
			ItemStack dark_matter_plate = ItemHelper.getOre("plateDarkMatter");
			ItemStack red_matter_gear = ItemHelper.getOre("gearRedMatter");
			ItemStack red_matter_plate = ItemHelper.getOre("plateRedMatter");
			
			ItemStack dark_matter_4 = Helper.getItemStack("projecte", "item.pe_matter", 4, 0);
			ItemStack red_matter_4 = Helper.getItemStack("projecte", "item.pe_matter", 4, 1);
			
			ItemStack dark_matter = Helper.getItemStack("projecte", "item.pe_matter", 1, 0);
			ItemStack red_matter = Helper.getItemStack("projecte", "item.pe_matter", 1, 1);
			
			CompactorManager.addRecipe(energy, dark_matter_4, dark_matter_gear, Mode.GEAR);
			CompactorManager.addRecipe(energy, red_matter_4, red_matter_gear, Mode.GEAR);
			
			CompactorManager.addRecipe(energy, dark_matter, dark_matter_plate, Mode.PLATE);
			CompactorManager.addRecipe(energy, red_matter, red_matter_plate, Mode.PLATE);
		}
		if (ModChecker.isRefinedStorageLoaded & Config.loadRefinedStorage) {
			ItemStack quartz_enriched_iron_gear = ItemHelper.getOre("gearQuartzEnrichedIron");
			ItemStack quartz_enriched_iron_plate = ItemHelper.getOre("plateQuartzEnrichedIron");
			
			ItemStack quartz_enriched_iron_4 = Helper.getItemStack("refinedstorage", "quartz_enriched_iron", 4);
			
			ItemStack quartz_enriched_iron = Helper.getItemStack("refinedstorage", "quartz_enriched_iron");
			
			CompactorManager.addRecipe(energy, quartz_enriched_iron_4, quartz_enriched_iron_gear, Mode.GEAR);
			CompactorManager.addRecipe(energy, quartz_enriched_iron, quartz_enriched_iron_plate, Mode.PLATE);
		}
		if (ItemHelper.oreNameExists("itemSilicon")) {
			ItemStack silicon_gear = ItemHelper.getOre("gearSilicon");
			ItemStack silicon_plate = ItemHelper.getOre("plateSilicon");
			
			ItemStack silicon_4 = ItemHelper.getOre("itemSilicon", 4);
			ItemStack silicon = ItemHelper.getOre("itemSilicon");
			
			CompactorManager.addRecipe(energy, silicon_4, silicon_gear, Mode.GEAR);
			CompactorManager.addRecipe(energy, silicon, silicon_plate, Mode.PLATE);
		}
	}
}