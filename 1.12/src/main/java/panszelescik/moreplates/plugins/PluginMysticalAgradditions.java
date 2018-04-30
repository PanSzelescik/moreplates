package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.mysticalagradditions.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginMysticalAgradditions {
	
	public static Item insanium_gear;
	public static Item insanium_plate;
	
	public static void preInit() {
		insanium_gear = new ItemInsaniumGear("insanium_gear");
		insanium_plate = new ItemInsaniumPlate("insanium_plate");
		
		registerItem(insanium_gear);
		registerItem(insanium_plate);
	}
	
	public static void clientPreInit() {
		registerRender(insanium_gear);
		registerRender(insanium_plate);
	}
	
	public static void init() {
		oreGear(INSANIUM, insanium_gear);
		orePlate(INSANIUM, insanium_plate);
	}
}