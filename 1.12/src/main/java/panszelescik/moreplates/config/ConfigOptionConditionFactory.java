package panszelescik.moreplates.config;

import java.util.function.BooleanSupplier;

import com.google.gson.JsonObject;
import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;
import panszelescik.moreplates.config.Config;

import static panszelescik.moreplates.ModChecker.*;

public class ConfigOptionConditionFactory implements IConditionFactory {
	
	@Override
	public BooleanSupplier parse(JsonContext context, JsonObject json) {
    	
    	String configSetting = JsonUtils.getString(json, "config_setting", "");
        
        switch (configSetting) {
        	case "enableIC2Hammer":
        		if (isIndustrialCraft2Loaded)
        			return () -> Config.enableIC2Hammer;
        	case "enableIEHammer":
        		if (isImmersiveEngineeringLoaded)
        			return () -> Config.enableIEHammer;
        	default:
        		throw new RuntimeException(String.format("Invalid config setting: %s", configSetting));
        }
	}
}