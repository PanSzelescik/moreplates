package panszelescik.moreplates.plugins;

public class PluginMysticalAgriculture extends PluginBase {
	
	public static final String MODID = "mysticalagriculture";
	public static final String MODNAME = "Mystical Agriculture";
	
	public PluginMysticalAgriculture() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(INFERIUM, "inferium");
		reg(INTERMEDIUM, "intermedium");
		reg(PRUDENTIUM, "prudentium");
		reg(SOULIUM, "soulium");
		reg(SUPERIUM, "superium");
		reg(SUPREMIUM, "supremium");
	}
}