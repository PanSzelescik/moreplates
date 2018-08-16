package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginAvaritia extends PluginBase {
	
	public static final String MODID = "avaritia";
	public static final String MODNAME = "Avaritia";
	
	public PluginAvaritia() {
		super(MODID, MODNAME);
	}
	
	Item crystal_matrix_gear;
	Item crystal_matrix_plate;
	Item infinity_gear;
	Item infinity_plate;
	Item neutronium_gear;
	Item neutronium_plate;
	
	public void preInit() {
		crystal_matrix_gear = gear("crystal_matrix");
		crystal_matrix_plate = plate("crystal_matrix");
		infinity_gear = gear("infinity");
		infinity_plate = plate("infinity");
		neutronium_gear = gear("neutronium");
		neutronium_plate = plate("neutronium");
		
		reg(CRYSTAL_MATRIX, crystal_matrix_gear, crystal_matrix_plate);
		reg(INFINITY, infinity_gear, infinity_plate);
		reg(NEUTRONIUM, neutronium_gear, neutronium_plate);
	}
}