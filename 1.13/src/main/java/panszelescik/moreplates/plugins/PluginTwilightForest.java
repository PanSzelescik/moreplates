package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginTwilightForest extends PluginBase {
	
	public static final String MODID = "twilightforest";
	public static final String MODNAME = "The Twilight Forest";
	
	public PluginTwilightForest() {
		super(MODID, MODNAME);
	}
	
	Item fiery_gear;
	Item fiery_plate;
	Item ironwood_gear;
	Item ironwood_plate;
	Item knightmetal_gear;
	Item knightmetal_plate;
	
	public void preInit() {
		fiery_gear = gear("fiery");
		fiery_plate = plate("fiery");
		ironwood_gear = gear("ironwood");
		ironwood_plate = plate("ironwood");
		knightmetal_gear = gear("knightmetal");
		knightmetal_plate = plate("knightmetal");
		
		reg(FIERY, fiery_gear, fiery_plate);
		reg(IRONWOOD, ironwood_gear, ironwood_plate);
		reg(KNIGHTMETAL, knightmetal_gear, knightmetal_plate);
	}
}