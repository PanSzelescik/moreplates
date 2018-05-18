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
		
		registerItem(fiery_gear);
		registerItem(fiery_plate);
		registerItem(ironwood_gear);
		registerItem(ironwood_plate);
		registerItem(knightmetal_gear);
		registerItem(knightmetal_plate);
		
		oreGear(FIERY, fiery_gear);
		orePlate(FIERY, fiery_plate);
		oreGear(IRONWOOD, ironwood_gear);
		orePlate(IRONWOOD, ironwood_plate);
		oreGear(KNIGHTMETAL, knightmetal_gear);
		orePlate(KNIGHTMETAL, knightmetal_plate);
	}
	
	public static void clientPreInit() {
		registerRender(fiery_gear);
		registerRender(fiery_plate);
		registerRender(ironwood_gear);
		registerRender(ironwood_plate);
		registerRender(knightmetal_gear);
		registerRender(knightmetal_plate);
	}
}