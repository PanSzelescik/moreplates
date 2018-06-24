package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginCalculator {
	
	public static Item amethyst_gear;
	public static Item amethyst_plate;
	public static Item enriched_gold_gear;
	public static Item enriched_gold_plate;
	public static Item redstone_gear;
	public static Item redstone_plate;
	public static Item reinforced_iron_gear;
	public static Item reinforced_iron_plate;
	public static Item tanzanite_gear;
	public static Item tanzanite_plate;
	
	public static void preInit() {
		amethyst_gear = new ItemGear("amethyst");
		amethyst_plate = new ItemPlate("amethyst");
		enriched_gold_gear = new ItemGear("enriched_gold");
		enriched_gold_plate = new ItemPlate("enriched_gold");
		redstone_gear =	 new ItemGear("redstone");
		redstone_plate = new ItemPlate("redstone");
		reinforced_iron_gear = new ItemGear("reinforced_iron");
		reinforced_iron_plate = new ItemPlate("reinforced_iron");
		tanzanite_gear = new ItemGear("tanzanite");
		tanzanite_plate = new ItemPlate("tanzanite");
		
		registerItem(amethyst_gear);
		registerItem(amethyst_plate);
		registerItem(enriched_gold_gear);
		registerItem(enriched_gold_plate);
		registerItem(redstone_gear);
		registerItem(redstone_plate);
		registerItem(reinforced_iron_gear);
		registerItem(reinforced_iron_plate);
		registerItem(tanzanite_gear);
		registerItem(tanzanite_plate);
		
		oreGear(AMETHYST, amethyst_gear);
		orePlate(AMETHYST, amethyst_plate);
		oreGear(ENRICHED_GOLD, enriched_gold_gear);
		orePlate(ENRICHED_GOLD, enriched_gold_plate);
		oreGear(REDSTONE_CALCULATOR, redstone_gear);
		orePlate(REDSTONE_CALCULATOR, redstone_plate);
		oreGear(REINFORCED_IRON, reinforced_iron_gear);
		orePlate(REINFORCED_IRON, reinforced_iron_plate);
		oreGear(TANZANITE, tanzanite_gear);
		orePlate(TANZANITE, tanzanite_plate);
	}
	
	public static void clientPreInit() {
		registerRender(amethyst_gear);
		registerRender(amethyst_plate);
		registerRender(enriched_gold_gear);
		registerRender(enriched_gold_plate);
		registerRender(redstone_gear);
		registerRender(redstone_plate);
		registerRender(reinforced_iron_gear);
		registerRender(reinforced_iron_plate);
		registerRender(tanzanite_gear);
		registerRender(tanzanite_plate);
	}
}