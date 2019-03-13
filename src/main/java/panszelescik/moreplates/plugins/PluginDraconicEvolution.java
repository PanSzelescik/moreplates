package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.helpers.PluginHelper;
import panszelescik.moreplates.plugins.core.Plugin;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = PluginDraconicEvolution.MODID, modname = PluginDraconicEvolution.MODNAME)
public class PluginDraconicEvolution extends PluginHelper {

    public static final String MODID = "draconicevolution";
    public static final String MODNAME = "Draconic Evolution";

    @Plugin.PreInit
    public static void preInit() {
        reg(AWAKENED_DRACONIUM);
        reg(DRACONIUM);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(AWAKENED_DRACONIUM);
        add(DRACONIUM);

        addBlock(AWAKENED_DRACONIUM);
        addBlock(DRACONIUM);
    }
}