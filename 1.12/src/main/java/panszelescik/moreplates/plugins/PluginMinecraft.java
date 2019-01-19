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
}