package panszelescik.moreplates.plugins;

import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;

public class PluginMinecraft extends PluginBase {
	
	public static final String MODID = "minecraft";
	public static final String MODNAME = "Minecraft";
	
	public PluginMinecraft() {
		super(MODID, MODNAME);
	}
	
	public static boolean gearCoal;
	public static boolean plateCoal;
	public static boolean gearDiamond;
	public static boolean plateDiamond;
	public static boolean gearEmerald;
	public static boolean plateEmerald;
	public static boolean gearGlowstone;
	public static boolean plateGlowstone;
	public static boolean gearGold;
	public static boolean plateGold;
	public static boolean stickGold;
	public static boolean gearIron;
	public static boolean plateIron;
	public static boolean stickIron;
	public static boolean gearLapisLazuli;
	public static boolean plateLapisLazuli;
	public static boolean gearNetherQuartz;
	public static boolean plateNetherQuartz;
	public static boolean gearRedstone;
	public static boolean plateRedstone;
	
	public void preInit() {
		OreDictionary.registerOre("coal", Items.COAL);
		
		if (!oreNameExists(GEAR + COAL)) {
			regCustomGear(gearCoal, COAL, "coal");
		}
		if (!oreNameExists(PLATE + COAL)) {
			regCustomPlate(plateCoal, COAL, "coal");
		}
		if (!oreNameExists(GEAR + DIAMOND)) {
			regCustomGear(gearDiamond, DIAMOND, "diamond");
		}
		if (!oreNameExists(PLATE + DIAMOND)) {
			regCustomPlate(plateDiamond, DIAMOND, "diamond");
		}
		if (!oreNameExists(GEAR + EMERALD)) {
			regCustomGear(gearEmerald, EMERALD, "emerald");
		}
		if (!oreNameExists(PLATE + EMERALD)) {
			regCustomPlate(plateEmerald, EMERALD, "emerald");
		}
		if (!oreNameExists(GEAR + GLOWSTONE)) {
			regCustomGear(gearGlowstone, GLOWSTONE, "glowstone");
		}
		if (!oreNameExists(PLATE + GLOWSTONE)) {
			regCustomPlate(plateGlowstone, GLOWSTONE, "glowstone");
		}
		if (!oreNameExists(GEAR + GOLD)) {
			regCustomGear(gearGold, GOLD, "gold");
		}
		if (!oreNameExists(PLATE + GOLD)
		&& !isLoaded(PluginImmersiveEngineering.MODID)
		&& !isLoaded("libvulpes")) {
			regCustomPlate(plateGold, GOLD, "gold");
		}
		if (!oreNameExists(STICK + GOLD)) {
			regCustomStick(stickGold, GOLD, "gold");
		}
		if (!oreNameExists(GEAR + IRON) && !isLoaded("libvulpes")) {
			regCustomGear(gearIron, IRON, "iron");
		}
		if (!oreNameExists(PLATE + IRON)
		&& !isLoaded(PluginImmersiveEngineering.MODID)
		&& !isLoaded("libvulpes")) {
			regCustomPlate(plateIron, IRON, "iron");
		}
		if (!oreNameExists(STICK + IRON)
		&& !isLoaded(PluginImmersiveEngineering.MODID)
		&& !isLoaded("libvulpes")) {
			regCustomStick(stickIron, IRON, "iron");
		}
		if (!oreNameExists(GEAR + LAPIS)) {
			regCustomGear(gearLapisLazuli, LAPIS, "lapis_lazuli");
		}
		if (!oreNameExists(PLATE + LAPIS)) {
			regCustomPlate(plateLapisLazuli, LAPIS, "lapis_lazuli");
		}
		if (!oreNameExists(GEAR + QUARTZ)) {
			regCustomGear(gearNetherQuartz, QUARTZ, "nether_quartz");
		}
		if (!oreNameExists(PLATE + QUARTZ)) {
			regCustomPlate(plateNetherQuartz, QUARTZ, "nether_quartz");
		}
		if (!oreNameExists(GEAR + REDSTONE)) {
			regCustomGear(gearRedstone, REDSTONE, "redstone");
		}
		if (!oreNameExists(PLATE + REDSTONE)) {
			regCustomPlate(plateRedstone, REDSTONE, "redstone");
		}
	}
}