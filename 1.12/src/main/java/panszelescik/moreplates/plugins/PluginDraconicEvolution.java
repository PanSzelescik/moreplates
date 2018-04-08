package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.items.draconicevolution.*;
import panszelescik.moreplates.register.*;

public class PluginDraconicEvolution {
	
	public static Item awakened_draconium_gear;
	public static Item awakened_draconium_plate;
	public static Item draconium_gear;
	public static Item draconium_plate;
	
	public static void init() {
		awakened_draconium_gear = new ItemAwakenedDraconiumGear("awakened_draconium_gear", "awakened_draconium_gear");
		awakened_draconium_plate = new ItemAwakenedDraconiumPlate("awakened_draconium_plate", "awakened_draconium_plate");
		draconium_gear = new ItemDraconiumGear("draconium_gear", "draconium_gear");
		draconium_plate = new ItemDraconiumPlate("draconium_plate", "draconium_plate");
	}
	
	public static void register() {
		RegisterItem.register(awakened_draconium_gear);
		RegisterItem.register(awakened_draconium_plate);
		RegisterItem.register(draconium_gear);
		RegisterItem.register(draconium_plate);
	}
	
	public static void registerRenders() {
		RegisterRender.register(awakened_draconium_gear);
		RegisterRender.register(awakened_draconium_plate);
		RegisterRender.register(draconium_gear);
		RegisterRender.register(draconium_plate);
	}
	
	public static void registerOreDict() {
		OreDictionary.registerOre("gearDraconiumAwakened", awakened_draconium_gear);
		OreDictionary.registerOre("plateDraconiumAwakened", awakened_draconium_plate);
		OreDictionary.registerOre("gearDraconium", draconium_gear);
		OreDictionary.registerOre("plateDraconium", draconium_plate);
	}
	
}