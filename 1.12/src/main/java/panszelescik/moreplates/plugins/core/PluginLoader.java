package panszelescik.moreplates.plugins.core;

import net.minecraftforge.fml.common.discovery.ASMDataTable;
import org.apache.logging.log4j.Level;
import panszelescik.morelibs.api.Helper;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.config.Config;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class PluginLoader {

    private static ArrayList<Class> initList = new ArrayList<>();

    public static void addPlugins(ASMDataTable dataTable) {
        for (ASMDataTable.ASMData data : dataTable.getAll(Plugin.class.getName())) {
            try {
                String modid = (String) data.getAnnotationInfo().get("modid");
                String modname = (String) data.getAnnotationInfo().get("modname");
                String clazzName = data.getClassName();
                Class clazz = Class.forName(clazzName);
                Plugin details = (Plugin) clazz.getAnnotation(Plugin.class);
                boolean loaded, config;
                if (details.checkModid())
                    loaded = Helper.isLoaded(modid);
                else
                    loaded = true;
                if (details.checkConfig())
                    config = getB(modname);
                else
                    config = true;
                if (loaded && config) {
                    initList.add(clazz);
                    MorePlates.logger.debug("Plugin " + modname + " loaded, adding");
                } else {
                    MorePlates.logger.debug("Plugin " + modname + " not loaded, skipping");
                }
            } catch (Exception e) {
                MorePlates.logger.error("Unable to add plugin class: " + data.getClassName() + "! An error occurred:");
                MorePlates.logger.catching(Level.ERROR, e);
            }
        }
    }

    public static void preInitPlugin() {
        MorePlates.logger.info("Searching for preInit methods");
        for (Class clazz : initList) {
            for (Method method : clazz.getMethods()) {
                if (method.isAnnotationPresent(Plugin.PreInit.class)) {
                    try {
                        method.invoke(null);
                    } catch (Exception e) {
                        MorePlates.logger.error("Unable to initialise plugin using preInit method: " + method.getName() + "! The following error was thrown:");
                        MorePlates.logger.catching(Level.ERROR, e);
                    }
                }
            }
        }
    }

    public static void postInitPlugin() {
        MorePlates.logger.info("Searching for postInit methods");
        for (Class clazz : initList) {
            for (Method method : clazz.getMethods()) {
                if (method.isAnnotationPresent(Plugin.PostInit.class)) {
                    try {
                        method.invoke(null);
                    } catch (Exception e) {
                        MorePlates.logger.error("Unable to initialise plugin using postInit method: " + method.getName() + "! The following error was thrown:");
                        MorePlates.logger.catching(Level.ERROR, e);
                    }
                }
            }
        }
    }

    private static boolean getB(String modname) {
        return MorePlates.config.getBoolean(modname, Config.CATEGORY_PLUGINS, "Enable this to load " + modname + " plugin");
    }
}