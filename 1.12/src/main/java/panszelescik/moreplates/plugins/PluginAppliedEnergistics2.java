package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.appliedenergistics2.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginAppliedEnergistics2 {
	
	public static Item certus_quartz_gear;
	public static Item certus_quartz_plate;
	public static Item fluix_gear;
	public static Item fluix_plate;
	
	public static void preInit() {
		certus_quartz_gear = new ItemCertusQuartzGear("certus_quartz_gear", "certus_quartz_gear");
		certus_quartz_plate = new ItemCertusQuartzPlate("certus_quartz_plate", "certus_quartz_plate");
		fluix_gear = new ItemFluixGear("fluix_gear", "fluix_gear");
		fluix_plate = new ItemFluixPlate("fluix_plate", "fluix_plate");
		
		registerItem(certus_quartz_gear);
		registerItem(certus_quartz_plate);
		registerItem(fluix_gear);
		registerItem(fluix_plate);
	}
	
	public static void clientPreInit() {
		registerRender(certus_quartz_gear);
		registerRender(certus_quartz_plate);
		registerRender(fluix_gear);
		registerRender(fluix_plate);
	}
	
	public static void init() {
		oreGear(CERTUS_QUARTZ, certus_quartz_gear);
		orePlate(CERTUS_QUARTZ, certus_quartz_plate);
		oreGear(FLUIX, fluix_gear);
		orePlate(FLUIX, fluix_plate);
	}
}