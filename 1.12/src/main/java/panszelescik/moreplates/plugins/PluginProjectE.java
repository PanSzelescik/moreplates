package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

import static panszelescik.moreplates.helpers.ItemInfo.*;

@Plugin(modid = PluginProjectE.MODID, modname = PluginProjectE.MODNAME)
public class PluginProjectE extends PluginHelper {

    public static final String MODID = "projecte";
    public static final String MODNAME = "ProjectE";

    @Plugin.PreInit
    public static void preInit() {
        reg(DARK_MATTER);
        reg(RED_MATTER);
    }

    @Plugin.PostInit
    public static void postInit() {
        String name = "item.pe_matter";
        add(DARK_MATTER, name, MODID, 0);
        add(RED_MATTER, name, MODID, 1);

        name = "matter_block";
        addBlock(DARK_MATTER, name, 4, MODID, 0);
        addBlock(RED_MATTER, name, 4, MODID, 1);
    }
}