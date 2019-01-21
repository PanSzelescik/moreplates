package panszelescik.moreplates.plugins;

import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginMinecraft.MODID, modname = PluginMinecraft.MODNAME, checkModid = false)
public class PluginMinecraft extends PluginHelper {

    public static final String MODID = "minecraft";
    public static final String MODNAME = "Minecraft";

    @Plugin.PreInit
    public static void preInit() {
        OreDictionary.registerOre("coal", Items.COAL);

        if (!oreNameExists(GEAR + COAL)) {
            regGear("coal", COAL);
        }
        if (!oreNameExists(PLATE + COAL)) {
            regPlate("coal", COAL);
        }
        if (!oreNameExists(GEAR + DIAMOND)) {
            regGear("diamond", DIAMOND);
        }
        if (!oreNameExists(PLATE + DIAMOND)) {
            regPlate("diamond", DIAMOND);
        }
        if (!oreNameExists(GEAR + EMERALD)) {
            regGear("emerald", EMERALD);
        }
        if (!oreNameExists(PLATE + EMERALD)) {
            regPlate("emerald", EMERALD);
        }
        if (!oreNameExists(GEAR + GLOWSTONE)) {
            regGear("glowstone", GLOWSTONE);
        }
        if (!oreNameExists(PLATE + GLOWSTONE)) {
            regPlate("glowstone", GLOWSTONE);
        }
        if (!oreNameExists(GEAR + GOLD)) {
            regGear("gold", GOLD);
        }
        if (!oreNameExists(PLATE + GOLD)
                && !isLoaded(PluginImmersiveEngineering.MODID)
                && !isLoaded("libvulpes")) {
            regPlate("gold", GOLD);
        }
        if (!oreNameExists(STICK + GOLD)) {
            regStick("gold", GOLD);
        }
        if (!oreNameExists(GEAR + IRON)
                && !isLoaded("libvulpes")) {
            regGear("iron", IRON);
        }
        if (!oreNameExists(PLATE + IRON)
                && !isLoaded(PluginImmersiveEngineering.MODID)
                && !isLoaded("libvulpes")) {
            regPlate("iron", IRON);
        }
        if (!oreNameExists(STICK + IRON)
                && !isLoaded(PluginImmersiveEngineering.MODID)
                && !isLoaded("libvulpes")) {
            regStick("iron", IRON);
        }
        if (!oreNameExists(GEAR + LAPIS)) {
            regGear("lapis_lazuli", LAPIS);
        }
        if (!oreNameExists(PLATE + LAPIS)) {
            regPlate("lapis_lazuli", LAPIS);
        }
        if (!oreNameExists(GEAR + QUARTZ)) {
            regGear("nether_quartz", QUARTZ);
        }
        if (!oreNameExists(PLATE + QUARTZ)) {
            regPlate("nether_quartz", QUARTZ);
        }
        if (!oreNameExists(GEAR + REDSTONE)) {
            regGear("redstone", REDSTONE);
        }
        if (!oreNameExists(PLATE + REDSTONE)) {
            regPlate("redstone", REDSTONE);
        }
    }

    @Plugin.PostInit
    public static void postInit() {
        add(COAL, "coal", contains("coal_gear"), contains("coal_plate"));
        add(DIAMOND, GEM + DIAMOND, contains("diamond_gear"), contains("diamond_plate"));
        add(EMERALD, GEM + EMERALD, contains("emerald_gear"), contains("emerald_plate"));
        add(GLOWSTONE, DUST + GLOWSTONE, contains("glowstone_gear"), contains("glowstone_plate"));
        add(GOLD, INGOT + GOLD, contains("gold_gear"), contains("gold_plate"), contains("gold_stick"));
        add(IRON, INGOT + IRON, contains("iron_gear"), contains("iron_plate"), contains("iron_stick"));
        add(LAPIS, GEM + LAPIS, contains("lapis_lazuli_gear"), contains("lapis_lazuli_plate"));
        add(QUARTZ, GEM + QUARTZ, contains("nether_quartz_gear"), contains("nether_quartz_plate"));
        add(REDSTONE, DUST + REDSTONE, contains("redstone_gear"), contains("redstone_plate"));

        addBlock(COAL, 9, contains("coal_plate"));
        addBlock(DIAMOND, 9, contains("diamond_plate"));
        addBlock(EMERALD, 9, contains("emerald_plate"));
        addBlock(GLOWSTONE, 4, contains("glowstone_plate"));
        addBlock(GOLD, 9, contains("gold_plate"));
        addBlock(IRON, 9, contains("iron_plate"));
        addBlock(LAPIS, 9, contains("lapis_lazuli_plate"));
        addBlock(QUARTZ, 4, contains("nether_quartz_plate"));
        addBlock(REDSTONE, 9, contains("redstone_plate"));
    }
}