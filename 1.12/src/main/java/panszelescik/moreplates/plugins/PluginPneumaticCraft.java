package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

import static panszelescik.moreplates.helpers.ItemInfo.*;

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