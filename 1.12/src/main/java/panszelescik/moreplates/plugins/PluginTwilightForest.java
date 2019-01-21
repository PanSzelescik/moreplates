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

    @Plugin.PostInit
    public static void postInit() {
        add(FIERY, INGOT + FIERY);
        add(IRONWOOD, INGOT + IRONWOOD);
        add(KNIGHTMETAL, INGOT + KNIGHTMETAL);

        addBlock(FIERY, 9);
        addBlock(IRONWOOD, IRONWOOD_BLOCK_NAME, 9, MODID);
        addBlock(KNIGHTMETAL, 9);
    }
}