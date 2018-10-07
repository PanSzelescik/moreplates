package panszelescik.moreplates.config;

import static panszelescik.moreplates.Reference.*;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import panszelescik.moreplates.plugins.*;

public class Config {
	
	public static Configuration cfg;
	public static final String CATEGORY_GENERAL = "general", CATEGORY_PLUGINS = "plugins", CATEGORY_ACTUALLY = PluginActuallyAdditions.MODID, CATEGORY_BOTANIA = PluginBotania.MODID, CATEGORY_IMMERSIVE = PluginImmersiveEngineering.MODID, CATEGORY_IC2 = PluginIndustrialCraft2.MODID, CATEGORY_TECHREBORN = PluginTechReborn.MODID, CATEGORY_THERMAL = PluginThermalExpansion.MODID;
	static final List <String> CATEGORIES = Arrays.asList(CATEGORY_GENERAL, CATEGORY_PLUGINS, CATEGORY_ACTUALLY, CATEGORY_BOTANIA, CATEGORY_IMMERSIVE, CATEGORY_IC2, CATEGORY_TECHREBORN, CATEGORY_THERMAL);
	
	public Config() {
		cfg = new Configuration(new File(Loader.instance().getConfigDir(), "/" + MODID + "/" + MODID + ".cfg"));
		MinecraftForge.EVENT_BUS.register(this);
		loadConfig();
	}
	
	@SubscribeEvent
	public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.getModID().equalsIgnoreCase(MODID))
			loadConfig();
	}
	
	public void loadConfig() {
		cfg.addCustomCategoryComment(CATEGORY_PLUGINS, "Loading plugins settings");
		cfg.addCustomCategoryComment(CATEGORY_ACTUALLY, PluginActuallyAdditions.MODNAME + " recipes settings");
		cfg.addCustomCategoryComment(CATEGORY_BOTANIA, PluginBotania.MODNAME + " recipes settings");
		cfg.addCustomCategoryComment(CATEGORY_IMMERSIVE, PluginImmersiveEngineering.MODNAME + " recipes settings");
		cfg.addCustomCategoryComment(CATEGORY_IC2, PluginIndustrialCraft2.MODNAME + " recipes settings");
		cfg.addCustomCategoryComment(CATEGORY_TECHREBORN, PluginTechReborn.MODNAME + " recipes settings");
		cfg.addCustomCategoryComment(CATEGORY_THERMAL, PluginThermalExpansion.MODNAME + " recipes settings");
		cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General settings");
		
		if (cfg.hasChanged())
			cfg.save();
	}
	
	public static int getInt(String name, String category, int intName, String comment) {
		return cfg.getInt(name, category, intName, 1, Integer.MAX_VALUE, comment);
	}
	
	public static boolean getBoolean(String name, String category, String comment) {
		return cfg.getBoolean(name, category, true, comment);
	}
	
	public static String[] getStrings(String name, String category, String[] defaultValues, String comment) {
		return cfg.getStringList(name, category, defaultValues, comment);
	}
}