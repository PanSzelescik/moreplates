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

    @Plugin.PostInit
    public static void postInit() {
        add(CRYSTAL_MATRIX, INGOT + CRYSTAL_MATRIX);
        add(INFINITY, INGOT + INFINITY);
        add(NEUTRONIUM, INGOT + NEUTRONIUM);

        addBlock(CRYSTAL_MATRIX, 9);
        addBlock(INFINITY, 9);
        addBlock(NEUTRONIUM, 9);
    }
}