package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginDraconicEvolution {
	
	public static Item awakened_draconium_gear;
	public static Item awakened_draconium_plate;
	public static Item draconium_gear;
	public static Item draconium_plate;
	
	public static void preInit() {
		awakened_draconium_gear = new ItemGear("awakened_draconium");
		awakened_draconium_plate = new ItemPlate("awakened_draconium");
		draconium_gear = new ItemGear("draconium");
		draconium_plate = new ItemPlate("draconium");
		
		regGear(awakened_draconium_gear, AWAKENED_DRACONIUM);
		regPlate(awakened_draconium_plate, AWAKENED_DRACONIUM);
		regGear(draconium_gear, DRACONIUM);
		regPlate(draconium_plate, DRACONIUM);
	}
}