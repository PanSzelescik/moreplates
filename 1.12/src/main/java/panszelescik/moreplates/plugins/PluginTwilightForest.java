package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginTwilightForest {
	
	public static Item fiery_gear;
	public static Item fiery_plate;
	public static Item ironwood_gear;
	public static Item ironwood_plate;
	public static Item knightmetal_gear;
	public static Item knightmetal_plate;
	
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