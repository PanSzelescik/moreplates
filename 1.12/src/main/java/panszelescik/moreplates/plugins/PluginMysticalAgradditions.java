package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.helpers.PluginHelper;
import panszelescik.moreplates.plugins.core.Plugin;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = PluginMysticalAgradditions.MODID, modname = PluginMysticalAgradditions.MODNAME)
public class PluginMysticalAgradditions extends PluginHelper {

    public static final String MODID = "mysticalagradditions";
    public static final String MODNAME = "Mystical Agradditions";

    @Plugin.PreInit
    public static void preInit() {
        reg(INSANIUM);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(INSANIUM);

        addBlock(INSANIUM);
    }
}