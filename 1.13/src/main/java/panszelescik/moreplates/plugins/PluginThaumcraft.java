package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginThaumcraft extends PluginBase {
	
	public static final String MODID = "thaumcraft";
	public static final String MODNAME = "Thaumcraft";
	
	public PluginThaumcraft() {
		super(MODID, MODNAME);
	}
	
	Item amber_gear;
	Item amber_plate;
	Item quicksilver_gear;
	Item quicksilver_plate;
	
	public void preInit() {
		amber_gear = gear("amber");
		amber_plate = plate("amber");
		quicksilver_gear = gear("quicksilver");
		quicksilver_plate = plate("quicksilver");
		
		reg(AMBER, amber_gear, amber_plate);
		reg(QUICKSILVER, quicksilver_gear, quicksilver_plate);
	}
}