package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

public class PluginVanilla {
	
	public static Item coal_gear;
	public static Item coal_plate;
	public static Item diamond_gear;
	public static Item diamond_plate;
	public static Item emerald_gear;
	public static Item emerald_plate;
	public static Item glowstone_gear;
	public static Item glowstone_plate;
	public static Item gold_gear;
	public static Item gold_plate;
	public static Item iron_gear;
	public static Item iron_plate;
	public static Item lapis_lazuli_gear;
	public static Item lapis_lazuli_plate;
	public static Item nether_quartz_gear;
	public static Item nether_quartz_plate;
	public static Item redstone_gear;
	public static Item redstone_plate;
	
	static boolean gearCoal;
	static boolean plateCoal;
	static boolean gearDiamond;
	static boolean plateDiamond;
	static boolean gearEmerald;
	static boolean plateEmerald;
	static boolean gearGlowstone;
	static boolean plateGlowstone;
	static boolean gearGold;
	static boolean plateGold;
	static boolean gearIron;
	static boolean plateIron;
	static boolean gearLapisLazuli;
	static boolean plateLapisLazuli;
	static boolean gearQuartz;
	static boolean plateQuartz;
	static boolean gearRedstone;
	static boolean plateRedstone;
	
	public static void preInit() {
		if (!oreNameExists(GEAR + COAL)) {
			coal_gear = new ItemGear("coal");
			registerItem(coal_gear);
			oreGear(COAL, coal_gear);
			gearCoal = true;
		}
		if (!oreNameExists(PLATE + COAL)) {
			coal_plate = new ItemPlate("coal");
			registerItem(coal_plate);
			orePlate(COAL, coal_plate);
			plateCoal = true;
		}
		if (!oreNameExists(GEAR + DIAMOND)) {
			diamond_gear = new ItemGear("diamond");
			registerItem(diamond_gear);
			oreGear(DIAMOND, diamond_gear);
			gearDiamond = true;
		}
		if (!oreNameExists(PLATE + DIAMOND)) {
			diamond_plate = new ItemPlate("diamond");
			registerItem(diamond_plate);
			orePlate(DIAMOND, diamond_plate);
			plateDiamond = true;
		}
		if (!oreNameExists(GEAR + EMERALD)) {
			emerald_gear = new ItemGear("emerald");
			registerItem(emerald_gear);
			oreGear(EMERALD, emerald_gear);
			gearEmerald = true;
		}
		if (!oreNameExists(PLATE + EMERALD)) {
			emerald_plate = new ItemPlate("emerald");
			registerItem(emerald_plate);
			orePlate(EMERALD, emerald_plate);
			plateEmerald = true;
		}
		if (!oreNameExists(GEAR + GLOWSTONE)) {
			glowstone_gear = new ItemGear("glowstone");
			registerItem(glowstone_gear);
			oreGear(GLOWSTONE, glowstone_gear);
			gearGlowstone = true;
		}
		if (!oreNameExists(PLATE + GLOWSTONE)) {
			glowstone_plate = new ItemPlate("glowstone");
			registerItem(glowstone_plate);
			orePlate(GLOWSTONE, glowstone_plate);
			plateGlowstone = true;
		}
		if (!oreNameExists(GEAR + GOLD)) {
			gold_gear = new ItemGear("gold");
			registerItem(gold_gear);
			oreGear(GOLD, gold_gear);
			gearGold = true;
		}
		if (!oreNameExists(PLATE + GOLD)) {
			glowstone_plate = new ItemPlate("gold");
			registerItem(gold_plate);
			orePlate(GOLD, gold_plate);
			plateGold = true;
		}
		if (!oreNameExists(GEAR + IRON)) {
			iron_gear = new ItemGear("iron");
			registerItem(iron_gear);
			oreGear(IRON, iron_gear);
			gearIron = true;
		}
		if (!oreNameExists(PLATE + IRON)) {
			iron_plate = new ItemPlate("iron");
			registerItem(iron_plate);
			orePlate(IRON, iron_plate);
			plateIron = true;
		}
		if (!oreNameExists(GEAR + LAPIS)) {
			lapis_lazuli_gear = new ItemGear("lapis_lazuli");
			registerItem(lapis_lazuli_gear);
			oreGear(LAPIS, lapis_lazuli_gear);
			gearLapisLazuli = true;
		}
		if (!oreNameExists(PLATE + LAPIS)) {
			lapis_lazuli_plate = new ItemPlate("lapis_lazuli");
			registerItem(lapis_lazuli_plate);
			orePlate(LAPIS, lapis_lazuli_plate);
			plateLapisLazuli = true;
		}
		if (!oreNameExists(GEAR + QUARTZ)) {
			nether_quartz_gear = new ItemGear("nether_quartz");
			registerItem(nether_quartz_gear);
			oreGear(QUARTZ, nether_quartz_gear);
			gearQuartz = true;
		}
		if (!oreNameExists(PLATE + QUARTZ)) {
			nether_quartz_plate = new ItemPlate("nether_quartz");
			registerItem(nether_quartz_plate);
			orePlate(QUARTZ, nether_quartz_plate);
			plateQuartz = true;
		}
		if (!oreNameExists(GEAR + REDSTONE)) {
			redstone_gear = new ItemGear("redstone");
			registerItem(redstone_gear);
			oreGear(REDSTONE, redstone_gear);
			gearRedstone = true;
		}
		if (!oreNameExists(PLATE + REDSTONE)) {
			redstone_plate = new ItemPlate("redstone");
			registerItem(redstone_plate);
			orePlate(REDSTONE, redstone_plate);
			plateRedstone = true;
		}
	}
	
	public static void clientPreInit() {
		if (gearCoal == true)
			registerRender(coal_gear);
		if (plateCoal == true)
			registerRender(coal_plate);
		if (gearDiamond == true)
			registerRender(diamond_gear);
		if (plateDiamond == true)
			registerRender(diamond_plate);
		if (gearEmerald == true)
			registerRender(emerald_gear);
		if (plateEmerald == true)
			registerRender(emerald_plate);
		if (gearGlowstone == true)
			registerRender(glowstone_gear);
		if (plateGlowstone == true)
			registerRender(glowstone_plate);
		if (gearGold == true)
			registerRender(gold_gear);
		if (plateGold == true)
			registerRender(gold_plate);
		if (gearIron == true)
			registerRender(iron_gear);
		if (plateIron == true)
			registerRender(iron_plate);
		if (gearLapisLazuli == true)
			registerRender(lapis_lazuli_gear);
		if (plateLapisLazuli == true)
			registerRender(lapis_lazuli_plate);
		if (gearQuartz == true)
			registerRender(nether_quartz_gear);
		if (plateQuartz == true)
			registerRender(nether_quartz_plate);
		if (gearRedstone == true)
			registerRender(redstone_gear);
		if (plateRedstone == true)
			registerRender(redstone_plate);
	}
}