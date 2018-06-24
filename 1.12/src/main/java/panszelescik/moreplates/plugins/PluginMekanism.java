package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginMekanism {
	
	public static Item osmium_gear;
	public static Item osmium_plate;
	public static Item refined_glowstone_gear;
	public static Item refined_glowstone_plate;
	public static Item refined_obsidian_gear;
	public static Item refined_obsidian_plate;
	
	public static void preInit() {
		osmium_gear = new ItemGear("osmium");
		osmium_plate = new ItemPlate("osmium");
		refined_glowstone_gear = new ItemGear("refined_glowstone");
		refined_glowstone_plate = new ItemPlate("refined_glowstone");
		refined_obsidian_gear = new ItemGear("refined_obsidian");
		refined_obsidian_plate = new ItemPlate("refined_obsidian");
		
		registerItem(osmium_gear);
		registerItem(osmium_plate);
		registerItem(refined_glowstone_gear);
		registerItem(refined_glowstone_plate);
		registerItem(refined_obsidian_gear);
		registerItem(refined_obsidian_plate);
		
		oreGear(OSMIUM, osmium_gear);
		orePlate(OSMIUM, osmium_plate);
		oreGear(REFINED_GLOWSTONE, refined_glowstone_gear);
		orePlate(REFINED_GLOWSTONE, refined_glowstone_plate);
		oreGear(REFINED_OBSIDIAN, refined_obsidian_gear);
		orePlate(REFINED_OBSIDIAN, refined_obsidian_plate);
	}
	
	public static void clientPreInit() {
		registerRender(osmium_gear);
		registerRender(osmium_plate);
		registerRender(refined_glowstone_gear);
		registerRender(refined_glowstone_plate);
		registerRender(refined_obsidian_gear);
		registerRender(refined_obsidian_plate);
	}
}