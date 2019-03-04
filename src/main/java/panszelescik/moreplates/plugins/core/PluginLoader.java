package panszelescik.moreplates.plugins.core;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.forgespi.language.ModFileScanData;
import org.apache.logging.log4j.Level;
import org.objectweb.asm.Type;
import panszelescik.morelibs.api.ClassComparator;
import panszelescik.morelibs.api.Helper;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.config.BaseConfig;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PluginLoader {

    private static ArrayList<Class> initList = new ArrayList<>();
    private static final Type PLUGIN = Type.getType(Plugin.class);

    public static void addPlugins() {
        final List<ModFileScanData.AnnotationData> annotations = ModList.get().getAllScanData().stream()
                .map(ModFileScanData::getAnnotations)
                .flatMap(Collection::stream)
                .filter(a -> PLUGIN.equals(a.getAnnotationType()))
                .collect(Collectors.toList());
        for (ModFileScanData.AnnotationData data : annotations) {
            try {
                System.out.println(data.getMemberName());
                String modid = (String) data.getAnnotationData().get("modid");
                String modname = (String) data.getAnnotationData().get("modname");
                String clazzName = data.getMemberName();
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
                MorePlates.logger.error("Unable to add plugin class: " + data.getMemberName() + "! An error occurred:");
                MorePlates.logger.catching(Level.ERROR, e);
            }
        }
        initList.sort(new ClassComparator());
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
        return true;
    }
}