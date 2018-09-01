package panszelescik.moreplates.helpers;

import static panszelescik.moreplates.MorePlates.*;
import static panszelescik.moreplates.config.Config.*;

import panszelescik.moreplates.plugins.PluginBotania;
import vazkii.botania.api.BotaniaAPI;

public class BotaniaHelper extends Helper {
	
	public static void addManaInfusion(String output, String input) {
		if (checkIsNotNull(GEAR + input) && checkIsNotNull(GEAR + output)) {
			logger.debug(INFO_MANA_INFUSION + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromOre(GEAR + input));
			BotaniaAPI.registerManaInfusionRecipe(getOre(GEAR + output), GEAR + input, manasteelMana);
			
			PluginBotania.ManaInfusionRecipes += 1;
		}
		if (checkIsNotNull(PLATE + input) && checkIsNotNull(PLATE + output)) {
			logger.debug(INFO_MANA_INFUSION + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(PLATE + input));
			BotaniaAPI.registerManaInfusionRecipe(getOre(PLATE + output), PLATE + input, manasteelMana);
			
			PluginBotania.ManaInfusionRecipes += 1;
		}
	}
	
	public static void addElvenTrade(String output, String input) {
		if (checkIsNotNull(GEAR + input) && checkIsNotNull(GEAR + output)) {
			logger.debug(INFO_ELVEN_TRADE + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromOre(GEAR + input) + " x2");
			BotaniaAPI.registerElvenTradeRecipe(getOre(GEAR + output), GEAR + input, GEAR + input);
			
			PluginBotania.ElvenTradeRecipes += 1;
		}
		if (checkIsNotNull(PLATE + input) && checkIsNotNull(PLATE + output)) {
			logger.debug(INFO_ELVEN_TRADE + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(PLATE + input) + " x2");
			BotaniaAPI.registerElvenTradeRecipe(getOre(PLATE + output), PLATE + input, PLATE + input);
			
			PluginBotania.ElvenTradeRecipes += 1;
		}
	}
}