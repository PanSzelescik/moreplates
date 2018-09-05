package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginTinkersConstruct extends PluginBase {
	
	public static final String MODID = "tconstruct";
	public static final String MODNAME = "Tinkers' Construct";
	
	public PluginTinkersConstruct() {
		super(MODID, MODNAME);
	}
	
	Item ardite_gear;
	Item ardite_plate;
	Item cobalt_gear;
	Item cobalt_plate;
	Item knightslime_gear;
	Item knightslime_plate;
	Item manyullyn_gear;
	Item manyullyn_plate;
	Item pig_iron_gear;
	Item pig_iron_plate;
	
	public void preInit() {
		ardite_gear = gear("ardite");
		ardite_plate = plate("ardite");
		cobalt_gear = gear("cobalt");
		cobalt_plate = plate("cobalt");
		knightslime_gear = gear("knightslime");
		knightslime_plate = plate("knightslime");
		manyullyn_gear = gear("manyullyn");
		manyullyn_plate = plate("manyullyn");
		pig_iron_gear = gear("pig_iron");
		pig_iron_plate = plate("pig_iron");
		
		reg(ARDITE, ardite_gear, ardite_plate);
		reg(COBALT, cobalt_gear, cobalt_plate);
		reg(KNIGHTSLIME, knightslime_gear, knightslime_plate);
		reg(MANYULLYN, manyullyn_gear, manyullyn_plate);
		reg(PIG_IRON, pig_iron_gear, pig_iron_plate);
	}
}