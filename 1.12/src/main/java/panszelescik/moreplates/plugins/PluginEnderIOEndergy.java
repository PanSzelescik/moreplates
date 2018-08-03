package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginEnderIOEndergy {
	
	static Item combustive_metal_gear;
	static Item combustive_metal_plate;
	static Item crude_steel_gear;
	static Item crude_steel_plate;
	static Item crystalline_alloy_gear;
	static Item crystalline_alloy_plate;
	static Item melodic_alloy_gear;
	static Item melodic_alloy_plate;
	static Item stellar_alloy_gear;
	static Item stellar_alloy_plate;
	
	public static void preInit() {
		combustive_metal_gear = new ItemGear("combustive_metal");
		combustive_metal_plate = new ItemGear("combustive_metal");
		crude_steel_gear = new ItemGear("crude_steel");
		crude_steel_plate = new ItemGear("crude_steel");
		crystalline_alloy_gear = new ItemGear("crystalline_alloy");
		crystalline_alloy_plate = new ItemGear("crystalline_alloy");
		melodic_alloy_gear = new ItemGear("melodic_alloy");
		melodic_alloy_plate = new ItemGear("melocidc_alloy");
		stellar_alloy_gear = new ItemGear("stellar_alloy");
		stellar_alloy_plate = new ItemGear("stellar_alloy");
		
		reg(COMBUSTIVE_METAL, combustive_metal_gear, combustive_metal_plate);
		reg(CRUDE_STEEL, crude_steel_gear, crude_steel_plate);
		reg(CRYSTALLINE_ALLOY, crystalline_alloy_gear, crystalline_alloy_plate);
		reg(MELODIC_ALLOY, melodic_alloy_gear, melodic_alloy_plate);
		reg(STELLAR_ALLOY, stellar_alloy_gear, stellar_alloy_plate);
	}
}