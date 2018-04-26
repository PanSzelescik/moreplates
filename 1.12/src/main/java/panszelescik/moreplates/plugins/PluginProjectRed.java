package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.items.projectred.*;

public class PluginProjectRed {
	
	public static Item electrotine_alloy_gear;
	public static Item electrotine_alloy_plate;
	public static Item red_alloy_gear;
	public static Item red_alloy_plate;
	
	public static void preInit() {
		electrotine_alloy_gear =	new ItemElectrotineAlloyGear	("electrotine_alloy_gear",	"electrotine_alloy_gear");
		electrotine_alloy_plate =	new ItemElectrotineAlloyPlate	("electrotine_alloy_plate",	"electrotine_alloy_plate");
		red_alloy_gear =			new ItemRedAlloyGear			("red_alloy_gear",			"red_alloy_gear");
		red_alloy_plate =			new ItemRedAlloyPlate			("red_alloy_plate",			"red_alloy_plate");
		
		Helper.registerItem(electrotine_alloy_gear);
		Helper.registerItem(electrotine_alloy_plate);
		Helper.registerItem(red_alloy_gear);
		Helper.registerItem(red_alloy_plate);
	}
	
	public static void clientPreInit() {
		Helper.registerRender(electrotine_alloy_gear);
		Helper.registerRender(electrotine_alloy_plate);
		Helper.registerRender(red_alloy_gear);
		Helper.registerRender(red_alloy_plate);
	}
	
	public static void init() {
		OreDictionary.registerOre("gearElectrotineAlloy",	electrotine_alloy_gear);
		OreDictionary.registerOre("plateElectrotineAlloy",	electrotine_alloy_gear);
		OreDictionary.registerOre("gearRedAlloy",			red_alloy_gear);
		OreDictionary.registerOre("plateRedAlloy",			red_alloy_plate);
	}
}