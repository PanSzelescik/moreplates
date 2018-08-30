package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginEnderIO extends PluginBase {
	
	public static final String MODID = "enderio";
	public static final String MODNAME = "Ender IO";
	
	public PluginEnderIO() {
		super(MODID, MODNAME);
	}
	
	//Item combustive_metal_gear;
	//Item combustive_metal_plate;
	Item conductive_iron_gear;
	Item conductive_iron_plate;
	//Item crude_steel_gear;
	//Item crude_steel_plate;
	//Item crystalline_alloy_gear;
	//Item crystalline_alloy_plate;
	//Item crystalline_pink_slime_gear;
	//Item crystalline_pink_slime_plate;
	Item dark_steel_gear;
	Item dark_steel_plate;
	Item electrical_steel_gear;
	Item electrical_steel_plate;
	Item end_steel_gear;
	Item end_steel_plate;
	Item energetic_alloy_gear;
	Item energetic_alloy_plate;
	//Item energetic_silver_gear;
	//Item energetic_silver_plate;
	//Item melodic_alloy_gear;
	//Item melodic_alloy_plate;
	Item pulsating_iron_gear;
	Item pulsating_iron_plate;
	Item redstone_alloy_gear;
	Item redstone_alloy_plate;
	Item soularium_gear;
	Item soularium_plate;
	//Item stellar_alloy_gear;
	//Item stellar_alloy_plate;
	Item vibrant_alloy_gear;
	Item vibrant_alloy_plate;
	
	public void preInit() {
		//combustive_metal_gear = gear("combustive_metal");
		//combustive_metal_plate = plate("combustive_metal");
		conductive_iron_gear = gear("conductive_iron");
		conductive_iron_plate = plate("conductive_iron");
		//crude_steel_gear = gear("crude_steel");
		//crude_steel_plate = plate("crude_steel");
		//crystalline_alloy_gear = gear("crystalline_alloy");
		//crystalline_alloy_plate = plate("crystalline_alloy");
		//crystalline_pink_slime_gear = gear("crystalline_pink_slime");
		//crystalline_pink_slime_plate = plate("crystalline_pink_slime");
		dark_steel_gear = gear("dark_steel");
		dark_steel_plate = plate("dark_steel");
		electrical_steel_gear =	 gear("electrical_steel");
		electrical_steel_plate = plate("electrical_steel");
		end_steel_gear = gear("end_steel");
		end_steel_plate = plate("end_steel");
		energetic_alloy_gear = gear("energetic_alloy");
		energetic_alloy_plate =  plate("energetic_alloy");
		//energetic_silver_gear = gear("energetic_silver");
		//energetic_silver_plate =  plate("energetic_silver");
		//melodic_alloy_gear = gear("melodic_alloy");
		//melodic_alloy_plate = plate("melodic_alloy");
		pulsating_iron_gear = gear("pulsating_iron");
		pulsating_iron_plate = plate("pulsating_iron");
		redstone_alloy_gear = gear("redstone_alloy");
		redstone_alloy_plate = plate("redstone_alloy");
		soularium_gear = gear("soularium");
		soularium_plate = plate("soularium");
		//stellar_alloy_gear = gear("stellar_alloy");
		//stellar_alloy_plate = plate("stellar_alloy");
		vibrant_alloy_gear = gear("vibrant_alloy");
		vibrant_alloy_plate = plate("vibrant_alloy");
		
		//reg(COMBUSTIVE_METAL, combustive_metal_gear, combustive_metal_plate);
		reg(CONDUCTIVE_IRON, conductive_iron_gear, conductive_iron_plate);
		//reg(CRUDE_STEEL, crude_steel_gear, crude_steel_plate);
		//reg(CRYSTALLINE_ALLOY, crystalline_alloy_gear, crystalline_alloy_plate);
		//reg(CRYSTALLINE_PINK_SLIME, crystalline_pink_slime_gear, crystalline_pink_slime_plate);
		reg(DARK_STEEL, dark_steel_gear, dark_steel_plate);
		reg(ELECTRICAL_STEEL, electrical_steel_gear, electrical_steel_plate);
		reg(END_STEEL, end_steel_gear, end_steel_plate);
		reg(ENERGETIC_ALLOY, energetic_alloy_gear, energetic_alloy_plate);
		//reg(ENERGETIC_SILVER, energetic_silver_gear, energetic_silver_plate);
		//reg(MELODIC_ALLOY, melodic_alloy_gear, melodic_alloy_plate);
		reg(PULSATING_IRON, pulsating_iron_gear, pulsating_iron_plate);
		reg(REDSTONE_ALLOY, redstone_alloy_gear, redstone_alloy_plate);
		reg(SOULARIUM, soularium_gear, soularium_plate);
		//reg(STELLAR_ALLOY, stellar_alloy_gear, stellar_alloy_plate);
		reg(VIBRANT_ALLOY, vibrant_alloy_gear, vibrant_alloy_plate);
	}
}