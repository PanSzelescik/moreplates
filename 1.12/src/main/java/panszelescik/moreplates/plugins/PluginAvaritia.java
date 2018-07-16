package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginAvaritia {
	
	static Item crystal_matrix_gear;
	static Item crystal_matrix_plate;
	static Item infinity_gear;
	static Item infinity_plate;
	static Item neutronium_gear;
	static Item neutronium_plate;
	
	public static void preInit() {
		crystal_matrix_gear = new ItemGear("crystal_matrix");
		crystal_matrix_plate = new ItemPlate("crystal_matrix");
		infinity_gear = new ItemGear("infinity");
		infinity_plate = new ItemPlate("infinity");
		neutronium_gear = new ItemGear("neutronium");
		neutronium_plate = new ItemPlate("neutronium");
		
		reg(CRYSTAL_MATRIX, crystal_matrix_gear, crystal_matrix_plate);
		reg(INFINITY, infinity_gear, infinity_plate);
		reg(NEUTRONIUM, neutronium_gear, neutronium_plate);
	}
}