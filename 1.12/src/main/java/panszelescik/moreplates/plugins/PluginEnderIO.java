package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginEnderIO.MODID, modname = PluginEnderIO.MODNAME)
public class PluginEnderIO extends PluginHelper {

    public static final String MODID = "enderio";
    public static final String MODNAME = "Ender IO";

    @Plugin.PreInit
    public static void preInit() {
        reg(CONDUCTIVE_IRON, "conductive_iron");
        reg(DARK_STEEL, "dark_steel");
        reg(ELECTRICAL_STEEL, "electrical_steel");
        reg(END_STEEL, "end_steel");
        reg(ENERGETIC_ALLOY, "energetic_alloy");
        reg(IRON_ALLOY, "iron_alloy");
        reg(PULSATING_IRON, "pulsating_iron");
        reg(REDSTONE_ALLOY, "redstone_alloy");
        reg(SOULARIUM, "soularium");
        reg(VIBRANT_ALLOY, "vibrant_alloy");
    }

    @Plugin.PostInit
    public static void postInit() {
        add(CONDUCTIVE_IRON, INGOT + CONDUCTIVE_IRON);
        add(DARK_STEEL, INGOT + DARK_STEEL);
        add(ELECTRICAL_STEEL, INGOT + ELECTRICAL_STEEL);
        add(END_STEEL, INGOT + END_STEEL);
        add(ENERGETIC_ALLOY, INGOT + ENERGETIC_ALLOY);
        add(IRON_ALLOY, INGOT + IRON_ALLOY);
        add(PULSATING_IRON, INGOT + PULSATING_IRON);
        add(REDSTONE_ALLOY, INGOT + REDSTONE_ALLOY);
        add(SOULARIUM, INGOT + SOULARIUM);
        add(VIBRANT_ALLOY, INGOT + VIBRANT_ALLOY);

        addBlock(CONDUCTIVE_IRON, 9);
        addBlock(DARK_STEEL, 9);
        addBlock(ELECTRICAL_STEEL, 9);
        addBlock(END_STEEL, 9);
        addBlock(ENERGETIC_ALLOY, 9);
        addBlock(IRON_ALLOY, 9);
        addBlock(PULSATING_IRON, 9);
        addBlock(REDSTONE_ALLOY, 9);
        addBlock(SOULARIUM, 9);
        addBlock(VIBRANT_ALLOY, 9);
    }
}