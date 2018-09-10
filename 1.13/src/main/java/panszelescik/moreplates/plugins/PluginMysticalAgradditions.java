package panszelescik.moreplates.plugins;

public class PluginMysticalAgradditions extends PluginBase {
	
	public static final String MODID = "mysticalagradditions";
	public static final String MODNAME = "Mystical Agradditions";
	
	public PluginMysticalAgradditions() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(INSANIUM, "insanium");
	}
}