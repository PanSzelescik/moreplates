package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
import panszelescik.moreplates.config.Config;

public class PluginMultiMod extends PluginBase {
	
	public PluginMultiMod() {
		super("", "MultiMod");
	}
	
	Item silicon_gear;
	Item silicon_plate;
	
	public void preInit() {
		silicon_gear = gear("silicon");
		silicon_plate = plate("silicon");
		
		reg(SILICON, silicon_gear, silicon_plate);
	}
}