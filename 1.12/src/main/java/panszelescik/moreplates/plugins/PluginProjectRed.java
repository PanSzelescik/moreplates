package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginProjectRed.MODID, modname = PluginProjectRed.MODNAME)
public class PluginProjectRed extends PluginHelper {

    public static final String MODID = "projectred-core";
    public static final String MODNAME = "Project Red";

    @Plugin.PreInit
    public static void preInit() {
        reg(ELECTROTINE, "electrotine_alloy");
        reg(RED_ALLOY, "red_alloy");
    }
}