package panszelescik.moreplates.plugins;

public class PluginDraconicEvolution extends PluginBase {
	
	public static final String MODID = "draconicevolution";
	public static final String MODNAME = "Draconic Evolution";
	
	public PluginDraconicEvolution() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(AWAKENED_DRACONIUM, "awakened_draconium");
		reg(DRACONIUM, "draconium");
	}
}