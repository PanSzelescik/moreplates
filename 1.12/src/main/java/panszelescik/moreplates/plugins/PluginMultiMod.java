package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.ModChecker;
import panszelescik.moreplates.config.Config;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.items.multimod.*;

public class PluginMultiMod {
	
	public static Item silicon_gear;
	public static Item silicon_plate;
	
	public static void preInit() {
		if (ModChecker.isAppliedEnergisticsLoaded & Config.loadAppliedEnergistics2) {
			silicon_gear =	new ItemSiliconGear	("silicon_gear",	"silicon_gear");
			silicon_plate =	new ItemSiliconPlate("silicon_plate",	"silicon_plate");
			
			Helper.registerItem(silicon_gear);
			Helper.registerItem(silicon_plate);
		}
		else if (ModChecker.isRefinedStorageLoaded & Config.loadRefinedStorage) {
			silicon_gear =	new	ItemSiliconGear	("silicon_gear",	"silicon_gear");
			silicon_plate = new	ItemSiliconPlate("silicon_plate",	"silicon_plate");
			
			Helper.registerRender(silicon_gear);
			Helper.registerRender(silicon_plate);
		}
	}
	
	public static void clientPreInit() {
		if (ModChecker.isAppliedEnergisticsLoaded & Config.loadAppliedEnergistics2) {
			Helper.registerRender(silicon_gear);
			Helper.registerRender(silicon_plate);
		}
		else if (ModChecker.isRefinedStorageLoaded & Config.loadRefinedStorage) {
			Helper.registerRender(silicon_gear);
			Helper.registerRender(silicon_plate);
		}
	}
	
	public static void init() {
		if (ModChecker.isAppliedEnergisticsLoaded & Config.loadAppliedEnergistics2) {
			OreDictionary.registerOre("gearSilicon",	silicon_gear);
			OreDictionary.registerOre("plateSilicon",	silicon_plate);
		}
		else if (ModChecker.isRefinedStorageLoaded & Config.loadRefinedStorage) {
			OreDictionary.registerOre("gearSilicon",	silicon_gear);
			OreDictionary.registerOre("plateSilicon",	silicon_plate);
		}
	}
}