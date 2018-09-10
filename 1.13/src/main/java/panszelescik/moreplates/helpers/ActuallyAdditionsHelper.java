package panszelescik.moreplates.helpers;

import static panszelescik.moreplates.MorePlates.*;
import static panszelescik.moreplates.config.Config.*;

import java.util.List;

import de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.oredict.OreDictionary;

public class ActuallyAdditionsHelper extends Helper {
	
	public static int AtomicReconstructorRecipes = 0;
	public static int EmpowererRecipes = 0;
	
	public static void addEmpowerer(String output, String input, String dye, ItemStack modifier2, ItemStack modifier3, ItemStack modifier4) {
		List<ItemStack> dyes = OreDictionary.getOres(dye);
		for (ItemStack dyeStack : dyes) {
			if (oreNameExists(GEAR + input) && oreNameExists(GEAR + output)) {
				logger.debug(INFO_EMPOWERER + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromOre(GEAR + input) + ", "  + getItemName(dyeStack) + ", " + getItemName(modifier2) + ", " + getItemName(modifier3) + " and " + getItemName(modifier4));
				ActuallyAdditionsAPI.addEmpowererRecipe(Ingredient.fromStacks(getOre(GEAR + input)), getOre(GEAR + output), Ingredient.fromStacks(dyeStack), Ingredient.fromStacks(modifier2), Ingredient.fromStacks(modifier3), Ingredient.fromStacks(modifier4), energyEmpowerer(), timeEmpowerer(), null);
				
				EmpowererRecipes += 1;
			}
			if (oreNameExists(PLATE + input) && oreNameExists(PLATE + output)) {
				logger.debug(INFO_EMPOWERER + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(PLATE + input) + ", " + getItemName(dyeStack) + ", " + getItemName(modifier2) + ", " + getItemName(modifier3) + " and " + getItemName(modifier4));
				ActuallyAdditionsAPI.addEmpowererRecipe(Ingredient.fromStacks(getOre(PLATE + input)), getOre(PLATE + output), Ingredient.fromStacks(dyeStack), Ingredient.fromStacks(modifier2), Ingredient.fromStacks(modifier3), Ingredient.fromStacks(modifier4), energyEmpowerer(), timeEmpowerer(), null);
				
				EmpowererRecipes += 1;
			}
		}
	}
	
	public static void addReconstructor(String output, String input, int energy) {
		if (oreNameExists(GEAR + input) && oreNameExists(GEAR + output)) {
			List<ItemStack> inputs = OreDictionary.getOres(GEAR + input);
			for (ItemStack inputStack : inputs) {
				logger.debug(INFO_RECONSTRUCTOR + getItemNameFromOre(GEAR + output) + INFO_3 + getItemName(inputStack));
				ActuallyAdditionsAPI.addReconstructorLensConversionRecipe(Ingredient.fromStacks(inputStack), getOre(GEAR + output), energyReconstructor(output, energy));
				
				AtomicReconstructorRecipes += 1;
			}
		}
		if (oreNameExists(PLATE + input) && oreNameExists(PLATE + output)) {
			List<ItemStack> inputss = OreDictionary.getOres(PLATE + input);
			for (ItemStack inputStack : inputss) {
				logger.debug(INFO_RECONSTRUCTOR + getItemNameFromOre(PLATE + output) + INFO_3 + getItemName(inputStack));
				ActuallyAdditionsAPI.addReconstructorLensConversionRecipe(Ingredient.fromStacks(inputStack), getOre(PLATE + output), energyReconstructor(output, energy));
				
				AtomicReconstructorRecipes += 1;
			}
		}
	}
	
	private static int energyEmpowerer() {
		return getInt("Energy in Empowerer", CATEGORY_ACTUALLY, 5000, "Energy per Display Stand used to make Empowered Gears and Plates in Empowerer");
	}
	
	private static int timeEmpowerer() {
		return getInt("Time in Empowerer", CATEGORY_ACTUALLY, 50, "Time in seconds to craft Empowered Gears and Plates in Empowerer");
	}
	
	private static int energyReconstructor(String name, int energy) {
		return getInt("Energy for " + name + " in Reconstructor", CATEGORY_ACTUALLY, energy, "Energy used to make " + name + " Gear and Plate in Atomic Reconstructor");
	}
}