package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginAvaritia.MODID, modname = PluginAvaritia.MODNAME)
public class PluginAvaritia extends PluginHelper {

    public static final String MODID = "avaritia";
    public static final String MODNAME = "Avaritia";

    @Plugin.PreInit
    public static void preInit() {
        reg(CRYSTAL_MATRIX, "crystal_matrix");
        reg(INFINITY, "infinity");
        reg(NEUTRONIUM, "neutronium");
    }
}