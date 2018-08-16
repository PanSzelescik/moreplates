package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;

public class PluginMysticalAgriculture extends PluginBase {
	
	public static final String MODID = "mysticalagriculture";
	public static final String MODNAME = "Mystical Agriculture";
	
	public PluginMysticalAgriculture() {
		super(MODID, MODNAME);
	}
	
	Item inferium_gear;
	Item inferium_plate;
	Item intermedium_gear;
	Item intermedium_plate;
	Item prudentium_gear;
	Item prudentium_plate;
	Item soulium_gear;
	Item soulium_plate;
	Item superium_gear;
	Item superium_plate;
	Item supremium_gear;
	Item supremium_plate;
	
	public void preInit() {
		inferium_gear  = gear("inferium");
		inferium_plate = plate("inferium");
		intermedium_gear = gear("intermedium");
		intermedium_plate = plate("intermedium");
		prudentium_gear = gear("prudentium");
		prudentium_plate = plate("prudentium");
		soulium_gear = gear("soulium");
		soulium_plate = plate("soulium");
		superium_gear = gear("superium");
		superium_plate = plate("superium");
		supremium_gear = gear("supremium");
		supremium_plate = plate("supremium");
		
		reg(INFERIUM, inferium_gear, inferium_plate);
		reg(INTERMEDIUM, intermedium_gear, intermedium_plate);
		reg(PRUDENTIUM, prudentium_gear, prudentium_plate);
		reg(SOULIUM, soulium_gear, soulium_plate);
		reg(SUPERIUM, superium_gear, superium_plate);
		reg(SUPREMIUM, supremium_gear, supremium_plate);
	}
}