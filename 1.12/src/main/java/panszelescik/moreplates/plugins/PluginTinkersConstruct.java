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

    @Plugin.PostInit
    public static void postInit() {
        add(ARDITE, INGOT + ARDITE);
        add(COBALT, INGOT + COBALT);
        add(KNIGHTSLIME, INGOT + KNIGHTSLIME);
        add(MANYULLYN, INGOT + MANYULLYN);
        add(PIG_IRON, INGOT + PIG_IRON);

        addBlock(ARDITE, 9);
        addBlock(COBALT, 9);
        addBlock(KNIGHTSLIME, 9);
        addBlock(MANYULLYN, 9);
        addBlock(PIG_IRON, 9);
    }
}