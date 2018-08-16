package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginEnderIO extends PluginBase {
	
	public static final String MODID = "enderio";
	public static final String MODNAME = "Ender IO";
	
	public PluginEnderIO() {
		super(MODID, MODNAME);
	}
	
	Item conductive_iron_gear;
	Item conductive_iron_plate;
	Item dark_steel_gear;
	Item dark_steel_plate;
	Item electrical_steel_gear;
	Item electrical_steel_plate;
	Item end_steel_gear;
	Item end_steel_plate;
	Item energetic_alloy_gear;
	Item energetic_alloy_plate;
	Item pulsating_iron_gear;
	Item pulsating_iron_plate;
	Item redstone_alloy_gear;
	Item redstone_alloy_plate;
	Item soularium_gear;
	Item soularium_plate;
	Item vibrant_alloy_gear;
	Item vibrant_alloy_plate;
	
	public void preInit() {
		conductive_iron_gear = gear("conductive_iron");
		conductive_iron_plate = plate("conductive_iron");
		dark_steel_gear = gear("dark_steel");
		dark_steel_plate = plate("dark_steel");
		electrical_steel_gear =	 gear("electrical_steel");
		electrical_steel_plate = plate("electrical_steel");
		end_steel_gear = gear("end_steel");
		end_steel_plate = plate("end_steel");
		energetic_alloy_gear = gear("energetic_alloy");
		energetic_alloy_plate =  plate("energetic_alloy");
		pulsating_iron_gear = gear("pulsating_iron");
		pulsating_iron_plate = plate("pulsating_iron");
		redstone_alloy_gear = gear("redstone_alloy");
		redstone_alloy_plate = plate("redstone_alloy");
		soularium_gear = gear("soularium");
		soularium_plate = plate("soularium");
		vibrant_alloy_gear = gear("vibrant_alloy");
		vibrant_alloy_plate = plate("vibrant_alloy");
		
		reg(CONDUCTIVE_IRON, conductive_iron_gear, conductive_iron_plate);
		reg(DARK_STEEL, dark_steel_gear, dark_steel_plate);
		reg(ELECTRICAL_STEEL, electrical_steel_gear, electrical_steel_plate);
		reg(END_STEEL, end_steel_gear, end_steel_plate);
		reg(ENERGETIC_ALLOY, energetic_alloy_gear, energetic_alloy_plate);
		reg(PULSATING_IRON, pulsating_iron_gear, pulsating_iron_plate);
		reg(REDSTONE_ALLOY, redstone_alloy_gear, redstone_alloy_plate);
		reg(SOULARIUM, soularium_gear, soularium_plate);
		reg(VIBRANT_ALLOY, vibrant_alloy_gear, vibrant_alloy_plate);
	}
}