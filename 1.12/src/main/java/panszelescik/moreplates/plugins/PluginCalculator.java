package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.items.calculator.*;
import panszelescik.moreplates.register.*;

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
		amethyst_gear =			new ItemAmethystGear		("amethyst_gear",			"amethyst_gear");
		amethyst_plate =		new ItemAmethystPlate		("amethyst_plate",			"amethyst_plate");
		enriched_gold_gear =	new ItemEnrichedGoldGear	("enriched_gold_gear",		"enriched_gold_gear");
		enriched_gold_plate =	new ItemEnrichedGoldPlate	("enriched_gold_plate",		"enriched_gold_plate");
		redstone_gear =			new ItemRedstoneGear		("redstone_gear",			"redstone_gear");
		redstone_plate =		new ItemRedstonePlate		("redstone_plate",			"redstone_plate");
		reinforced_iron_gear =	new ItemReinforcedIronGear	("reinforced_iron_gear",	"reinforced_iron_gear");
		reinforced_iron_plate =	new ItemReinforcedIronPlate	("reinforced_iron_plate",	"reinforced_iron_plate");
		tanzanite_gear =		new ItemTanzaniteGear		("tanzanite_gear",			"tanzanite_gear");
		tanzanite_plate =		new ItemTanzanitePlate		("tanzanite_plate",			"tanzanite_plate");
		
		RegisterItem.register(amethyst_gear);
		RegisterItem.register(amethyst_plate);
		RegisterItem.register(enriched_gold_gear);
		RegisterItem.register(enriched_gold_plate);
		RegisterItem.register(redstone_gear);
		RegisterItem.register(redstone_plate);
		RegisterItem.register(reinforced_iron_gear);
		RegisterItem.register(reinforced_iron_plate);
		RegisterItem.register(tanzanite_gear);
		RegisterItem.register(tanzanite_plate);
	}
	
	public static void clientPreInit() {
		RegisterRender.register(amethyst_gear);
		RegisterRender.register(amethyst_plate);
		RegisterRender.register(enriched_gold_gear);
		RegisterRender.register(enriched_gold_plate);
		RegisterRender.register(redstone_gear);
		RegisterRender.register(redstone_plate);
		RegisterRender.register(reinforced_iron_gear);
		RegisterRender.register(reinforced_iron_plate);
		RegisterRender.register(tanzanite_gear);
		RegisterRender.register(tanzanite_plate);
	}
	
	public static void init() {
		OreDictionary.registerOre("gearAmethyst",			amethyst_gear);
		OreDictionary.registerOre("plateAmethyst",			amethyst_plate);
		OreDictionary.registerOre("gearEnrichedGold",		enriched_gold_gear);
		OreDictionary.registerOre("plateEnrichedGold",		enriched_gold_plate);
		OreDictionary.registerOre("gearRedstone",			redstone_gear);
		OreDictionary.registerOre("plateRedstone",			redstone_plate);
		OreDictionary.registerOre("gearReinforcedIron",		reinforced_iron_gear);
		OreDictionary.registerOre("plateReinforcedIron",	reinforced_iron_plate);
		OreDictionary.registerOre("gearTanzanite",			tanzanite_gear);
		OreDictionary.registerOre("plateTanzanite",			tanzanite_plate);
	}
}