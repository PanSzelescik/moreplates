package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.items.draconicevolution.*;

public class PluginDraconicEvolution {
	
	public static Item awakened_draconium_gear;
	public static Item awakened_draconium_plate;
	public static Item draconium_gear;
	public static Item draconium_plate;
	
	public static void preInit() {
		awakened_draconium_gear =	new ItemAwakenedDraconiumGear	("awakened_draconium_gear",		"awakened_draconium_gear");
		awakened_draconium_plate =	new ItemAwakenedDraconiumPlate	("awakened_draconium_plate",	"awakened_draconium_plate");
		draconium_gear =			new ItemDraconiumGear			("draconium_gear",				"draconium_gear");
		draconium_plate =			new ItemDraconiumPlate			("draconium_plate",				"draconium_plate");
		
		Helper.registerItem(awakened_draconium_gear);
		Helper.registerItem(awakened_draconium_plate);
		Helper.registerItem(draconium_gear);
		Helper.registerItem(draconium_plate);
	}
	
	public static void clientPreInit() {
		Helper.registerRender(awakened_draconium_gear);
		Helper.registerRender(awakened_draconium_plate);
		Helper.registerRender(draconium_gear);
		Helper.registerRender(draconium_plate);
	}
	
	public static void init() {
		OreDictionary.registerOre("gearDraconiumAwakened",	awakened_draconium_gear);
		OreDictionary.registerOre("plateDraconiumAwakened",	awakened_draconium_plate);
		OreDictionary.registerOre("gearDraconium",			draconium_gear);
		OreDictionary.registerOre("plateDraconium",			draconium_plate);
	}
}