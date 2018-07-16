package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginTwilightForest {
	
	static Item fiery_gear;
	static Item fiery_plate;
	static Item ironwood_gear;
	static Item ironwood_plate;
	static Item knightmetal_gear;
	static Item knightmetal_plate;
	
	public static void preInit() {
		fiery_gear = new ItemGear("fiery");
		fiery_plate = new ItemPlate("fiery");
		ironwood_gear = new ItemGear("ironwood");
		ironwood_plate = new ItemPlate("ironwood");
		knightmetal_gear = new ItemGear("knightmetal");
		knightmetal_plate = new ItemPlate("knightmetal");
		
		reg(FIERY, fiery_gear, fiery_plate);
		reg(IRONWOOD, ironwood_gear, ironwood_plate);
		reg(KNIGHTMETAL, knightmetal_gear, knightmetal_plate);
	}
}