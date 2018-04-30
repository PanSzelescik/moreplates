package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.refinedstorage.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginRefinedStorage {
	
	public static Item quartz_enriched_iron_gear;
	public static Item quartz_enriched_iron_plate;
	
	public static void preInit() {
		quartz_enriched_iron_gear = new ItemQuartzEnrichedIronGear("quartz_enriched_iron_gear");
		quartz_enriched_iron_plate = new ItemQuartzEnrichedIronPlate("quartz_enriched_iron_plate");
		
		registerItem(quartz_enriched_iron_gear);
		registerItem(quartz_enriched_iron_plate);
	}
	
	public static void clientPreInit() {
		registerRender(quartz_enriched_iron_gear);
		registerRender(quartz_enriched_iron_plate);
	}
	
	public static void init() {
		oreGear(QUARTZ_ENRICHED_IRON, quartz_enriched_iron_gear);
		orePlate(QUARTZ_ENRICHED_IRON, quartz_enriched_iron_plate);
	}
}