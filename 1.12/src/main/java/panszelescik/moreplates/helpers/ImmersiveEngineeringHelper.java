package panszelescik.moreplates.helpers;

import static panszelescik.moreplates.MorePlates.*;
import static panszelescik.moreplates.config.Config.*;

import blusunrize.immersiveengineering.api.crafting.MetalPressRecipe;
import net.minecraft.item.ItemStack;
import panszelescik.moreplates.plugins.PluginImmersiveEngineering;

public class ImmersiveEngineeringHelper extends Helper {
	
	static ItemStack mold_gear = getItemStack(PluginImmersiveEngineering.MODID, "mold", 1, 1);
	static ItemStack mold_plate = getItemStack(PluginImmersiveEngineering.MODID, "mold", 1, 0);
	
	public static void add(String output, String inputOre, boolean gear, boolean plate) {
		if (gear && getOre(inputOre) != ItemStack.EMPTY) {
			logger.debug(INFO_IE + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromOre(inputOre) + " x4");
			MetalPressRecipe.addRecipe(getOre(GEAR + output), inputOre, mold_gear, energyMetalPress).setInputSize(4);
			
			PluginImmersiveEngineering.MetalPressRecipes += 1;
		}
		if (plate && getOre(inputOre) != ItemStack.EMPTY) {
			logger.debug(INFO_IE + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(inputOre));
			MetalPressRecipe.addRecipe(getOre(PLATE + output), inputOre, mold_plate, energyMetalPress);
			
			PluginImmersiveEngineering.MetalPressRecipes += 1;
		}
	}
	
	public static void add(String output, String inputOre) {
		if (getOre(inputOre) != ItemStack.EMPTY) {
			logger.debug(INFO_IE + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromOre(inputOre) + " x4");
			MetalPressRecipe.addRecipe(getOre(GEAR + output), inputOre, mold_gear, energyMetalPress).setInputSize(4);
			
			PluginImmersiveEngineering.MetalPressRecipes += 1;
			
			logger.debug(INFO_IE + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(inputOre));
			MetalPressRecipe.addRecipe(getOre(PLATE + output), inputOre, mold_plate, energyMetalPress);
			
			PluginImmersiveEngineering.MetalPressRecipes += 1;
		}
	}
	
	public static void add(String output, String input, String id) {
		if (getItemStack(id, input) != ItemStack.EMPTY) {
			logger.debug(INFO_IE + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromItemStack(id, input) + " x4");
			MetalPressRecipe.addRecipe(getOre(GEAR + output), getItemStack(id, input), mold_gear, energyMetalPress).setInputSize(4);
			
			PluginImmersiveEngineering.MetalPressRecipes += 1;
			
			logger.debug(INFO_IE + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input));
			MetalPressRecipe.addRecipe(getOre(PLATE + output), getItemStack(id, input), mold_plate, energyMetalPress);
			
			PluginImmersiveEngineering.MetalPressRecipes += 1;
		}
	}
	
	public static void add(String output, String input, String id, int meta) {
		if (getItemStack(id, input, 1, meta) != ItemStack.EMPTY) {
			logger.debug(INFO_IE + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromItemStack(id, input, 1, meta) + " x4");
			MetalPressRecipe.addRecipe(getOre(GEAR + output), getItemStack(id, input, 1, meta), mold_gear, energyMetalPress).setInputSize(4);
			
			PluginImmersiveEngineering.MetalPressRecipes += 1;
			
			logger.debug(INFO_IE + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input, 1, meta));
			MetalPressRecipe.addRecipe(getOre(PLATE + output), getItemStack(id, input, 1, meta), mold_plate, energyMetalPress);
			
			PluginImmersiveEngineering.MetalPressRecipes += 1;
		}
	}
	
	public static void addGaia(String output, String input) {
		if (getOre(input) != ItemStack.EMPTY) {
			logger.debug(INFO_IE + getItemNameFromOre(output + "Gear") + INFO_3 + getItemNameFromOre(input) + " x4");
			MetalPressRecipe.addRecipe(getOre(output + "Gear"), getOre(input), mold_gear, energyMetalPress).setInputSize(4);
			
			PluginImmersiveEngineering.MetalPressRecipes += 1;
			
			logger.debug(INFO_IE + getItemNameFromOre(output + "Plate") + INFO_3 + getItemNameFromOre(input));
			MetalPressRecipe.addRecipe(getOre(output + "Plate"), input, mold_plate, energyMetalPress);
			
			PluginImmersiveEngineering.MetalPressRecipes += 1;
		}
	}
}