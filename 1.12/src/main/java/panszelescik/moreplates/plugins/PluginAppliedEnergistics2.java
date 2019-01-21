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

    @Plugin.PostInit
    public static void postInit() {
        add(CERTUS_QUARTZ, CRYSTAL + CERTUS_QUARTZ);
        add(CERTUS_QUARTZ, PURE_CERTUS_QUARTZ_NAME, MODID, PURE_CERTUS_QUARTZ_META);
        add(FLUIX, CRYSTAL + FLUIX);
        add(FLUIX, CRYSTAL + PURE_FLUIX);

        addBlock(CERTUS_QUARTZ, CERTUS_QUARTZ_BLOCK_NAME, 4, MODID);
        addBlock(FLUIX, FLUIX_BLOCK_NAME, 4, MODID);
    }
}