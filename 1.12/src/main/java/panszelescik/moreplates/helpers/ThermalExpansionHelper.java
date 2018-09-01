package panszelescik.moreplates.helpers;

import static panszelescik.moreplates.MorePlates.*;
import static panszelescik.moreplates.config.Config.*;

import java.util.List;

import cofh.thermalexpansion.util.managers.machine.CompactorManager;
import cofh.thermalexpansion.util.managers.machine.CompactorManager.Mode;
import cofh.thermalexpansion.util.managers.machine.SmelterManager;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.plugins.PluginThermalExpansion;

public class ThermalExpansionHelper extends Helper {
	
	static ItemStack sand = new ItemStack(Blocks.SAND);
	static ItemStack slag = getItemStack("thermalfoundation", "material", 1, 864);
	
	public static void add(String output, String inputOre, boolean gear, boolean plate) {
		if (checkIsNotNull(inputOre)) {
			List<ItemStack> inputs = OreDictionary.getOres(inputOre);
			for (ItemStack input : inputs) {
				if (gear && checkIsNotNull(GEAR + output)) {
					logger.debug(INFO_COMPACTOR + getItemNameFromOre(GEAR + output) + INFO_3 + getItemName(input) + " x4");
					CompactorManager.addRecipe(energyCompactor, cloneStack(input, 4), getOre(GEAR + output), Mode.GEAR);
					
					PluginThermalExpansion.CompactorRecipes += 1;
					
					logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(inputOre) + " x4" + INFO_3 + getItemNameFromOre(GEAR + output));
					SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(GEAR + output), cloneStack(getOre(inputOre), 4), slag, 10);
					
					PluginThermalExpansion.InductionSmelterRecipes += 1;
				}
				if (plate && checkIsNotNull(PLATE + output)) {
					logger.debug(INFO_COMPACTOR + getItemNameFromOre(PLATE + output) + INFO_3 + getItemName(input));
					CompactorManager.addRecipe(energyCompactor, input, getOre(PLATE + output), Mode.PLATE);
					
					PluginThermalExpansion.CompactorRecipes += 1;
					
					logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(inputOre) + INFO_3 + getItemNameFromOre(PLATE + output));
					SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(PLATE + output), getOre(inputOre), slag, 10);
					
					PluginThermalExpansion.InductionSmelterRecipes += 1;
				}
			}
		}
	}
	
	public static void add(String output, String inputOre) {
		if (checkIsNotNull(inputOre)) {
			List<ItemStack> inputs = OreDictionary.getOres(inputOre);
			for (ItemStack input : inputs) {
				if (checkIsNotNull(GEAR + output)) {
					logger.debug(INFO_COMPACTOR + getItemNameFromOre(GEAR + output) + INFO_3 + getItemName(input) + " x4");
					CompactorManager.addRecipe(energyCompactor, cloneStack(input, 4), getOre(GEAR + output), Mode.GEAR);
					
					PluginThermalExpansion.CompactorRecipes += 1;
					
					logger.debug(INFO_COMPACTOR + getItemNameFromOre(PLATE + output) + INFO_3 + getItemName(input));
					CompactorManager.addRecipe(energyCompactor, input, getOre(PLATE + output), Mode.PLATE);
					
					PluginThermalExpansion.CompactorRecipes += 1;
				}
				if (checkIsNotNull(PLATE + output)) {
					logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(inputOre) + " x4" + INFO_3 + getItemNameFromOre(GEAR + output));
					SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(GEAR + output), cloneStack(getOre(inputOre), 4), slag, 10);
					
					PluginThermalExpansion.InductionSmelterRecipes += 1;
					
					logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(inputOre) + INFO_3 + getItemNameFromOre(PLATE + output));
					SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(PLATE + output), getOre(inputOre), slag, 10);
					
					PluginThermalExpansion.InductionSmelterRecipes += 1;
				}
			}
		}
	}
	
	public static void add(String output, String input, String id) {
		if (checkIsNotNull(id, input)) {
			if (checkIsNotNull(GEAR + output)) {
				logger.debug(INFO_COMPACTOR + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromItemStack(id, input) + " x4");
				CompactorManager.addRecipe(energyCompactor, getItemStack(id, input, 4), getOre(GEAR + output), Mode.GEAR);
				
				PluginThermalExpansion.CompactorRecipes += 1;
				
				logger.debug(INFO_COMPACTOR + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input));
				CompactorManager.addRecipe(energyCompactor, getItemStack(id, input), getOre(PLATE + output), Mode.PLATE);
				
				PluginThermalExpansion.CompactorRecipes += 1;
			}
			if (checkIsNotNull(PLATE + output)) {
				logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromItemStack(id, input) + " x4" + INFO_3 + getItemNameFromOre(GEAR + output));
				SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(GEAR + output), getItemStack(id, input, 4), slag, 10);
				
				PluginThermalExpansion.InductionSmelterRecipes += 1;
				
				logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromItemStack(id, input) + INFO_3 + getItemNameFromOre(PLATE + output));
				SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(PLATE + output), getItemStack(id, input), slag, 10);
				
				PluginThermalExpansion.InductionSmelterRecipes += 1;
			}
		}
	}
	
	public static void add(String output, String input, String id, int meta) {
		if (checkIsNotNull(id, input, meta)) {
			if (checkIsNotNull(GEAR + output)) {
				logger.debug(INFO_COMPACTOR + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromItemStack(id, input, 1, meta) + " x4");
				CompactorManager.addRecipe(energyCompactor, getItemStack(id, input, 4, meta), getOre(GEAR + output), Mode.GEAR);
				
				PluginThermalExpansion.CompactorRecipes += 1;
				
				logger.debug(INFO_COMPACTOR + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input, 1, meta));
				CompactorManager.addRecipe(energyCompactor, getItemStack(id, input, 1, meta), getOre(PLATE + output), Mode.PLATE);
				
				PluginThermalExpansion.CompactorRecipes += 1;
			}
			if (checkIsNotNull(PLATE + output)) {
				logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromItemStack(id, input, 1, meta) + " x4" + INFO_3 + getItemNameFromOre(GEAR + output));
				SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(GEAR + output), getItemStack(id, input, 4, meta), slag, 10);
				
				PluginThermalExpansion.InductionSmelterRecipes += 1;
				
				logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromItemStack(id, input, 1, meta) + INFO_3 + getItemNameFromOre(PLATE + output));
				SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(PLATE + output), getItemStack(id, input, 1, meta), slag, 10);
				
				PluginThermalExpansion.InductionSmelterRecipes += 1;
			}
		}
	}
	
	public static void addGaia(String output, String input) {
		if (checkIsNotNull(input)) {
			if (checkIsNotNull(output + "Gear")) {
				logger.debug(INFO_COMPACTOR + getItemNameFromOre(output + "Gear") + INFO_3 + getItemNameFromOre(input) + " x4");
				CompactorManager.addRecipe(energyCompactor, getOre(input, 4), getOre(output + "Gear"), Mode.GEAR);
				
				PluginThermalExpansion.CompactorRecipes += 1;
				
				logger.debug(INFO_COMPACTOR + getItemNameFromOre(output + "Plate") + INFO_3 + getItemNameFromOre(input));
				CompactorManager.addRecipe(energyCompactor, getOre(input), getOre(output + "Plate"), Mode.PLATE);
				
				PluginThermalExpansion.CompactorRecipes += 1;
			}
			if (checkIsNotNull(output + "Plate")) {
				logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(input) + " x4" + INFO_3 + getItemNameFromOre(output + "Gear"));
				SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(output + "Gear"), cloneStack(getOre(input), 4), slag, 10);
				
				PluginThermalExpansion.InductionSmelterRecipes += 1;
				
				logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(input) + INFO_3 + getItemNameFromOre(output + "Plate"));
				SmelterManager.addRecipe(energyInductionSmelter, sand, getOre(output + "Plate"), getOre(input), slag, 10);
				
				PluginThermalExpansion.InductionSmelterRecipes += 1;
			}
		}
	}
}