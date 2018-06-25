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
			gearNetherQuartz = true;
		}
		if (!oreNameExists(PLATE + QUARTZ)) {
			nether_quartz_plate = new ItemPlate("nether_quartz");
			registerItem(nether_quartz_plate);
			orePlate(QUARTZ, nether_quartz_plate);
			plateNetherQuartz = true;
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
		if (gearCoal)
			registerRender(coal_gear);
		if (plateCoal)
			registerRender(coal_plate);
		if (gearDiamond)
			registerRender(diamond_gear);
		if (plateDiamond)
			registerRender(diamond_plate);
		if (gearEmerald)
			registerRender(emerald_gear);
		if (plateEmerald)
			registerRender(emerald_plate);
		if (gearGlowstone)
			registerRender(glowstone_gear);
		if (plateGlowstone)
			registerRender(glowstone_plate);
		if (gearGold)
			registerRender(gold_gear);
		if (plateGold)
			registerRender(gold_plate);
		if (gearIron)
			registerRender(iron_gear);
		if (plateIron)
			registerRender(iron_plate);
		if (gearLapisLazuli)
			registerRender(lapis_lazuli_gear);
		if (plateLapisLazuli)
			registerRender(lapis_lazuli_plate);
		if (gearNetherQuartz)
			registerRender(nether_quartz_gear);
		if (plateNetherQuartz)
			registerRender(nether_quartz_plate);
		if (gearRedstone)
			registerRender(redstone_gear);
		if (plateRedstone)
			registerRender(redstone_plate);
	}
}