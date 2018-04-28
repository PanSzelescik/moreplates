package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.extrautils2.*;

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
		demon_gear = new ItemDemonGear("demon_gear", "demon_gear");
		demon_plate = new ItemDemonPlate("demon_plate", "demon_plate");
		enchanted_gear = new ItemEnchantedGear("enchanted_gear", "enchanted_gear");
		enchanted_plate = new ItemEnchantedPlate("enchanted_plate", "enchanted_plate");
		evil_infused_iron_gear = new ItemEvilInfusedIronGear("evil_infused_iron_gear", "evil_infused_iron_gear");
		evil_infused_iron_plate = new ItemEvilInfusedIronPlate("evil_infused_iron_plate", "evil_infused_iron_plate");
		
		registerItem(demon_gear);
		registerItem(demon_plate);
		registerItem(enchanted_gear);
		registerItem(enchanted_plate);
		registerItem(evil_infused_iron_gear);
		registerItem(evil_infused_iron_plate);
	}
	
	public static void clientPreInit() {
		registerRender(demon_gear);
		registerRender(demon_plate);
		registerRender(enchanted_gear);
		registerRender(enchanted_plate);
		registerRender(evil_infused_iron_gear);
		registerRender(evil_infused_iron_plate);
	}
	
	public static void init() {
		oreGear(DEMON, demon_gear);
		orePlate(DEMON, demon_plate);
		oreGear(ENCHANTED, enchanted_gear);
		orePlate(ENCHANTED, enchanted_plate);
		oreGear(EVIL_INFUSED_IRON, evil_infused_iron_gear);
		orePlate(EVIL_INFUSED_IRON, evil_infused_iron_plate);
	}
}