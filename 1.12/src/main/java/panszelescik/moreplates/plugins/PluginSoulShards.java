package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginSoulShards.MODID, modname = PluginSoulShards.MODNAME)
public class PluginSoulShards extends PluginHelper {

    public static final String MODID = "soulshardstow";
    public static final String MODNAME = "Soul Shards - The Old Ways";

    @Plugin.PreInit
    public static void preInit() {
        reg(CORRUPTED, "corrupted");
    }

    @Plugin.PostInit
    public static void postInit() {
        add(CORRUPTED, INGOT + CORRUPTED);
    }
}