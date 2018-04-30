package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.calculator.*;

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
		amethyst_gear = new ItemAmethystGear("amethyst_gear");
		amethyst_plate = new ItemAmethystPlate("amethyst_plate");
		enriched_gold_gear = new ItemEnrichedGoldGear("enriched_gold_gear");
		enriched_gold_plate = new ItemEnrichedGoldPlate("enriched_gold_plate");
		redstone_gear =	 new ItemRedstoneGear("redstone_gear");
		redstone_plate = new ItemRedstonePlate("redstone_plate");
		reinforced_iron_gear = new ItemReinforcedIronGear("reinforced_iron_gear");
		reinforced_iron_plate = new ItemReinforcedIronPlate("reinforced_iron_plate");
		tanzanite_gear = new ItemTanzaniteGear("tanzanite_gear");
		tanzanite_plate = new ItemTanzanitePlate("tanzanite_plate");
		
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
	
	public static void init() {
		oreGear(AMETHYST, amethyst_gear);
		orePlate(AMETHYST, amethyst_plate);
		oreGear(ENRICHED_GOLD, enriched_gold_gear);
		orePlate(ENRICHED_GOLD, enriched_gold_plate);
		oreGear(REDSTONE, redstone_gear);
		orePlate(REDSTONE, redstone_plate);
		oreGear(REINFORCED_IRON, reinforced_iron_gear);
		orePlate(REINFORCED_IRON, reinforced_iron_plate);
		oreGear(TANZANITE, tanzanite_gear);
		orePlate(TANZANITE, tanzanite_plate);
	}
}