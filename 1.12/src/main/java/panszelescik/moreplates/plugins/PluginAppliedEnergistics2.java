package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

import static panszelescik.moreplates.helpers.ItemInfo.*;

@Plugin(modid = PluginAppliedEnergistics2.MODID, modname = PluginAppliedEnergistics2.MODNAME)
public class PluginAppliedEnergistics2 extends PluginHelper {

    public static final String MODID = "appliedenergistics2";
    public static final String MODNAME = "Applied Energistics 2";

    @Plugin.PreInit
    public static void preInit() {
        reg(CERTUS_QUARTZ);
        reg(FLUIX);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(CERTUS_QUARTZ);
        add(CERTUS_QUARTZ, "material", MODID, 10);
        add(FLUIX);
        add(FLUIX, PURE_FLUIX);

        addBlock(CERTUS_QUARTZ, "quartz_block", 4, MODID);
        addBlock(FLUIX, "fluix_block", 4, MODID);
    }
}