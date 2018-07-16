package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginDraconicEvolution {
	
	static Item awakened_draconium_gear;
	static Item awakened_draconium_plate;
	static Item draconium_gear;
	static Item draconium_plate;
	
	public static void preInit() {
		awakened_draconium_gear = new ItemGear("awakened_draconium");
		awakened_draconium_plate = new ItemPlate("awakened_draconium");
		draconium_gear = new ItemGear("draconium");
		draconium_plate = new ItemPlate("draconium");
		
		reg(AWAKENED_DRACONIUM, awakened_draconium_gear, awakened_draconium_plate);
		reg(DRACONIUM, draconium_gear, draconium_plate);
	}
}