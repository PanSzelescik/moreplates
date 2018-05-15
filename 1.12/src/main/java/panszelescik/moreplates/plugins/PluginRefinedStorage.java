package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.ItemGear;
import panszelescik.moreplates.items.ItemPlate;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginRefinedStorage {
	
	public static Item quartz_enriched_iron_gear;
	public static Item quartz_enriched_iron_plate;
	
	public static void preInit() {
		quartz_enriched_iron_gear = new ItemGear("quartz_enriched_iron");
		quartz_enriched_iron_plate = new ItemPlate("quartz_enriched_iron");
		
		registerItem(quartz_enriched_iron_gear);
		registerItem(quartz_enriched_iron_plate);
		
		oreGear(QUARTZ_ENRICHED_IRON, quartz_enriched_iron_gear);
		orePlate(QUARTZ_ENRICHED_IRON, quartz_enriched_iron_plate);
	}
	
	public static void clientPreInit() {
		registerRender(quartz_enriched_iron_gear);
		registerRender(quartz_enriched_iron_plate);
	}
}