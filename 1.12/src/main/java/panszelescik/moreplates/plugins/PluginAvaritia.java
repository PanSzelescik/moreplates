package panszelescik.moreplates.plugins;

public class PluginAvaritia extends PluginBase {
	
	public static final String MODID = "avaritia";
	public static final String MODNAME = "Avaritia";
	
	public PluginAvaritia() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(CRYSTAL_MATRIX, "crystal_matrix");
		reg(INFINITY, "infinity");
		reg(NEUTRONIUM, "neutronium");
	}
}