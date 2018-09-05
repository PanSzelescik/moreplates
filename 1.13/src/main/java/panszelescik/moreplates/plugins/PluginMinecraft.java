package panszelescik.moreplates.plugins;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
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
	Item iron_gear;
	Item iron_plate;
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
	public static boolean gearIron;
	public static boolean plateIron;
	public static boolean gearLapisLazuli;
	public static boolean plateLapisLazuli;
	public static boolean gearNetherQuartz;
	public static boolean plateNetherQuartz;
	public static boolean gearRedstone;
	public static boolean plateRedstone;
	
	public void preInit() {
		OreDictionary.registerOre("coal", Items.COAL);
		
		if (!oreNameExists(GEAR + COAL)) {
			coal_gear = gear("coal");
			regGear(coal_gear, COAL);
			gearCoal = true;
		}
		if (!oreNameExists(PLATE + COAL)) {
			coal_plate = plate("coal");
			regPlate(coal_plate, COAL);
			plateCoal = true;
		}
		if (!oreNameExists(GEAR + DIAMOND)) {
			diamond_gear = gear("diamond");
			regGear(diamond_gear, DIAMOND);
			gearDiamond = true;
		}
		if (!oreNameExists(PLATE + DIAMOND)) {
			diamond_plate = plate("diamond");
			regPlate(diamond_plate, DIAMOND);
			plateDiamond = true;
		}
		if (!oreNameExists(GEAR + EMERALD)) {
			emerald_gear = gear("emerald");
			regGear(emerald_gear, EMERALD);
			gearEmerald = true;
		}
		if (!oreNameExists(PLATE + EMERALD)) {
			emerald_plate = plate("emerald");
			regPlate(emerald_plate, EMERALD);
			plateEmerald = true;
		}
		if (!oreNameExists(GEAR + GLOWSTONE)) {
			glowstone_gear = gear("glowstone");
			regGear(glowstone_gear, GLOWSTONE);
			gearGlowstone = true;
		}
		if (!oreNameExists(PLATE + GLOWSTONE)) {
			glowstone_plate = plate("glowstone");
			regPlate(glowstone_plate, GLOWSTONE);
			plateGlowstone = true;
		}
		if (!oreNameExists(GEAR + GOLD)) {
			gold_gear = gear("gold");
			regGear(gold_gear, GOLD);
			gearGold = true;
		}
		if (!oreNameExists(PLATE + GOLD) && !Loader.isModLoaded(PluginImmersiveEngineering.MODID) && !Loader.isModLoaded("libvulpes")) {
			gold_plate = plate("gold");
			regPlate(gold_plate, GOLD);
			plateGold = true;
		}
		if (!oreNameExists(GEAR + IRON) && !Loader.isModLoaded("libvulpes")) {
			iron_gear = gear("iron");
			regGear(iron_gear, IRON);
			gearIron = true;
		}
		if (!oreNameExists(PLATE + IRON) && !Loader.isModLoaded(PluginImmersiveEngineering.MODID) && !Loader.isModLoaded("libvulpes")) {
			iron_plate = plate("iron");
			regPlate(iron_plate, IRON);
			plateIron = true;
		}
		if (!oreNameExists(GEAR + LAPIS)) {
			lapis_lazuli_gear = gear("lapis_lazuli");
			regGear(lapis_lazuli_gear, LAPIS);
			gearLapisLazuli = true;
		}
		if (!oreNameExists(PLATE + LAPIS)) {
			lapis_lazuli_plate = plate("lapis_lazuli");
			regPlate(lapis_lazuli_plate, LAPIS);
			plateLapisLazuli = true;
		}
		if (!oreNameExists(GEAR + QUARTZ)) {
			nether_quartz_gear = gear("nether_quartz");
			regGear(nether_quartz_gear, QUARTZ);
			gearNetherQuartz = true;
		}
		if (!oreNameExists(PLATE + QUARTZ)) {
			nether_quartz_plate = plate("nether_quartz");
			regPlate(nether_quartz_plate, QUARTZ);
			plateNetherQuartz = true;
		}
		if (!oreNameExists(GEAR + REDSTONE)) {
			redstone_gear = gear("redstone");
			regGear(redstone_gear, REDSTONE);
			gearRedstone = true;
		}
		if (!oreNameExists(PLATE + REDSTONE)) {
			redstone_plate = plate("redstone");
			regPlate(redstone_plate, REDSTONE);
			plateRedstone = true;
		}
	}
}