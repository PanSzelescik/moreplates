package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.helpers.PluginHelper;
import panszelescik.moreplates.plugins.core.Plugin;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = PluginSoulShards.MODID, modname = PluginSoulShards.MODNAME)
public class PluginSoulShards extends PluginHelper {

    public static final String MODID = "soulshardstow";
    public static final String MODNAME = "Soul Shards - The Old Ways";

    @Plugin.PreInit
    public static void preInit() {
        reg(CORRUPTED);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(CORRUPTED);
    }
}