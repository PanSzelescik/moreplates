package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

import static panszelescik.moreplates.helpers.ItemInfo.*;

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