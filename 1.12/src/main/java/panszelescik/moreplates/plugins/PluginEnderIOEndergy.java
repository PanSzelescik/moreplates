package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginEnderIOEndergy.MODID, modname = PluginEnderIOEndergy.MODNAME)
public class PluginEnderIOEndergy extends PluginHelper {

    public static final String MODID = "enderioendergy";
    public static final String MODNAME = "Ender IO Endergy";

    @Plugin.PreInit
    public static void preInit() {
        reg(CRUDE_STEEL, "crude_steel");
        reg(CRYSTALLINE_ALLOY, "crystalline_alloy");
        reg(CRYSTALLINE_PINK_SLIME, "crystalline_pink_slime");
        reg(ENERGETIC_SILVER, "energetic_silver");
        reg(MELODIC_ALLOY, "melodic_alloy");
        reg(STELLAR_ALLOY, "stellar_alloy");
        reg(VIVID_ALLOY, "vivid_alloy");
    }

    @Plugin.PostInit
    public static void postInit() {
        add(CRUDE_STEEL, INGOT + CRUDE_STEEL);
        add(CRYSTALLINE_ALLOY, INGOT + CRYSTALLINE_ALLOY);
        add(CRYSTALLINE_PINK_SLIME, INGOT + CRYSTALLINE_PINK_SLIME);
        add(ENERGETIC_SILVER, INGOT + ENERGETIC_SILVER);
        add(MELODIC_ALLOY, INGOT + MELODIC_ALLOY);
        add(STELLAR_ALLOY, INGOT + STELLAR_ALLOY);
        add(VIVID_ALLOY, INGOT + VIVID_ALLOY);

        addBlock(CRUDE_STEEL, 9);
        addBlock(CRYSTALLINE_ALLOY, 9);
        addBlock(CRYSTALLINE_PINK_SLIME, 9);
        addBlock(ENERGETIC_SILVER, 9);
        addBlock(MELODIC_ALLOY, 9);
        addBlock(STELLAR_ALLOY, 9);
        addBlock(VIVID_ALLOY, 9);
    }
}