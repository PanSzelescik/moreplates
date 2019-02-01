package panszelescik.moreplates.plugins;

import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

import static panszelescik.moreplates.helpers.ItemInfo.*;

@Plugin(modid = PluginMinecraft.MODID, modname = PluginMinecraft.MODNAME, checkModid = false)
public class PluginMinecraft extends PluginHelper {

    public static final String MODID = "minecraft";
    public static final String MODNAME = "Minecraft";

    @Plugin.PreInit
    public static void preInit() {
        OreDictionary.registerOre("coal", Items.COAL);
        if (!oreNameExists(COAL, Type.GEAR)) {
            regGear(COAL);
        }
        if (!oreNameExists(COAL, Type.PLATE)) {
            regPlate(COAL);
        }
        if (!oreNameExists(DIAMOND, Type.GEAR)) {
            regGear(DIAMOND);
        }
        if (!oreNameExists(DIAMOND, Type.PLATE)) {
            regPlate(DIAMOND);
        }
        if (!oreNameExists(EMERALD, Type.GEAR)) {
            regGear(EMERALD);
        }
        if (!oreNameExists(EMERALD, Type.PLATE)) {
            regPlate(EMERALD);
        }
        if (!oreNameExists(GLOWSTONE, Type.GEAR)) {
            regGear(GLOWSTONE);
        }
        if (!oreNameExists(GLOWSTONE, Type.PLATE)) {
            regPlate(GLOWSTONE);
        }
        if (!oreNameExists(GOLD, Type.GEAR)) {
            regGear(GOLD);
        }
        if (!oreNameExists(GOLD, Type.PLATE)
                && !isLoaded(PluginImmersiveEngineering.MODID)
                && !isLoaded("libvulpes")) {
            regPlate(GOLD);
        }
        if (!oreNameExists(GOLD, Type.STICK)) {
            regStick(GOLD);
        }
        if (!oreNameExists(IRON, Type.GEAR)
                && !isLoaded("libvulpes")) {
            regGear(IRON);
        }
        if (!oreNameExists(IRON, Type.PLATE)
                && !isLoaded(PluginImmersiveEngineering.MODID)
                && !isLoaded("libvulpes")) {
            regPlate(IRON);
        }
        if (!oreNameExists(IRON, Type.STICK)
                && !isLoaded(PluginImmersiveEngineering.MODID)
                && !isLoaded("libvulpes")) {
            regStick(IRON);
        }
        if (!oreNameExists(LAPIS_LAZULI, Type.GEAR)) {
            regGear(LAPIS_LAZULI);
        }
        if (!oreNameExists(LAPIS_LAZULI, Type.PLATE)) {
            regPlate(LAPIS_LAZULI);
        }
        if (!oreNameExists(NETHER_QUARTZ, Type.GEAR)) {
            regGear(NETHER_QUARTZ);
        }
        if (!oreNameExists(NETHER_QUARTZ, Type.PLATE)) {
            regPlate(NETHER_QUARTZ);
        }
        if (!oreNameExists(REDSTONE, Type.GEAR)) {
            regGear(REDSTONE);
        }
        if (!oreNameExists(REDSTONE, Type.PLATE)) {
            regPlate(REDSTONE);
        }
    }

    @Plugin.PostInit
    public static void postInit() {
        add(COAL, "coal", contains("coal_gear"), contains("coal_plate"));
        add(DIAMOND, contains("diamond_gear"), contains("diamond_plate"));
        add(EMERALD, contains("emerald_gear"), contains("emerald_plate"));
        add(GLOWSTONE, contains("glowstone_gear"), contains("glowstone_plate"));
        add(GOLD, contains("gold_gear"), contains("gold_plate"), contains("gold_stick"));
        add(IRON, contains("iron_gear"), contains("iron_plate"), contains("iron_stick"));
        add(LAPIS_LAZULI, contains("lapis_lazuli_gear"), contains("lapis_lazuli_plate"));
        add(NETHER_QUARTZ, contains("nether_quartz_gear"), contains("nether_quartz_plate"));
        add(REDSTONE, contains("redstone_gear"), contains("redstone_plate"));

        addBlock(COAL, 9, contains("coal_plate"));
        addBlock(DIAMOND, 9, contains("diamond_plate"));
        addBlock(EMERALD, 9, contains("emerald_plate"));
        addBlock(GLOWSTONE, 4, contains("glowstone_plate"));
        addBlock(GOLD, 9, contains("gold_plate"));
        addBlock(IRON, 9, contains("iron_plate"));
        addBlock(LAPIS_LAZULI, 9, contains("lapis_lazuli_plate"));
        addBlock(NETHER_QUARTZ, 4, contains("nether_quartz_plate"));
        addBlock(REDSTONE, 9, contains("redstone_plate"));
    }
}