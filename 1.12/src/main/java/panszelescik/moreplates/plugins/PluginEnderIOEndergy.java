package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

import static panszelescik.moreplates.helpers.ItemInfo.*;

@Plugin(modid = PluginEnderIOEndergy.MODID, modname = PluginEnderIOEndergy.MODNAME)
public class PluginEnderIOEndergy extends PluginHelper {

    public static final String MODID = "enderioendergy";
    public static final String MODNAME = "Ender IO Endergy";

    @Plugin.PreInit
    public static void preInit() {
        reg(CRUDE_STEEL);
        reg(CRYSTALLINE_ALLOY);
        reg(CRYSTALLINE_PINK_SLIME);
        reg(ENERGETIC_SILVER);
        reg(MELODIC_ALLOY);
        reg(STELLAR_ALLOY);
        reg(VIVID_ALLOY);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(CRUDE_STEEL);
        add(CRYSTALLINE_ALLOY);
        add(CRYSTALLINE_PINK_SLIME);
        add(ENERGETIC_SILVER);
        add(MELODIC_ALLOY);
        add(STELLAR_ALLOY);
        add(VIVID_ALLOY);

        addBlock(CRUDE_STEEL);
        addBlock(CRYSTALLINE_ALLOY);
        addBlock(CRYSTALLINE_PINK_SLIME);
        addBlock(ENERGETIC_SILVER);
        addBlock(MELODIC_ALLOY);
        addBlock(STELLAR_ALLOY);
        addBlock(VIVID_ALLOY);
    }
}