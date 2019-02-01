package panszelescik.moreplates.helpers;

import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.config.Config;
import vazkii.botania.api.BotaniaAPI;

import static panszelescik.moreplates.helpers.ItemInfo.Type.*;

public class BotaniaHelper extends PluginHelper {

    public static int ElvenTradeRecipes = 0, ManaInfusionRecipes = 0;

    public static void addManaInfusion(String output, String input) {
        if (oreNameExists(GEAR + input) && oreNameExists(GEAR + output)) {
            MorePlates.logger.debug("Adding Mana Infusion recipe for: " + getItemName(GEAR + output) + " from: " + getItemName(GEAR + input));
            BotaniaAPI.registerManaInfusionRecipe(get(GEAR + output), GEAR + input, manasteelMana());

            ManaInfusionRecipes += 1;
        }
        if (oreNameExists(PLATE + input) && oreNameExists(PLATE + output)) {
            MorePlates.logger.debug("Adding Mana Infusion recipe for: " + getItemName(PLATE + output) + " from: " + getItemName(PLATE + input));
            BotaniaAPI.registerManaInfusionRecipe(get(PLATE + output), PLATE + input, manasteelMana());

            ManaInfusionRecipes += 1;
        }
    }

    public static void addElvenTrade(String output, String input) {
        if (oreNameExists(GEAR + input) && oreNameExists(GEAR + output)) {
            MorePlates.logger.debug("Adding Elven Trade recipe for: " + getItemName(GEAR + output) + " from: " + getItemName(GEAR + input) + " x2");
            BotaniaAPI.registerElvenTradeRecipe(get(GEAR + output), GEAR + input, GEAR + input);

            ElvenTradeRecipes += 1;
        }
        if (oreNameExists(PLATE + input) && oreNameExists(PLATE + output)) {
            MorePlates.logger.debug("Adding Elven Trade recipe for: " + getItemName(PLATE + output) + " from: " + getItemName(PLATE + input) + " x2");
            BotaniaAPI.registerElvenTradeRecipe(get(PLATE + output), PLATE + input, PLATE + input);

            ElvenTradeRecipes += 1;
        }
    }

    private static int manasteelMana() {
        return MorePlates.config.getInt("Mana for Manasteel", Config.CATEGORY_BOTANIA, 3000, "Amount of mana used to make Manasteel Gear and Plate");
    }
}