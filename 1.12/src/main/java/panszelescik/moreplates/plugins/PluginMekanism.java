package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginMekanism {
	
	static Item osmium_gear;
	static Item osmium_plate;
	static Item refined_glowstone_gear;
	static Item refined_glowstone_plate;
	static Item refined_obsidian_gear;
	static Item refined_obsidian_plate;
	
	public static void preInit() {
		osmium_gear = new ItemGear("osmium");
		osmium_plate = new ItemPlate("osmium");
		refined_glowstone_gear = new ItemGear("refined_glowstone");
		refined_glowstone_plate = new ItemPlate("refined_glowstone");
		refined_obsidian_gear = new ItemGear("refined_obsidian");
		refined_obsidian_plate = new ItemPlate("refined_obsidian");
		
		reg(OSMIUM, osmium_gear, osmium_plate);
		reg(REFINED_GLOWSTONE, refined_glowstone_gear, refined_glowstone_plate);
		reg(REFINED_OBSIDIAN, refined_obsidian_gear, refined_obsidian_plate);
	}
}