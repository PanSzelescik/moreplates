package panszelescik.moreplates.helpers;

import static panszelescik.moreplates.MorePlates.*;
import static panszelescik.moreplates.config.Config.*;

import java.util.List;

import de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.plugins.PluginActuallyAdditions;

public class ActuallyAdditionsHelper extends Helper {
	
	public static void addEmpowerer(String output, String input, String dye, ItemStack modifier2, ItemStack modifier3, ItemStack modifier4) {
		List<ItemStack> dyes = OreDictionary.getOres(dye);
		for (ItemStack dyeStack : dyes) {
			logger.debug(INFO_EMPOWERER + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromOre(GEAR + input) + ", "  + getItemName(dyeStack) + ", " + getItemName(modifier2) + ", " + getItemName(modifier3) + " and " + getItemName(modifier4));
			ActuallyAdditionsAPI.addEmpowererRecipe(Ingredient.fromStacks(getOre(GEAR + input)), getOre(GEAR + output), Ingredient.fromStacks(dyeStack), Ingredient.fromStacks(modifier2), Ingredient.fromStacks(modifier3), Ingredient.fromStacks(modifier4), energyEmpowerer, timeEmpowerer, null);
			
			PluginActuallyAdditions.EmpowererRecipes += 1;
			
			logger.debug(INFO_EMPOWERER + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(PLATE + input) + ", " + getItemName(dyeStack) + ", " + getItemName(modifier2) + ", " + getItemName(modifier3) + " and " + getItemName(modifier4));
			ActuallyAdditionsAPI.addEmpowererRecipe(Ingredient.fromStacks(getOre(PLATE + input)), getOre(PLATE + output), Ingredient.fromStacks(dyeStack), Ingredient.fromStacks(modifier2), Ingredient.fromStacks(modifier3), Ingredient.fromStacks(modifier4), energyEmpowerer, timeEmpowerer, null);
			
			PluginActuallyAdditions.EmpowererRecipes += 1;
		}
	}
	
	public static void addReconstructor(String output, String input, int energy) {
		List<ItemStack> inputs = OreDictionary.getOres(GEAR + input);
		for (ItemStack inputStack : inputs) {
			logger.debug(INFO_RECONSTRUCTOR + getItemNameFromOre(GEAR + output) + INFO_3 + getItemName(inputStack));
			ActuallyAdditionsAPI.addReconstructorLensConversionRecipe(Ingredient.fromStacks(inputStack), getOre(GEAR + output), energy);
			
			PluginActuallyAdditions.AtomicReconstructorRecipes += 1;
		}
		List<ItemStack> inputss = OreDictionary.getOres(PLATE + input);
		for (ItemStack inputStack : inputss) {
			logger.debug(INFO_RECONSTRUCTOR + getItemNameFromOre(PLATE + output) + INFO_3 + getItemName(inputStack));
			ActuallyAdditionsAPI.addReconstructorLensConversionRecipe(Ingredient.fromStacks(inputStack), getOre(PLATE + output), energy);
			
			PluginActuallyAdditions.AtomicReconstructorRecipes += 1;
		}
	}
}