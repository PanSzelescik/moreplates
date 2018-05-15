package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.ItemGear;
import panszelescik.moreplates.items.ItemPlate;

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
		
		registerItem(inferium_gear);
		registerItem(inferium_plate);
		registerItem(intermedium_gear);
		registerItem(intermedium_plate);
		registerItem(prudentium_gear);
		registerItem(prudentium_plate);
		registerItem(soulium_gear);
		registerItem(soulium_plate);
		registerItem(superium_gear);
		registerItem(superium_plate);
		registerItem(supremium_gear);
		registerItem(supremium_plate);
		
		oreGear(INFERIUM, inferium_gear);
		orePlate(INFERIUM, inferium_plate);
		oreGear(INTERMEDIUM, intermedium_gear);
		orePlate(INTERMEDIUM, intermedium_plate);
		oreGear(PRUDENTIUM, prudentium_gear);
		orePlate(PRUDENTIUM, prudentium_plate);
		oreGear(SOULIUM, soulium_gear);
		orePlate(SOULIUM, soulium_plate);
		oreGear(SUPERIUM, superium_gear);
		orePlate(SUPERIUM, superium_plate);
		oreGear(SUPREMIUM, supremium_gear);
		orePlate(SUPREMIUM, supremium_plate);
	}
	
	public static void clientPreInit() {
		registerRender(inferium_gear);
		registerRender(inferium_plate);
		registerRender(intermedium_gear);
		registerRender(intermedium_plate);
		registerRender(prudentium_gear);
		registerRender(prudentium_plate);
		registerRender(soulium_gear);
		registerRender(soulium_plate);
		registerRender(superium_gear);
		registerRender(superium_plate);
		registerRender(supremium_gear);
		registerRender(supremium_plate);
	}
}