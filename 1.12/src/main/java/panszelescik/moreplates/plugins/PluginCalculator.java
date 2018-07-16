package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginCalculator {
	
	static Item amethyst_gear;
	static Item amethyst_plate;
	static Item enriched_gold_gear;
	static Item enriched_gold_plate;
	static Item reinforced_iron_gear;
	static Item reinforced_iron_plate;
	static Item tanzanite_gear;
	static Item tanzanite_plate;
	
	public static void preInit() {
		amethyst_gear = new ItemGear("amethyst");
		amethyst_plate = new ItemPlate("amethyst");
		enriched_gold_gear = new ItemGear("enriched_gold");
		enriched_gold_plate = new ItemPlate("enriched_gold");
		reinforced_iron_gear = new ItemGear("reinforced_iron");
		reinforced_iron_plate = new ItemPlate("reinforced_iron");
		tanzanite_gear = new ItemGear("tanzanite");
		tanzanite_plate = new ItemPlate("tanzanite");
		
		reg(AMETHYST, amethyst_gear, amethyst_plate);
		reg(ENRICHED_GOLD, enriched_gold_gear, enriched_gold_plate);
		reg(REINFORCED_IRON, reinforced_iron_gear, reinforced_iron_plate);
		reg(TANZANITE, tanzanite_gear, tanzanite_plate);
	}
}