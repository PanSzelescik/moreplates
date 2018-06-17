package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.items.*;
import vazkii.botania.api.BotaniaAPI;

import static panszelescik.moreplates.config.Config.*;
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
	
	public static void postInit() {
		addManaInfusion(MANASTEEL, IRON);
		addElvenTrade(ELEMENTIUM, MANASTEEL);
	}
	
	private static void addManaInfusion(String output, String input) {
		if (oreNameExists(GEAR + input)) {
			BotaniaAPI.registerManaInfusionRecipe(getOre(GEAR + output), GEAR + input, manasteelMana);
			MorePlates.logger.debug(INFO_MANA_INFUSION + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromOre(GEAR + input));
		}
		
		if (oreNameExists(PLATE + input)) {
			BotaniaAPI.registerManaInfusionRecipe(getOre(PLATE + output), PLATE + input, manasteelMana);
			MorePlates.logger.debug(INFO_MANA_INFUSION + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(PLATE + input));
		}
	}
	private static void addElvenTrade(String output, String input) {
		BotaniaAPI.registerElvenTradeRecipe(getOre(GEAR + output), GEAR + input, GEAR + input);
		MorePlates.logger.debug(INFO_ELVEN_TRADE + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromOre(GEAR + input) + " x2");
		BotaniaAPI.registerElvenTradeRecipe(getOre(PLATE + output), PLATE + input, PLATE + input);
		MorePlates.logger.debug(INFO_ELVEN_TRADE + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(PLATE + input) + " x2");
	}
}