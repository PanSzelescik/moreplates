package panszelescik.moreplates.plugins;

import de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.config.Config.*;
import static panszelescik.moreplates.helpers.Helper.*;
import static panszelescik.moreplates.helpers.Strings.*;

import java.util.List;

import javax.annotation.Nonnull;

public class PluginActuallyAdditions {
	
	private static int AtomicReconstructorRecipes = 0;
	private static int EmpowererRecipes = 0;
	
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
		
		reg(BLACK_QUARTZ, black_quartz_gear, black_quartz_plate);
		reg(DIAMATINE, diamatine_gear, diamatine_plate);
		reg(EMERADIC, emeradic_gear, emeradic_plate);
		reg(ENORI, enori_gear, enori_plate);
		reg(PALIS, palis_gear, palis_plate);
		reg(RESTONIA, restonia_gear, restonia_plate);
		reg(VOID, void_gear, void_plate);
		
		reg(EMPOWERED_DIAMATINE, empowered_diamatine_gear, empowered_diamatine_plate);
		reg(EMPOWERED_EMERADIC, empowered_emeradic_gear, empowered_emeradic_plate);
		reg(EMPOWERED_ENORI, empowered_enori_gear, empowered_enori_plate);
		reg(EMPOWERED_PALIS, empowered_palis_gear, empowered_palis_plate);
		reg(EMPOWERED_RESTONIA, empowered_restonia_gear, empowered_restonia_plate);
		reg(EMPOWERED_VOID, empowered_void_gear, empowered_void_plate);
	}
	
	public static void postInit() {
		addEmpowerer(EMPOWERED_DIAMATINE, DIAMATINE, DYE_LIGHT_BLUE, new ItemStack(Items.CLAY_BALL), new ItemStack(Items.CLAY_BALL), new ItemStack(Blocks.CLAY));
		List<ItemStack> balls = OreDictionary.getOres("slimeball");
		for (ItemStack ball : balls) {
			addEmpowerer(EMPOWERED_EMERADIC, EMERADIC, DYE_LIME, new ItemStack(Blocks.TALLGRASS, 1, 1), new ItemStack(Blocks.SAPLING), ball.copy());
		}
		addEmpowerer(EMPOWERED_ENORI, ENORI, DYE_GRAY, new ItemStack(Items.SNOWBALL), new ItemStack(Blocks.STONE_BUTTON), new ItemStack(Blocks.COBBLESTONE));
		addEmpowerer(EMPOWERED_PALIS, PALIS, DYE_CYAN, new ItemStack(Items.PRISMARINE_SHARD), new ItemStack(Items.PRISMARINE_SHARD), new ItemStack(Items.PRISMARINE_SHARD));
		addEmpowerer(EMPOWERED_RESTONIA, RESTONIA, DYE_RED, new ItemStack(Items.NETHERBRICK), new ItemStack(Items.REDSTONE), new ItemStack(Items.BRICK));
		addEmpowerer(EMPOWERED_VOID, VOID, DYE_BLACK, new ItemStack(Items.COAL, 1, 1), new ItemStack(Items.FLINT), new ItemStack(Blocks.STONE));
		
		addReconstructor(DIAMATINE, DIAMOND, energyDiamantineReconstructor);
		addReconstructor(EMERADIC, EMERALD, energyEmeradicReconstructor);
		addReconstructor(ENORI, IRON, energyEnoriReconstructor);
		addReconstructor(PALIS, LAPIS, energyPalisReconstructor);
		addReconstructor(RESTONIA, REDSTONE, energyRestoniaReconstructor);
		addReconstructor(VOID, COAL, energyVoidReconstructor);
		
		MorePlates.logger.info("Added " + AtomicReconstructorRecipes + " recipes to Atomic Reconstructor");
		MorePlates.logger.info("Added " + EmpowererRecipes + " recipes to Empowerer");
	}
	
	private static void addEmpowerer(@Nonnull String output, @Nonnull String input, @Nonnull String dye, @Nonnull ItemStack modifier2, @Nonnull ItemStack modifier3, @Nonnull ItemStack modifier4) {
		List<ItemStack> dyes = OreDictionary.getOres(dye);
		for (ItemStack dyeStack : dyes) {
			MorePlates.logger.debug(INFO_EMPOWERER + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromOre(GEAR + input) + ", "  + getItemName(dyeStack) + ", " + getItemName(modifier2) + ", " + getItemName(modifier3) + " and " + getItemName(modifier4));
			ActuallyAdditionsAPI.addEmpowererRecipe(Ingredient.fromStacks(getOre(GEAR + input)), getOre(GEAR + output), Ingredient.fromStacks(dyeStack), Ingredient.fromStacks(modifier2), Ingredient.fromStacks(modifier3), Ingredient.fromStacks(modifier4), energyEmpowerer, timeEmpowerer, null);
			
			EmpowererRecipes += 1;
			
			MorePlates.logger.debug(INFO_EMPOWERER + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(PLATE + input) + ", " + getItemName(dyeStack) + ", " + getItemName(modifier2) + ", " + getItemName(modifier3) + " and " + getItemName(modifier4));
			ActuallyAdditionsAPI.addEmpowererRecipe(Ingredient.fromStacks(getOre(PLATE + input)), getOre(PLATE + output), Ingredient.fromStacks(dyeStack), Ingredient.fromStacks(modifier2), Ingredient.fromStacks(modifier3), Ingredient.fromStacks(modifier4), energyEmpowerer, timeEmpowerer, null);
			
			EmpowererRecipes += 1;
		}
	}
	
	private static void addReconstructor(@Nonnull String output, @Nonnull String input, int energy) {
		List<ItemStack> inputs = OreDictionary.getOres(GEAR + input);
		for (ItemStack inputStack : inputs) {
			MorePlates.logger.debug(INFO_RECONSTRUCTOR + getItemNameFromOre(GEAR + output) + INFO_3 + getItemName(inputStack));
			ActuallyAdditionsAPI.addReconstructorLensConversionRecipe(Ingredient.fromStacks(inputStack), getOre(GEAR + output), energy);
			
			AtomicReconstructorRecipes += 1;
		}
		List<ItemStack> inputss = OreDictionary.getOres(PLATE + input);
		for (ItemStack inputStack : inputss) {
			MorePlates.logger.debug(INFO_RECONSTRUCTOR + getItemNameFromOre(PLATE + output) + INFO_3 + getItemName(inputStack));
			ActuallyAdditionsAPI.addReconstructorLensConversionRecipe(Ingredient.fromStacks(inputStack), getOre(PLATE + output), energy);
			
			AtomicReconstructorRecipes += 1;
		}
	}
}