package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginEnderIO {
	
	public static Item conductive_iron_gear;
	public static Item conductive_iron_plate;
	public static Item dark_steel_gear;
	public static Item dark_steel_plate;
	public static Item electrical_steel_gear;
	public static Item electrical_steel_plate;
	public static Item end_steel_gear;
	public static Item end_steel_plate;
	public static Item energetic_alloy_gear;
	public static Item energetic_alloy_plate;
	public static Item pulsating_iron_gear;
	public static Item pulsating_iron_plate;
	public static Item redstone_alloy_gear;
	public static Item redstone_alloy_plate;
	public static Item soularium_gear;
	public static Item soularium_plate;
	public static Item vibrant_alloy_gear;
	public static Item vibrant_alloy_plate;
	
	public static void preInit() {
		conductive_iron_gear = new ItemGear("conductive_iron");
		conductive_iron_plate = new ItemPlate("conductive_iron");
		dark_steel_gear = new ItemGear("dark_steel");
		dark_steel_plate = new ItemPlate("dark_steel");
		electrical_steel_gear =	 new ItemGear("electrical_steel");
		electrical_steel_plate = new ItemPlate("electrical_steel");
		end_steel_gear = new ItemGear("end_steel");
		end_steel_plate = new ItemPlate("end_steel");
		energetic_alloy_gear = new ItemGear("energetic_alloy");
		energetic_alloy_plate =  new ItemPlate("energetic_alloy");
		pulsating_iron_gear = new ItemGear("pulsating_iron");
		pulsating_iron_plate = new ItemPlate("pulsating_iron");
		redstone_alloy_gear = new ItemGear("redstone_alloy");
		redstone_alloy_plate = new ItemPlate("redstone_alloy");
		soularium_gear = new ItemGear("soularium");
		soularium_plate = new ItemPlate("soularium");
		vibrant_alloy_gear = new ItemGear("vibrant_alloy");
		vibrant_alloy_plate = new ItemPlate("vibrant_alloy");
		
		regGear(conductive_iron_gear, CONDUCTIVE_IRON);
		regPlate(conductive_iron_plate, CONDUCTIVE_IRON);
		regGear(dark_steel_gear, DARK_STEEL);
		regPlate(dark_steel_plate, DARK_STEEL);
		regGear(electrical_steel_gear, ELECTRICAL_STEEL);
		regPlate(electrical_steel_plate, ELECTRICAL_STEEL);
		regGear(end_steel_gear, END_STEEL);
		regPlate(end_steel_plate, END_STEEL);
		regGear(energetic_alloy_gear, ENERGETIC_ALLOY);
		regPlate(energetic_alloy_plate, ENERGETIC_ALLOY);
		regGear(pulsating_iron_gear, PULSATING_IRON);
		regPlate(pulsating_iron_plate, PULSATING_IRON);
		regGear(redstone_alloy_gear, REDSTONE_ALLOY);
		regPlate(redstone_alloy_plate, REDSTONE_ALLOY);
		regGear(soularium_gear, SOULARIUM);
		regPlate(soularium_plate, SOULARIUM);
		regGear(vibrant_alloy_gear, VIBRANT_ALLOY);
		regPlate(vibrant_alloy_plate, VIBRANT_ALLOY);
		
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