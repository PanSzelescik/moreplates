package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.config.Config;

public abstract class PluginBase extends PluginCore {
	
	public PluginBase(String modid, String modname) {
		super(modid, modname);
	}
	
	@Override
	public boolean preInitPlugin() {
		enabled();
		if (!enable)
			return false;
		MorePlates.logger.info("Enabling Plugin: " + modname + " Phase 1");
		preInit();
		return !error;
	}
	
	@Override
	public boolean initPlugin() {
		enabled();
		if (!enable)
			return false;
		try {
			MorePlates.logger.info("Enabling Plugin: " + modname + " Phase 1");
			postInit();
		} catch (Throwable t) {
			MorePlates.logger.error("Plugin: " + modname + " has an error:", t);
			error = true;
		}
		if (!error)
			MorePlates.logger.info("Plugin: " + modname + " enabled");
		return !error;
	}
	
	protected boolean enabled() {
		String category = "Plugins";
		String comment = "Enable this to load " + modname + " plugin";
		boolean config = Config.getBoolean(modname, category, comment);
		boolean modloaded = Loader.isModLoaded(modid);
		return enable = config && modloaded;
	}
	
	public boolean isEnabled(PluginMetals plugin) {
		return Config.getBoolean("Metals", "Plugins", "Enable this to load Metals plugin");
	}
	
	public boolean isEnabled(PluginMultiMod plugin) {
		String category = "Plugins";
		boolean config = Config.getBoolean(PluginAppliedEnergistics2.MODNAME, category, "Enable this to load " + PluginAppliedEnergistics2.MODNAME + " plugin");
		boolean modloaded = Loader.isModLoaded(PluginAppliedEnergistics2.MODID);
		boolean config2 = Config.getBoolean(PluginRefinedStorage.MODNAME, category, "Enable this to load " + PluginRefinedStorage.MODNAME + " plugin");
		boolean modloaded2 = Loader.isModLoaded(PluginRefinedStorage.MODID);
		if (config && modloaded)
			return true;
		else if (config2 && modloaded2)
			return true;
		else
			return false;
	}
	
	public boolean isEnabled(PluginCore plugin) {
		String category = "Plugins";
		String comment = "Enable this to load " + plugin.modname + " plugin";
		boolean config = Config.getBoolean(plugin.modname, category, comment);
		boolean modloaded = Loader.isModLoaded(plugin.modid);
		return config && modloaded;
	}
	
	public void preInit() {}
	public void postInit() {}
}