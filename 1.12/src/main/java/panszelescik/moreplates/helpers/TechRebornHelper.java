package panszelescik.moreplates.helpers;

import static panszelescik.moreplates.MorePlates.*;
import static panszelescik.moreplates.config.Config.*;

import reborncore.api.recipe.RecipeHandler;
import techreborn.api.recipe.machines.CompressorRecipe;

public class TechRebornHelper extends Helper {
	
	public static int CompressorRecipes = 0;
	
	public static void add(String output, String input, boolean plate) {
		if (oreNameExists(input) && plate && oreNameExists(PLATE + output)) {
			logger.debug(INFO_TECHREBORN + getItemName(PLATE + output) + INFO_3 + getItemName(input));
			RecipeHandler.addRecipe(new CompressorRecipe(input, get(PLATE + output), timeCompressor(), energyCompressor()));
			
			CompressorRecipes += 1;
		}
	}
	
	public static void add(String output, String input) {
		if (oreNameExists(input) && oreNameExists(PLATE + output)) {
			logger.debug(INFO_TECHREBORN + getItemName(PLATE + output) + INFO_3 + getItemName(input));
			RecipeHandler.addRecipe(new CompressorRecipe(input, get(PLATE + output), timeCompressor(), energyCompressor()));
			
			CompressorRecipes += 1;
		}
	}
	
	public static void add(String output, String input, String id) {
		if (notNull(id, input) && oreNameExists(PLATE + output)) {
			logger.debug(INFO_TECHREBORN + getItemName(PLATE + output) + INFO_3 + getItemName(id, input));
			RecipeHandler.addRecipe(new CompressorRecipe(get(id, input), get(PLATE + output), timeCompressor(), energyCompressor()));
			
			CompressorRecipes += 1;
		}
	}
	
	public static void add(String output, String input, String id, int meta) {
		if (notNull(id, input, meta)) {
			logger.debug(INFO_TECHREBORN + getItemName(PLATE + output) + INFO_3 + getItemName(id, input, 1, meta));
			RecipeHandler.addRecipe(new CompressorRecipe(get(id, input, 1, meta), get(PLATE + output), timeCompressor(), energyCompressor()));
			
			CompressorRecipes += 1;
		}
	}
	
	public static void addGaia(String output, String input) {
		if (oreNameExists(input) && oreNameExists(output + "Plate")) {
			logger.debug(INFO_TECHREBORN + getItemName(output + "Plate") + INFO_3 + getItemName(input));
			RecipeHandler.addRecipe(new CompressorRecipe(input, get(output + "Plate"), timeCompressor(), energyCompressor()));
			
			CompressorRecipes += 1;
		}
	}
	
	public static void addBlock(String name, int amount, boolean plate) {
		if (oreNameExists(BLOCK + name) && plate && oreNameExists(PLATE + name)) {
			logger.debug(INFO_TECHREBORN + getItemName(PLATE + name) + " x" + amount + INFO_3 + getItemName(BLOCK + name));
			RecipeHandler.addRecipe(new CompressorRecipe(BLOCK + name, get(PLATE + name, amount), timeCompressor(), energyCompressor()));
			
			CompressorRecipes += 1;
		}
	}
	
	public static void addBlock(String name, int amount) {
		if (oreNameExists(BLOCK + name) && oreNameExists(PLATE + name)) {
			logger.debug(INFO_TECHREBORN + getItemName(PLATE + name) + " x" + amount + INFO_3 + getItemName(BLOCK + name));
			RecipeHandler.addRecipe(new CompressorRecipe(BLOCK + name, get(PLATE + name, amount), timeCompressor(), energyCompressor()));
			
			CompressorRecipes += 1;
		}
	}
	
	public static void addBlock(String output, String input, int amount, String id) {
		if (notNull(id, input) && oreNameExists(PLATE + output)) {
			logger.debug(INFO_TECHREBORN + getItemName(PLATE + output) + " x" + amount + INFO_3 + getItemName(id, input));
			RecipeHandler.addRecipe(new CompressorRecipe(get(id, input), get(PLATE + output, amount), timeCompressor(), energyCompressor()));
			
			CompressorRecipes += 1;
		}
	}
	
	public static void addBlock(String output, String input, int amount, String id, int meta) {
		if (notNull(id, input, meta) && oreNameExists(PLATE + output)) {
			logger.debug(INFO_TECHREBORN + getItemName(PLATE + output) + " x" + amount + INFO_3 + getItemName(id, input, 1, meta));
			RecipeHandler.addRecipe(new CompressorRecipe(get(id, input, 1, meta), get(PLATE + output, amount), timeCompressor(), energyCompressor()));
			
			CompressorRecipes += 1;
		}
	}
	
	private static int energyCompressor() {
		return getInt("Energy in Compressor", CATEGORY_TECHREBORN, 4, "Energy used to make some Plates in Compressor (in EU/t)");
	}
	
	private static int timeCompressor() {
		return getInt("Time in Compressor", CATEGORY_TECHREBORN, 300, "Time in ticks to craft some Plates in Compressor");
	}
}