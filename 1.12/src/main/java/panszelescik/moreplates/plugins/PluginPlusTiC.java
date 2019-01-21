package panszelescik.moreplates.plugins;

import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginPlusTiC.MODID, modname = PluginPlusTiC.MODNAME)
public class PluginPlusTiC extends PluginHelper {

    public static final String MODID = "plustic";
    public static final String MODNAME = "PlusTiC";

    @Plugin.PreInit
    public static void preInit() {
        reg(ALUMITE, "alumite");
        if (isLoaded(PluginBotania.MODID))
            reg(MIRION, "mirion");
        if (isLoaded(PluginMekanism.MODID))
            reg(OSGLOGLAS, "osgloglas");
        if (isLoaded(PluginMekanism.MODID) && isLoaded(PluginThermalExpansion.MODID))
            reg(OSMIRIDIUM, "osmiridium");
    }

    @Plugin.PostInit
    public static void postInit() {
        add(ALUMITE, INGOT + ALUMITE);
        addBlock(ALUMITE, 9);
        if (isLoaded(PluginBotania.MODID)) {
            add(MIRION, INGOT + MIRION);
            addBlock(MIRION, 9);
        }
        if (isLoaded(PluginMekanism.MODID)) {
            add(OSGLOGLAS, INGOT + OSGLOGLAS);
            addBlock(OSGLOGLAS, 9);
        }
        if (isLoaded(PluginMekanism.MODID) && isLoaded(PluginThermalExpansion.MODID)) {
            add(OSMIRIDIUM, INGOT + OSMIRIDIUM);
            addBlock(OSMIRIDIUM, 9);
        }
    }
}