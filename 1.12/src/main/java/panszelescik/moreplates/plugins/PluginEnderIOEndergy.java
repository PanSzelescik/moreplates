package panszelescik.moreplates.plugins;

public class PluginEnderIOEndergy extends PluginBase {
	
	public static final String MODID = "enderioendergy";
	public static final String MODNAME = "Ender IO Endergy";
	
	public PluginEnderIOEndergy() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(CRUDE_STEEL, "crude_steel");
		reg(CRYSTALLINE_ALLOY, "crystalline_alloy");
		reg(CRYSTALLINE_PINK_SLIME, "crystalline_pink_slime");
		reg(ENERGETIC_SILVER, "energetic_silver");
		reg(MELODIC_ALLOY, "melodic_alloy");
		reg(STELLAR_ALLOY, "stellar_alloy");
		reg(VIVID_ALLOY, "vivid_alloy");
	}
}