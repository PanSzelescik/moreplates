package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.helpers.PluginHelper;
import panszelescik.moreplates.plugins.core.Plugin;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = PluginTinkersConstruct.MODID, modname = PluginTinkersConstruct.MODNAME)
public class PluginTinkersConstruct extends PluginHelper {

    public static final String MODID = "tconstruct";
    public static final String MODNAME = "Tinkers' Construct";

    @Plugin.PreInit
    public static void preInit() {
        reg(ARDITE);
        reg(COBALT);
        reg(KNIGHTSLIME);
        reg(MANYULLYN);
        reg(PIG_IRON);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(ARDITE);
        add(COBALT);
        add(KNIGHTSLIME);
        add(MANYULLYN);
        add(PIG_IRON);

        addBlock(ARDITE);
        addBlock(COBALT);
        addBlock(KNIGHTSLIME);
        addBlock(MANYULLYN);
        addBlock(PIG_IRON);
    }
}