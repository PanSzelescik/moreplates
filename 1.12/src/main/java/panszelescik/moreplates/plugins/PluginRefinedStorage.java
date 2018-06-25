package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginRefinedStorage {
	
	public static Item quartz_enriched_iron_gear;
	public static Item quartz_enriched_iron_plate;
	
	public static void preInit() {
		quartz_enriched_iron_gear = new ItemGear("quartz_enriched_iron");
		quartz_enriched_iron_plate = new ItemPlate("quartz_enriched_iron");
		
		regGear(quartz_enriched_iron_gear, QUARTZ_ENRICHED_IRON);
		regPlate(quartz_enriched_iron_plate, QUARTZ_ENRICHED_IRON);
	}
}