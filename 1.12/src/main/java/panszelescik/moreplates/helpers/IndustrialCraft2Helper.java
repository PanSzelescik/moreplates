package panszelescik.moreplates.helpers;

import ic2.api.recipe.Recipes;
import panszelescik.moreplates.MorePlates;

import java.util.Collections;

import static panszelescik.moreplates.helpers.ItemInfo.Type.*;

public class IndustrialCraft2Helper extends PluginHelper {

    public static int BlockCuttingMachineRecipes = 0, MetalFormerRecipes = 0;

    public static void add(String output, String input, boolean plate) {
        if (oreNameExists(input) && plate && oreNameExists(PLATE + output)) {
            MorePlates.logger.debug("Adding Metal Former recipe for: " + getItemName(PLATE + output) + " from: " + getItemName(input));
            Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forOreDict(input), Collections.singletonList(get(PLATE + output)), null, false);

            MetalFormerRecipes += 1;
        }
    }

    public static void add(String output, String input) {
        if (oreNameExists(input) && oreNameExists(PLATE + output)) {
            MorePlates.logger.debug("Adding Metal Former recipe for: " + getItemName(PLATE + output) + " from: " + getItemName(input));
            Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forOreDict(input), Collections.singletonList(get(PLATE + output)), null, false);

            MetalFormerRecipes += 1;
        }
    }

    public static void add(String output, String input, String id, int meta) {
        if (notNull(id, input, meta) && oreNameExists(PLATE + output)) {
            MorePlates.logger.debug("Adding Metal Former recipe for: " + getItemName(PLATE + output) + " from: " + getItemName(id, input, 1, meta));
            Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forStack(get(id, input, 1, meta)), Collections.singletonList(get(PLATE + output)), null, false);

            MetalFormerRecipes += 1;
        }
    }

    public static void addBlock(String name, int amount, boolean plate) {
        if (oreNameExists(BLOCK + name) && plate && oreNameExists(PLATE + name)) {
            MorePlates.logger.debug("Adding Block Cutting Machine recipe for: " + getItemName(PLATE + name) + " x" + amount + " from: " + getItemName(BLOCK + name));
            Recipes.blockcutter.addRecipe(Recipes.inputFactory.forOreDict(BLOCK + name), Collections.singletonList(get(PLATE + name, amount)), null, false);

            BlockCuttingMachineRecipes += 1;
        }
    }

    public static void addBlock(String name, int amount) {
        if (oreNameExists(BLOCK + name) && oreNameExists(PLATE + name)) {
            MorePlates.logger.debug("Adding Block Cutting Machine recipe for: " + getItemName(PLATE + name) + " x" + amount + " from: " + getItemName(BLOCK + name));
            Recipes.blockcutter.addRecipe(Recipes.inputFactory.forOreDict(BLOCK + name), Collections.singletonList(get(PLATE + name, amount)), null, false);

            BlockCuttingMachineRecipes += 1;
        }
    }

    public static void addBlock(String output, String input, int amount, String id) {
        if (notNull(id, input) && oreNameExists(PLATE + output)) {
            MorePlates.logger.debug("Adding Block Cutting Machine recipe for: " + getItemName(PLATE + output) + " x" + amount + " from: " + getItemName(id, input));
            Recipes.blockcutter.addRecipe(Recipes.inputFactory.forStack(get(id, input)), Collections.singletonList(get(PLATE + output, amount)), null, false);

            BlockCuttingMachineRecipes += 1;
        }
    }

    public static void addBlock(String output, String input, int amount, String id, int meta) {
        if (notNull(id, input, meta) && oreNameExists(PLATE + output)) {
            MorePlates.logger.debug("Adding Block Cutting Machine recipe for: " + getItemName(PLATE + output) + " x" + amount + " from: " + getItemName(id, input, 1, meta));
            Recipes.blockcutter.addRecipe(Recipes.inputFactory.forStack(get(id, input, 1, meta)), Collections.singletonList(get(PLATE + output, amount)), null, false);

            BlockCuttingMachineRecipes += 1;
        }
    }
}