package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginMekanism.MODID, modname = PluginMekanism.MODNAME)
public class PluginMekanism extends PluginHelper {

    public static final String MODID = "mekanism";
    public static final String MODNAME = "Mekanism";

    @Plugin.PreInit
    public static void preInit() {
        reg(OSMIUM, "osmium");
        reg(REFINED_GLOWSTONE, "refined_glowstone");
        reg(REFINED_OBSIDIAN, "refined_obsidian");
    }
}