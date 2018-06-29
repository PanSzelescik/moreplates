package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.items.*;
import vazkii.botania.api.BotaniaAPI;

import static panszelescik.moreplates.config.Config.*;
import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginBotania {
	
	private static int ElvenTradeRecipes = 0;
	private static int ManaInfusionRecipes = 0;
	
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
		
		reg(ELEMENTIUM, elementium_gear, elementium_plate);
		regGaia(GAIA_SPIRIT, gaia_spirit_gear, gaia_spirit_plate);
		reg(MANASTEEL, manasteel_gear, manasteel_plate);
		reg(TERRASTEEL, terrasteel_gear, terrasteel_plate);
	}
	
	public static void postInit() {
		addElvenTrade(ELEMENTIUM, MANASTEEL);
		addManaInfusion(MANASTEEL, IRON);
		
		MorePlates.logger.info("Added " + ElvenTradeRecipes + " recipes to Elven Trade");
		MorePlates.logger.info("Added " + ManaInfusionRecipes + " Mana Infusion recipes");
	}
	
	private static void addManaInfusion(String output, String input) {
		MorePlates.logger.debug(INFO_MANA_INFUSION + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromOre(GEAR + input));
		BotaniaAPI.registerManaInfusionRecipe(getOre(GEAR + output), GEAR + input, manasteelMana);
		
		ManaInfusionRecipes += 1;
		
		MorePlates.logger.debug(INFO_MANA_INFUSION + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(PLATE + input));
		BotaniaAPI.registerManaInfusionRecipe(getOre(PLATE + output), PLATE + input, manasteelMana);
		
		ManaInfusionRecipes += 1;
	}
	
	private static void addElvenTrade(String output, String input) {
		MorePlates.logger.debug(INFO_ELVEN_TRADE + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromOre(GEAR + input) + " x2");
		BotaniaAPI.registerElvenTradeRecipe(getOre(GEAR + output), GEAR + input, GEAR + input);
		
		ElvenTradeRecipes += 1;
		
		MorePlates.logger.debug(INFO_ELVEN_TRADE + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(PLATE + input) + " x2");
		BotaniaAPI.registerElvenTradeRecipe(getOre(PLATE + output), PLATE + input, PLATE + input);
		
		ElvenTradeRecipes += 1;
	}
}