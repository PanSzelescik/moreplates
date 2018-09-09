package panszelescik.moreplates.plugins;

public class PluginEnderIO extends PluginBase {
	
	public static final String MODID = "enderio";
	public static final String MODNAME = "Ender IO";
	
	public PluginEnderIO() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(COMBUSTIVE_METAL, "combustive_metal");
		reg(CONDUCTIVE_IRON, "conductive_iron");
		reg(CRUDE_STEEL, "crude_steel");
		reg(CRYSTALLINE_ALLOY, "crystalline_alloy");
		reg(CRYSTALLINE_PINK_SLIME, "crystalline_pink_slime");
		reg(DARK_STEEL, "dark_steel");
		reg(ELECTRICAL_STEEL, "electrical_steel");
		reg(END_STEEL, "end_steel");
		reg(ENERGETIC_ALLOY, "energetic_alloy");
		reg(ENERGETIC_SILVER, "energetic_silver");
		reg(MELODIC_ALLOY, "melodic_alloy");
		reg(PULSATING_IRON, "pulsating_iron");
		reg(REDSTONE_ALLOY, "redstone_alloy");
		reg(SOULARIUM, "soularium");
		reg(STELLAR_ALLOY, "stellar_alloy");
		reg(VIBRANT_ALLOY, "vibrant_alloy");
	}
}