package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginMetals extends PluginBase {
	
	public PluginMetals() {
		super("", "Metals");
	}
	
	Item copper_stick;
	Item steel_gear;
	Item steel_plate;
	Item steel_stick;
	
	public static boolean stickCopper;
	public static boolean gearSteel;
	public static boolean plateSteel;
	public static boolean stickSteel;
	
	public void preInit() {
		//Copper
		if (oreNameExists(INGOT + COPPER)
		|| isLoaded(PluginImmersiveEngineering.MODID)
		|| isLoaded(PluginIndustrialCraft2.MODID)
		|| isLoaded("libvulpes")
		|| isLoaded(PluginMekanism.MODID)
		|| isLoaded(PluginProjectRed.MODID)
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + COPPER)) {
				copper_stick = stick("copper");
				regStick(copper_stick, COPPER);
				stickCopper = true;
			}
		}
		//Steel
		if (oreNameExists(INGOT + STEEL)
		|| isLoaded(PluginImmersiveEngineering.MODID)
		|| isLoaded(PluginIndustrialCraft2.MODID)
		|| isLoaded("libvulpes")
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(GEAR + STEEL)
			&& !isLoaded("libvulpes")
			&& !isLoaded("thermalfoundation")) {
				steel_gear = gear("steel");
				regGear(steel_gear, STEEL);
				gearSteel = true;
			}
			if (!oreNameExists(PLATE + STEEL)
			&& !isLoaded(PluginImmersiveEngineering.MODID)
			&& !isLoaded(PluginIndustrialCraft2.MODID)
			&& !isLoaded("libvulpes")
			&& !isLoaded(PluginTechReborn.MODID)
			&& !isLoaded("thermalfoundation")) {
				steel_plate = plate("steel");
				regGear(steel_plate, STEEL);
				plateSteel = true;
			}
			if (!oreNameExists(STICK + STEEL)
			&& !isLoaded(PluginImmersiveEngineering.MODID)
			&& !isLoaded("libvulpes")) {
				steel_stick = stick("steel");
				regStick(steel_stick, STEEL);
				stickSteel = true;
			}
		}
	}
}