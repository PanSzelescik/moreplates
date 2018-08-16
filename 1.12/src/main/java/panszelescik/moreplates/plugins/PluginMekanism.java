package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginMekanism extends PluginBase {
	
	public static final String MODID = "mekanism";
	public static final String MODNAME = "Mekanism";
	
	public PluginMekanism() {
		super(MODID, MODNAME);
	}
	
	Item osmium_gear;
	Item osmium_plate;
	Item refined_glowstone_gear;
	Item refined_glowstone_plate;
	Item refined_obsidian_gear;
	Item refined_obsidian_plate;
	
	public void preInit() {
		osmium_gear = gear("osmium");
		osmium_plate = plate("osmium");
		refined_glowstone_gear = gear("refined_glowstone");
		refined_glowstone_plate = plate("refined_glowstone");
		refined_obsidian_gear = gear("refined_obsidian");
		refined_obsidian_plate = plate("refined_obsidian");
		
		reg(OSMIUM, osmium_gear, osmium_plate);
		reg(REFINED_GLOWSTONE, refined_glowstone_gear, refined_glowstone_plate);
		reg(REFINED_OBSIDIAN, refined_obsidian_gear, refined_obsidian_plate);
	}
}