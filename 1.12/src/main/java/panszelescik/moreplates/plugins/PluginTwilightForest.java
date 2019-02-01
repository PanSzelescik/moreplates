package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.helpers.PluginHelper;
import panszelescik.moreplates.plugins.core.Plugin;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = PluginTwilightForest.MODID, modname = PluginTwilightForest.MODNAME)
public class PluginTwilightForest extends PluginHelper {

    public static final String MODID = "twilightforest";
    public static final String MODNAME = "The Twilight Forest";

    @Plugin.PreInit
    public static void preInit() {
        reg(FIERY);
        reg(IRONWOOD);
        reg(KNIGHTMETAL);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(FIERY);
        add(IRONWOOD);
        add(KNIGHTMETAL);

        addBlock(FIERY);
        addBlock(IRONWOOD, "knightmetal_block", 9, MODID);
        addBlock(KNIGHTMETAL);
    }
}