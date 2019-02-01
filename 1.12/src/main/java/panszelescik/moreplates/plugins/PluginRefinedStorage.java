package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

import static panszelescik.moreplates.helpers.ItemInfo.*;

@Plugin(modid = PluginRefinedStorage.MODID, modname = PluginRefinedStorage.MODNAME)
public class PluginRefinedStorage extends PluginHelper {

    public static final String MODID = "refinedstorage";
    public static final String MODNAME = "Refined Storage";

    @Plugin.PreInit
    public static void preInit() {
        reg(QUARTZ_ENRICHED_IRON);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(QUARTZ_ENRICHED_IRON, "quartz_enriched_iron", MODID);

        addBlock(QUARTZ_ENRICHED_IRON, "quartz_enriched_iron_block", 9, MODID);
    }
}