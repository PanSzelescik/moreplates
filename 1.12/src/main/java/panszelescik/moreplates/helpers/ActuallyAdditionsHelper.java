package panszelescik.moreplates.helpers;

import de.ellpeck.actuallyadditions.api.ActuallyAdditionsAPI;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.config.Config;

import java.util.List;

public class ActuallyAdditionsHelper extends PluginHelper {

    public static int AtomicReconstructorRecipes = 0, EmpowererRecipes = 0;

    public static void addEmpowerer(String output, String input, String dye, ItemStack modifier2, ItemStack modifier3, ItemStack modifier4) {
        List<ItemStack> dyes = OreDictionary.getOres(dye);
        for (ItemStack dyeStack : dyes) {
            if (oreNameExists(GEAR + input) && oreNameExists(GEAR + output)) {
                MorePlates.logger.debug(INFO_EMPOWERER + getItemName(GEAR + output) + INFO_3 + getItemName(GEAR + input) + ", " + getItemName(dyeStack) + ", " + getItemName(modifier2) + ", " + getItemName(modifier3) + " and " + getItemName(modifier4));
                ActuallyAdditionsAPI.addEmpowererRecipe(Ingredient.fromStacks(get(GEAR + input)), get(GEAR + output), Ingredient.fromStacks(dyeStack), Ingredient.fromStacks(modifier2), Ingredient.fromStacks(modifier3), Ingredient.fromStacks(modifier4), energyEmpowerer(), timeEmpowerer(), null);

                EmpowererRecipes += 1;
            }
            if (oreNameExists(PLATE + input) && oreNameExists(PLATE + output)) {
                MorePlates.logger.debug(INFO_EMPOWERER + getItemName(PLATE + output) + INFO_3 + getItemName(PLATE + input) + ", " + getItemName(dyeStack) + ", " + getItemName(modifier2) + ", " + getItemName(modifier3) + " and " + getItemName(modifier4));
                ActuallyAdditionsAPI.addEmpowererRecipe(Ingredient.fromStacks(get(PLATE + input)), get(PLATE + output), Ingredient.fromStacks(dyeStack), Ingredient.fromStacks(modifier2), Ingredient.fromStacks(modifier3), Ingredient.fromStacks(modifier4), energyEmpowerer(), timeEmpowerer(), null);

                EmpowererRecipes += 1;
            }
        }
    }

    public static void addReconstructor(String output, String input, int energy) {
        if (oreNameExists(GEAR + input) && oreNameExists(GEAR + output)) {
            List<ItemStack> inputs = OreDictionary.getOres(GEAR + input);
            for (ItemStack inputStack : inputs) {
                MorePlates.logger.debug(INFO_RECONSTRUCTOR + getItemName(GEAR + output) + INFO_3 + getItemName(inputStack));
                ActuallyAdditionsAPI.addReconstructorLensConversionRecipe(Ingredient.fromStacks(inputStack), get(GEAR + output), energyReconstructor(output, energy));

                AtomicReconstructorRecipes += 1;
            }
        }
        if (oreNameExists(PLATE + input) && oreNameExists(PLATE + output)) {
            List<ItemStack> inputss = OreDictionary.getOres(PLATE + input);
            for (ItemStack inputStack : inputss) {
                MorePlates.logger.debug(INFO_RECONSTRUCTOR + getItemName(PLATE + output) + INFO_3 + getItemName(inputStack));
                ActuallyAdditionsAPI.addReconstructorLensConversionRecipe(Ingredient.fromStacks(inputStack), get(PLATE + output), energyReconstructor(output, energy));

                AtomicReconstructorRecipes += 1;
            }
        }
    }

    private static int energyEmpowerer() {
        return Config.getInt("Energy in Empowerer", Config.CATEGORY_ACTUALLY, 5000, "Energy per Display Stand used to make Empowered Gears and Plates in Empowerer");
    }

    private static int timeEmpowerer() {
        return Config.getInt("Time in Empowerer", Config.CATEGORY_ACTUALLY, 50, "Time in seconds to craft Empowered Gears and Plates in Empowerer");
    }

    private static int energyReconstructor(String name, int energy) {
        return Config.getInt("Energy for " + name + " in Reconstructor", Config.CATEGORY_ACTUALLY, energy, "Energy used to make " + name + " Gear and Plate in Atomic Reconstructor");
    }
}