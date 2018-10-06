package panszelescik.moreplates.config;

import static panszelescik.moreplates.config.Config.*;

import java.util.function.BooleanSupplier;

import com.google.gson.JsonObject;

import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.plugins.*;

public class ConfigOptionConditionFactory implements IConditionFactory {
	
	@Override
	public BooleanSupplier parse(JsonContext context, JsonObject json) {
		String configSetting = JsonUtils.getString(json, "config_setting", "");
    	
    	switch (configSetting) {
    		case "enableIC2Hammer":
    			if (Helper.isLoaded(PluginIndustrialCraft2.MODID))
    				return () -> getBoolean("Enable IC2 Hammer", CATEGORY_IC2, "Enable this to add option to make all Plates with Forge Hammer");
    			else
    				return () -> false;
    		case "enableIEHammer":
    			if (Helper.isLoaded(PluginImmersiveEngineering.MODID))
    				return () -> getBoolean("Enable IE Hammer", CATEGORY_IMMERSIVE, "Enable this to add option to make all Plates with Engineer's Hammer");
    			else
    				return () -> false;
    		case "centerMetals":
    			return () -> getBoolean("Center metals in recipes", CATEGORY_GENERAL, "Enable this to add option to make Gears with Bronze, Copper, Iron and Tin");
    		case "enableGear":
    			return () -> getBoolean("Enable Gear recipes", CATEGORY_GENERAL, "Set this to false, to disable all crafting recipes for Gears");
    		case "enablePlate":
    			return () -> getBoolean("Enable Plate recipes", CATEGORY_GENERAL, "Set this to false, to disable all crafting recipes for Plates");
    		case "enableStick":
    			return () -> getBoolean("Enable Rod recipes", CATEGORY_GENERAL, "Set this to false, to disable all crafting recipes for Rods");
    		default:
    			throw new RuntimeException("Invalid config setting: " + configSetting);
    	}
	}
}