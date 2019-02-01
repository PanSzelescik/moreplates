package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

import static panszelescik.moreplates.helpers.ItemInfo.*;

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