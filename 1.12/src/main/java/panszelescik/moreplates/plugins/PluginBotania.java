package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.botania.*;

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
		elementium_gear = new ItemElementiumGear("elementium_gear");
		elementium_plate = new ItemElementiumPlate("elementium_plate");
		gaia_spirit_gear = new ItemGaiaSpiritGear("gaia_spirit_gear");
		gaia_spirit_plate = new ItemGaiaSpiritPlate("gaia_spirit_plate");
		manasteel_gear = new ItemManasteelGear("manasteel_gear");
		manasteel_plate = new ItemManasteelPlate("manasteel_plate");
		terrasteel_gear = new ItemTerrasteelGear("terrasteel_gear");
		terrasteel_plate = new ItemTerrasteelPlate("terrasteel_plate");
		
		registerItem(elementium_gear);
		registerItem(elementium_plate);
		registerItem(gaia_spirit_gear);
		registerItem(gaia_spirit_plate);
		registerItem(manasteel_gear);
		registerItem(manasteel_plate);
		registerItem(terrasteel_gear);
		registerItem(terrasteel_plate);
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
	
	public static void init() {
		oreGear(ELEMENTIUM, elementium_gear);
		orePlate(ELEMENTIUM, elementium_plate);
		oreGearGaia(GAIA_SPIRIT, gaia_spirit_gear);
		orePlateGaia(GAIA_SPIRIT, gaia_spirit_plate);
		oreGear(MANASTEEL, manasteel_gear);
		orePlate(MANASTEEL, manasteel_plate);
		oreGear(TERRASTEEL, terrasteel_gear);
		orePlate(TERRASTEEL, terrasteel_plate);
	}
}