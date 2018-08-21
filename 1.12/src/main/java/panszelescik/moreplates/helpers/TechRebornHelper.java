package panszelescik.moreplates.helpers;

import static panszelescik.moreplates.MorePlates.*;
import static panszelescik.moreplates.config.Config.*;

import net.minecraft.item.ItemStack;
import panszelescik.moreplates.plugins.PluginTechReborn;
import reborncore.api.recipe.RecipeHandler;
import techreborn.api.recipe.machines.CompressorRecipe;

public class TechRebornHelper extends Helper {
	
	public static void add(String output, String input, boolean plate) {
		if (plate && getOre(input) != ItemStack.EMPTY) {
			logger.debug(INFO_TECHREBORN + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(input));
			RecipeHandler.addRecipe(new CompressorRecipe(input, getOre(PLATE + output), timeCompressor, energyCompressor));
			
			PluginTechReborn.CompressorRecipes += 1;
		}
	}
	
	public static void add(String output, String input) {
		if (getOre(input) != ItemStack.EMPTY) {
			logger.debug(INFO_TECHREBORN + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(input));
			RecipeHandler.addRecipe(new CompressorRecipe(input, getOre(PLATE + output), timeCompressor, energyCompressor));
			
			PluginTechReborn.CompressorRecipes += 1;
		}
	}
	
	public static void add(String output, String input, String id) {
		if (getItemStack(id, input) != ItemStack.EMPTY) {
			logger.debug(INFO_TECHREBORN + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input));
			RecipeHandler.addRecipe(new CompressorRecipe(getItemStack(id, input), getOre(PLATE + output), timeCompressor, energyCompressor));
			
			PluginTechReborn.CompressorRecipes += 1;
		}
	}
	
	public static void add(String output, String input, String id, int meta) {
		if (getItemStack(id, input, 1, meta) != ItemStack.EMPTY) {
			logger.debug(INFO_TECHREBORN + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input, 1, meta));
			RecipeHandler.addRecipe(new CompressorRecipe(getItemStack(id, input, 1, meta), getOre(PLATE + output), timeCompressor, energyCompressor));
			
			PluginTechReborn.CompressorRecipes += 1;
		}
	}
	
	public static void addGaia(String output, String input) {
		if (getOre(input) != ItemStack.EMPTY) {
			logger.debug(INFO_TECHREBORN + getItemNameFromOre(output + "Plate") + INFO_3 + getItemNameFromOre(input));
			RecipeHandler.addRecipe(new CompressorRecipe(input, getOre(output + "Plate"), timeCompressor, energyCompressor));
			
			PluginTechReborn.CompressorRecipes += 1;
		}
	}
	
	public static void addBlock(String name, int amount, boolean plate) {
		if (plate && getOre(BLOCK + name) != ItemStack.EMPTY) {
			logger.debug(INFO_TECHREBORN + getItemNameFromOre(PLATE + name) + " x" + amount + INFO_3 + getItemNameFromOre(BLOCK + name));
			RecipeHandler.addRecipe(new CompressorRecipe(BLOCK + name, getOre(PLATE + name, amount), timeCompressor, energyCompressor));
			
			PluginTechReborn.CompressorRecipes += 1;
		}
	}
	
	public static void addBlock(String name, int amount) {
		if (getOre(BLOCK + name) != ItemStack.EMPTY) {
			logger.debug(INFO_TECHREBORN + getItemNameFromOre(PLATE + name) + " x" + amount + INFO_3 + getItemNameFromOre(BLOCK + name));
			RecipeHandler.addRecipe(new CompressorRecipe(BLOCK + name, getOre(PLATE + name, amount), timeCompressor, energyCompressor));
			
			PluginTechReborn.CompressorRecipes += 1;
		}
	}
	
	public static void addBlock(String output, String input, int amount, String id) {
		if (getItemStack(id, input) != ItemStack.EMPTY) {
			logger.debug(INFO_TECHREBORN + getItemNameFromOre(PLATE + output) + " x" + amount + INFO_3 + getItemNameFromItemStack(id, input));
			RecipeHandler.addRecipe(new CompressorRecipe(getItemStack(id, input), getOre(PLATE + output, amount), timeCompressor, energyCompressor));
			
			PluginTechReborn.CompressorRecipes += 1;
		}
	}
	
	public static void addBlock(String output, String input, int amount, String id, int meta) {
		if (getItemStack(id, input, 1, meta) != ItemStack.EMPTY) {
			logger.debug(INFO_TECHREBORN + getItemNameFromOre(PLATE + output) + " x" + amount + INFO_3 + getItemNameFromItemStack(id, input, 1, meta));
			RecipeHandler.addRecipe(new CompressorRecipe(getItemStack(id, input, 1, meta), getOre(PLATE + output, amount), timeCompressor, energyCompressor));
			
			PluginTechReborn.CompressorRecipes += 1;
		}
	}	
}