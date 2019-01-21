package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginExtraUtilities.MODID, modname = PluginExtraUtilities.MODNAME)
public class PluginExtraUtilities extends PluginHelper {

    public static final String MODID = "extrautils2";
    public static final String MODNAME = "Extra Utilities 2";

    @Plugin.PreInit
    public static void preInit() {
        reg(DEMON, "demon");
        reg(ENCHANTED, "enchanted");
        reg(EVIL_INFUSED_IRON, "evil_infused_iron");
    }

    @Plugin.PostInit
    public static void postInit() {
        add(DEMON, INGOT + DEMON);
        add(ENCHANTED, INGOT + ENCHANTED);
        add(EVIL_INFUSED_IRON, INGOT + EVIL_INFUSED_IRON);

        addBlock(DEMON, 9);
        addBlock(ENCHANTED, 9);
        addBlock(EVIL_INFUSED_IRON, 9);
    }
}