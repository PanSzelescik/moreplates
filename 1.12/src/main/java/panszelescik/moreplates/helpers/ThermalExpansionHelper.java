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

public class ThermalExpansionHelper extends Helper {
	
	public static int CompactorRecipes = 0, InductionSmelterRecipes = 0;
	static ItemStack sand = new ItemStack(Blocks.SAND), slag = getItemStack("thermalfoundation", "material", 1, 864);
	
	public static void add(String output, String inputOre, boolean gear, boolean plate) {
		if (oreNameExists(inputOre)) {
			List<ItemStack> inputs = OreDictionary.getOres(inputOre);
			for (ItemStack input : inputs) {
				if (gear && oreNameExists(GEAR + output)) {
					logger.debug(INFO_COMPACTOR + getItemNameFromOre(GEAR + output) + INFO_3 + getItemName(input) + " x4");
					CompactorManager.addRecipe(energyCompactor(), cloneStack(input, 4), getOre(GEAR + output), Mode.GEAR);
					
					CompactorRecipes += 1;
					
					logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(inputOre) + " x4" + INFO_3 + getItemNameFromOre(GEAR + output));
					SmelterManager.addRecipe(energyInductionSmelter(), sand, getOre(GEAR + output), cloneStack(getOre(inputOre), 4), slag, 10);
					
					InductionSmelterRecipes += 1;
				}
				if (plate && oreNameExists(PLATE + output)) {
					logger.debug(INFO_COMPACTOR + getItemNameFromOre(PLATE + output) + INFO_3 + getItemName(input));
					CompactorManager.addRecipe(energyCompactor(), input, getOre(PLATE + output), Mode.PLATE);
					
					CompactorRecipes += 1;
					
					logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(inputOre) + INFO_3 + getItemNameFromOre(PLATE + output));
					SmelterManager.addRecipe(energyInductionSmelter(), sand, getOre(PLATE + output), getOre(inputOre), slag, 10);
					
					InductionSmelterRecipes += 1;
				}
			}
		}
	}
	
	public static void add(String output, String inputOre) {
		if (oreNameExists(inputOre)) {
			List<ItemStack> inputs = OreDictionary.getOres(inputOre);
			for (ItemStack input : inputs) {
				if (oreNameExists(GEAR + output)) {
					logger.debug(INFO_COMPACTOR + getItemNameFromOre(GEAR + output) + INFO_3 + getItemName(input) + " x4");
					CompactorManager.addRecipe(energyCompactor(), cloneStack(input, 4), getOre(GEAR + output), Mode.GEAR);
					
					CompactorRecipes += 1;
					
					logger.debug(INFO_COMPACTOR + getItemNameFromOre(PLATE + output) + INFO_3 + getItemName(input));
					CompactorManager.addRecipe(energyCompactor(), input, getOre(PLATE + output), Mode.PLATE);
					
					CompactorRecipes += 1;
				}
				if (oreNameExists(PLATE + output)) {
					logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(inputOre) + " x4" + INFO_3 + getItemNameFromOre(GEAR + output));
					SmelterManager.addRecipe(energyInductionSmelter(), sand, getOre(GEAR + output), cloneStack(getOre(inputOre), 4), slag, 10);
					
					InductionSmelterRecipes += 1;
					
					logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(inputOre) + INFO_3 + getItemNameFromOre(PLATE + output));
					SmelterManager.addRecipe(energyInductionSmelter(), sand, getOre(PLATE + output), getOre(inputOre), slag, 10);
					
					InductionSmelterRecipes += 1;
				}
			}
		}
	}
	
	public static void add(String output, String input, String id) {
		if (checkIsNotNull(id, input)) {
			if (oreNameExists(GEAR + output)) {
				logger.debug(INFO_COMPACTOR + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromItemStack(id, input) + " x4");
				CompactorManager.addRecipe(energyCompactor(), getItemStack(id, input, 4), getOre(GEAR + output), Mode.GEAR);
				
				CompactorRecipes += 1;
				
				logger.debug(INFO_COMPACTOR + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input));
				CompactorManager.addRecipe(energyCompactor(), getItemStack(id, input), getOre(PLATE + output), Mode.PLATE);
				
				CompactorRecipes += 1;
			}
			if (oreNameExists(PLATE + output)) {
				logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromItemStack(id, input) + " x4" + INFO_3 + getItemNameFromOre(GEAR + output));
				SmelterManager.addRecipe(energyInductionSmelter(), sand, getOre(GEAR + output), getItemStack(id, input, 4), slag, 10);
				
				InductionSmelterRecipes += 1;
				
				logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromItemStack(id, input) + INFO_3 + getItemNameFromOre(PLATE + output));
				SmelterManager.addRecipe(energyInductionSmelter(), sand, getOre(PLATE + output), getItemStack(id, input), slag, 10);
				
				InductionSmelterRecipes += 1;
			}
		}
	}
	
	public static void add(String output, String input, String id, int meta) {
		if (checkIsNotNull(id, input, meta)) {
			if (oreNameExists(GEAR + output)) {
				logger.debug(INFO_COMPACTOR + getItemNameFromOre(GEAR + output) + INFO_3 + getItemNameFromItemStack(id, input, 1, meta) + " x4");
				CompactorManager.addRecipe(energyCompactor(), getItemStack(id, input, 4, meta), getOre(GEAR + output), Mode.GEAR);
				
				CompactorRecipes += 1;
				
				logger.debug(INFO_COMPACTOR + getItemNameFromOre(PLATE + output) + INFO_3 + getItemNameFromItemStack(id, input, 1, meta));
				CompactorManager.addRecipe(energyCompactor(), getItemStack(id, input, 1, meta), getOre(PLATE + output), Mode.PLATE);
				
				CompactorRecipes += 1;
			}
			if (oreNameExists(PLATE + output)) {
				logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromItemStack(id, input, 1, meta) + " x4" + INFO_3 + getItemNameFromOre(GEAR + output));
				SmelterManager.addRecipe(energyInductionSmelter(), sand, getOre(GEAR + output), getItemStack(id, input, 4, meta), slag, 10);
				
				InductionSmelterRecipes += 1;
				
				logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromItemStack(id, input, 1, meta) + INFO_3 + getItemNameFromOre(PLATE + output));
				SmelterManager.addRecipe(energyInductionSmelter(), sand, getOre(PLATE + output), getItemStack(id, input, 1, meta), slag, 10);
				
				InductionSmelterRecipes += 1;
			}
		}
	}
	
	public static void addGaia(String output, String input) {
		if (oreNameExists(input)) {
			if (oreNameExists(output + "Gear")) {
				logger.debug(INFO_COMPACTOR + getItemNameFromOre(output + "Gear") + INFO_3 + getItemNameFromOre(input) + " x4");
				CompactorManager.addRecipe(energyCompactor(), getOre(input, 4), getOre(output + "Gear"), Mode.GEAR);
				
				CompactorRecipes += 1;
				
				logger.debug(INFO_COMPACTOR + getItemNameFromOre(output + "Plate") + INFO_3 + getItemNameFromOre(input));
				CompactorManager.addRecipe(energyCompactor(), getOre(input), getOre(output + "Plate"), Mode.PLATE);
				
				CompactorRecipes += 1;
			}
			if (oreNameExists(output + "Plate")) {
				logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(input) + " x4" + INFO_3 + getItemNameFromOre(output + "Gear"));
				SmelterManager.addRecipe(energyInductionSmelter(), sand, getOre(output + "Gear"), cloneStack(getOre(input), 4), slag, 10);
				
				InductionSmelterRecipes += 1;
				
				logger.debug(INFO_INDUCTION_SMELTER + getItemNameFromOre(input) + INFO_3 + getItemNameFromOre(output + "Plate"));
				SmelterManager.addRecipe(energyInductionSmelter(), sand, getOre(output + "Plate"), getOre(input), slag, 10);
				
				InductionSmelterRecipes += 1;
			}
		}
	}
	
	private static int energyCompactor() {
		return getInt("Energy in Compactor", CATEGORY_THERMAL, 4000, "Energy used to make Gears and Plates in Compactor");
	}
	
	private static int energyInductionSmelter() {
		return getInt("Energy in Induction Smelter", CATEGORY_THERMAL, 2000, "Energy used to make ingots from Gears and Plates");
	}
}