package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.items.tconstruct.*;
import panszelescik.moreplates.register.*;

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
	
	public static void init() {
		ardite_gear = new ItemArditeGear("ardite_gear", "ardite_gear");
		ardite_plate = new ItemArditePlate("ardite_plate", "ardite_plate");
		cobalt_gear = new ItemCobaltGear("cobalt_gear", "cobalt_gear");
		cobalt_plate = new ItemCobaltPlate("cobalt_plate", "cobalt_plate");
		knightslime_gear = new ItemKnightslimeGear("knightslime_gear", "knightslime_gear");
		knightslime_plate = new ItemKnightslimePlate("knightslime_plate", "knightslime_plate");
		manyullyn_gear = new ItemManyullynGear("manyullyn_gear", "manyullyn_gear");
		manyullyn_plate = new ItemManyullynPlate("manyullyn_plate", "manyullyn_plate");
		pig_iron_gear = new ItemPigIronGear("pig_iron_gear", "pig_iron_gear");
		pig_iron_plate = new ItemPigIronPlate("pig_iron_plate", "pig_iron_plate");
	}
	
	public static void register() {
		RegisterItem.register(ardite_gear);
		RegisterItem.register(ardite_plate);
		RegisterItem.register(cobalt_gear);
		RegisterItem.register(cobalt_plate);
		RegisterItem.register(knightslime_gear);
		RegisterItem.register(knightslime_plate);
		RegisterItem.register(manyullyn_gear);
		RegisterItem.register(manyullyn_plate);
		RegisterItem.register(pig_iron_gear);
		RegisterItem.register(pig_iron_plate);
	}
	
	public static void registerRenders() {
		RegisterRender.register(ardite_gear);
		RegisterRender.register(ardite_plate);
		RegisterRender.register(cobalt_gear);
		RegisterRender.register(cobalt_plate);
		RegisterRender.register(knightslime_gear);
		RegisterRender.register(knightslime_plate);
		RegisterRender.register(manyullyn_gear);
		RegisterRender.register(manyullyn_plate);
		RegisterRender.register(pig_iron_gear);
		RegisterRender.register(pig_iron_plate);
	}
	
	public static void registerOreDict() {
		OreDictionary.registerOre("gearArdite", ardite_gear);
		OreDictionary.registerOre("plateArdite", ardite_plate);
		OreDictionary.registerOre("gearCobalt", cobalt_gear);
		OreDictionary.registerOre("plateCobalt", cobalt_plate);
		OreDictionary.registerOre("gearKnightslime", knightslime_gear);
		OreDictionary.registerOre("plateKnightslime", knightslime_plate);
		OreDictionary.registerOre("gearManyullyn", manyullyn_gear);
		OreDictionary.registerOre("plateManyullyn", manyullyn_plate);
		OreDictionary.registerOre("gearPigiron", pig_iron_gear);
		OreDictionary.registerOre("platePigiron", pig_iron_plate);
	}
	
}