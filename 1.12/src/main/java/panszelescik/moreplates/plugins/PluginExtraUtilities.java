package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.items.extrautils2.*;

public class PluginExtraUtilities {
	
	public static Item demon_gear;
	public static Item demon_plate;
	public static Item enchanted_gear;
	public static Item enchanted_plate;
	public static Item evil_infused_iron_gear;
	public static Item evil_infused_iron_plate;
	
	public static void preInit() {
		demon_gear =				new ItemDemonGear				("demon_gear",				"demon_gear");
		demon_plate =				new ItemDemonPlate				("demon_plate",				"demon_plate");
		enchanted_gear =			new ItemEnchantedGear			("enchanted_gear",			"enchanted_gear");
		enchanted_plate =			new ItemEnchantedPlate			("enchanted_plate",			"enchanted_plate");
		evil_infused_iron_gear =	new ItemEvilInfusedIronGear		("evil_infused_iron_gear",	"evil_infused_iron_gear");
		evil_infused_iron_plate =	new ItemEvilInfusedIronPlate	("evil_infused_iron_plate",	"evil_infused_iron_plate");
		
		Helper.registerItem(demon_gear);
		Helper.registerItem(demon_plate);
		Helper.registerItem(enchanted_gear);
		Helper.registerItem(enchanted_plate);
		Helper.registerItem(evil_infused_iron_gear);
		Helper.registerItem(evil_infused_iron_plate);
	}
	
	public static void clientPreInit() {
		Helper.registerRender(demon_gear);
		Helper.registerRender(demon_plate);
		Helper.registerRender(enchanted_gear);
		Helper.registerRender(enchanted_plate);
		Helper.registerRender(evil_infused_iron_gear);
		Helper.registerRender(evil_infused_iron_plate);
	}
	
	public static void init() {
		OreDictionary.registerOre("gearDemon",				demon_gear);
		OreDictionary.registerOre("plateDemon",				demon_plate);
		OreDictionary.registerOre("gearEnchanted",			enchanted_gear);
		OreDictionary.registerOre("plateEnchanted",			enchanted_plate);
		OreDictionary.registerOre("gearEvilInfusedIron",	evil_infused_iron_gear);
		OreDictionary.registerOre("plateEvilInfusedIron",	evil_infused_iron_plate);
	}
}