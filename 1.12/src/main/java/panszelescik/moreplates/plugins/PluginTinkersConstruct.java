package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.items.tconstruct.*;

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
		ardite_gear =		new ItemArditeGear			("ardite_gear",			"ardite_gear");
		ardite_plate =		new ItemArditePlate			("ardite_plate",		"ardite_plate");
		cobalt_gear =		new ItemCobaltGear			("cobalt_gear",			"cobalt_gear");
		cobalt_plate =		new ItemCobaltPlate			("cobalt_plate",		"cobalt_plate");
		knightslime_gear =	new ItemKnightslimeGear		("knightslime_gear",	"knightslime_gear");
		knightslime_plate =	new ItemKnightslimePlate	("knightslime_plate",	"knightslime_plate");
		manyullyn_gear =	new ItemManyullynGear		("manyullyn_gear",		"manyullyn_gear");
		manyullyn_plate =	new ItemManyullynPlate		("manyullyn_plate",		"manyullyn_plate");
		pig_iron_gear =		new ItemPigIronGear			("pig_iron_gear",		"pig_iron_gear");
		pig_iron_plate =	new ItemPigIronPlate		("pig_iron_plate",		"pig_iron_plate");
		
		Helper.registerItem(ardite_gear);
		Helper.registerItem(ardite_plate);
		Helper.registerItem(cobalt_gear);
		Helper.registerItem(cobalt_plate);
		Helper.registerItem(knightslime_gear);
		Helper.registerItem(knightslime_plate);
		Helper.registerItem(manyullyn_gear);
		Helper.registerItem(manyullyn_plate);
		Helper.registerItem(pig_iron_gear);
		Helper.registerItem(pig_iron_plate);
	}
	
	public static void clientPreInit() {
		Helper.registerRender(ardite_gear);
		Helper.registerRender(ardite_plate);
		Helper.registerRender(cobalt_gear);
		Helper.registerRender(cobalt_plate);
		Helper.registerRender(knightslime_gear);
		Helper.registerRender(knightslime_plate);
		Helper.registerRender(manyullyn_gear);
		Helper.registerRender(manyullyn_plate);
		Helper.registerRender(pig_iron_gear);
		Helper.registerRender(pig_iron_plate);
	}
	
	public static void init() {
		OreDictionary.registerOre("gearArdite",			ardite_gear);
		OreDictionary.registerOre("plateArdite",		ardite_plate);
		OreDictionary.registerOre("gearCobalt",			cobalt_gear);
		OreDictionary.registerOre("plateCobalt",		cobalt_plate);
		OreDictionary.registerOre("gearKnightslime",	knightslime_gear);
		OreDictionary.registerOre("plateKnightslime",	knightslime_plate);
		OreDictionary.registerOre("gearManyullyn",		manyullyn_gear);
		OreDictionary.registerOre("plateManyullyn",		manyullyn_plate);
		OreDictionary.registerOre("gearPigiron",		pig_iron_gear);
		OreDictionary.registerOre("platePigiron",		pig_iron_plate);
	}
}