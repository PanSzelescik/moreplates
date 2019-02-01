package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

import static panszelescik.moreplates.helpers.ItemInfo.*;

@Plugin(modid = PluginCalculator.MODID, modname = PluginCalculator.MODNAME)
public class PluginCalculator extends PluginHelper {

    public static final String MODID = "calculator";
    public static final String MODNAME = "Calculator";

    @Plugin.PreInit
    public static void preInit() {
        reg(AMETHYST);
        reg(ENRICHED_GOLD);
        reg(REINFORCED_IRON);
        reg(TANZANITE);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(AMETHYST);
        add(ENRICHED_GOLD);
        add(REINFORCED_IRON, "reinforcedironingot", MODID);
        add(TANZANITE);

        String name = "material";
        addBlock(ENRICHED_GOLD, name, 9, MODID, 2);
        addBlock(REINFORCED_IRON, name, 9, MODID, 3);
    }
}