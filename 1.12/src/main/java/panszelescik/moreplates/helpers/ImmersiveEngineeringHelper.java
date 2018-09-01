package panszelescik.moreplates.helpers;

import static panszelescik.moreplates.MorePlates.*;
import static panszelescik.moreplates.config.Config.*;

import blusunrize.immersiveengineering.api.crafting.MetalPressRecipe;
import net.minecraft.item.ItemStack;
import panszelescik.moreplates.plugins.PluginImmersiveEngineering;

public class ImmersiveEngineeringHelper extends Helper {
	
	public static int MetalPressRecipes = 0;
	
	static ItemStack mold_gear = getItemStack(PluginImmersiveEngineering.MODID, "mold", 1, 1);
	static ItemStack mold_plate = getItemStack(PluginImmersiveEngineering.MODID, "mold", 1, 0);
	
	public static void add(String output, String input, boolean gear, boolean plate) {
		if (checkIsNotNull(input)) {
			if (gear && checkIsNotNull(GEAR + output)) {
				logger.debug(INFO_IE + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromOre(input) + " x4");
				MetalPressRecipe.addRecipe(getOre(GEAR + output), input, mold_gear, energyMetalPress()).setInputSize(4);
				
				MetalPressRecipes += 1;
			}
			if (plate && checkIsNotNull(PLATE + output)) {
				logger.debug(INFO_IE + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(input));
				MetalPressRecipe.addRecipe(getOre(PLATE + output), input, mold_plate, energyMetalPress());
				
				MetalPressRecipes += 1;
			}
		}
	}
	
	public static void add(String output, String input) {
		if (checkIsNotNull(input)) {
			if (checkIsNotNull(GEAR + output)) {
				logger.debug(INFO_IE + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromOre(input) + " x4");
				MetalPressRecipe.addRecipe(getOre(GEAR + output), input, mold_gear, energyMetalPress()).setInputSize(4);
				
				MetalPressRecipes += 1;
			}
			if (checkIsNotNull(PLATE + output)) {
				logger.debug(INFO_IE + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromOre(input));
				MetalPressRecipe.addRecipe(getOre(PLATE + output), input, mold_plate, energyMetalPress());
				
				MetalPressRecipes += 1;
			}
		}
	}
	
	public static void add(String output, String input, String id) {
		if (checkIsNotNull(id, input)) {
			if (checkIsNotNull(GEAR + output)) {
				logger.debug(INFO_IE + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromItemStack(id, input) + " x4");
				MetalPressRecipe.addRecipe(getOre(GEAR + output), getItemStack(id, input), mold_gear, energyMetalPress()).setInputSize(4);
				
				MetalPressRecipes += 1;
			}
			if (checkIsNotNull(PLATE + output)) {
				logger.debug(INFO_IE + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input));
				MetalPressRecipe.addRecipe(getOre(PLATE + output), getItemStack(id, input), mold_plate, energyMetalPress());
				
				MetalPressRecipes += 1;
			}
		}
	}
	
	public static void add(String output, String input, String id, int meta) {
		if (checkIsNotNull(id, input, meta)) {
			if (checkIsNotNull(GEAR + output)) {
				logger.debug(INFO_IE + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromItemStack(id, input, 1, meta) + " x4");
				MetalPressRecipe.addRecipe(getOre(GEAR + output), getItemStack(id, input, 1, meta), mold_gear, energyMetalPress()).setInputSize(4);
				
				MetalPressRecipes += 1;
			}
			if (checkIsNotNull(PLATE + output)) {
				logger.debug(INFO_IE + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input, 1, meta));
				MetalPressRecipe.addRecipe(getOre(PLATE + output), getItemStack(id, input, 1, meta), mold_plate, energyMetalPress());
				
				MetalPressRecipes += 1;
			}
		}
	}
	
	public static void addGaia(String output, String input) {
		if (checkIsNotNull(input)) {
			if (checkIsNotNull(output + "Gear")) {
				logger.debug(INFO_IE + getItemNameFromOre(output + "Gear") + INFO_3 + getItemNameFromOre(input) + " x4");
				MetalPressRecipe.addRecipe(getOre(output + "Gear"), getOre(input), mold_gear, energyMetalPress()).setInputSize(4);
				
				MetalPressRecipes += 1;
			}
			if (checkIsNotNull(output + "Plate")) {
				logger.debug(INFO_IE + getItemNameFromOre(output + "Plate") + INFO_3 + getItemNameFromOre(input));
				MetalPressRecipe.addRecipe(getOre(output + "Plate"), input, mold_plate, energyMetalPress());
				
				MetalPressRecipes += 1;
			}
		}
	}
	
	private static int energyMetalPress() {
		return getInt("Energy in Metal Press", CATEGORY_IMMERSIVE, 2400, "Energy used to make Gears and Plates in Metal Press");
	}
}