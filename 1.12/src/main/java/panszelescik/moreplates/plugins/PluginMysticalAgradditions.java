package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.items.mysticalagradditions.*;
import panszelescik.moreplates.register.*;

public class PluginMysticalAgradditions {
	
	public static Item insanium_gear;
	public static Item insanium_plate;
	
	public static void init() {
		insanium_gear = new ItemInsaniumGear("insanium_gear", "insanium_gear");
		insanium_plate = new ItemInsaniumPlate("insanium_plate", "insanium_plate");
	}
	
	public static void register() {
		RegisterItem.register(insanium_gear);
		RegisterItem.register(insanium_plate);
	}
	
	public static void registerRenders() {
		RegisterRender.register(insanium_gear);
		RegisterRender.register(insanium_plate);
	}
	
	public static void registerOreDict() {
		OreDictionary.registerOre("gearInsanium", insanium_gear);
		OreDictionary.registerOre("plateInsanium", insanium_plate);
	}
	
}