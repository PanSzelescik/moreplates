package panszelescik.moreplates.plugins;

public class PluginProjectE extends PluginBase {
	
	public static final String MODID = "projecte";
	public static final String MODNAME = "ProjectE";
	
	public PluginProjectE() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(DARK_MATTER, "dark_matter");
		reg(RED_MATTER, "red_matter");
	}
}