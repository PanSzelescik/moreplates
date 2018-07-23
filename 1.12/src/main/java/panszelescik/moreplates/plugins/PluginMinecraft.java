package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginMinecraft {
	
	static Item coal_gear;
	static Item coal_plate;
	static Item diamond_gear;
	static Item diamond_plate;
	static Item emerald_gear;
	static Item emerald_plate;
	static Item glowstone_gear;
	static Item glowstone_plate;
	static Item gold_gear;
	static Item gold_plate;
	static Item iron_gear;
	static Item iron_plate;
	static Item lapis_lazuli_gear;
	static Item lapis_lazuli_plate;
	static Item nether_quartz_gear;
	static Item nether_quartz_plate;
	static Item redstone_gear;
	static Item redstone_plate;
	
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
	
	public static void preInit() {
		if (!oreNameExists(GEAR + COAL)) {
			coal_gear = new ItemGear("coal");
			regGear(coal_gear, COAL);
			gearCoal = true;
		}
		if (!oreNameExists(PLATE + COAL)) {
			coal_plate = new ItemPlate("coal");
			regPlate(coal_plate, COAL);
			plateCoal = true;
		}
		if (!oreNameExists(GEAR + DIAMOND)) {
			diamond_gear = new ItemGear("diamond");
			regGear(diamond_gear, DIAMOND);
			gearDiamond = true;
		}
		if (!oreNameExists(PLATE + DIAMOND)) {
			diamond_plate = new ItemPlate("diamond");
			regPlate(diamond_plate, DIAMOND);
			plateDiamond = true;
		}
		if (!oreNameExists(GEAR + EMERALD)) {
			emerald_gear = new ItemGear("emerald");
			regGear(emerald_gear, EMERALD);
			gearEmerald = true;
		}
		if (!oreNameExists(PLATE + EMERALD)) {
			emerald_plate = new ItemPlate("emerald");
			regPlate(emerald_plate, EMERALD);
			plateEmerald = true;
		}
		if (!oreNameExists(GEAR + GLOWSTONE)) {
			glowstone_gear = new ItemGear("glowstone");
			regGear(glowstone_gear, GLOWSTONE);
			gearGlowstone = true;
		}
		if (!oreNameExists(PLATE + GLOWSTONE)) {
			glowstone_plate = new ItemPlate("glowstone");
			regPlate(glowstone_plate, GLOWSTONE);
			plateGlowstone = true;
		}
		if (!oreNameExists(GEAR + GOLD)) {
			gold_gear = new ItemGear("gold");
			regGear(gold_gear, GOLD);
			gearGold = true;
		}
		if (!oreNameExists(PLATE + GOLD)) {
			gold_plate = new ItemPlate("gold");
			regPlate(gold_plate, GOLD);
			plateGold = true;
		}
		if (!oreNameExists(GEAR + IRON)) {
			iron_gear = new ItemGear("iron");
			regGear(iron_gear, IRON);
			gearIron = true;
		}
		if (!oreNameExists(PLATE + IRON)) {
			iron_plate = new ItemPlate("iron");
			regPlate(iron_plate, IRON);
			plateIron = true;
		}
		if (!oreNameExists(GEAR + LAPIS)) {
			lapis_lazuli_gear = new ItemGear("lapis_lazuli");
			regGear(lapis_lazuli_gear, LAPIS);
			gearLapisLazuli = true;
		}
		if (!oreNameExists(PLATE + LAPIS)) {
			lapis_lazuli_plate = new ItemPlate("lapis_lazuli");
			regPlate(lapis_lazuli_plate, LAPIS);
			plateLapisLazuli = true;
		}
		if (!oreNameExists(GEAR + QUARTZ)) {
			nether_quartz_gear = new ItemGear("nether_quartz");
			regGear(nether_quartz_gear, QUARTZ);
			gearNetherQuartz = true;
		}
		if (!oreNameExists(PLATE + QUARTZ)) {
			nether_quartz_plate = new ItemPlate("nether_quartz");
			regPlate(nether_quartz_plate, QUARTZ);
			plateNetherQuartz = true;
		}
		if (!oreNameExists(GEAR + REDSTONE)) {
			redstone_gear = new ItemGear("redstone");
			regGear(redstone_gear, REDSTONE);
			gearRedstone = true;
		}
		if (!oreNameExists(PLATE + REDSTONE)) {
			redstone_plate = new ItemPlate("redstone");
			regPlate(redstone_plate, REDSTONE);
			plateRedstone = true;
		}
	}
}