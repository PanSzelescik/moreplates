package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginActuallyAdditions {
	
	public static Item black_quartz_gear;
	public static Item black_quartz_plate;
	public static Item diamantine_gear;
	public static Item diamantine_plate;
	public static Item emeraldic_gear;
	public static Item emeraldic_plate;
	public static Item enori_gear;
	public static Item enori_plate;
	public static Item palis_gear;
	public static Item palis_plate;
	public static Item restonia_gear;
	public static Item restonia_plate;
	public static Item void_gear;
	public static Item void_plate;
	
	public static Item empowered_diamantine_gear;
	public static Item empowered_diamantine_plate;
	public static Item empowered_emeraldic_gear;
	public static Item empowered_emeraldic_plate;
	public static Item empowered_enori_gear;
	public static Item empowered_enori_plate;
	public static Item empowered_palis_gear;
	public static Item empowered_palis_plate;
	public static Item empowered_restonia_gear;
	public static Item empowered_restonia_plate;
	public static Item empowered_void_gear;
	public static Item empowered_void_plate;
	
	public static void preInit() {
		black_quartz_gear = new ItemGear("black_quartz");
		black_quartz_plate = new ItemPlate("black_quartz");
		diamantine_gear = new ItemGear("diamantine");
		diamantine_plate = new ItemPlate("diamantine");
		emeraldic_gear = new ItemGear("emeraldic");
		emeraldic_plate = new ItemPlate("emeraldic");
		enori_gear = new ItemGear("enori");
		enori_plate = new ItemPlate("enori");
		palis_gear = new ItemGear("palis");
		palis_plate = new ItemPlate("palis");
		restonia_gear = new ItemGear("restonia");
		restonia_plate = new ItemPlate("restonia");
		void_gear = new ItemGear("void");
		void_plate = new ItemPlate("void");
		
		empowered_diamantine_gear = new ItemGear("empowered_diamantine");
		empowered_diamantine_plate = new ItemPlate("empowered_diamantine");
		empowered_emeraldic_gear = new ItemGear("empowered_emeraldic");
		empowered_emeraldic_plate = new ItemPlate("empowered_emeraldic");
		empowered_enori_gear = new ItemGear("empowered_enori");
		empowered_enori_plate = new ItemPlate("empowered_enori");
		empowered_palis_gear = new ItemGear("empowered_palis");
		empowered_palis_plate = new ItemPlate("empowered_palis");
		empowered_restonia_gear = new ItemGear("empowered_restonia");
		empowered_restonia_plate = new ItemPlate("empowered_restonia");
		empowered_void_gear = new ItemGear("empowered_void");
		empowered_void_plate = new ItemPlate("empowered_void");
		
		registerItem(black_quartz_gear);
		registerItem(black_quartz_plate);
		registerItem(diamantine_gear);
		registerItem(diamantine_plate);
		registerItem(emeraldic_gear);
		registerItem(emeraldic_plate);
		registerItem(enori_gear);
		registerItem(enori_plate);
		registerItem(palis_gear);
		registerItem(palis_plate);
		registerItem(restonia_gear);
		registerItem(restonia_plate);
		registerItem(void_gear);
		registerItem(void_plate);
		
		registerItem(empowered_diamantine_gear);
		registerItem(empowered_diamantine_plate);
		registerItem(empowered_emeraldic_gear);
		registerItem(empowered_emeraldic_plate);
		registerItem(empowered_enori_gear);
		registerItem(empowered_enori_plate);
		registerItem(empowered_palis_gear);
		registerItem(empowered_palis_plate);
		registerItem(empowered_restonia_gear);
		registerItem(empowered_restonia_plate);
		registerItem(empowered_void_gear);
		registerItem(empowered_void_plate);
		
		oreGear(BLACK_QUARTZ, black_quartz_gear);
		orePlate(BLACK_QUARTZ, black_quartz_plate);
		oreGear(DIAMANTINE, diamantine_gear);
		orePlate(DIAMANTINE, diamantine_plate);
		oreGear(EMERALDIC, emeraldic_gear);
		orePlate(EMERALDIC, emeraldic_plate);
		oreGear(ENORI, enori_gear);
		orePlate(ENORI, enori_plate);
		oreGear(PALIS, palis_gear);
		orePlate(PALIS, palis_plate);
		oreGear(RESTONIA, restonia_gear);
		orePlate(RESTONIA, restonia_plate);
		oreGear(VOID, void_gear);
		orePlate(VOID, void_plate);
		
		oreGear(EMPOWERED_DIAMANTINE, empowered_diamantine_gear);
		orePlate(EMPOWERED_DIAMANTINE, empowered_diamantine_plate);
		oreGear(EMPOWERED_EMERALDIC, empowered_emeraldic_gear);
		orePlate(EMPOWERED_EMERALDIC, empowered_emeraldic_plate);
		oreGear(EMPOWERED_ENORI, empowered_enori_gear);
		orePlate(EMPOWERED_ENORI, empowered_enori_plate);
		oreGear(EMPOWERED_PALIS, empowered_palis_gear);
		orePlate(EMPOWERED_PALIS, empowered_palis_plate);
		oreGear(EMPOWERED_RESTONIA, empowered_restonia_gear);
		orePlate(EMPOWERED_RESTONIA, empowered_restonia_plate);
		oreGear(EMPOWERED_VOID, empowered_void_gear);
		orePlate(EMPOWERED_VOID, empowered_void_plate);
	}
	
	public static void clientPreInit() {
		registerRender(black_quartz_gear);
		registerRender(black_quartz_plate);
		registerRender(diamantine_gear);
		registerRender(diamantine_plate);
		registerRender(emeraldic_gear);
		registerRender(emeraldic_plate);
		registerRender(enori_gear);
		registerRender(enori_plate);
		registerRender(palis_gear);
		registerRender(palis_plate);
		registerRender(restonia_gear);
		registerRender(restonia_plate);
		registerRender(void_gear);
		registerRender(void_plate);
		
		registerRender(empowered_diamantine_gear);
		registerRender(empowered_diamantine_plate);
		registerRender(empowered_emeraldic_gear);
		registerRender(empowered_emeraldic_plate);
		registerRender(empowered_enori_gear);
		registerRender(empowered_enori_plate);
		registerRender(empowered_palis_gear);
		registerRender(empowered_palis_plate);
		registerRender(empowered_restonia_gear);
		registerRender(empowered_restonia_plate);
		registerRender(empowered_void_gear);
		registerRender(empowered_void_plate);
	}
}