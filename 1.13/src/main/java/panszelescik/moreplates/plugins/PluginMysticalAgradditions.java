package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginMysticalAgradditions extends PluginBase {
	
	public static final String MODID = "mysticalagradditions";
	public static final String MODNAME = "Mystical Agradditions";
	
	public PluginMysticalAgradditions() {
		super(MODID, MODNAME);
	}
	
	Item insanium_gear;
	Item insanium_plate;
	
	public void preInit() {
		insanium_gear = gear("insanium");
		insanium_plate = plate("insanium");
		
		reg(INSANIUM, insanium_gear, insanium_plate);
	}
}