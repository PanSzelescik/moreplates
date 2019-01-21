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

    @Plugin.PostInit
    public static void postInit() {
        add(OSMIUM, INGOT + OSMIUM);
        add(REFINED_GLOWSTONE, INGOT + REFINED_GLOWSTONE);
        add(REFINED_OBSIDIAN, INGOT + REFINED_OBSIDIAN);

        addBlock(OSMIUM, 9);
        addBlock(REFINED_GLOWSTONE, 9);
        addBlock(REFINED_OBSIDIAN, 9);
    }
}