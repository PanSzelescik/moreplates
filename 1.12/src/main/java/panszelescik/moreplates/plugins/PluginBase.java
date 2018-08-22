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
		return enable = isEnabled(this);
	}
	
	public boolean isEnabled(PluginCore plugin) {
		if (plugin instanceof PluginMetals)
			return Config.getBoolean("Metals", "Plugins", "Enable this to load Metals plugin");
		else if (plugin instanceof PluginMultiMod) {
			if (Config.getBoolean(PluginAppliedEnergistics2.MODNAME, "Plugins", "Enable this to load " + PluginAppliedEnergistics2.MODNAME + " plugin") && Loader.isModLoaded(PluginAppliedEnergistics2.MODID))
				return true;
			else if (Config.getBoolean(PluginRefinedStorage.MODNAME, "Plugins", "Enable this to load " + PluginRefinedStorage.MODNAME + " plugin") && Loader.isModLoaded(PluginRefinedStorage.MODID))
				return true;
			else
				return false;
		} else
			return Config.getBoolean(plugin.modname, "Plugins", "Enable this to load " + plugin.modname + " plugin") && Loader.isModLoaded(plugin.modid);
	}
	
	public void preInit() {}
	public void postInit() {}
}