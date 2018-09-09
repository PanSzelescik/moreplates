package panszelescik.moreplates.plugins;

public class PluginAppliedEnergistics2 extends PluginBase {
	
	public static final String MODID = "appliedenergistics2";
	public static final String MODNAME = "Applied Energistics 2";
	
	public PluginAppliedEnergistics2() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(CERTUS_QUARTZ, "certus_quartz");
		reg(FLUIX, "fluix");
	}
}