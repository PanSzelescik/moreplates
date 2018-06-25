package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginMysticalAgradditions {
	
	public static Item insanium_gear;
	public static Item insanium_plate;
	
	public static void preInit() {
		insanium_gear = new ItemGear("insanium");
		insanium_plate = new ItemPlate("insanium");
		
		regGear(insanium_gear, INSANIUM);
		regPlate(insanium_plate, INSANIUM);
	}
}