package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.helpers.PluginHelper;
import panszelescik.moreplates.plugins.core.Plugin;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = PluginPneumaticCraft.MODID, modname = PluginPneumaticCraft.MODNAME)
public class PluginPneumaticCraft extends PluginHelper {

    public static final String MODID = "pneumaticcraft";
    public static final String MODNAME = "PneumaticCraft: Repressurized";

    @Plugin.PreInit
    public static void preInit() {
        reg(COMPRESSED_IRON);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(COMPRESSED_IRON);

        addBlock(COMPRESSED_IRON);
    }
}