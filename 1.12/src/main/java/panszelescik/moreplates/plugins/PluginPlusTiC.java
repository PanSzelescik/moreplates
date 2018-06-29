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
		
		reg(ALUMITE, alumite_gear, alumite_plate);
		
		if (isBotaniaLoaded) {
			mirion_gear = new ItemGear("mirion");
			mirion_plate = new ItemPlate("mirion");
			
			reg(MIRION, mirion_gear, mirion_plate);
		}
		if (isMekanismLoaded) {
			osgloglas_gear = new ItemGear("osgloglas");
			osgloglas_plate = new ItemPlate("osgloglas");
			
			reg(OSGLOGLAS, osgloglas_gear, osgloglas_plate);
		}
		if (isMekanismLoaded & isThermalExpansionLoaded) {
			osmiridium_gear = new ItemGear("osmiridium");
			osmiridium_plate = new ItemPlate("osmiridium");
			
			reg(OSMIRIDIUM, osmiridium_gear, osmiridium_plate);
		}
	}
}