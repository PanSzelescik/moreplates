package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.core.Plugin;
import panszelescik.moreplates.plugins.helpers.PluginHelper;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = PluginMinecraft.MODID, modname = PluginMinecraft.MODNAME, checkModid = false)
public class PluginMinecraft extends PluginHelper {

    public static final String MODID = "minecraft";
    public static final String MODNAME = "Minecraft";

    @Plugin.PreInit
    public static void preInit() {
        regGear(COAL);
        regPlate(COAL);
        regGear(DIAMOND);
        regPlate(DIAMOND);
        regGear(EMERALD);
        regPlate(EMERALD);
        regGear(GLOWSTONE);
        regPlate(GLOWSTONE);
        regGear(GOLD);
        regPlate(GOLD);
        regStick(GOLD);
        regGear(IRON);
        regPlate(IRON);
        regStick(IRON);
        regGear(LAPIS_LAZULI);
        regPlate(LAPIS_LAZULI);
        regGear(NETHER_QUARTZ);
        regPlate(NETHER_QUARTZ);
        regGear(REDSTONE);
        regPlate(REDSTONE);
    }

    @Plugin.PostInit
    public static void postInit() {

    }
}