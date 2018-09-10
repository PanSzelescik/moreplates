package panszelescik.moreplates.plugins;

public class PluginMekanism extends PluginBase {
	
	public static final String MODID = "mekanism";
	public static final String MODNAME = "Mekanism";
	
	public PluginMekanism() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(OSMIUM, "osmium");
		reg(REFINED_GLOWSTONE, "refined_glowstone");
		reg(REFINED_OBSIDIAN, "refined_obsidian");
	}
}