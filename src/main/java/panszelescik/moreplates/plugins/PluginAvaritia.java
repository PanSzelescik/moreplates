package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.helpers.PluginHelper;
import panszelescik.moreplates.plugins.core.Plugin;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = PluginAvaritia.MODID, modname = PluginAvaritia.MODNAME)
public class PluginAvaritia extends PluginHelper {

    public static final String MODID = "avaritia";
    public static final String MODNAME = "Avaritia";

    @Plugin.PreInit
    public static void preInit() {
        reg(CRYSTAL_MATRIX);
        reg(INFINITY);
        reg(NEUTRONIUM);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(CRYSTAL_MATRIX);
        add(INFINITY);
        add(NEUTRONIUM);

        addBlock(CRYSTAL_MATRIX);
        addBlock(INFINITY);
        addBlock(NEUTRONIUM);
    }
}