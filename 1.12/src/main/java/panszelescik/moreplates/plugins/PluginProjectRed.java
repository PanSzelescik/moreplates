package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.helpers.PluginHelper;
import panszelescik.moreplates.plugins.core.Plugin;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = PluginProjectRed.MODID, modname = PluginProjectRed.MODNAME)
public class PluginProjectRed extends PluginHelper {

    public static final String MODID = "projectred-core";
    public static final String MODNAME = "Project Red";

    @Plugin.PreInit
    public static void preInit() {
        reg(ELECTROTINE_ALLOY);
        reg(RED_ALLOY);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(ELECTROTINE_ALLOY);
        add(RED_ALLOY);
    }
}