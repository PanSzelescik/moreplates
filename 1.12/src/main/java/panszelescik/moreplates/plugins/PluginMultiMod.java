package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
import panszelescik.moreplates.config.Config;

public class PluginMultiMod extends PluginBase {
	
	public PluginMultiMod() {
		super("", "");
	}
	
	Item silicon_gear;
	Item silicon_plate;
	
	@Override
	public boolean preInitPlugin() {
		String category = "Plugins";
		boolean config = Config.getBoolean(PluginAppliedEnergistics2.MODNAME, category, "Enable this to load " + PluginAppliedEnergistics2.MODNAME + " plugin");
		boolean modloaded = Loader.isModLoaded(PluginAppliedEnergistics2.MODID);
		boolean config2 = Config.getBoolean(PluginRefinedStorage.MODNAME, category, "Enable this to load " + PluginRefinedStorage.MODNAME + " plugin");
		boolean modloaded2 = Loader.isModLoaded(PluginRefinedStorage.MODID);
		if (config && modloaded)
			enable = true;
		else if (config2 && modloaded2)
			enable = true;
		if (!enable)
			return false;
		preInit();
		return !error;
	}
	
	public void preInit() {
		silicon_gear = gear("silicon");
		silicon_plate = plate("silicon");
		
		reg(SILICON, silicon_gear, silicon_plate);
	}
}