package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginTinkersConstruct {
	
	public static Item ardite_gear;
	public static Item ardite_plate;
	public static Item cobalt_gear;
	public static Item cobalt_plate;
	public static Item knightslime_gear;
	public static Item knightslime_plate;
	public static Item manyullyn_gear;
	public static Item manyullyn_plate;
	public static Item pig_iron_gear;
	public static Item pig_iron_plate;
	
	public static void preInit() {
		ardite_gear = new ItemGear("ardite");
		ardite_plate = new ItemPlate("ardite");
		cobalt_gear = new ItemGear("cobalt");
		cobalt_plate = new ItemPlate("cobalt");
		knightslime_gear = new ItemGear("knightslime");
		knightslime_plate = new ItemPlate("knightslime");
		manyullyn_gear = new ItemGear("manyullyn");
		manyullyn_plate = new ItemPlate("manyullyn");
		pig_iron_gear = new ItemGear("pig_iron");
		pig_iron_plate = new ItemPlate("pig_iron");
		
		reg(ARDITE, ardite_gear, ardite_plate);
		reg(COBALT, cobalt_gear, cobalt_plate);
		reg(KNIGHTSLIME, knightslime_gear, knightslime_plate);
		reg(MANYULLYN, manyullyn_gear, manyullyn_plate);
		reg(PIG_IRON, pig_iron_gear, pig_iron_plate);
	}
}