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
		redstone_gear =	 new ItemGear("redstone1");
		redstone_plate = new ItemPlate("redstone1");
		reinforced_iron_gear = new ItemGear("reinforced_iron");
		reinforced_iron_plate = new ItemPlate("reinforced_iron");
		tanzanite_gear = new ItemGear("tanzanite");
		tanzanite_plate = new ItemPlate("tanzanite");
		
		regGear(amethyst_gear, AMETHYST);
		regPlate(amethyst_plate, AMETHYST);
		regGear(enriched_gold_gear, ENRICHED_GOLD);
		regPlate(enriched_gold_plate, ENRICHED_GOLD);
		regGear(redstone_gear, REDSTONE_CALCULATOR);
		regPlate(redstone_plate, REDSTONE_CALCULATOR);
		regGear(reinforced_iron_gear, REINFORCED_IRON);
		regPlate(reinforced_iron_plate, REINFORCED_IRON);
		regGear(tanzanite_gear, TANZANITE);
		regPlate(tanzanite_plate, TANZANITE);
	}
}