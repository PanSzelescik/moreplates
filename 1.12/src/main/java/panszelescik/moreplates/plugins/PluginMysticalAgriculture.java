package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

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
		inferium_gear  = new ItemGear("inferium");
		inferium_plate = new ItemPlate("inferium");
		intermedium_gear = new ItemGear("intermedium");
		intermedium_plate = new ItemPlate("intermedium");
		prudentium_gear = new ItemGear("prudentium");
		prudentium_plate = new ItemPlate("prudentium");
		soulium_gear = new ItemGear("soulium");
		soulium_plate = new ItemPlate("soulium");
		superium_gear = new ItemGear("superium");
		superium_plate = new ItemPlate("superium");
		supremium_gear = new ItemGear("supremium");
		supremium_plate = new ItemPlate("supremium");
		
		regGear(inferium_gear, INFERIUM);
		regPlate(inferium_plate, INFERIUM);
		regGear(intermedium_gear, INTERMEDIUM);
		regPlate(intermedium_plate, INTERMEDIUM);
		regGear(prudentium_gear, PRUDENTIUM);
		regPlate(prudentium_plate, PRUDENTIUM);
		regGear(soulium_gear, SOULIUM);
		regPlate(soulium_plate, SOULIUM);
		regGear(superium_gear, SUPERIUM);
		regPlate(superium_plate, SUPERIUM);
		regGear(supremium_gear, SUPREMIUM);
		regPlate(supremium_plate, SUPREMIUM);
	}
}