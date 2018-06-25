package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

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
		
		regGear(certus_quartz_gear, CERTUS_QUARTZ);
		regPlate(certus_quartz_plate, CERTUS_QUARTZ);
		regGear(fluix_gear, FLUIX);
		regPlate(fluix_plate, FLUIX);
	}
}