package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.enderio.*;

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
		conductive_iron_gear = new ItemConductiveIronGear("conductive_iron_gear", "conductive_iron_gear");
		conductive_iron_plate = new ItemConductiveIronPlate("conductive_iron_plate", "conductive_iron_plate");
		dark_steel_gear = new ItemDarkSteelGear("dark_steel_gear", "dark_steel_gear");
		dark_steel_plate = new ItemDarkSteelPlate("dark_steel_plate", "dark_steel_plate");
		electrical_steel_gear =	 new ItemElectricalSteelGear("electrical_steel_gear", "electrical_steel_gear");
		electrical_steel_plate = new ItemElectricalSteelPlate("electrical_steel_plate", "electrical_steel_plate");
		end_steel_gear = new ItemEndSteelGear("end_steel_gear", "end_steel_gear");
		end_steel_plate = new ItemEndSteelPlate("end_steel_plate", "end_steel_plate");
		energetic_alloy_gear = new ItemEnergeticAlloyGear("energetic_alloy_gear", "energetic_alloy_gear");
		energetic_alloy_plate =  new ItemEnergeticAlloyPlate("energetic_alloy_plate", "energetic_alloy_plate");
		pulsating_iron_gear = new ItemPulsatingIronGear("pulsating_iron_gear", "pulsating_iron_gear");
		pulsating_iron_plate = new ItemPulsatingIronPlate("pulsating_iron_plate", "pulsating_iron_plate");
		redstone_alloy_gear = new ItemRedstoneAlloyGear("redstone_alloy_gear", "redstone_alloy_gear");
		redstone_alloy_plate = new ItemRedstoneAlloyPlate("redstone_alloy_plate", "redstone_alloy_plate");
		soularium_gear = new ItemSoulariumGear("soularium_gear", "soularium_gear");
		soularium_plate = new ItemSoulariumPlate("soularium_plate", "soularium_plate");
		vibrant_alloy_gear = new ItemVibrantAlloyGear("vibrant_alloy_gear", "vibrant_alloy_gear");
		vibrant_alloy_plate = new ItemVibrantAlloyPlate("vibrant_alloy_plate", "vibrant_alloy_plate");
		
		registerItem(conductive_iron_gear);
		registerItem(conductive_iron_plate);
		registerItem(dark_steel_gear);
		registerItem(dark_steel_plate);
		registerItem(electrical_steel_gear);
		registerItem(electrical_steel_plate);
		registerItem(end_steel_gear);
		registerItem(end_steel_plate);
		registerItem(energetic_alloy_gear);
		registerItem(energetic_alloy_plate);
		registerItem(pulsating_iron_gear);
		registerItem(pulsating_iron_plate);
		registerItem(redstone_alloy_gear);
		registerItem(redstone_alloy_plate);
		registerItem(soularium_gear);
		registerItem(soularium_plate);
		registerItem(vibrant_alloy_gear);
		registerItem(vibrant_alloy_plate);
	}
	
	public static void clientPreInit() {
		registerRender(conductive_iron_gear);
		registerRender(conductive_iron_plate);
		registerRender(dark_steel_gear);
		registerRender(dark_steel_plate);
		registerRender(electrical_steel_gear);
		registerRender(electrical_steel_plate);
		registerRender(end_steel_gear);
		registerRender(end_steel_plate);
		registerRender(energetic_alloy_gear);
		registerRender(energetic_alloy_plate);
		registerRender(pulsating_iron_gear);
		registerRender(pulsating_iron_plate);
		registerRender(redstone_alloy_gear);
		registerRender(redstone_alloy_plate);
		registerRender(soularium_gear);
		registerRender(soularium_plate);
		registerRender(vibrant_alloy_gear);
		registerRender(vibrant_alloy_plate);
	}
	
	public static void init() {
		oreGear(CONDUCTIVE_IRON, conductive_iron_gear);
		orePlate(CONDUCTIVE_IRON, conductive_iron_plate);
		oreGear(DARK_STEEL, dark_steel_gear);
		orePlate(DARK_STEEL, dark_steel_plate);
		oreGear(ELECTRICAL_STEEL, electrical_steel_gear);
		orePlate(ELECTRICAL_STEEL, electrical_steel_plate);
		oreGear(END_STEEL, end_steel_gear);
		orePlate(END_STEEL, end_steel_plate);
		oreGear(ENERGETIC_ALLOY, energetic_alloy_gear);
		orePlate(ENERGETIC_ALLOY, energetic_alloy_plate);
		oreGear(PULSATING_IRON, pulsating_iron_gear);
		orePlate(PULSATING_IRON, pulsating_iron_plate);
		oreGear(REDSTONE_ALLOY, redstone_alloy_gear);
		orePlate(REDSTONE_ALLOY, redstone_alloy_plate);
		oreGear(SOULARIUM, soularium_gear);
		orePlate(SOULARIUM, soularium_plate);
		oreGear(VIBRANT_ALLOY, vibrant_alloy_gear);
		orePlate(VIBRANT_ALLOY, vibrant_alloy_plate);
	}
}