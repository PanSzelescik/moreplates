package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;

public class PluginPlusTiC extends PluginBase {
	
	public static final String MODID = "plustic";
	public static final String MODNAME = "PlusTiC";
	
	public PluginPlusTiC() {
		super(MODID, MODNAME);
	}
	
	Item alumite_gear;
	Item alumite_plate;
	Item mirion_gear;
	Item mirion_plate;
	Item osgloglas_gear;
	Item osgloglas_plate;
	Item osmiridium_gear;
	Item osmiridium_plate;
	
	public void preInit() {
		alumite_gear = gear("alumite");
		alumite_plate = plate("alumite");
		
		reg(ALUMITE, alumite_gear, alumite_plate);
		
		if (Loader.isModLoaded(PluginBotania.MODID)) {
			mirion_gear = gear("mirion");
			mirion_plate = plate("mirion");
			
			reg(MIRION, mirion_gear, mirion_plate);
		}
		if (Loader.isModLoaded(PluginMekanism.MODID)) {
			osgloglas_gear = gear("osgloglas");
			osgloglas_plate = plate("osgloglas");
			
			reg(OSGLOGLAS, osgloglas_gear, osgloglas_plate);
		}
		if (Loader.isModLoaded(PluginMekanism.MODID) && Loader.isModLoaded(PluginThermalExpansion.MODID)) {
			osmiridium_gear = gear("osmiridium");
			osmiridium_plate = plate("osmiridium");
			
			reg(OSMIRIDIUM, osmiridium_gear, osmiridium_plate);
		}
	}
}