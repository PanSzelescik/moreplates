package panszelescik.moreplates.plugins;

public class PluginRefinedStorage extends PluginBase {
	
	public static final String MODID = "refinedstorage";
	public static final String MODNAME = "Refined Storage";
	
	public PluginRefinedStorage() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(QUARTZ_ENRICHED_IRON, "quartz_enriched_iron");
	}
}