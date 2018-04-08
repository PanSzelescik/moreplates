package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.items.mysticalagriculture.*;
import panszelescik.moreplates.register.*;

public class PluginMysticalAgriculture {
	
	public static Item inferium_gear;
	public static Item inferium_plate;
	public static Item intermedium_gear;
	public static Item intermedium_plate;
	public static Item prudentium_gear;
	public static Item prudentium_plate;
	public static Item soulium_gear;
	public static Item soulium_plate;
	public static Item superium_gear;
	public static Item superium_plate;
	public static Item supremium_gear;
	public static Item supremium_plate;
	
	public static void init() {
		inferium_gear  = new ItemInferiumGear("inferium_gear", "inferium_gear");
		inferium_plate = new ItemInferiumPlate("inferium_plate", "inferium_plate");
		intermedium_gear = new ItemIntermediumGear("intermedium_gear", "intermedium_gear");
		intermedium_plate = new ItemIntermediumPlate("intermedium_plate", "intermedium_plate");
		prudentium_gear = new ItemPrudentiumGear("prudentium_gear", "prudentium_gear");
		prudentium_plate = new ItemPrudentiumPlate("prudentium_plate", "prudentium_plate");
		soulium_gear = new ItemSouliumGear("soulium_gear", "soulium_gear");
		soulium_plate = new ItemSouliumPlate("soulium_plate", "soulium_plate");
		superium_gear = new ItemSuperiumGear("superium_gear", "superium_gear");
		superium_plate = new ItemSuperiumPlate("superium_plate", "superium_plate");
		supremium_gear = new ItemSupremiumGear("supremium_gear", "supremium_gear");
		supremium_plate = new ItemSupremiumPlate("supremium_plate", "supremium_plate");
	}
	
	public static void register() {
		RegisterItem.register(inferium_gear);
		RegisterItem.register(inferium_plate);
		RegisterItem.register(intermedium_gear);
		RegisterItem.register(intermedium_plate);
		RegisterItem.register(prudentium_gear);
		RegisterItem.register(prudentium_plate);
		RegisterItem.register(soulium_gear);
		RegisterItem.register(soulium_plate);
		RegisterItem.register(superium_gear);
		RegisterItem.register(superium_plate);
		RegisterItem.register(supremium_gear);
		RegisterItem.register(supremium_plate);
	}
	
	public static void registerRenders() {
		RegisterRender.register(inferium_gear);
		RegisterRender.register(inferium_plate);
		RegisterRender.register(intermedium_gear);
		RegisterRender.register(intermedium_plate);
		RegisterRender.register(prudentium_gear);
		RegisterRender.register(prudentium_plate);
		RegisterRender.register(soulium_gear);
		RegisterRender.register(soulium_plate);
		RegisterRender.register(superium_gear);
		RegisterRender.register(superium_plate);
		RegisterRender.register(supremium_gear);
		RegisterRender.register(supremium_plate);
	}
	
	public static void registerOreDict() {
		OreDictionary.registerOre("gearInferium", inferium_gear);
		OreDictionary.registerOre("plateInferium", inferium_plate);
		OreDictionary.registerOre("gearIntermedium", intermedium_gear);
		OreDictionary.registerOre("plateIntermedium", intermedium_plate);
		OreDictionary.registerOre("gearPrudentium", prudentium_gear);
		OreDictionary.registerOre("platePrudentium", prudentium_plate);
		OreDictionary.registerOre("gearSoulium", soulium_gear);
		OreDictionary.registerOre("plateSoulium", soulium_plate);
		OreDictionary.registerOre("gearSuperium", superium_gear);
		OreDictionary.registerOre("plateSuperium", superium_plate);
		OreDictionary.registerOre("gearSupremium", supremium_gear);
		OreDictionary.registerOre("plateSupremium", supremium_plate);
	}
	
}