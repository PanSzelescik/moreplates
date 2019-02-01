package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.helpers.PluginHelper;
import panszelescik.moreplates.plugins.core.Plugin;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = PluginMysticalAgriculture.MODID, modname = PluginMysticalAgriculture.MODNAME)
public class PluginMysticalAgriculture extends PluginHelper {

    public static final String MODID = "mysticalagriculture";
    public static final String MODNAME = "Mystical Agriculture";

    @Plugin.PreInit
    public static void preInit() {
        reg(INFERIUM);
        reg(INTERMEDIUM);
        reg(PRUDENTIUM);
        reg(SOULIUM);
        reg(SUPERIUM);
        reg(SUPREMIUM);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(INFERIUM);
        add(INTERMEDIUM);
        add(PRUDENTIUM);
        add(SOULIUM);
        add(SUPERIUM);
        add(SUPREMIUM);

        addBlock(INFERIUM);
        addBlock(INTERMEDIUM);
        addBlock(PRUDENTIUM);
        addBlock(SOULIUM);
        addBlock(SUPERIUM);
        addBlock(SUPREMIUM);
    }
}