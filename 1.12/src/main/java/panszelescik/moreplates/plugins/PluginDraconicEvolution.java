package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.ItemGear;
import panszelescik.moreplates.items.ItemPlate;

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
		
		registerItem(awakened_draconium_gear);
		registerItem(awakened_draconium_plate);
		registerItem(draconium_gear);
		registerItem(draconium_plate);
		
		oreGear(AWAKENED_DRACONIUM, awakened_draconium_gear);
		orePlate(AWAKENED_DRACONIUM, awakened_draconium_plate);
		oreGear(DRACONIUM, draconium_gear);
		orePlate(DRACONIUM, draconium_plate);
	}
	
	public static void clientPreInit() {
		registerRender(awakened_draconium_gear);
		registerRender(awakened_draconium_plate);
		registerRender(draconium_gear);
		registerRender(draconium_plate);
	}
}