package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.ItemGear;
import panszelescik.moreplates.items.ItemPlate;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginAppliedEnergistics2 {

	public static Item certus_quartz_gear;
	public static Item certus_quartz_plate;
	public static Item fluix_gear;
	public static Item fluix_plate;
	
	public static void preInit() {
		certus_quartz_gear = new ItemGear("certus_quartz");
		certus_quartz_plate = new ItemPlate("certus_quartz");
		fluix_gear = new ItemGear("fluix");
		fluix_plate = new ItemPlate("fluix");
		
		registerItem(certus_quartz_gear);
		registerItem(certus_quartz_plate);
		registerItem(fluix_gear);
		registerItem(fluix_plate);
		
		oreGear(CERTUS_QUARTZ, certus_quartz_gear);
		orePlate(CERTUS_QUARTZ, certus_quartz_plate);
		oreGear(FLUIX, fluix_gear);
		orePlate(FLUIX, fluix_plate);
	}
	
	public static void clientPreInit() {
		registerRender(certus_quartz_gear);
		registerRender(certus_quartz_plate);
		registerRender(fluix_gear);
		registerRender(fluix_plate);
	}
}