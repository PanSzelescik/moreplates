package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.items.enderio.*;

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
		conductive_iron_gear =		new ItemConductiveIronGear		("conductive_iron_gear",	"conductive_iron_gear");
		conductive_iron_plate =		new ItemConductiveIronPlate		("conductive_iron_plate",	"conductive_iron_plate");
		dark_steel_gear =			new ItemDarkSteelGear			("dark_steel_gear",			"dark_steel_gear");
		dark_steel_plate =			new ItemDarkSteelPlate			("dark_steel_plate",		"dark_steel_plate");
		electrical_steel_gear =		new ItemElectricalSteelGear		("electrical_steel_gear",	"electrical_steel_gear");
		electrical_steel_plate =	new ItemElectricalSteelPlate	("electrical_steel_plate",	"electrical_steel_plate");
		end_steel_gear =			new ItemEndSteelGear			("end_steel_gear",			"end_steel_gear");
		end_steel_plate =			new ItemEndSteelPlate			("end_steel_plate",			"end_steel_plate");
		energetic_alloy_gear =		new ItemEnergeticAlloyGear		("energetic_alloy_gear",	"energetic_alloy_gear");
		energetic_alloy_plate = 	new ItemEnergeticAlloyPlate		("energetic_alloy_plate",	"energetic_alloy_plate");
		pulsating_iron_gear =		new ItemPulsatingIronGear		("pulsating_iron_gear",		"pulsating_iron_gear");
		pulsating_iron_plate =		new ItemPulsatingIronPlate		("pulsating_iron_plate",	"pulsating_iron_plate");
		redstone_alloy_gear =		new ItemRedstoneAlloyGear		("redstone_alloy_gear",		"redstone_alloy_gear");
		redstone_alloy_plate =		new ItemRedstoneAlloyPlate		("redstone_alloy_plate",	"redstone_alloy_plate");
		soularium_gear =			new ItemSoulariumGear			("soularium_gear",			"soularium_gear");
		soularium_plate =			new ItemSoulariumPlate			("soularium_plate",			"soularium_plate");
		vibrant_alloy_gear =		new ItemVibrantAlloyGear		("vibrant_alloy_gear",		"vibrant_alloy_gear");
		vibrant_alloy_plate =		new ItemVibrantAlloyPlate		("vibrant_alloy_plate",		"vibrant_alloy_plate");
		
		Helper.registerItem(conductive_iron_gear);
		Helper.registerItem(conductive_iron_plate);
		Helper.registerItem(dark_steel_gear);
		Helper.registerItem(dark_steel_plate);
		Helper.registerItem(electrical_steel_gear);
		Helper.registerItem(electrical_steel_plate);
		Helper.registerItem(end_steel_gear);
		Helper.registerItem(end_steel_plate);
		Helper.registerItem(energetic_alloy_gear);
		Helper.registerItem(energetic_alloy_plate);
		Helper.registerItem(pulsating_iron_gear);
		Helper.registerItem(pulsating_iron_plate);
		Helper.registerItem(redstone_alloy_gear);
		Helper.registerItem(redstone_alloy_plate);
		Helper.registerItem(soularium_gear);
		Helper.registerItem(soularium_plate);
		Helper.registerItem(vibrant_alloy_gear);
		Helper.registerItem(vibrant_alloy_plate);
	}
	
	public static void clientPreInit() {
		Helper.registerRender(conductive_iron_gear);
		Helper.registerRender(conductive_iron_plate);
		Helper.registerRender(dark_steel_gear);
		Helper.registerRender(dark_steel_plate);
		Helper.registerRender(electrical_steel_gear);
		Helper.registerRender(electrical_steel_plate);
		Helper.registerRender(end_steel_gear);
		Helper.registerRender(end_steel_plate);
		Helper.registerRender(energetic_alloy_gear);
		Helper.registerRender(energetic_alloy_plate);
		Helper.registerRender(pulsating_iron_gear);
		Helper.registerRender(pulsating_iron_plate);
		Helper.registerRender(redstone_alloy_gear);
		Helper.registerRender(redstone_alloy_plate);
		Helper.registerRender(soularium_gear);
		Helper.registerRender(soularium_plate);
		Helper.registerRender(vibrant_alloy_gear);
		Helper.registerRender(vibrant_alloy_plate);
	}
	
	public static void init() {
		OreDictionary.registerOre("gearConductiveIron",		conductive_iron_gear);
		OreDictionary.registerOre("plateConductiveIron",	conductive_iron_plate);
		OreDictionary.registerOre("gearDarkSteel",			dark_steel_gear);
		OreDictionary.registerOre("plateDarkSteel",			dark_steel_plate);
		OreDictionary.registerOre("gearElectricalSteel",	electrical_steel_gear);
		OreDictionary.registerOre("plateElectricalSteel",	electrical_steel_plate);
		OreDictionary.registerOre("gearEndSteel",			end_steel_gear);
		OreDictionary.registerOre("plateEndSteel",			end_steel_plate);
		OreDictionary.registerOre("gearEnergeticAlloy",		energetic_alloy_gear);
		OreDictionary.registerOre("plateEnergeticAlloy",	energetic_alloy_plate);
		OreDictionary.registerOre("gearPulsatingIron",		pulsating_iron_gear);
		OreDictionary.registerOre("platePulsatingIron",		pulsating_iron_plate);
		OreDictionary.registerOre("gearRedstoneAlloy",		redstone_alloy_gear);
		OreDictionary.registerOre("plateRedstoneAlloy",		redstone_alloy_plate);
		OreDictionary.registerOre("gearSoularium",			soularium_gear);
		OreDictionary.registerOre("plateSoularium",			soularium_plate);
		OreDictionary.registerOre("gearVibrantAlloy",		vibrant_alloy_gear);
		OreDictionary.registerOre("plateVibrantAlloy",		vibrant_alloy_plate);
	}
}