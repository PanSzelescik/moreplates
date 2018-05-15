package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.ItemGear;
import panszelescik.moreplates.items.ItemPlate;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginMekanism {
	
	public static Item glowstone_gear;
	public static Item glowstone_plate;
	public static Item osmium_gear;
	public static Item osmium_plate;
	public static Item refined_obsidian_gear;
	public static Item refined_obsidian_plate;
	
	public static void preInit() {
		glowstone_gear = new ItemGear("glowstone");
		glowstone_plate = new ItemPlate("glowstone");
		osmium_gear = new ItemGear("osmium");
		osmium_plate = new ItemPlate("osmium");
		refined_obsidian_gear = new ItemGear("refined_obsidian");
		refined_obsidian_plate = new ItemPlate("refined_obsidian");
		
		registerItem(glowstone_gear);
		registerItem(glowstone_plate);
		registerItem(osmium_gear);
		registerItem(osmium_plate);
		registerItem(refined_obsidian_gear);
		registerItem(refined_obsidian_plate);
		
		oreGear(GLOWSTONE, glowstone_gear);
		orePlate(GLOWSTONE, glowstone_plate);
		oreGear(OSMIUM, osmium_gear);
		orePlate(OSMIUM, osmium_plate);
		oreGear(REFINED_OBSIDIAN, refined_obsidian_gear);
		orePlate(REFINED_OBSIDIAN, refined_obsidian_plate);
	}
	
	public static void clientPreInit() {
		registerRender(glowstone_gear);
		registerRender(glowstone_plate);
		registerRender(osmium_gear);
		registerRender(osmium_plate);
		registerRender(refined_obsidian_gear);
		registerRender(refined_obsidian_plate);
	}
}