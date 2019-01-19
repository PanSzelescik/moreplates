package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginThaumcraft.MODID, modname = PluginThaumcraft.MODNAME)
public class PluginThaumcraft extends PluginHelper {

    public static final String MODID = "thaumcraft";
    public static final String MODNAME = "Thaumcraft";

    @Plugin.PreInit
    public static void preInit() {
        reg(AMBER, "amber");
        reg(QUICKSILVER, "quicksilver");
    }
}