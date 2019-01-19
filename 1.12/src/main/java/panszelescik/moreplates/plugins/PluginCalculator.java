package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginCalculator.MODID, modname = PluginCalculator.MODNAME)
public class PluginCalculator extends PluginHelper {

    public static final String MODID = "calculator";
    public static final String MODNAME = "Calculator";

    @Plugin.PreInit
    public static void preInit() {
        reg(AMETHYST, "amethyst");
        reg(ENRICHED_GOLD, "enriched_gold");
        reg(REINFORCED_IRON, "reinforced_iron");
        reg(TANZANITE, "tanzanite");
    }
}