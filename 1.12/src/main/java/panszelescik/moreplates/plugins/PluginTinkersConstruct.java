package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.tconstruct.*;

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
		ardite_gear = new ItemArditeGear("ardite_gear");
		ardite_plate = new ItemArditePlate("ardite_plate");
		cobalt_gear = new ItemCobaltGear("cobalt_gear");
		cobalt_plate = new ItemCobaltPlate("cobalt_plate");
		knightslime_gear = new ItemKnightslimeGear("knightslime_gear");
		knightslime_plate = new ItemKnightslimePlate("knightslime_plate");
		manyullyn_gear = new ItemManyullynGear("manyullyn_gear");
		manyullyn_plate = new ItemManyullynPlate("manyullyn_plate");
		pig_iron_gear = new ItemPigIronGear("pig_iron_gear");
		pig_iron_plate = new ItemPigIronPlate("pig_iron_plate");
		
		registerItem(ardite_gear);
		registerItem(ardite_plate);
		registerItem(cobalt_gear);
		registerItem(cobalt_plate);
		registerItem(knightslime_gear);
		registerItem(knightslime_plate);
		registerItem(manyullyn_gear);
		registerItem(manyullyn_plate);
		registerItem(pig_iron_gear);
		registerItem(pig_iron_plate);
	}
	
	public static void clientPreInit() {
		registerRender(ardite_gear);
		registerRender(ardite_plate);
		registerRender(cobalt_gear);
		registerRender(cobalt_plate);
		registerRender(knightslime_gear);
		registerRender(knightslime_plate);
		registerRender(manyullyn_gear);
		registerRender(manyullyn_plate);
		registerRender(pig_iron_gear);
		registerRender(pig_iron_plate);
	}
	
	public static void init() {
		oreGear(ARDITE, ardite_gear);
		orePlate(ARDITE, ardite_plate);
		oreGear(COBALT, cobalt_gear);
		orePlate(COBALT, cobalt_plate);
		oreGear(KNIGHTSLIME, knightslime_gear);
		orePlate(KNIGHTSLIME, knightslime_plate);
		oreGear(MANYULLYN, manyullyn_gear);
		orePlate(MANYULLYN, manyullyn_plate);
		oreGear(PIG_IRON, pig_iron_gear);
		orePlate(PIG_IRON, pig_iron_plate);
	}
}