package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginProjectE extends PluginBase {
	
	public static final String MODID = "projecte";
	public static final String MODNAME = "ProjectE";
	
	public PluginProjectE() {
		super(MODID, MODNAME);
	}
	
	Item dark_matter_gear;
	Item dark_matter_plate;
	Item red_matter_gear;
	Item red_matter_plate;
	
	public void preInit() {
		dark_matter_gear = gear("dark_matter");
		dark_matter_plate = plate("dark_matter");
		red_matter_gear = gear("red_matter");
		red_matter_plate = plate("red_matter");
		
		reg(DARK_MATTER, dark_matter_gear, dark_matter_plate);
		reg(RED_MATTER, red_matter_gear, red_matter_plate);
	}
}