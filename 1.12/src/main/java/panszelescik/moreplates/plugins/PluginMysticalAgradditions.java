package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.items.mysticalagradditions.*;

public class PluginMysticalAgradditions {
	
	public static Item insanium_gear;
	public static Item insanium_plate;
	
	public static void preInit() {
		insanium_gear =		new ItemInsaniumGear	("insanium_gear",	"insanium_gear");
		insanium_plate =	new ItemInsaniumPlate	("insanium_plate",	"insanium_plate");
		
		Helper.registerItem(insanium_gear);
		Helper.registerItem(insanium_plate);
	}
	
	public static void clientPreInit() {
		Helper.registerRender(insanium_gear);
		Helper.registerRender(insanium_plate);
	}
	
	public static void init() {
		OreDictionary.registerOre("gearInsanium",	insanium_gear);
		OreDictionary.registerOre("plateInsanium",	insanium_plate);
	}
}