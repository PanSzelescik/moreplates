package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.ItemGear;
import panszelescik.moreplates.items.ItemPlate;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginProjectRed {
	
	public static Item electrotine_alloy_gear;
	public static Item electrotine_alloy_plate;
	public static Item red_alloy_gear;
	public static Item red_alloy_plate;
	
	public static void preInit() {
		electrotine_alloy_gear = new ItemGear("electrotine_alloy");
		electrotine_alloy_plate = new ItemPlate("electrotine_alloy");
		red_alloy_gear = new ItemGear("red_alloy");
		red_alloy_plate = new ItemPlate("red_alloy");
		
		registerItem(electrotine_alloy_gear);
		registerItem(electrotine_alloy_plate);
		registerItem(red_alloy_gear);
		registerItem(red_alloy_plate);
		
		oreGear(ELECTROTINE, electrotine_alloy_gear);
		orePlate(ELECTROTINE, electrotine_alloy_gear);
		oreGear(RED_ALLOY, red_alloy_gear);
		orePlate(RED_ALLOY, red_alloy_plate);
	}
	
	public static void clientPreInit() {
		registerRender(electrotine_alloy_gear);
		registerRender(electrotine_alloy_plate);
		registerRender(red_alloy_gear);
		registerRender(red_alloy_plate);
	}
}