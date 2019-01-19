package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginTinkersConstruct.MODID, modname = PluginTinkersConstruct.MODNAME)
public class PluginTinkersConstruct extends PluginHelper {

    public static final String MODID = "tconstruct";
    public static final String MODNAME = "Tinkers' Construct";

    @Plugin.PreInit
    public static void preInit() {
        reg(ARDITE, "ardite");
        reg(COBALT, "cobalt");
        reg(KNIGHTSLIME, "knightslime");
        reg(MANYULLYN, "manyullyn");
        reg(PIG_IRON, "pig_iron");
    }
}