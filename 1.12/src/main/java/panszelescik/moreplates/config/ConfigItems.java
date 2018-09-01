package panszelescik.moreplates.config;

import static panszelescik.moreplates.Reference.*;

import java.io.File;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConfigItems {
	
	public static Configuration cfg;
	
	public static final String CATEGORY_ITEMS = "items";
	
	public ConfigItems() {
		cfg = new Configuration(new File(Loader.instance().getConfigDir(), "/" + MODID + "/items.cfg"));
		MinecraftForge.EVENT_BUS.register(this);
		loadConfig();
	}
	
	public Configuration getConfig() {
		return cfg;
	}
	
	@SubscribeEvent
	public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.getModID().equalsIgnoreCase(MODID))
			loadConfig();
	}
	
	public void loadConfig() {
		cfg.addCustomCategoryComment(CATEGORY_ITEMS, "Loading items settings");
		
		if (cfg.hasChanged())
			cfg.save();
	}
	
	public static boolean loadItem(Item item) {
		return cfg.get(CATEGORY_ITEMS, item.getRegistryName().toString().substring(11), true).getBoolean();
	}
}