package panszelescik.moreplates.helpers;

import cofh.thermalexpansion.util.managers.machine.CompactorManager;
import cofh.thermalexpansion.util.managers.machine.CompactorManager.Mode;
import cofh.thermalexpansion.util.managers.machine.SmelterManager;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.config.Config;

import static panszelescik.moreplates.helpers.ItemInfo.Type.*;

import java.util.List;

public class ThermalExpansionHelper extends PluginHelper {

    public static int CompactorRecipes = 0, InductionSmelterRecipes = 0;
    private static ItemStack sand = new ItemStack(Blocks.SAND), slag = get("thermalfoundation", "material", 1, 864);

    public static void add(String output, String inputOre, boolean gear, boolean plate) {
        if (oreNameExists(inputOre)) {
            List<ItemStack> inputs = OreDictionary.getOres(inputOre);
            for (ItemStack input : inputs) {
                if (gear && oreNameExists(GEAR + output)) {
                    MorePlates.logger.debug("Adding Compactor recipe for: " + getItemName(GEAR + output) + " from: " + getItemName(input) + " x4");
                    CompactorManager.addRecipe(energyCompactor(), cloneStack(input, 4), get(GEAR + output), Mode.GEAR);

                    CompactorRecipes += 1;

                    MorePlates.logger.debug("Adding Induction Smelter recipe for: " + getItemName(inputOre) + " x4 from: " + getItemName(GEAR + output));
                    SmelterManager.addRecipe(energyInductionSmelter(), sand, get(GEAR + output), cloneStack(get(inputOre), 4), slag, 10);

                    InductionSmelterRecipes += 1;
                }
                if (plate && oreNameExists(PLATE + output)) {
                    MorePlates.logger.debug("Adding Compactor recipe for: " + getItemName(PLATE + output) + " from: " + getItemName(input));
                    CompactorManager.addRecipe(energyCompactor(), input, get(PLATE + output), Mode.PLATE);

                    CompactorRecipes += 1;

                    MorePlates.logger.debug("Adding Induction Smelter recipe for: " + getItemName(inputOre) + " from: " + getItemName(PLATE + output));
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
                    MorePlates.logger.debug("Adding Compactor recipe for: " + getItemName(GEAR + output) + " from: " + getItemName(input) + " x4");
                    CompactorManager.addRecipe(energyCompactor(), cloneStack(input, 4), get(GEAR + output), Mode.GEAR);

                    CompactorRecipes += 1;

                    MorePlates.logger.debug("Adding Compactor recipe for: " + getItemName(PLATE + output) + " from: " + getItemName(input));
                    CompactorManager.addRecipe(energyCompactor(), input, get(PLATE + output), Mode.PLATE);

                    CompactorRecipes += 1;
                }
                if (oreNameExists(PLATE + output)) {
                    MorePlates.logger.debug("Adding Induction Smelter recipe for: " + getItemName(inputOre) + " x4 from: " + getItemName(GEAR + output));
                    SmelterManager.addRecipe(energyInductionSmelter(), sand, get(GEAR + output), cloneStack(get(inputOre), 4), slag, 10);

                    InductionSmelterRecipes += 1;

                    MorePlates.logger.debug("Adding Induction Smelter recipe for: " + getItemName(inputOre) + " from: " + getItemName(PLATE + output));
                    SmelterManager.addRecipe(energyInductionSmelter(), sand, get(PLATE + output), get(inputOre), slag, 10);

                    InductionSmelterRecipes += 1;
                }
            }
        }
    }

    public static void add(String output, String input, String id, int meta) {
        if (notNull(id, input, meta)) {
            if (oreNameExists(GEAR + output)) {
                MorePlates.logger.debug("Adding Compactor recipe for: " + getItemName(GEAR + output) + " from: " + getItemName(id, input, 1, meta) + " x4");
                CompactorManager.addRecipe(energyCompactor(), get(id, input, 4, meta), get(GEAR + output), Mode.GEAR);

                CompactorRecipes += 1;

                MorePlates.logger.debug("Adding Compactor recipe for: " + getItemName(PLATE + output) + " from: " + getItemName(id, input, 1, meta));
                CompactorManager.addRecipe(energyCompactor(), get(id, input, 1, meta), get(PLATE + output), Mode.PLATE);

                CompactorRecipes += 1;
            }
            if (oreNameExists(PLATE + output)) {
                MorePlates.logger.debug("Adding Induction Smelter recipe for: " + getItemName(id, input, 1, meta) + " x4 from: " + getItemName(GEAR + output));
                SmelterManager.addRecipe(energyInductionSmelter(), sand, get(GEAR + output), get(id, input, 4, meta), slag, 10);

                InductionSmelterRecipes += 1;

                MorePlates.logger.debug("Adding Induction Smelter recipe for: " + getItemName(id, input, 1, meta) + " from: " + getItemName(PLATE + output));
                SmelterManager.addRecipe(energyInductionSmelter(), sand, get(PLATE + output), get(id, input, 1, meta), slag, 10);

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