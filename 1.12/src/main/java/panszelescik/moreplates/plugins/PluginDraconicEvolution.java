package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.draconicevolution.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginDraconicEvolution {
	
	public static Item awakened_draconium_gear;
	public static Item awakened_draconium_plate;
	public static Item draconium_gear;
	public static Item draconium_plate;
	
	public static void preInit() {
		awakened_draconium_gear = new ItemAwakenedDraconiumGear("awakened_draconium_gear",	 "awakened_draconium_gear");
		awakened_draconium_plate = new ItemAwakenedDraconiumPlate("awakened_draconium_plate", "awakened_draconium_plate");
		draconium_gear = new ItemDraconiumGear("draconium_gear", "draconium_gear");
		draconium_plate = new ItemDraconiumPlate("draconium_plate",	 "draconium_plate");
		
		registerItem(awakened_draconium_gear);
		registerItem(awakened_draconium_plate);
		registerItem(draconium_gear);
		registerItem(draconium_plate);
	}
	
	public static void clientPreInit() {
		registerRender(awakened_draconium_gear);
		registerRender(awakened_draconium_plate);
		registerRender(draconium_gear);
		registerRender(draconium_plate);
	}
	
	public static void init() {
		oreGear(AWAKENED_DRACONIUM, awakened_draconium_gear);
		orePlate(AWAKENED_DRACONIUM, awakened_draconium_plate);
		oreGear(DRACONIUM, draconium_gear);
		orePlate(DRACONIUM, draconium_plate);
	}
}