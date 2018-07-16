package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginMysticalAgradditions {
	
	static Item insanium_gear;
	static Item insanium_plate;
	
	public static void preInit() {
		insanium_gear = new ItemGear("insanium");
		insanium_plate = new ItemPlate("insanium");
		
		reg(INSANIUM, insanium_gear, insanium_plate);
	}
}