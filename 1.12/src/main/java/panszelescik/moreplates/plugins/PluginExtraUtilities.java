package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.helpers.PluginHelper;
import panszelescik.moreplates.plugins.core.Plugin;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = PluginExtraUtilities.MODID, modname = PluginExtraUtilities.MODNAME)
public class PluginExtraUtilities extends PluginHelper {

    public static final String MODID = "extrautils2";
    public static final String MODNAME = "Extra Utilities 2";

    @Plugin.PreInit
    public static void preInit() {
        reg(DEMON);
        reg(ENCHANTED);
        reg(EVIL_INFUSED_IRON);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(DEMON);
        add(ENCHANTED);
        add(EVIL_INFUSED_IRON);

        addBlock(DEMON);
        addBlock(ENCHANTED);
        addBlock(EVIL_INFUSED_IRON);
    }
}