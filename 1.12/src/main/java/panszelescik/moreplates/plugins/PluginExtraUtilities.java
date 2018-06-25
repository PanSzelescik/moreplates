package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginExtraUtilities {
	
	public static Item demon_gear;
	public static Item demon_plate;
	public static Item enchanted_gear;
	public static Item enchanted_plate;
	public static Item evil_infused_iron_gear;
	public static Item evil_infused_iron_plate;
	
	public static void preInit() {
		demon_gear = new ItemGear("demon");
		demon_plate = new ItemPlate("demon");
		enchanted_gear = new ItemGear("enchanted");
		enchanted_plate = new ItemPlate("enchanted");
		evil_infused_iron_gear = new ItemGear("evil_infused_iron");
		evil_infused_iron_plate = new ItemPlate("evil_infused_iron");
		
		regGear(demon_gear, DEMON);
		regPlate(demon_plate, DEMON);
		regGear(enchanted_gear, ENCHANTED);
		regPlate(enchanted_plate, ENCHANTED);
		regGear(evil_infused_iron_gear, EVIL_INFUSED_IRON);
		regPlate(evil_infused_iron_plate, EVIL_INFUSED_IRON);
	}
}