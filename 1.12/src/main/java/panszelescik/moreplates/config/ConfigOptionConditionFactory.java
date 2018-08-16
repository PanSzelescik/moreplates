package panszelescik.moreplates.config;

import static panszelescik.moreplates.config.Config.*;

import java.util.function.BooleanSupplier;

import com.google.gson.JsonObject;

import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.fml.common.Loader;
import panszelescik.moreplates.plugins.*;

public class ConfigOptionConditionFactory implements IConditionFactory {
	
	@Override
	public BooleanSupplier parse(JsonContext context, JsonObject json) {
		
		String configSetting = JsonUtils.getString(json, "config_setting", "");
    	
    	switch (configSetting) {
    		case "enableIC2Hammer":
    			if (Loader.isModLoaded(PluginIndustrialCraft2.MODID))
    				return () -> enableIC2Hammer;
    			else
    				return () -> false;
    		case "enableIEHammer":
    			if (Loader.isModLoaded(PluginImmersiveEngineering.MODID))
    				return () -> enableIEHammer;
    			else
    				return () -> false;
    		case "centerMetals":
    			return () -> centerMetals;
    		default:
    			throw new RuntimeException("Invalid config setting: " + configSetting);
    	}
	}
}