package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginTwilightForest.MODID, modname = PluginTwilightForest.MODNAME)
public class PluginTwilightForest extends PluginHelper {

    public static final String MODID = "twilightforest";
    public static final String MODNAME = "The Twilight Forest";

    @Plugin.PreInit
    public static void preInit() {
        reg(FIERY, "fiery");
        reg(IRONWOOD, "ironwood");
        reg(KNIGHTMETAL, "knightmetal");
    }
}