package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.ModChecker.*;
import static panszelescik.moreplates.config.Config.*;
import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginMultiMod {
	
	static Item silicon_gear;
	static Item silicon_plate;
	
	public static void preInit() {
		if (isAppliedEnergisticsLoaded & loadAppliedEnergistics2) {
			silicon_gear = new ItemGear("silicon");
			silicon_plate = new ItemPlate("silicon");
			
			reg(SILICON, silicon_gear, silicon_plate);
		}
		else if (isRefinedStorageLoaded & loadRefinedStorage) {
			silicon_gear = new ItemGear("silicon");
			silicon_plate = new ItemPlate("silicon");
			
			reg(SILICON, silicon_gear, silicon_plate);
		}
	}
}