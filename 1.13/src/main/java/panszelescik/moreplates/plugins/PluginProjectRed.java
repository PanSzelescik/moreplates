package panszelescik.moreplates.plugins;

public class PluginProjectRed extends PluginBase {
	
	public static final String MODID = "projectred-core";
	public static final String MODNAME = "Project Red";
	
	public PluginProjectRed() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(ELECTROTINE, "electrotine_alloy");
		reg(RED_ALLOY, "red_alloy");
	}
}