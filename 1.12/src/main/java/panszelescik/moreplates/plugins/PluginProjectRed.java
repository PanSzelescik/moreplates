package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginProjectRed extends PluginBase {
	
	public static final String MODID = "projectred-core";
	public static final String MODNAME = "Project Red";
	
	public PluginProjectRed() {
		super(MODID, MODNAME);
	}
	
	Item electrotine_alloy_gear;
	Item electrotine_alloy_plate;
	Item red_alloy_gear;
	Item red_alloy_plate;
	
	public void preInit() {
		electrotine_alloy_gear = gear("electrotine_alloy");
		electrotine_alloy_plate = plate("electrotine_alloy");
		red_alloy_gear = gear("red_alloy");
		red_alloy_plate = plate("red_alloy");
		
		reg(ELECTROTINE, electrotine_alloy_gear, electrotine_alloy_plate);
		reg(RED_ALLOY, red_alloy_gear, red_alloy_plate);
	}
}