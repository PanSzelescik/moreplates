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
		
		regGear(dark_matter_gear, DARK_MATTER);
		regPlate(dark_matter_plate, DARK_MATTER);
		regGear(red_matter_gear, RED_MATTER);
		regPlate(red_matter_plate, RED_MATTER);
	}
}