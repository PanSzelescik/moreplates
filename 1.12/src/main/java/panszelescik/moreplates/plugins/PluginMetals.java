package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
import panszelescik.moreplates.config.Config;

public class PluginMetals extends PluginBase {
	
	public PluginMetals() {
		super("", "");
	}
	
	Item steel_gear;
	Item steel_plate;
	
	public static boolean gearSteel;
	public static boolean plateSteel;
	
	public void preInit() {
		if (oreNameExists(INGOT + STEEL) || Loader.isModLoaded(PluginImmersiveEngineering.MODID)) {
			if (!oreNameExists(GEAR + STEEL)) {
				steel_gear = gear("steel");
				regGear(steel_gear, STEEL);
				gearSteel = true;
			}
			if (!oreNameExists(PLATE + STEEL) && !Loader.isModLoaded(PluginImmersiveEngineering.MODID)) {
				steel_plate = plate("steel");
				regGear(steel_plate, STEEL);
				plateSteel = true;
			}
		}
	}
}