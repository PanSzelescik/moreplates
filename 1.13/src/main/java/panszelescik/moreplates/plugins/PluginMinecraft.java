package panszelescik.moreplates.plugins;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class PluginMinecraft extends PluginBase {
	
	public static final String MODID = "minecraft";
	public static final String MODNAME = "Minecraft";
	
	public PluginMinecraft() {
		super(MODID, MODNAME);
	}
	
	Item coal_gear;
	Item coal_plate;
	Item diamond_gear;
	Item diamond_plate;
	Item emerald_gear;
	Item emerald_plate;
	Item glowstone_gear;
	Item glowstone_plate;
	Item gold_gear;
	Item gold_plate;
	Item gold_stick;
	Item iron_gear;
	Item iron_plate;
	Item iron_stick;
	Item lapis_lazuli_gear;
	Item lapis_lazuli_plate;
	Item nether_quartz_gear;
	Item nether_quartz_plate;
	Item redstone_gear;
	Item redstone_plate;
	
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
			regCustomGear(coal_gear, gearCoal, COAL, "coal");
		}
		if (!oreNameExists(PLATE + COAL)) {
			regCustomPlate(coal_plate, plateCoal, COAL, "coal");
		}
		if (!oreNameExists(GEAR + DIAMOND)) {
			regCustomGear(diamond_gear, gearDiamond, DIAMOND, "diamond");
		}
		if (!oreNameExists(PLATE + DIAMOND)) {
			regCustomPlate(diamond_plate, plateDiamond, DIAMOND, "diamond");
		}
		if (!oreNameExists(GEAR + EMERALD)) {
			regCustomGear(emerald_gear, gearEmerald, EMERALD, "emerald");
		}
		if (!oreNameExists(PLATE + EMERALD)) {
			regCustomPlate(emerald_plate, plateEmerald, EMERALD, "emerald");
		}
		if (!oreNameExists(GEAR + GLOWSTONE)) {
			regCustomGear(glowstone_gear, gearGlowstone, GLOWSTONE, "glowstone");
		}
		if (!oreNameExists(PLATE + GLOWSTONE)) {
			regCustomPlate(glowstone_plate, plateGlowstone, GLOWSTONE, "glowstone");
		}
		if (!oreNameExists(GEAR + GOLD)) {
			regCustomGear(gold_gear, gearGold, GOLD, "gold");
		}
		if (!oreNameExists(PLATE + GOLD)
		&& !isLoaded(PluginImmersiveEngineering.MODID)
		&& !isLoaded("libvulpes")) {
			regCustomPlate(gold_plate, plateGold, GOLD, "gold");
		}
		if (!oreNameExists(STICK + GOLD)) {
			regCustomStick(gold_stick, stickGold, GOLD, "gold");
		}
		if (!oreNameExists(GEAR + IRON) && !isLoaded("libvulpes")) {
			regCustomGear(iron_gear, gearIron, IRON, "iron");
		}
		if (!oreNameExists(PLATE + IRON)
		&& !isLoaded(PluginImmersiveEngineering.MODID)
		&& !isLoaded("libvulpes")) {
			regCustomPlate(iron_plate, plateIron, IRON, "iron");
		}
		if (!oreNameExists(STICK + IRON)
		&& !isLoaded(PluginImmersiveEngineering.MODID)
		&& !isLoaded("libvulpes")) {
			regCustomStick(iron_stick, stickIron, IRON, "iron");
		}
		if (!oreNameExists(GEAR + LAPIS)) {
			regCustomGear(lapis_lazuli_gear, gearLapisLazuli, LAPIS, "lapis_lazuli");
		}
		if (!oreNameExists(PLATE + LAPIS)) {
			regCustomPlate(lapis_lazuli_plate, plateLapisLazuli, LAPIS, "lapis_lazuli");
		}
		if (!oreNameExists(GEAR + QUARTZ)) {
			regCustomGear(nether_quartz_gear, gearNetherQuartz, QUARTZ, "nether_quartz");
		}
		if (!oreNameExists(PLATE + QUARTZ)) {
			regCustomPlate(nether_quartz_plate, plateNetherQuartz, QUARTZ, "nether_quartz");
		}
		if (!oreNameExists(GEAR + REDSTONE)) {
			regCustomGear(redstone_gear, gearRedstone, REDSTONE, "redstone");
		}
		if (!oreNameExists(PLATE + REDSTONE)) {
			regCustomPlate(redstone_gear, plateRedstone, REDSTONE, "redstone");
		}
	}
}