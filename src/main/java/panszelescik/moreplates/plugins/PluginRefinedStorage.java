package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.helpers.PluginHelper;
import panszelescik.moreplates.plugins.core.Plugin;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

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