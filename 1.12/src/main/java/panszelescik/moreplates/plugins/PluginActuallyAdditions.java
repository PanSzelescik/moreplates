package panszelescik.moreplates.plugins;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.items.*;

import de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI;

import static panszelescik.moreplates.config.Config.*;
import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

import java.util.List;

public class PluginActuallyAdditions {
	
	public static Item black_quartz_gear;
	public static Item black_quartz_plate;
	public static Item diamatine_gear;
	public static Item diamatine_plate;
	public static Item emeradic_gear;
	public static Item emeradic_plate;
	public static Item enori_gear;
	public static Item enori_plate;
	public static Item palis_gear;
	public static Item palis_plate;
	public static Item restonia_gear;
	public static Item restonia_plate;
	public static Item void_gear;
	public static Item void_plate;
	
	public static Item empowered_diamatine_gear;
	public static Item empowered_diamatine_plate;
	public static Item empowered_emeradic_gear;
	public static Item empowered_emeradic_plate;
	public static Item empowered_enori_gear;
	public static Item empowered_enori_plate;
	public static Item empowered_palis_gear;
	public static Item empowered_palis_plate;
	public static Item empowered_restonia_gear;
	public static Item empowered_restonia_plate;
	public static Item empowered_void_gear;
	public static Item empowered_void_plate;
	
	public static void preInit() {
		black_quartz_gear = new ItemGear("black_quartz");
		black_quartz_plate = new ItemPlate("black_quartz");
		diamatine_gear = new ItemGear("diamatine");
		diamatine_plate = new ItemPlate("diamatine");
		emeradic_gear = new ItemGear("emeradic");
		emeradic_plate = new ItemPlate("emeradic");
		enori_gear = new ItemGear("enori");
		enori_plate = new ItemPlate("enori");
		palis_gear = new ItemGear("palis");
		palis_plate = new ItemPlate("palis");
		restonia_gear = new ItemGear("restonia");
		restonia_plate = new ItemPlate("restonia");
		void_gear = new ItemGear("void");
		void_plate = new ItemPlate("void");
		
		empowered_diamatine_gear = new ItemGear("empowered_diamatine");
		empowered_diamatine_plate = new ItemPlate("empowered_diamatine");
		empowered_emeradic_gear = new ItemGear("empowered_emeradic");
		empowered_emeradic_plate = new ItemPlate("empowered_emeradic");
		empowered_enori_gear = new ItemGear("empowered_enori");
		empowered_enori_plate = new ItemPlate("empowered_enori");
		empowered_palis_gear = new ItemGear("empowered_palis");
		empowered_palis_plate = new ItemPlate("empowered_palis");
		empowered_restonia_gear = new ItemGear("empowered_restonia");
		empowered_restonia_plate = new ItemPlate("empowered_restonia");
		empowered_void_gear = new ItemGear("empowered_void");
		empowered_void_plate = new ItemPlate("empowered_void");
		
		registerItem(black_quartz_gear);
		registerItem(black_quartz_plate);
		registerItem(diamatine_gear);
		registerItem(diamatine_plate);
		registerItem(emeradic_gear);
		registerItem(emeradic_plate);
		registerItem(enori_gear);
		registerItem(enori_plate);
		registerItem(palis_gear);
		registerItem(palis_plate);
		registerItem(restonia_gear);
		registerItem(restonia_plate);
		registerItem(void_gear);
		registerItem(void_plate);
		
		registerItem(empowered_diamatine_gear);
		registerItem(empowered_diamatine_plate);
		registerItem(empowered_emeradic_gear);
		registerItem(empowered_emeradic_plate);
		registerItem(empowered_enori_gear);
		registerItem(empowered_enori_plate);
		registerItem(empowered_palis_gear);
		registerItem(empowered_palis_plate);
		registerItem(empowered_restonia_gear);
		registerItem(empowered_restonia_plate);
		registerItem(empowered_void_gear);
		registerItem(empowered_void_plate);
		
		oreGear(BLACK_QUARTZ, black_quartz_gear);
		orePlate(BLACK_QUARTZ, black_quartz_plate);
		oreGear(DIAMATINE, diamatine_gear);
		orePlate(DIAMATINE, diamatine_plate);
		oreGear(EMERADIC, emeradic_gear);
		orePlate(EMERADIC, emeradic_plate);
		oreGear(ENORI, enori_gear);
		orePlate(ENORI, enori_plate);
		oreGear(PALIS, palis_gear);
		orePlate(PALIS, palis_plate);
		oreGear(RESTONIA, restonia_gear);
		orePlate(RESTONIA, restonia_plate);
		oreGear(VOID, void_gear);
		orePlate(VOID, void_plate);
		
		oreGear(EMPOWERED_DIAMATINE, empowered_diamatine_gear);
		orePlate(EMPOWERED_DIAMATINE, empowered_diamatine_plate);
		oreGear(EMPOWERED_EMERADIC, empowered_emeradic_gear);
		orePlate(EMPOWERED_EMERADIC, empowered_emeradic_plate);
		oreGear(EMPOWERED_ENORI, empowered_enori_gear);
		orePlate(EMPOWERED_ENORI, empowered_enori_plate);
		oreGear(EMPOWERED_PALIS, empowered_palis_gear);
		orePlate(EMPOWERED_PALIS, empowered_palis_plate);
		oreGear(EMPOWERED_RESTONIA, empowered_restonia_gear);
		orePlate(EMPOWERED_RESTONIA, empowered_restonia_plate);
		oreGear(EMPOWERED_VOID, empowered_void_gear);
		orePlate(EMPOWERED_VOID, empowered_void_plate);
	}
	
	public static void clientPreInit() {
		registerRender(black_quartz_gear);
		registerRender(black_quartz_plate);
		registerRender(diamatine_gear);
		registerRender(diamatine_plate);
		registerRender(emeradic_gear);
		registerRender(emeradic_plate);
		registerRender(enori_gear);
		registerRender(enori_plate);
		registerRender(palis_gear);
		registerRender(palis_plate);
		registerRender(restonia_gear);
		registerRender(restonia_plate);
		registerRender(void_gear);
		registerRender(void_plate);
		
		registerRender(empowered_diamatine_gear);
		registerRender(empowered_diamatine_plate);
		registerRender(empowered_emeradic_gear);
		registerRender(empowered_emeradic_plate);
		registerRender(empowered_enori_gear);
		registerRender(empowered_enori_plate);
		registerRender(empowered_palis_gear);
		registerRender(empowered_palis_plate);
		registerRender(empowered_restonia_gear);
		registerRender(empowered_restonia_plate);
		registerRender(empowered_void_gear);
		registerRender(empowered_void_plate);
	}
	public static void postInit() {
		add(EMPOWERED_DIAMATINE, DIAMATINE, DYE_LIGHT_BLUE, new ItemStack(Items.CLAY_BALL), new ItemStack(Items.CLAY_BALL), new ItemStack(Blocks.CLAY));
		List<ItemStack> balls = OreDictionary.getOres("slimeball");
		for (ItemStack ball : balls) {
			add(EMPOWERED_EMERADIC, EMERADIC, DYE_LIME, new ItemStack(Blocks.TALLGRASS, 1, 1), new ItemStack(Blocks.SAPLING), ball.copy());
		}
		add(EMPOWERED_ENORI, ENORI, DYE_GRAY, new ItemStack(Items.SNOWBALL), new ItemStack(Blocks.STONE_BUTTON), new ItemStack(Blocks.COBBLESTONE));
		add(EMPOWERED_PALIS, PALIS, DYE_CYAN, new ItemStack(Items.PRISMARINE_SHARD), new ItemStack(Items.PRISMARINE_SHARD), new ItemStack(Items.PRISMARINE_SHARD));
		add(EMPOWERED_RESTONIA, RESTONIA, DYE_RED, new ItemStack(Items.NETHERBRICK), new ItemStack(Items.REDSTONE), new ItemStack(Items.BRICK));
		add(EMPOWERED_VOID, VOID, DYE_BLACK, new ItemStack(Items.COAL, 1, 1), new ItemStack(Items.FLINT), new ItemStack(Blocks.STONE));
	}
	private static void add(String output, String input, String dye, ItemStack modifier2, ItemStack modifier3, ItemStack modifier4) {
		List<ItemStack> dyes = OreDictionary.getOres(dye);
		for (ItemStack dyeStack : dyes) {
			ActuallyAdditionsAPI.addEmpowererRecipe(getOre(GEAR + input), getOre(GEAR + output), dyeStack, modifier2, modifier3, modifier4, energyEmpowerer, timeEmpowerer, null);
			MorePlates.logger.debug(INFO_ACTUALLY + getItemName(getOre(GEAR + output)) + INFO_3 + getItemName(getOre(GEAR + input)) + ", "  + getItemName(dyeStack) + ", " + getItemName(modifier2) + ", " + getItemName(modifier3) + " and " + getItemName(modifier4));
			ActuallyAdditionsAPI.addEmpowererRecipe(getOre(PLATE + input), getOre(PLATE + output), dyeStack, modifier2, modifier3, modifier4, energyEmpowerer, timeEmpowerer, null);
			MorePlates.logger.debug(INFO_ACTUALLY + getItemName(getOre(PLATE + output)) + INFO_3 + getItemName(getOre(PLATE + input)) + ", " + getItemName(dyeStack) + ", " + getItemName(modifier2) + ", " + getItemName(modifier3) + " and " + getItemName(modifier4));
		}
	}
}