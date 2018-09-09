package panszelescik.moreplates.plugins;

public class PluginExtraUtilities extends PluginBase {
	
	public static final String MODID = "extrautils2";
	public static final String MODNAME = "Extra Utilities 2";
	
	public PluginExtraUtilities() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(DEMON, "demon");
		reg(ENCHANTED, "enchanted");
		reg(EVIL_INFUSED_IRON, "evil_infused_iron");
	}
}