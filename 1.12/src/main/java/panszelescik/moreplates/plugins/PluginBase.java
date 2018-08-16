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
		String category = "Plugins";
		String comment = "Enable this to load " + modname + " plugin";
		boolean config = Config.getBoolean(modname, category, comment);
		boolean modloaded = Loader.isModLoaded(modid);
		enable = config && modloaded;
		if (!enable)
			return false;
		preInit();
		return !error;
	}
	
	@Override
	public boolean initPlugin() {
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
	
	public void preInit() {}
	public void postInit() {}
}