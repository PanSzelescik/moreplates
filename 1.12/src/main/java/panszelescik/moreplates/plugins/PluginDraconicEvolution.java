package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginDraconicEvolution.MODID, modname = PluginDraconicEvolution.MODNAME)
public class PluginDraconicEvolution extends PluginHelper {

    public static final String MODID = "draconicevolution";
    public static final String MODNAME = "Draconic Evolution";

    @Plugin.PreInit
    public static void preInit() {
        reg(AWAKENED_DRACONIUM, "awakened_draconium");
        reg(DRACONIUM, "draconium");
    }

    @Plugin.PostInit
    public static void postInit() {
        add(AWAKENED_DRACONIUM, INGOT + AWAKENED_DRACONIUM);
        add(DRACONIUM, INGOT + DRACONIUM);

        addBlock(AWAKENED_DRACONIUM, 9);
        addBlock(DRACONIUM, 9);
    }
}