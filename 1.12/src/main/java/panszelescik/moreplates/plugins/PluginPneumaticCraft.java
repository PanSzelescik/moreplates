package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginPneumaticCraft {
	
	public static Item compressed_iron_gear;
	public static Item compressed_iron_plate;
	
	public static void preInit() {
		compressed_iron_gear = new ItemGear("compressed_iron");
		compressed_iron_plate = new ItemPlate("compressed_iron");
		
		registerItem(compressed_iron_gear);
		registerItem(compressed_iron_plate);
		
		oreGear(COMPRESSED_IRON, compressed_iron_gear);
		orePlate(COMPRESSED_IRON, compressed_iron_plate);
	}
	
	public static void clientPreInit() {
		registerRender(compressed_iron_gear);
		registerRender(compressed_iron_plate);
	}
}