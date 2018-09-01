package panszelescik.moreplates.plugins;

import static panszelescik.moreplates.config.Config.*;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
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
			return getBoolean(plugin.modname, CATEGORY_PLUGINS, "Enable this to load " + plugin.modname + " plugin") && Loader.isModLoaded(plugin.modid) && !Loader.isModLoaded("ic2-classic-spmod");
		else if (plugin instanceof PluginMetals)
			return getBoolean(plugin.modname, CATEGORY_PLUGINS, "Enable this to load " + plugin.modname + " plugin");
		else if (plugin instanceof PluginMultiMod) {
			if (getBoolean(PluginAppliedEnergistics2.MODNAME, CATEGORY_PLUGINS, "Enable this to load " + PluginAppliedEnergistics2.MODNAME + " plugin") && Loader.isModLoaded(PluginAppliedEnergistics2.MODID))
				return true;
			else if (getBoolean(PluginRefinedStorage.MODNAME, CATEGORY_PLUGINS, "Enable this to load " + PluginRefinedStorage.MODNAME + " plugin") && Loader.isModLoaded(PluginRefinedStorage.MODID))
				return true;
			else
				return false;
		} else
			return getBoolean(plugin.modname, CATEGORY_PLUGINS, "Enable this to load " + plugin.modname + " plugin") && Loader.isModLoaded(plugin.modid);
	}
	
	public void preInit() {}
	public void postInit() {}
}