package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.helpers.PluginHelper;
import panszelescik.moreplates.plugins.core.Plugin;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = PluginMekanism.MODID, modname = PluginMekanism.MODNAME)
public class PluginMekanism extends PluginHelper {

    public static final String MODID = "mekanism";
    public static final String MODNAME = "Mekanism";

    @Plugin.PreInit
    public static void preInit() {
        reg(OSMIUM);
        reg(REFINED_GLOWSTONE);
        reg(REFINED_OBSIDIAN);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(OSMIUM);
        add(REFINED_GLOWSTONE);
        add(REFINED_OBSIDIAN);

        addBlock(OSMIUM);
        addBlock(REFINED_GLOWSTONE);
        addBlock(REFINED_OBSIDIAN);
    }
}