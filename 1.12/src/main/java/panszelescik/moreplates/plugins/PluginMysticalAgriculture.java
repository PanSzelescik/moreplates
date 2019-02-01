package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

import static panszelescik.moreplates.helpers.ItemInfo.*;

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