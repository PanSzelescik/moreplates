package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginMysticalAgriculture.MODID, modname = PluginMysticalAgriculture.MODNAME)
public class PluginMysticalAgriculture extends PluginHelper {

    public static final String MODID = "mysticalagriculture";
    public static final String MODNAME = "Mystical Agriculture";

    @Plugin.PreInit
    public static void preInit() {
        reg(INFERIUM, "inferium");
        reg(INTERMEDIUM, "intermedium");
        reg(PRUDENTIUM, "prudentium");
        reg(SOULIUM, "soulium");
        reg(SUPERIUM, "superium");
        reg(SUPREMIUM, "supremium");
    }
}