package panszelescik.moreplates.plugins;

import static panszelescik.moreplates.config.Config.*;

import panszelescik.moreplates.MorePlates;

public abstract class PluginBase extends PluginCore {
	
	public PluginBase(String modid, String modname) {
		super(modid, modname);
	}
	
	@Override
	public boolean preInitPlugin() {
		enabled();
		if (!enable)
			return false;
		try {
			MorePlates.logger.info("Enabling Plugin: " + modname + " Phase 1");
			preInit();
		} catch (Throwable t) {
			MorePlates.logger.error("Plugin: " + modname + " has an error:", t);
			error = true;
		}
		return !error;
	}
	
	@Override
	public boolean initPlugin() {
		enabled();
		if (!enable)
			return false;
		try {
			MorePlates.logger.info("Enabling Plugin: " + modname + " Phase 2");
			postInit();
		} catch (Throwable t) {
			MorePlates.logger.error("Plugin: " + modname + " has an error:", t);
			error = true;
		}
		return !error;
	}
	
	protected boolean enabled() {
		return enable = isEnabled(this);
	}
	
	public boolean isEnabled(PluginCore plugin) {
		if (plugin instanceof PluginIndustrialCraft2)
			return getBoolean(plugin.modname, CATEGORY_PLUGINS, "Enable this to load " + plugin.modname + " plugin") && isLoaded(plugin.modid) && !isLoaded("ic2-classic-spmod");
		else if (plugin instanceof PluginMetals)
			return getBoolean(plugin.modname, CATEGORY_PLUGINS, "Enable this to load " + plugin.modname + " plugin");
		else
			return getBoolean(plugin.modname, CATEGORY_PLUGINS, "Enable this to load " + plugin.modname + " plugin") && isLoaded(plugin.modid);
	}
	
	public void preInit() {}
	public void postInit() {}
}