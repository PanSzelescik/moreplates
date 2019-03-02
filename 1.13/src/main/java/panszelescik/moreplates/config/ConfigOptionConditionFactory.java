package panszelescik.moreplates.config;

import com.google.gson.JsonObject;
import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionSerializer;
import panszelescik.moreplates.MorePlates;

import java.util.function.BooleanSupplier;

public class ConfigOptionConditionFactory implements IConditionSerializer {

    public ConfigOptionConditionFactory() {}

    @Override
    public BooleanSupplier parse(JsonObject json) {
        String configSetting = JsonUtils.getString(json, "config_setting");

        switch (configSetting) {
            case "enable_gear":
                return () -> Config.GEAR_RECIPES.get();
            case "enable_plate":
                return () -> Config.PLATE_RECIPES.get();
            case "enable_stick":
                return () -> Config.ROD_RECIPES.get();
            default:
                MorePlates.logger.error("Invalid config setting: " + configSetting);
                MorePlates.logger.error("Setting to true to avoid problems");
                return () -> true;
        }
    }
}