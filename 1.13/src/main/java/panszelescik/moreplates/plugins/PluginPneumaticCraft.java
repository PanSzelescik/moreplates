package panszelescik.moreplates.plugins;

public class PluginPneumaticCraft extends PluginBase {
	
	public static final String MODID = "pneumaticcraft";
	public static final String MODNAME = "PneumaticCraft: Repressurized";
	
	public PluginPneumaticCraft() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(COMPRESSED_IRON, "compressed_iron");
	}
}