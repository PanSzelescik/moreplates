package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginProjectE.MODID, modname = PluginProjectE.MODNAME)
public class PluginProjectE extends PluginHelper {

    public static final String MODID = "projecte";
    public static final String MODNAME = "ProjectE";

    @Plugin.PreInit
    public static void preInit() {
        reg(DARK_MATTER, "dark_matter");
        reg(RED_MATTER, "red_matter");
    }

    @Plugin.PostInit
    public static void postInit() {
        add(DARK_MATTER, MATTER_NAME, MODID, DARK_MATTER_META);
        add(RED_MATTER, MATTER_NAME, MODID, RED_MATTER_META);

        addBlock(DARK_MATTER, MATTER_BLOCK_NAME, 4, MODID, DARK_MATTER_META);
        addBlock(RED_MATTER, MATTER_BLOCK_NAME, 4, MODID, RED_MATTER_META);
    }
}