package panszelescik.moreplates.helpers;

import cofh.thermalexpansion.util.managers.machine.CompactorManager;
import cofh.thermalexpansion.util.managers.machine.CompactorManager.Mode;
import cofh.thermalexpansion.util.managers.machine.SmelterManager;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.config.Config;

import java.util.List;

public class ThermalExpansionHelper extends PluginHelper {

    public static int CompactorRecipes = 0, InductionSmelterRecipes = 0;
    private static ItemStack sand = new ItemStack(Blocks.SAND), slag = get("thermalfoundation", "material", 1, 864);

    public static void add(String output, String inputOre, boolean gear, boolean plate) {
        if (oreNameExists(inputOre)) {
            List<ItemStack> inputs = OreDictionary.getOres(inputOre);
            for (ItemStack input : inputs) {
                if (gear && oreNameExists(GEAR + output)) {
                    MorePlates.logger.debug(INFO_COMPACTOR + getItemName(GEAR + output) + INFO_3 + getItemName(input) + " x4");
                    CompactorManager.addRecipe(energyCompactor(), cloneStack(input, 4), get(GEAR + output), Mode.GEAR);

                    CompactorRecipes += 1;

                    MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemName(inputOre) + " x4" + INFO_3 + getItemName(GEAR + output));
                    SmelterManager.addRecipe(energyInductionSmelter(), sand, get(GEAR + output), cloneStack(get(inputOre), 4), slag, 10);

                    InductionSmelterRecipes += 1;
                }
                if (plate && oreNameExists(PLATE + output)) {
                    MorePlates.logger.debug(INFO_COMPACTOR + getItemName(PLATE + output) + INFO_3 + getItemName(input));
                    CompactorManager.addRecipe(energyCompactor(), input, get(PLATE + output), Mode.PLATE);

                    CompactorRecipes += 1;

                    MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemName(inputOre) + INFO_3 + getItemName(PLATE + output));
                    SmelterManager.addRecipe(energyInductionSmelter(), sand, get(PLATE + output), get(inputOre), slag, 10);

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
                    MorePlates.logger.debug(INFO_COMPACTOR + getItemName(GEAR + output) + INFO_3 + getItemName(input) + " x4");
                    CompactorManager.addRecipe(energyCompactor(), cloneStack(input, 4), get(GEAR + output), Mode.GEAR);

                    CompactorRecipes += 1;

                    MorePlates.logger.debug(INFO_COMPACTOR + getItemName(PLATE + output) + INFO_3 + getItemName(input));
                    CompactorManager.addRecipe(energyCompactor(), input, get(PLATE + output), Mode.PLATE);

                    CompactorRecipes += 1;
                }
                if (oreNameExists(PLATE + output)) {
                    MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemName(inputOre) + " x4" + INFO_3 + getItemName(GEAR + output));
                    SmelterManager.addRecipe(energyInductionSmelter(), sand, get(GEAR + output), cloneStack(get(inputOre), 4), slag, 10);

                    InductionSmelterRecipes += 1;

                    MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemName(inputOre) + INFO_3 + getItemName(PLATE + output));
                    SmelterManager.addRecipe(energyInductionSmelter(), sand, get(PLATE + output), get(inputOre), slag, 10);

                    InductionSmelterRecipes += 1;
                }
            }
        }
    }

    public static void add(String output, String input, String id) {
        if (notNull(id, input)) {
            if (oreNameExists(GEAR + output)) {
                MorePlates.logger.debug(INFO_COMPACTOR + getItemName(GEAR + output) + INFO_3 + getItemName(id, input) + " x4");
                CompactorManager.addRecipe(energyCompactor(), get(id, input, 4), get(GEAR + output), Mode.GEAR);

                CompactorRecipes += 1;

                MorePlates.logger.debug(INFO_COMPACTOR + getItemName(PLATE + output) + INFO_3 + getItemName(id, input));
                CompactorManager.addRecipe(energyCompactor(), get(id, input), get(PLATE + output), Mode.PLATE);

                CompactorRecipes += 1;
            }
            if (oreNameExists(PLATE + output)) {
                MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemName(id, input) + " x4" + INFO_3 + getItemName(GEAR + output));
                SmelterManager.addRecipe(energyInductionSmelter(), sand, get(GEAR + output), get(id, input, 4), slag, 10);

                InductionSmelterRecipes += 1;

                MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemName(id, input) + INFO_3 + getItemName(PLATE + output));
                SmelterManager.addRecipe(energyInductionSmelter(), sand, get(PLATE + output), get(id, input), slag, 10);

                InductionSmelterRecipes += 1;
            }
        }
    }

    public static void add(String output, String input, String id, int meta) {
        if (notNull(id, input, meta)) {
            if (oreNameExists(GEAR + output)) {
                MorePlates.logger.debug(INFO_COMPACTOR + getItemName(GEAR + output) + INFO_3 + getItemName(id, input, 1, meta) + " x4");
                CompactorManager.addRecipe(energyCompactor(), get(id, input, 4, meta), get(GEAR + output), Mode.GEAR);

                CompactorRecipes += 1;

                MorePlates.logger.debug(INFO_COMPACTOR + getItemName(PLATE + output) + INFO_3 + getItemName(id, input, 1, meta));
                CompactorManager.addRecipe(energyCompactor(), get(id, input, 1, meta), get(PLATE + output), Mode.PLATE);

                CompactorRecipes += 1;
            }
            if (oreNameExists(PLATE + output)) {
                MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemName(id, input, 1, meta) + " x4" + INFO_3 + getItemName(GEAR + output));
                SmelterManager.addRecipe(energyInductionSmelter(), sand, get(GEAR + output), get(id, input, 4, meta), slag, 10);

                InductionSmelterRecipes += 1;

                MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemName(id, input, 1, meta) + INFO_3 + getItemName(PLATE + output));
                SmelterManager.addRecipe(energyInductionSmelter(), sand, get(PLATE + output), get(id, input, 1, meta), slag, 10);

                InductionSmelterRecipes += 1;
            }
        }
    }

    public static void addGaia(String output, String input) {
        if (oreNameExists(input)) {
            if (oreNameExists(output + "Gear")) {
                MorePlates.logger.debug(INFO_COMPACTOR + getItemName(output + "Gear") + INFO_3 + getItemName(input) + " x4");
                CompactorManager.addRecipe(energyCompactor(), get(input, 4), get(output + "Gear"), Mode.GEAR);

                CompactorRecipes += 1;

                MorePlates.logger.debug(INFO_COMPACTOR + getItemName(output + "Plate") + INFO_3 + getItemName(input));
                CompactorManager.addRecipe(energyCompactor(), get(input), get(output + "Plate"), Mode.PLATE);

                CompactorRecipes += 1;
            }
            if (oreNameExists(output + "Plate")) {
                MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemName(input) + " x4" + INFO_3 + getItemName(output + "Gear"));
                SmelterManager.addRecipe(energyInductionSmelter(), sand, get(output + "Gear"), cloneStack(get(input), 4), slag, 10);

                InductionSmelterRecipes += 1;

                MorePlates.logger.debug(INFO_INDUCTION_SMELTER + getItemName(input) + INFO_3 + getItemName(output + "Plate"));
                SmelterManager.addRecipe(energyInductionSmelter(), sand, get(output + "Plate"), get(input), slag, 10);

                InductionSmelterRecipes += 1;
            }
        }
    }

    private static int energyCompactor() {
        return MorePlates.config.getInt("Energy in Compactor", Config.CATEGORY_THERMAL, 4000, "Energy used to make Gears and Plates in Compactor");
    }

    private static int energyInductionSmelter() {
        return MorePlates.config.getInt("Energy in Induction Smelter", Config.CATEGORY_THERMAL, 2000, "Energy used to make ingots from Gears and Plates");
    }
}