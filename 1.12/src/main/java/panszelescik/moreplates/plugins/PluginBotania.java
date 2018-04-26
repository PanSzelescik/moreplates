package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.items.botania.*;

public class PluginBotania {
	
	public static Item elementium_gear;
	public static Item elementium_plate;
	public static Item gaia_spirit_gear;
	public static Item gaia_spirit_plate;
	public static Item manasteel_gear;
	public static Item manasteel_plate;
	public static Item terrasteel_gear;
	public static Item terrasteel_plate;
	
	public static void preInit() {
		elementium_gear =	new ItemElementiumGear	("elementium_gear",		"elementium_gear");
		elementium_plate =	new ItemElementiumPlate	("elementium_plate",	"elementium_plate");
		gaia_spirit_gear =	new ItemGaiaSpiritGear	("gaia_spirit_gear",	"gaia_spirit_gear");
		gaia_spirit_plate =	new ItemGaiaSpiritPlate	("gaia_spirit_plate",	"gaia_spirit_plate");
		manasteel_gear =	new ItemManasteelGear	("manasteel_gear",		"manasteel_gear");
		manasteel_plate =	new ItemManasteelPlate	("manasteel_plate",		"manasteel_plate");
		terrasteel_gear =	new ItemTerrasteelGear	("terrasteel_gear",		"terrasteel_gear");
		terrasteel_plate =	new ItemTerrasteelPlate	("terrasteel_plate",	"terrasteel_plate");
		
		Helper.registerItem(elementium_gear);
		Helper.registerItem(elementium_plate);
		Helper.registerItem(gaia_spirit_gear);
		Helper.registerItem(gaia_spirit_plate);
		Helper.registerItem(manasteel_gear);
		Helper.registerItem(manasteel_plate);
		Helper.registerItem(terrasteel_gear);
		Helper.registerItem(terrasteel_plate);
	}
	
	public static void clientPreInit() {
		Helper.registerRender(elementium_gear);
		Helper.registerRender(elementium_plate);
		Helper.registerRender(gaia_spirit_gear);
		Helper.registerRender(gaia_spirit_plate);
		Helper.registerRender(manasteel_gear);
		Helper.registerRender(manasteel_plate);
		Helper.registerRender(terrasteel_gear);
		Helper.registerRender(terrasteel_plate);
	}
	
	public static void init() {
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