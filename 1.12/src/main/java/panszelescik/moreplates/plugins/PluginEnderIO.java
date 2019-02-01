package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.helpers.PluginHelper;
import panszelescik.moreplates.plugins.core.Plugin;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = PluginEnderIO.MODID, modname = PluginEnderIO.MODNAME)
public class PluginEnderIO extends PluginHelper {

    public static final String MODID = "enderio";
    public static final String MODNAME = "Ender IO";

    @Plugin.PreInit
    public static void preInit() {
        reg(CONDUCTIVE_IRON);
        reg(DARK_STEEL);
        reg(ELECTRICAL_STEEL);
        reg(END_STEEL);
        reg(ENERGETIC_ALLOY);
        reg(IRON_ALLOY);
        reg(PULSATING_IRON);
        reg(REDSTONE_ALLOY);
        reg(SOULARIUM);
        reg(VIBRANT_ALLOY);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(CONDUCTIVE_IRON);
        add(DARK_STEEL);
        add(ELECTRICAL_STEEL);
        add(END_STEEL);
        add(ENERGETIC_ALLOY);
        add(IRON_ALLOY);
        add(PULSATING_IRON);
        add(REDSTONE_ALLOY);
        add(SOULARIUM);
        add(VIBRANT_ALLOY);

        addBlock(CONDUCTIVE_IRON);
        addBlock(DARK_STEEL);
        addBlock(ELECTRICAL_STEEL);
        addBlock(END_STEEL);
        addBlock(ENERGETIC_ALLOY);
        addBlock(IRON_ALLOY);
        addBlock(PULSATING_IRON);
        addBlock(REDSTONE_ALLOY);
        addBlock(SOULARIUM);
        addBlock(VIBRANT_ALLOY);
    }
}