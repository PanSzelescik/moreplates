package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.helpers.PluginHelper;
import panszelescik.moreplates.plugins.core.Plugin;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = PluginPlusTiC.MODID, modname = PluginPlusTiC.MODNAME)
public class PluginPlusTiC extends PluginHelper {

    public static final String MODID = "plustic";
    public static final String MODNAME = "PlusTiC";

    @Plugin.PreInit
    public static void preInit() {
        reg(ALUMITE);
        if (isLoaded(PluginBotania.MODID))
            reg(MIRION);
        if (isLoaded(PluginMekanism.MODID))
            reg(OSGLOGLAS);
        if (isLoaded(PluginMekanism.MODID) && isLoaded(PluginThermalExpansion.MODID))
            reg(OSMIRIDIUM);
    }

    @Plugin.PostInit
    public static void postInit() {
        add(ALUMITE);
        addBlock(ALUMITE);
        if (isLoaded(PluginBotania.MODID)) {
            add(MIRION);
            addBlock(MIRION);
        }
        if (isLoaded(PluginMekanism.MODID)) {
            add(OSGLOGLAS);
            addBlock(OSGLOGLAS);
        }
        if (isLoaded(PluginMekanism.MODID) && isLoaded(PluginThermalExpansion.MODID)) {
            add(OSMIRIDIUM);
            addBlock(OSMIRIDIUM);
        }
    }
}