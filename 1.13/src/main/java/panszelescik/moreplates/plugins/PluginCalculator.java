package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginCalculator extends PluginBase {
	
	public static final String MODID = "calculator";
	public static final String MODNAME = "Calculator";
	
	public PluginCalculator() {
		super(MODID, MODNAME);
	}
	
	Item amethyst_gear;
	Item amethyst_plate;
	Item enriched_gold_gear;
	Item enriched_gold_plate;
	Item reinforced_iron_gear;
	Item reinforced_iron_plate;
	Item tanzanite_gear;
	Item tanzanite_plate;
	
	public void preInit() {
		amethyst_gear = gear("amethyst");
		amethyst_plate = plate("amethyst");
		enriched_gold_gear = gear("enriched_gold");
		enriched_gold_plate = plate("enriched_gold");
		reinforced_iron_gear = gear("reinforced_iron");
		reinforced_iron_plate = plate("reinforced_iron");
		tanzanite_gear = gear("tanzanite");
		tanzanite_plate = plate("tanzanite");
		
		reg(AMETHYST, amethyst_gear, amethyst_plate);
		reg(ENRICHED_GOLD, enriched_gold_gear, enriched_gold_plate);
		reg(REINFORCED_IRON, reinforced_iron_gear, reinforced_iron_plate);
		reg(TANZANITE, tanzanite_gear, tanzanite_plate);
	}
}