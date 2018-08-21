package panszelescik.moreplates.helpers;

import static panszelescik.moreplates.MorePlates.*;

import java.util.Collections;

import ic2.api.recipe.Recipes;
import net.minecraft.item.ItemStack;
import panszelescik.moreplates.plugins.PluginIndustrialCraft2;

public class IndustrialCraft2Helper extends Helper {
	
	public static void add(String output, String input, boolean plate) {
		if (plate && getOre(input) != ItemStack.EMPTY) {
			logger.debug(INFO_FORMER_IC2 + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(input));
			Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forOreDict(input), Collections.singletonList(getOre(PLATE + output)), null, false);
			
			PluginIndustrialCraft2.MetalFormerRecipes += 1;
		}
	}
	
	public static void add(String output, String input) {
		if (getOre(input) != ItemStack.EMPTY) {
			logger.debug(INFO_FORMER_IC2 + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(input));
			Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forOreDict(input), Collections.singletonList(getOre(PLATE + output)), null, false);
			
			PluginIndustrialCraft2.MetalFormerRecipes += 1;
		}
	}
	
	public static void add(String output, String input, String id) {
		if (getItemStack(id, input) != ItemStack.EMPTY) {
			logger.debug(INFO_FORMER_IC2 + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input));
			Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forStack(getItemStack(id, input)), Collections.singletonList(getOre(PLATE + output)), null, false);
			
			PluginIndustrialCraft2.MetalFormerRecipes += 1;
		}
	}
	
	public static void add(String output, String input, String id, int meta) {
		if (getItemStack(id, input, 1, meta) != ItemStack.EMPTY) {
			logger.debug(INFO_FORMER_IC2 + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input, 1, meta));
			Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forStack(getItemStack(id, input, 1, meta)), Collections.singletonList(getOre(PLATE + output)), null, false);
			
			PluginIndustrialCraft2.MetalFormerRecipes += 1;
		}
	}
	
	public static void addGaia(String output, String input) {
		if (getOre(input) != ItemStack.EMPTY) {
			logger.debug(INFO_FORMER_IC2 + getItemNameFromOre(output + "Plate") + INFO_3 + getItemNameFromOre(input));
			Recipes.metalformerRolling.addRecipe(Recipes.inputFactory.forOreDict(input), Collections.singletonList(getOre(output + "Plate")), null, false);
			
			PluginIndustrialCraft2.MetalFormerRecipes += 1;
		}
	}
	
	public static void addBlock(String name, int amount, boolean plate) {
		if (plate && getOre(BLOCK + name) != ItemStack.EMPTY) {
			logger.debug(INFO_CUTTING_IC2 + getItemNameFromOre(PLATE + name) + " x" + amount + INFO_3 + getItemNameFromOre(BLOCK + name));
			Recipes.blockcutter.addRecipe(Recipes.inputFactory.forOreDict(BLOCK + name), Collections.singletonList(getOre(PLATE + name, amount)), null, false);
			
			PluginIndustrialCraft2.BlockCuttingMachineRecipes += 1;
		}
	}
	
	public static void addBlock(String name, int amount) {
		if (getOre(BLOCK + name) != ItemStack.EMPTY) {
			logger.debug(INFO_CUTTING_IC2 + getItemNameFromOre(PLATE + name) + " x" + amount + INFO_3 + getItemNameFromOre(BLOCK + name));
			Recipes.blockcutter.addRecipe(Recipes.inputFactory.forOreDict(BLOCK + name), Collections.singletonList(getOre(PLATE + name, amount)), null, false);
			
			PluginIndustrialCraft2.BlockCuttingMachineRecipes += 1;
		}
	}
	
	public static void addBlock(String output, String input, int amount, String id) {
		if (getItemStack(id, input) != ItemStack.EMPTY) {
			logger.debug(INFO_CUTTING_IC2 + getItemNameFromOre(PLATE + output) + " x" + amount + INFO_3 + getItemNameFromItemStack(id, input));
			Recipes.blockcutter.addRecipe(Recipes.inputFactory.forStack(getItemStack(id, input)), Collections.singletonList(getOre(PLATE + output, amount)), null, false);
			
			PluginIndustrialCraft2.BlockCuttingMachineRecipes += 1;
		}
	}
	
	public static void addBlock(String output, String input, int amount, String id, int meta) {
		if (getItemStack(id, input, 1, meta) != ItemStack.EMPTY) {
			logger.debug(INFO_CUTTING_IC2 + getItemNameFromOre(PLATE + output) + " x" + amount + INFO_3 + getItemNameFromItemStack(id, input, 1, meta));
			Recipes.blockcutter.addRecipe(Recipes.inputFactory.forStack(getItemStack(id, input, 1, meta)), Collections.singletonList(getOre(PLATE + output, amount)), null, false);
			
			PluginIndustrialCraft2.BlockCuttingMachineRecipes += 1;
		}
	}
}