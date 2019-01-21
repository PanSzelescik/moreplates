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

    @Plugin.PostInit
    public static void postInit() {
        add(INFERIUM, INGOT + INFERIUM);
        add(INTERMEDIUM, INGOT + INTERMEDIUM);
        add(PRUDENTIUM, INGOT + PRUDENTIUM);
        add(SOULIUM, INGOT + SOULIUM);
        add(SUPERIUM, INGOT + SUPERIUM);
        add(SUPREMIUM, INGOT + SUPREMIUM);

        addBlock(INFERIUM, 9);
        addBlock(INTERMEDIUM, 9);
        addBlock(PRUDENTIUM, 9);
        addBlock(SOULIUM, 9);
        addBlock(SUPERIUM, 9);
        addBlock(SUPREMIUM, 9);
    }
}