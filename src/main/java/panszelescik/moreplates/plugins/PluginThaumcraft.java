package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.helpers.PluginHelper;
import panszelescik.moreplates.plugins.core.Plugin;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = PluginThaumcraft.MODID, modname = PluginThaumcraft.MODNAME)
public class PluginThaumcraft extends PluginHelper {

    public static final String MODID = "thaumcraft";
    public static final String MODNAME = "Thaumcraft";

    @Plugin.PreInit
    public static void preInit() {
        reg(AMBER);
        reg(QUICKSILVER);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(AMBER);
        add(QUICKSILVER, "quicksilver", true, true);

        addBlock(AMBER, "amber_block", 9, MODID);
    }
}