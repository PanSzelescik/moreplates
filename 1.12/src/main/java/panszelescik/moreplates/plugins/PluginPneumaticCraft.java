package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginPneumaticCraft extends PluginBase {
	
	public static final String MODID = "pneumaticcraft";
	public static final String MODNAME = "PneumaticCraft: Repressurized";
	
	public PluginPneumaticCraft() {
		super(MODID, MODNAME);
	}
	
	Item compressed_iron_gear;
	Item compressed_iron_plate;
	
	public void preInit() {
		compressed_iron_gear = gear("compressed_iron");
		compressed_iron_plate = plate("compressed_iron");
		
		reg(COMPRESSED_IRON, compressed_iron_gear, compressed_iron_plate);
	}
}