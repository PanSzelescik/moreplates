package panszelescik.moreplates.plugins;

public class PluginEnderIO extends PluginBase {
	
	public static final String MODID = "enderio";
	public static final String MODNAME = "Ender IO";
	
	public PluginEnderIO() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(CONDUCTIVE_IRON, "conductive_iron");
		reg(DARK_STEEL, "dark_steel");
		reg(ELECTRICAL_STEEL, "electrical_steel");
		reg(END_STEEL, "end_steel");
		reg(ENERGETIC_ALLOY, "energetic_alloy");
		reg(IRON_ALLOY, "iron_alloy");
		reg(PULSATING_IRON, "pulsating_iron");
		reg(REDSTONE_ALLOY, "redstone_alloy");
		reg(SOULARIUM, "soularium");
		reg(VIBRANT_ALLOY, "vibrant_alloy");
	}
}