package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.items.refinedstorage.*;
import panszelescik.moreplates.register.*;

public class PluginRefinedStorage {
	
	public static Item quartz_enriched_iron_gear;
	public static Item quartz_enriched_iron_plate;
	
	public static void preInit() {
		quartz_enriched_iron_gear =		new ItemQuartzEnrichedIronGear	("quartz_enriched_iron_gear",	"quartz_enriched_iron_gear");
		quartz_enriched_iron_plate =	new ItemQuartzEnrichedIronPlate	("quartz_enriched_iron_plate",	"quartz_enriched_iron_plate");
		
		RegisterItem.register(quartz_enriched_iron_gear);
		RegisterItem.register(quartz_enriched_iron_plate);
	}
	
	public static void clientPreInit() {
		RegisterRender.register(quartz_enriched_iron_gear);
		RegisterRender.register(quartz_enriched_iron_plate);
	}
	
	public static void init() {
		OreDictionary.registerOre("gearQuartzEnrichedIron",		quartz_enriched_iron_gear);
		OreDictionary.registerOre("plateQuartzEnrichedIron",	quartz_enriched_iron_plate);
	}
}