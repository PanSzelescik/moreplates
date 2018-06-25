package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

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
		
		regGear(electrotine_alloy_gear, ELECTROTINE);
		regPlate(electrotine_alloy_plate, ELECTROTINE);
		regGear(red_alloy_gear, RED_ALLOY);
		regPlate(red_alloy_plate, RED_ALLOY);
	}
}