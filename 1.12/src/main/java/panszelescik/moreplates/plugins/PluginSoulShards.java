package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginSoulShards extends PluginBase {
	
	public static final String MODID = "soulshardstow";
	public static final String MODNAME = "Soul Shards - The Old Ways";
	
	public PluginSoulShards() {
		super(MODID, MODNAME);
	}
	
	Item corrupted_gear;
	Item corrupted_plate;
	
	public void preInit() {
		corrupted_gear = gear("corrupted");
		corrupted_plate = plate("corrupted");
		
		reg(CORRUPTED, corrupted_gear, corrupted_plate);
	}
}