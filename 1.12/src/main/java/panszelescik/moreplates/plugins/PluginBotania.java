package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.ItemGear;
import panszelescik.moreplates.items.ItemPlate;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginBotania {
	
	public static Item elementium_gear;
	public static Item elementium_plate;
	public static Item gaia_spirit_gear;
	public static Item gaia_spirit_plate;
	public static Item manasteel_gear;
	public static Item manasteel_plate;
	public static Item terrasteel_gear;
	public static Item terrasteel_plate;
	
	public static void preInit() {
		elementium_gear = new ItemGear("elementium");
		elementium_plate = new ItemPlate("elementium");
		gaia_spirit_gear = new ItemGear("gaia_spirit");
		gaia_spirit_plate = new ItemPlate("gaia_spirit");
		manasteel_gear = new ItemGear("manasteel");
		manasteel_plate = new ItemPlate("manasteel");
		terrasteel_gear = new ItemGear("terrasteel");
		terrasteel_plate = new ItemPlate("terrasteel");
		
		registerItem(elementium_gear);
		registerItem(elementium_plate);
		registerItem(gaia_spirit_gear);
		registerItem(gaia_spirit_plate);
		registerItem(manasteel_gear);
		registerItem(manasteel_plate);
		registerItem(terrasteel_gear);
		registerItem(terrasteel_plate);
		
		oreGear(ELEMENTIUM, elementium_gear);
		orePlate(ELEMENTIUM, elementium_plate);
		oreGearGaia(GAIA_SPIRIT, gaia_spirit_gear);
		orePlateGaia(GAIA_SPIRIT, gaia_spirit_plate);
		oreGear(MANASTEEL, manasteel_gear);
		orePlate(MANASTEEL, manasteel_plate);
		oreGear(TERRASTEEL, terrasteel_gear);
		orePlate(TERRASTEEL, terrasteel_plate);
	}
	
	public static void clientPreInit() {
		registerRender(elementium_gear);
		registerRender(elementium_plate);
		registerRender(gaia_spirit_gear);
		registerRender(gaia_spirit_plate);
		registerRender(manasteel_gear);
		registerRender(manasteel_plate);
		registerRender(terrasteel_gear);
		registerRender(terrasteel_plate);
	}
}