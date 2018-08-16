package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginRefinedStorage extends PluginBase {
	
	public static final String MODID = "refinedstorage";
	public static final String MODNAME = "Refined Storage";
	
	public PluginRefinedStorage() {
		super(MODID, MODNAME);
	}
	
	Item quartz_enriched_iron_gear;
	Item quartz_enriched_iron_plate;
	
	public void preInit() {
		quartz_enriched_iron_gear = gear("quartz_enriched_iron");
		quartz_enriched_iron_plate = plate("quartz_enriched_iron");
		
		reg(QUARTZ_ENRICHED_IRON, quartz_enriched_iron_gear, quartz_enriched_iron_plate);
	}
}