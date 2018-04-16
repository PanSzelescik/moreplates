package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.items.botania.*;
import panszelescik.moreplates.register.*;

public class PluginBotania {
	
	public static Item elementium_gear;
	public static Item elementium_plate;
	public static Item gaia_spirit_gear;
	public static Item gaia_spirit_plate;
	public static Item manasteel_gear;
	public static Item manasteel_plate;
	public static Item terrasteel_gear;
	public static Item terrasteel_plate;
	
	public static void init() {
		elementium_gear =	new ItemElementiumGear	("elementium_gear",		"elementium_gear");
		elementium_plate =	new ItemElementiumPlate	("elementium_plate",	"elementium_plate");
		gaia_spirit_gear =	new ItemGaiaSpiritGear	("gaia_spirit_gear",	"gaia_spirit_gear");
		gaia_spirit_plate =	new ItemGaiaSpiritPlate	("gaia_spirit_plate",	"gaia_spirit_plate");
		manasteel_gear =	new ItemManasteelGear	("manasteel_gear",		"manasteel_gear");
		manasteel_plate =	new ItemManasteelPlate	("manasteel_plate",		"manasteel_plate");
		terrasteel_gear =	new ItemTerrasteelGear	("terrasteel_gear",		"terrasteel_gear");
		terrasteel_plate =	new ItemTerrasteelPlate	("terrasteel_plate",	"terrasteel_plate");
	}
	
	public static void register() {
		RegisterItem.register(elementium_gear);
		RegisterItem.register(elementium_plate);
		RegisterItem.register(gaia_spirit_gear);
		RegisterItem.register(gaia_spirit_plate);
		RegisterItem.register(manasteel_gear);
		RegisterItem.register(manasteel_plate);
		RegisterItem.register(terrasteel_gear);
		RegisterItem.register(terrasteel_plate);
	}
	
	public static void registerRenders() {
		RegisterRender.register(elementium_gear);
		RegisterRender.register(elementium_plate);
		RegisterRender.register(gaia_spirit_gear);
		RegisterRender.register(gaia_spirit_plate);
		RegisterRender.register(manasteel_gear);
		RegisterRender.register(manasteel_plate);
		RegisterRender.register(terrasteel_gear);
		RegisterRender.register(terrasteel_plate);
	}
	
	public static void registerOreDict() {
		OreDictionary.registerOre("gearElvenElementium",	elementium_gear);
		OreDictionary.registerOre("plateElvenElementium",	elementium_plate);
		OreDictionary.registerOre("gaiaGear",				gaia_spirit_gear);
		OreDictionary.registerOre("gaiaPlate",				gaia_spirit_plate);
		OreDictionary.registerOre("gearManasteel",			manasteel_gear);
		OreDictionary.registerOre("plateManasteel",			manasteel_plate);
		OreDictionary.registerOre("gearTerrasteel",			terrasteel_gear);
		OreDictionary.registerOre("plateTerrasteel",		terrasteel_plate);
	}
	
}