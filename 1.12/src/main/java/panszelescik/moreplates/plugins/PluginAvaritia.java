package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginAvaritia {
	
	public static Item crystal_matrix_gear;
	public static Item crystal_matrix_plate;
	public static Item infinity_gear;
	public static Item infinity_plate;
	public static Item neutronium_gear;
	public static Item neutronium_plate;
	
	public static void preInit() {
		crystal_matrix_gear = new ItemGear("crystal_matrix");
		crystal_matrix_plate = new ItemPlate("crystal_matrix");
		infinity_gear = new ItemGear("infinity");
		infinity_plate = new ItemPlate("infinity");
		neutronium_gear = new ItemGear("neutronium");
		neutronium_plate = new ItemPlate("neutronium");
		
		registerItem(crystal_matrix_gear);
		registerItem(crystal_matrix_plate);
		registerItem(infinity_gear);
		registerItem(infinity_plate);
		registerItem(neutronium_gear);
		registerItem(neutronium_plate);
		
		oreGear(CRYSTAL_MATRIX, crystal_matrix_gear);
		orePlate(CRYSTAL_MATRIX, crystal_matrix_plate);
		oreGear(INFINITY, infinity_gear);
		orePlate(INFINITY, infinity_plate);
		oreGear(NEUTRONIUM, neutronium_gear);
		orePlate(NEUTRONIUM, neutronium_plate);
	}
	
	public static void clientPreInit() {
		registerRender(crystal_matrix_gear);
		registerRender(crystal_matrix_plate);
		registerRender(infinity_gear);
		registerRender(infinity_plate);
		registerRender(neutronium_gear);
		registerRender(neutronium_plate);
	}
}