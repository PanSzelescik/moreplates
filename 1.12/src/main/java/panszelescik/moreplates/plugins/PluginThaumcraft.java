package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginThaumcraft {
	
	static Item amber_gear;
	static Item amber_plate;
	static Item quicksilver_gear;
	static Item quicksilver_plate;
	
	public static void preInit() {
		amber_gear = new ItemGear("amber");
		amber_plate = new ItemPlate("amber");
		quicksilver_gear = new ItemGear("quicksilver");
		quicksilver_plate = new ItemPlate("quicksilver");
		
		reg(AMBER, amber_gear, amber_plate);
		reg(QUICKSILVER, quicksilver_gear, quicksilver_plate);
	}
}