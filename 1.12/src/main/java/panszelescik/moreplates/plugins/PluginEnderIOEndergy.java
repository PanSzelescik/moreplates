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
}