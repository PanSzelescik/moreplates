package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginThaumcraft {
	
	public static Item amber_gear;
	public static Item amber_plate;
	public static Item quicksilver_gear;
	public static Item quicksilver_plate;
	
	public static void preInit() {
		amber_gear = new ItemGear("amber");
		amber_plate = new ItemPlate("amber");
		quicksilver_gear = new ItemGear("quicksilver");
		quicksilver_plate = new ItemPlate("quicksilver");
		
		registerItem(amber_gear);
		registerItem(amber_plate);
		registerItem(quicksilver_gear);
		registerItem(quicksilver_plate);
		
		oreGear(AMBER, amber_gear);
		orePlate(AMBER, amber_plate);
		oreGear(QUICKSILVER, quicksilver_gear);
		orePlate(QUICKSILVER, quicksilver_plate);
	}
	
	public static void clientPreInit() {
		registerRender(amber_gear);
		registerRender(amber_plate);
		registerRender(quicksilver_gear);
		registerRender(quicksilver_plate);
	}
}