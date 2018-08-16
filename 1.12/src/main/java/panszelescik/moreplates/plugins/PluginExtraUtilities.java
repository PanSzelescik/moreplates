package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginExtraUtilities extends PluginBase {
	
	public static final String MODID = "extrautils2";
	public static final String MODNAME = "Extra Utilities 2";
	
	public PluginExtraUtilities() {
		super(MODID, MODNAME);
	}
	
	Item demon_gear;
	Item demon_plate;
	Item enchanted_gear;
	Item enchanted_plate;
	Item evil_infused_iron_gear;
	Item evil_infused_iron_plate;
	
	public void preInit() {
		demon_gear = gear("demon");
		demon_plate = plate("demon");
		enchanted_gear = gear("enchanted");
		enchanted_plate = plate("enchanted");
		evil_infused_iron_gear = gear("evil_infused_iron");
		evil_infused_iron_plate = plate("evil_infused_iron");
		
		reg(DEMON, demon_gear, demon_plate);
		reg(ENCHANTED, enchanted_gear, enchanted_plate);
		reg(EVIL_INFUSED_IRON, evil_infused_iron_gear, evil_infused_iron_plate);
	}
}