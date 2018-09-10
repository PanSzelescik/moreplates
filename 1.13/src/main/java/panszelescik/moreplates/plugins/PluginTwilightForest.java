package panszelescik.moreplates.plugins;

public class PluginTwilightForest extends PluginBase {
	
	public static final String MODID = "twilightforest";
	public static final String MODNAME = "The Twilight Forest";
	
	public PluginTwilightForest() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(FIERY, "fiery");
		reg(IRONWOOD, "ironwood");
		reg(KNIGHTMETAL, "knightmetal");
	}
}