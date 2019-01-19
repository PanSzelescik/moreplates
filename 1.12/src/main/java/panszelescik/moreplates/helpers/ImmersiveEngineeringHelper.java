package panszelescik.moreplates.helpers;

import blusunrize.immersiveengineering.api.crafting.MetalPressRecipe;
import net.minecraft.item.ItemStack;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.config.Config;
import panszelescik.moreplates.plugins.PluginImmersiveEngineering;

public class ImmersiveEngineeringHelper extends PluginHelper {

    public static int MetalPressRecipes = 0;
    private static ItemStack mold_gear = getMold(1), mold_plate = getMold(0), mold_stick = getMold(2);

    public static void add(String output, String input, boolean gear, boolean plate, boolean stick) {
        if (oreNameExists(input)) {
            if (gear && oreNameExists(GEAR + output)) {
                MorePlates.logger.debug(INFO_IE + getItemName(GEAR + output) + INFO_3 + getItemName(input) + " x4");
                MetalPressRecipe.addRecipe(get(GEAR + output), input, mold_gear, energyMetalPress()).setInputSize(4);

                MetalPressRecipes += 1;
            }
            if (plate && oreNameExists(PLATE + output)) {
                MorePlates.logger.debug(INFO_IE + getItemName(PLATE + output) + INFO_3 + getItemName(input));
                MetalPressRecipe.addRecipe(get(PLATE + output), input, mold_plate, energyMetalPress());

                MetalPressRecipes += 1;
            }
            if (stick && oreNameExists(STICK + output)) {
                MorePlates.logger.debug(INFO_IE + getItemName(STICK + output) + INFO_3 + getItemName(input));
                MetalPressRecipe.addRecipe(get(STICK + output, 2), input, mold_stick, energyMetalPress());

                MetalPressRecipes += 1;
            }
        }
    }

    public static void add(String output, String input) {
        if (oreNameExists(input)) {
            if (oreNameExists(GEAR + output)) {
                MorePlates.logger.debug(INFO_IE + getItemName(GEAR + output) + INFO_3 + getItemName(input) + " x4");
                MetalPressRecipe.addRecipe(get(GEAR + output), input, mold_gear, energyMetalPress()).setInputSize(4);

                MetalPressRecipes += 1;
            }
            if (oreNameExists(PLATE + output)) {
                MorePlates.logger.debug(INFO_IE + getItemName(PLATE + output) + INFO_3 + getItemName(input));
                MetalPressRecipe.addRecipe(get(PLATE + output), input, mold_plate, energyMetalPress());

                MetalPressRecipes += 1;
            }
        }
    }

    public static void add(String output, String input, String id) {
        if (notNull(id, input)) {
            if (oreNameExists(GEAR + output)) {
                MorePlates.logger.debug(INFO_IE + getItemName(GEAR + output) + INFO_3 + getItemName(id, input) + " x4");
                MetalPressRecipe.addRecipe(get(GEAR + output), get(id, input), mold_gear, energyMetalPress()).setInputSize(4);

                MetalPressRecipes += 1;
            }
            if (oreNameExists(PLATE + output)) {
                MorePlates.logger.debug(INFO_IE + getItemName(PLATE + output) + INFO_3 + getItemName(id, input));
                MetalPressRecipe.addRecipe(get(PLATE + output), get(id, input), mold_plate, energyMetalPress());

                MetalPressRecipes += 1;
            }
        }
    }

    public static void add(String output, String input, String id, int meta) {
        if (notNull(id, input, meta)) {
            if (oreNameExists(GEAR + output)) {
                MorePlates.logger.debug(INFO_IE + getItemName(GEAR + output) + INFO_3 + getItemName(id, input, 1, meta) + " x4");
                MetalPressRecipe.addRecipe(get(GEAR + output), get(id, input, 1, meta), mold_gear, energyMetalPress()).setInputSize(4);

                MetalPressRecipes += 1;
            }
            if (oreNameExists(PLATE + output)) {
                MorePlates.logger.debug(INFO_IE + getItemName(PLATE + output) + INFO_3 + getItemName(id, input, 1, meta));
                MetalPressRecipe.addRecipe(get(PLATE + output), get(id, input, 1, meta), mold_plate, energyMetalPress());

                MetalPressRecipes += 1;
            }
        }
    }

    public static void addGaia(String output, String input) {
        if (oreNameExists(input)) {
            if (oreNameExists(output + "Gear")) {
                MorePlates.logger.debug(INFO_IE + getItemName(output + "Gear") + INFO_3 + getItemName(input) + " x4");
                MetalPressRecipe.addRecipe(get(output + "Gear"), get(input), mold_gear, energyMetalPress()).setInputSize(4);

                MetalPressRecipes += 1;
            }
            if (oreNameExists(output + "Plate")) {
                MorePlates.logger.debug(INFO_IE + getItemName(output + "Plate") + INFO_3 + getItemName(input));
                MetalPressRecipe.addRecipe(get(output + "Plate"), input, mold_plate, energyMetalPress());

                MetalPressRecipes += 1;
            }
        }
    }

    private static int energyMetalPress() {
        return Config.getInt("Energy in Metal Press", Config.CATEGORY_IMMERSIVE, 2400, "Energy used to make Gears and Plates in Metal Press");
    }

    private static ItemStack getMold(int meta) {
        return get(PluginImmersiveEngineering.MODID, "mold", 1, meta);
    }
}