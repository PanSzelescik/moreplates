package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginAppliedEnergistics2 extends PluginBase {
	
	public static final String MODID = "appliedenergistics2";
	public static final String MODNAME = "Applied Energistics 2";
	
	public PluginAppliedEnergistics2() {
		super(MODID, MODNAME);
	}
	
	Item certus_quartz_gear;
	Item certus_quartz_plate;
	Item fluix_gear;
	Item fluix_plate;
	
	@Override
	public void preInit() {
		certus_quartz_gear = gear("certus_quartz");
		certus_quartz_plate = plate("certus_quartz");
		fluix_gear = gear("fluix");
		fluix_plate = plate("fluix");
		
		reg(CERTUS_QUARTZ, certus_quartz_gear, certus_quartz_plate);
		reg(FLUIX, fluix_gear, fluix_plate);
	}
}