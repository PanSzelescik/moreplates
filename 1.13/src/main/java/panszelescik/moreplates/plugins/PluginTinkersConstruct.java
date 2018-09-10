package panszelescik.moreplates.plugins;

public class PluginTinkersConstruct extends PluginBase {
	
	public static final String MODID = "tconstruct";
	public static final String MODNAME = "Tinkers' Construct";
	
	public PluginTinkersConstruct() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(ARDITE, "ardite");
		reg(COBALT, "cobalt");
		reg(KNIGHTSLIME, "knightslime");
		reg(MANYULLYN, "manyullyn");
		reg(PIG_IRON, "pig_iron");
	}
}