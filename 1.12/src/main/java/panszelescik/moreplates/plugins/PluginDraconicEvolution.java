package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginDraconicEvolution extends PluginBase {
	
	public static final String MODID = "draconicevolution";
	public static final String MODNAME = "Draconic Evolution";
	
	public PluginDraconicEvolution() {
		super(MODID, MODNAME);
	}
	
	Item awakened_draconium_gear;
	Item awakened_draconium_plate;
	Item draconium_gear;
	Item draconium_plate;
	
	public void preInit() {
		awakened_draconium_gear = gear("awakened_draconium");
		awakened_draconium_plate = plate("awakened_draconium");
		draconium_gear = gear("draconium");
		draconium_plate = plate("draconium");
		
		reg(AWAKENED_DRACONIUM, awakened_draconium_gear, awakened_draconium_plate);
		reg(DRACONIUM, draconium_gear, draconium_plate);
	}
}