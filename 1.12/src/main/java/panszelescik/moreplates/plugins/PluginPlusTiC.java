package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.items.ItemGear;
import panszelescik.moreplates.items.ItemPlate;

import static panszelescik.moreplates.ModChecker.*;
import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginPlusTiC {
	
	public static Item alumite_gear;
	public static Item alumite_plate;
	public static Item mirion_gear;
	public static Item mirion_plate;
	public static Item osgloglas_gear;
	public static Item osgloglas_plate;
	public static Item osmiridium_gear;
	public static Item osmiridium_plate;
	
	public static void preInit() {
		alumite_gear = new ItemGear("alumite");
		alumite_plate = new ItemPlate("alumite");
		
		regGear(alumite_gear, ALUMITE);
		regPlate(alumite_plate, ALUMITE);
		
		if (isBotaniaLoaded) {
			mirion_gear = new ItemGear("mirion");
			mirion_plate = new ItemPlate("mirion");
			
			regGear(mirion_gear, MIRION);
			regPlate(mirion_plate, MIRION);
		}
		if (isMekanismLoaded) {
			osgloglas_gear = new ItemGear("osgloglas");
			osgloglas_plate = new ItemPlate("osgloglas");
			
			regGear(osgloglas_gear, OSGLOGLAS);
			regPlate(osgloglas_plate, OSGLOGLAS);
		}
		if (isMekanismLoaded & isThermalExpansionLoaded) {
			osmiridium_gear = new ItemGear("osmiridium");
			osmiridium_plate = new ItemPlate("osmiridium");
			
			regGear(osmiridium_gear, OSMIRIDIUM);
			regPlate(osmiridium_plate, OSMIRIDIUM);
		}
	}
}