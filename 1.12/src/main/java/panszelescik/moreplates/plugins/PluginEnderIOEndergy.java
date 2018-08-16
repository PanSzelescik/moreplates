package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginEnderIOEndergy extends PluginBase {
	
	public static final String MODID = "enderioendergy";
	public static final String MODNAME = "Ender IO Endergy";
	
	public PluginEnderIOEndergy() {
		super(MODID, MODNAME);
	}
	
	Item combustive_metal_gear;
	Item combustive_metal_plate;
	Item crude_steel_gear;
	Item crude_steel_plate;
	Item crystalline_alloy_gear;
	Item crystalline_alloy_plate;
	Item melodic_alloy_gear;
	Item melodic_alloy_plate;
	Item stellar_alloy_gear;
	Item stellar_alloy_plate;
	
	public void preInit() {
		combustive_metal_gear = gear("combustive_metal");
		combustive_metal_plate = plate("combustive_metal");
		crude_steel_gear = gear("crude_steel");
		crude_steel_plate = plate("crude_steel");
		crystalline_alloy_gear = gear("crystalline_alloy");
		crystalline_alloy_plate = plate("crystalline_alloy");
		melodic_alloy_gear = gear("melodic_alloy");
		melodic_alloy_plate = plate("melocidc_alloy");
		stellar_alloy_gear = gear("stellar_alloy");
		stellar_alloy_plate = plate("stellar_alloy");
		
		reg(COMBUSTIVE_METAL, combustive_metal_gear, combustive_metal_plate);
		reg(CRUDE_STEEL, crude_steel_gear, crude_steel_plate);
		reg(CRYSTALLINE_ALLOY, crystalline_alloy_gear, crystalline_alloy_plate);
		reg(MELODIC_ALLOY, melodic_alloy_gear, melodic_alloy_plate);
		reg(STELLAR_ALLOY, stellar_alloy_gear, stellar_alloy_plate);
	}
}