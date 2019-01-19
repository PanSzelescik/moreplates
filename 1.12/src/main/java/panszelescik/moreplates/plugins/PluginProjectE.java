package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginProjectE.MODID, modname = PluginProjectE.MODNAME)
public class PluginProjectE extends PluginHelper {

    public static final String MODID = "projecte";
    public static final String MODNAME = "ProjectE";

    @Plugin.PreInit
    public static void preInit() {
        reg(DARK_MATTER, "dark_matter");
        reg(RED_MATTER, "red_matter");
    }
}