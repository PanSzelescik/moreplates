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

    @Plugin.PostInit
    public static void postInit() {
        add(AMETHYST, GEM + AMETHYST);
        add(ENRICHED_GOLD, INGOT + ENRICHED_GOLD);
        add(REINFORCED_IRON, REINFORCED_IRON_NAME, MODID);
        add(TANZANITE, GEM + TANZANITE);

        addBlock(ENRICHED_GOLD, CALCULATOR_NAME, 9, MODID, ENRICHED_GOLD_BLOCK_META);
        addBlock(REINFORCED_IRON, CALCULATOR_NAME, 9, MODID, REINFORCED_IRON_BLOCK_META);
    }
}