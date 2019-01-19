package panszelescik.moreplates.config;

import com.google.gson.JsonObject;
import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;
import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.plugins.PluginImmersiveEngineering;
import panszelescik.moreplates.plugins.PluginIndustrialCraft2;

import java.util.function.BooleanSupplier;

public class ConfigOptionConditionFactory implements IConditionFactory {

    @Override
    public BooleanSupplier parse(JsonContext context, JsonObject json) {
        String configSetting = JsonUtils.getString(json, "config_setting");

        switch (configSetting) {
            case "enableIC2Hammer":
                if (PluginHelper.isLoaded(PluginIndustrialCraft2.MODID))
                    return () -> Config.getBoolean("Enable IC2 Hammer", Config.CATEGORY_IC2, "Enable this to add option to make all Plates with Forge Hammer");
                else
                    return () -> false;
            case "enableIEHammer":
                if (PluginHelper.isLoaded(PluginImmersiveEngineering.MODID))
                    return () -> Config.getBoolean("Enable IE Hammer", Config.CATEGORY_IMMERSIVE, "Enable this to add option to make all Plates with Engineer's Hammer");
                else
                    return () -> false;
            case "enableGear":
                return () -> Config.getBoolean("Enable Gear recipes", Config.CATEGORY_GENERAL, "Set this to false, to disable all crafting recipes for Gears");
            case "enablePlate":
                return () -> Config.getBoolean("Enable Plate recipes", Config.CATEGORY_GENERAL, "Set this to false, to disable all crafting recipes for Plates");
            case "enableStick":
                return () -> Config.getBoolean("Enable Rod recipes", Config.CATEGORY_GENERAL, "Set this to false, to disable all crafting recipes for Rods");
            default:
                throw new RuntimeException("Invalid config setting: " + configSetting);
        }
    }
}