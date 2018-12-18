package panszelescik.moreplates.helpers;

import static panszelescik.moreplates.MorePlates.*;
import static panszelescik.moreplates.config.Config.*;

import vazkii.botania.api.BotaniaAPI;

public class BotaniaHelper extends Helper {
	
	public static int ElvenTradeRecipes = 0, ManaInfusionRecipes = 0;
	
	public static void addManaInfusion(String output, String input) {
		if (oreNameExists(GEAR + input) && oreNameExists(GEAR + output)) {
			logger.debug(INFO_MANA_INFUSION + getItemName(GEAR + output) + INFO_3 + getItemName(GEAR + input));
			BotaniaAPI.registerManaInfusionRecipe(get(GEAR + output), GEAR + input, manasteelMana());
			
			ManaInfusionRecipes += 1;
		}
		if (oreNameExists(PLATE + input) && oreNameExists(PLATE + output)) {
			logger.debug(INFO_MANA_INFUSION + getItemName(PLATE + output) + INFO_3 + getItemName(PLATE + input));
			BotaniaAPI.registerManaInfusionRecipe(get(PLATE + output), PLATE + input, manasteelMana());
			
			ManaInfusionRecipes += 1;
		}
	}
	
	public static void addElvenTrade(String output, String input) {
		if (oreNameExists(GEAR + input) && oreNameExists(GEAR + output)) {
			logger.debug(INFO_ELVEN_TRADE + getItemName(GEAR + output) + INFO_3 + getItemName(GEAR + input) + " x2");
			BotaniaAPI.registerElvenTradeRecipe(get(GEAR + output), GEAR + input, GEAR + input);
			
			ElvenTradeRecipes += 1;
		}
		if (oreNameExists(PLATE + input) && oreNameExists(PLATE + output)) {
			logger.debug(INFO_ELVEN_TRADE + getItemName(PLATE + output) + INFO_3 + getItemName(PLATE + input) + " x2");
			BotaniaAPI.registerElvenTradeRecipe(get(PLATE + output), PLATE + input, PLATE + input);
			
			ElvenTradeRecipes += 1;
		}
	}
	
	private static int manasteelMana() {
		return getInt("Mana for Manasteel", CATEGORY_BOTANIA, 3000, "Amount of mana used to make Manasteel Gear and Plate");
	}
}