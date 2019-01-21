package panszelescik.moreplates.plugins;

import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.helpers.BotaniaHelper;
import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginBotania.MODID, modname = PluginBotania.MODNAME)
public class PluginBotania extends PluginHelper {

    public static final String MODID = "botania";
    public static final String MODNAME = "Botania";

    @Plugin.PreInit
    public static void preInit() {
        reg(ELEMENTIUM, "elementium");
        regGaia(GAIA_SPIRIT, "gaia_spirit");
        reg(MANASTEEL, "manasteel");
        reg(TERRASTEEL, "terrasteel");
    }

    @Plugin.PostInit
    public static void postInit() {
        addElvenTrade(ELEMENTIUM, MANASTEEL);
        addManaInfusion(MANASTEEL, IRON);

        add(ELEMENTIUM, INGOT + ELEMENTIUM);
        addGaia(GAIA_SPIRIT, GAIA_SPIRIT + "Ingot");
        add(MANASTEEL, INGOT + MANASTEEL);
        add(TERRASTEEL, INGOT + TERRASTEEL);

        addBlock(ELEMENTIUM, BOTANIA_NAME, 9, MODID, ELEMENTIUM_META);
        addBlock(MANASTEEL, BOTANIA_NAME, 9, MODID, MANASTEEL_META);
        addBlock(TERRASTEEL, BOTANIA_NAME, 9, MODID, TERRASTEEL_META);

        MorePlates.logger.info("Added " + BotaniaHelper.ElvenTradeRecipes + " recipes to Elven Trade");
        MorePlates.logger.info("Added " + BotaniaHelper.ManaInfusionRecipes + " Mana Infusion recipes");
    }

    private static void addManaInfusion(String output, String input) {
        BotaniaHelper.addManaInfusion(output, input);
    }

    private static void addElvenTrade(String output, String input) {
        BotaniaHelper.addElvenTrade(output, input);
    }
}