package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginProjectE {
	
	public static Item dark_matter_gear;
	public static Item dark_matter_plate;
	public static Item red_matter_gear;
	public static Item red_matter_plate;
	
	public static void preInit() {
		dark_matter_gear = new ItemGear("dark_matter");
		dark_matter_plate = new ItemPlate("dark_matter");
		red_matter_gear = new ItemGear("red_matter");
		red_matter_plate = new ItemPlate("red_matter");
		
		registerItem(dark_matter_gear);
		registerItem(dark_matter_plate);
		registerItem(red_matter_gear);
		registerItem(red_matter_plate);
		
		oreGear(DARK_MATTER, dark_matter_gear);
		orePlate(DARK_MATTER, dark_matter_plate);
		oreGear(RED_MATTER, red_matter_gear);
		orePlate(RED_MATTER, red_matter_plate);
	}
	
	public static void clientPreInit() {
		registerRender(dark_matter_gear);
		registerRender(dark_matter_plate);
		registerRender(red_matter_gear);
		registerRender(red_matter_plate);
	}
}