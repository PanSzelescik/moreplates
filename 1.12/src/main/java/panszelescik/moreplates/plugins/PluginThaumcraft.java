package panszelescik.moreplates.plugins;

public class PluginThaumcraft extends PluginBase {
	
	public static final String MODID = "thaumcraft";
	public static final String MODNAME = "Thaumcraft";
	
	public PluginThaumcraft() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(AMBER, "amber");
		reg(QUICKSILVER, "quicksilver");
	}
}