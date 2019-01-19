package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginAppliedEnergistics2.MODID, modname = PluginAppliedEnergistics2.MODNAME)
public class PluginAppliedEnergistics2 extends PluginHelper {

    public static final String MODID = "appliedenergistics2";
    public static final String MODNAME = "Applied Energistics 2";

    @Plugin.PreInit
    public static void preInit() {
        reg(CERTUS_QUARTZ, "certus_quartz");
        reg(FLUIX, "fluix");
    }
}