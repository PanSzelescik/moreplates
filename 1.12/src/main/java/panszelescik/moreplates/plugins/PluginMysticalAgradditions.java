package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.ItemGear;
import panszelescik.moreplates.items.ItemPlate;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginMysticalAgradditions {
	
	public static Item insanium_gear;
	public static Item insanium_plate;
	
	public static void preInit() {
		insanium_gear = new ItemGear("insanium");
		insanium_plate = new ItemPlate("insanium");
		
		registerItem(insanium_gear);
		registerItem(insanium_plate);
		
		oreGear(INSANIUM, insanium_gear);
		orePlate(INSANIUM, insanium_plate);
	}
	
	public static void clientPreInit() {
		registerRender(insanium_gear);
		registerRender(insanium_plate);
	}
}