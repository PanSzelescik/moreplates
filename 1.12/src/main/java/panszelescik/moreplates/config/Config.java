package panszelescik.moreplates.config;

import static panszelescik.moreplates.MorePlates.*;

import java.util.Arrays;
import java.util.List;

import panszelescik.morelibs.config.ConfigBase;
import panszelescik.moreplates.plugins.*;

public class Config extends ConfigBase {
	
	public static final String CATEGORY_GENERAL = "general", CATEGORY_PLUGINS = "plugins", CATEGORY_ACTUALLY = PluginActuallyAdditions.MODID, CATEGORY_BOTANIA = PluginBotania.MODID, CATEGORY_IMMERSIVE = PluginImmersiveEngineering.MODID, CATEGORY_IC2 = PluginIndustrialCraft2.MODID, CATEGORY_TECHREBORN = PluginTechReborn.MODID, CATEGORY_THERMAL = PluginThermalExpansion.MODID;
	static final List <String> CATEGORIES = Arrays.asList(CATEGORY_GENERAL, CATEGORY_PLUGINS, CATEGORY_ACTUALLY, CATEGORY_BOTANIA, CATEGORY_IMMERSIVE, CATEGORY_IC2, CATEGORY_TECHREBORN, CATEGORY_THERMAL);
	
	public Config() {
		super(MODID + "/" + MODID, MODID);
	}
	
	@Override
	public void loadConfig() {
		getCfg().addCustomCategoryComment(CATEGORY_PLUGINS, "Loading plugins settings");
		getCfg().addCustomCategoryComment(CATEGORY_ACTUALLY, PluginActuallyAdditions.MODNAME + " recipes settings");
		getCfg().addCustomCategoryComment(CATEGORY_BOTANIA, PluginBotania.MODNAME + " recipes settings");
		getCfg().addCustomCategoryComment(CATEGORY_IMMERSIVE, PluginImmersiveEngineering.MODNAME + " recipes settings");
		getCfg().addCustomCategoryComment(CATEGORY_IC2, PluginIndustrialCraft2.MODNAME + " recipes settings");
		getCfg().addCustomCategoryComment(CATEGORY_TECHREBORN, PluginTechReborn.MODNAME + " recipes settings");
		getCfg().addCustomCategoryComment(CATEGORY_THERMAL, PluginThermalExpansion.MODNAME + " recipes settings");
		getCfg().addCustomCategoryComment(CATEGORY_GENERAL, "General settings");
		
		super.loadConfig();
	}
}