package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

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
		
		if (!isLoaded("libvulpes")) {
			silicon_plate = plate("silicon");
			regPlate(silicon_plate, SILICON);
			plateSilicon = true;
		}
	}
}