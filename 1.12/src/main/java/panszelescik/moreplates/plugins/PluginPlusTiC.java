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
		
		registerItem(alumite_gear);
		registerItem(alumite_plate);
		
		oreGear(ALUMITE, alumite_gear);
		orePlate(ALUMITE, alumite_plate);
		
		if (isBotaniaLoaded) {
			mirion_gear = new ItemGear("mirion");
			mirion_plate = new ItemPlate("mirion");
			
			registerItem(mirion_gear);
			registerItem(mirion_plate);
			
			oreGear(MIRION, mirion_gear);
			orePlate(MIRION, mirion_plate);
		}
		if (isMekanismLoaded) {
			osgloglas_gear = new ItemGear("osgloglas");
			osgloglas_plate = new ItemPlate("osgloglas");
			
			registerItem(osgloglas_gear);
			registerItem(osgloglas_plate);
			
			oreGear(OSGLOGLAS, osgloglas_gear);
			orePlate(OSGLOGLAS, osgloglas_plate);
		}
		if (isMekanismLoaded & isThermalExpansionLoaded) {
			osmiridium_gear = new ItemGear("osmiridium");
			osmiridium_plate = new ItemPlate("osmiridium");
			
			registerItem(osmiridium_gear);
			registerItem(osmiridium_plate);
			
			oreGear(OSMIRIDIUM, osmiridium_gear);
			orePlate(OSMIRIDIUM, osmiridium_plate);
		}
	}
	
	public static void clientPreInit() {
		registerRender(alumite_gear);
		registerRender(alumite_plate);
		
		if (isBotaniaLoaded) {
			registerRender(mirion_gear);
			registerRender(mirion_plate);
		}
		if (isMekanismLoaded) {
			registerRender(osgloglas_gear);
			registerRender(osgloglas_plate);
		}
		if (isMekanismLoaded & isThermalExpansionLoaded) {
			registerRender(osmiridium_gear);
			registerRender(osmiridium_plate);
		}
	}
}