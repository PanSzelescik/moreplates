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
	
	public static boolean gearSilicon;
	public static boolean plateSilicon;
	
	public void preInit() {
		silicon_gear = gear("silicon");
		regGear(silicon_gear, SILICON);
		gearSilicon = true;
		
		if (!Loader.isModLoaded("libvulpes")) {
			silicon_plate = plate("silicon");
			regPlate(silicon_plate, SILICON);
			plateSilicon = true;
		}
	}
}