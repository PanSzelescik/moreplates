package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginRefinedStorage.MODID, modname = PluginRefinedStorage.MODNAME)
public class PluginRefinedStorage extends PluginHelper {

    public static final String MODID = "refinedstorage";
    public static final String MODNAME = "Refined Storage";

    @Plugin.PreInit
    public static void preInit() {
        reg(QUARTZ_ENRICHED_IRON, "quartz_enriched_iron");
    }
}