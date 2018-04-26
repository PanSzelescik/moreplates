package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.items.mysticalagriculture.*;

public class PluginMysticalAgriculture {
	
	public static Item inferium_gear;
	public static Item inferium_plate;
	public static Item intermedium_gear;
	public static Item intermedium_plate;
	public static Item prudentium_gear;
	public static Item prudentium_plate;
	public static Item soulium_gear;
	public static Item soulium_plate;
	public static Item superium_gear;
	public static Item superium_plate;
	public static Item supremium_gear;
	public static Item supremium_plate;
	
	public static void preInit() {
		inferium_gear  =	new ItemInferiumGear		("inferium_gear",		"inferium_gear");
		inferium_plate =	new ItemInferiumPlate		("inferium_plate",		"inferium_plate");
		intermedium_gear =	new ItemIntermediumGear		("intermedium_gear",	"intermedium_gear");
		intermedium_plate =	new ItemIntermediumPlate	("intermedium_plate",	"intermedium_plate");
		prudentium_gear =	new ItemPrudentiumGear		("prudentium_gear",		"prudentium_gear");
		prudentium_plate =	new ItemPrudentiumPlate		("prudentium_plate",	"prudentium_plate");
		soulium_gear =		new ItemSouliumGear			("soulium_gear",		"soulium_gear");
		soulium_plate =		new ItemSouliumPlate		("soulium_plate",		"soulium_plate");
		superium_gear =		new ItemSuperiumGear		("superium_gear",		"superium_gear");
		superium_plate =	new ItemSuperiumPlate		("superium_plate",		"superium_plate");
		supremium_gear =	new ItemSupremiumGear		("supremium_gear",		"supremium_gear");
		supremium_plate =	new ItemSupremiumPlate		("supremium_plate",		"supremium_plate");
		
		Helper.registerItem(inferium_gear);
		Helper.registerItem(inferium_plate);
		Helper.registerItem(intermedium_gear);
		Helper.registerItem(intermedium_plate);
		Helper.registerItem(prudentium_gear);
		Helper.registerItem(prudentium_plate);
		Helper.registerItem(soulium_gear);
		Helper.registerItem(soulium_plate);
		Helper.registerItem(superium_gear);
		Helper.registerItem(superium_plate);
		Helper.registerItem(supremium_gear);
		Helper.registerItem(supremium_plate);
	}
	
	public static void clientPreInit() {
		Helper.registerRender(inferium_gear);
		Helper.registerRender(inferium_plate);
		Helper.registerRender(intermedium_gear);
		Helper.registerRender(intermedium_plate);
		Helper.registerRender(prudentium_gear);
		Helper.registerRender(prudentium_plate);
		Helper.registerRender(soulium_gear);
		Helper.registerRender(soulium_plate);
		Helper.registerRender(superium_gear);
		Helper.registerRender(superium_plate);
		Helper.registerRender(supremium_gear);
		Helper.registerRender(supremium_plate);
	}
	
	public static void init() {
		OreDictionary.registerOre("gearInferium",		inferium_gear);
		OreDictionary.registerOre("plateInferium",		inferium_plate);
		OreDictionary.registerOre("gearIntermedium",	intermedium_gear);
		OreDictionary.registerOre("plateIntermedium",	intermedium_plate);
		OreDictionary.registerOre("gearPrudentium",		prudentium_gear);
		OreDictionary.registerOre("platePrudentium",	prudentium_plate);
		OreDictionary.registerOre("gearSoulium",		soulium_gear);
		OreDictionary.registerOre("plateSoulium",		soulium_plate);
		OreDictionary.registerOre("gearSuperium",		superium_gear);
		OreDictionary.registerOre("plateSuperium",		superium_plate);
		OreDictionary.registerOre("gearSupremium",		supremium_gear);
		OreDictionary.registerOre("plateSupremium",		supremium_plate);
	}
}