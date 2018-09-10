package panszelescik.moreplates.plugins;

public class PluginCalculator extends PluginBase {
	
	public static final String MODID = "calculator";
	public static final String MODNAME = "Calculator";
	
	public PluginCalculator() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(AMETHYST, "amethyst");
		reg(ENRICHED_GOLD, "enriched_gold");
		reg(REINFORCED_IRON, "reinforced_iron");
		reg(TANZANITE, "tanzanite");
	}
}