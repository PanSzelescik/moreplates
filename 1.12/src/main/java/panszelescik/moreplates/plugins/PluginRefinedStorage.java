package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.items.refinedstorage.*;

public class PluginRefinedStorage {
	
	public static Item quartz_enriched_iron_gear;
	public static Item quartz_enriched_iron_plate;
	
	public static void preInit() {
		quartz_enriched_iron_gear =		new ItemQuartzEnrichedIronGear	("quartz_enriched_iron_gear",	"quartz_enriched_iron_gear");
		quartz_enriched_iron_plate =	new ItemQuartzEnrichedIronPlate	("quartz_enriched_iron_plate",	"quartz_enriched_iron_plate");
		
		Helper.registerItem(quartz_enriched_iron_gear);
		Helper.registerItem(quartz_enriched_iron_plate);
	}
	
	public static void clientPreInit() {
		Helper.registerRender(quartz_enriched_iron_gear);
		Helper.registerRender(quartz_enriched_iron_plate);
	}
	
	public static void init() {
		OreDictionary.registerOre("gearQuartzEnrichedIron",		quartz_enriched_iron_gear);
		OreDictionary.registerOre("plateQuartzEnrichedIron",	quartz_enriched_iron_plate);
	}
}