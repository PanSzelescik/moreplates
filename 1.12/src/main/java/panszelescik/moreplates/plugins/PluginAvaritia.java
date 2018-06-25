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
		
		regGear(crystal_matrix_gear, CRYSTAL_MATRIX);
		regPlate(crystal_matrix_plate, CRYSTAL_MATRIX);
		regGear(infinity_gear, INFINITY);
		regPlate(infinity_plate, INFINITY);
		regGear(neutronium_gear, NEUTRONIUM);
		regPlate(neutronium_plate, NEUTRONIUM);
	}
}