package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginMysticalAgradditions.MODID, modname = PluginMysticalAgradditions.MODNAME)
public class PluginMysticalAgradditions extends PluginHelper {

    public static final String MODID = "mysticalagradditions";
    public static final String MODNAME = "Mystical Agradditions";

    @Plugin.PreInit
    public static void preInit() {
        reg(INSANIUM, "insanium");
    }
}