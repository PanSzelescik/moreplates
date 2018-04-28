package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.projecte.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginProjectE {
	
	public static Item dark_matter_gear;
	public static Item dark_matter_plate;
	public static Item red_matter_gear;
	public static Item red_matter_plate;
	
	public static void preInit() {
		dark_matter_gear = new ItemDarkMatterGear("dark_matter_gear", "dark_matter_gear");
		dark_matter_plate = new ItemDarkMatterPlate("dark_matter_plate", "dark_matter_plate");
		red_matter_gear = new ItemRedMatterGear("red_matter_gear", "red_matter_gear");
		red_matter_plate = new ItemRedMatterPlate("red_matter_plate", "red_matter_plate");
		
		registerItem(dark_matter_gear);
		registerItem(dark_matter_plate);
		registerItem(red_matter_gear);
		registerItem(red_matter_plate);
	}
	
	public static void clientPreInit() {
		registerRender(dark_matter_gear);
		registerRender(dark_matter_plate);
		registerRender(red_matter_gear);
		registerRender(red_matter_plate);
	}
	
	public static void init() {
		oreGear(DARK_MATTER, dark_matter_gear);
		orePlate(DARK_MATTER, dark_matter_plate);
		oreGear(RED_MATTER, red_matter_gear);
		orePlate(RED_MATTER, red_matter_plate);
	}
}