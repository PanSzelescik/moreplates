package panszelescik.moreplates.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {

    public static ForgeConfigSpec.IntValue DURABILITY_HAMMER;
    public static ForgeConfigSpec.BooleanValue GEAR_RECIPES;
    public static ForgeConfigSpec.BooleanValue PLATE_RECIPES;
    public static ForgeConfigSpec.BooleanValue ROD_RECIPES;

    public static void init(ForgeConfigSpec.Builder SERVER_BUILDER) {
        DURABILITY_HAMMER = SERVER_BUILDER
                .comment("Durability of Hammer")
                .defineInRange("hammer.durability", 150, 1, Integer.MAX_VALUE);
        GEAR_RECIPES = SERVER_BUILDER
                .comment("Set this to false, to disable all crafting recipes for Gears")
                .define("recipes.enable_gear", true);
        PLATE_RECIPES = SERVER_BUILDER
                .comment("Set this to false, to disable all crafting recipes for Plates")
                .define("recipes.enable_plate", true);
        ROD_RECIPES = SERVER_BUILDER
                .comment("Set this to false, to disable all crafting recipes for Rods")
                .define("recipes.enable_rod", true);
    }
}
