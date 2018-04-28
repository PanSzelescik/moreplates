package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.multimod.*;

import static panszelescik.moreplates.ModChecker.*;
import static panszelescik.moreplates.config.Config.*;
import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginMultiMod {
	
	public static Item silicon_gear;
	public static Item silicon_plate;
	
	public static void preInit() {
		if (isAppliedEnergisticsLoaded & loadAppliedEnergistics2) {
			silicon_gear = new ItemSiliconGear("silicon_gear", "silicon_gear");
			silicon_plate = new ItemSiliconPlate("silicon_plate", "silicon_plate");
			
			registerItem(silicon_gear);
			registerItem(silicon_plate);
		}
		else if (isRefinedStorageLoaded & loadRefinedStorage) {
			silicon_gear = new ItemSiliconGear("silicon_gear", "silicon_gear");
			silicon_plate = new	ItemSiliconPlate("silicon_plate", "silicon_plate");
			
			registerRender(silicon_gear);
			registerRender(silicon_plate);
		}
	}
	
	public static void clientPreInit() {
		if (isAppliedEnergisticsLoaded & loadAppliedEnergistics2) {
			registerRender(silicon_gear);
			registerRender(silicon_plate);
		}
		else if (isRefinedStorageLoaded & loadRefinedStorage) {
			registerRender(silicon_gear);
			registerRender(silicon_plate);
		}
	}
	
	public static void init() {
		if (isAppliedEnergisticsLoaded & loadAppliedEnergistics2) {
			oreGear(SILICON, silicon_gear);
			orePlate(SILICON, silicon_plate);
		}
		else if (isRefinedStorageLoaded & loadRefinedStorage) {
			oreGear(SILICON, silicon_gear);
			orePlate(SILICON, silicon_plate);
		}
	}
}