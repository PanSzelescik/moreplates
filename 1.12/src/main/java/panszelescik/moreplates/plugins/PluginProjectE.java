package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.items.projecte.*;
import panszelescik.moreplates.register.*;

public class PluginProjectE {
	
	public static Item dark_matter_gear;
	public static Item dark_matter_plate;
	public static Item red_matter_gear;
	public static Item red_matter_plate;
	
	public static void preInit() {
		dark_matter_gear =	new ItemDarkMatterGear	("dark_matter_gear",	"dark_matter_gear");
		dark_matter_plate =	new ItemDarkMatterPlate	("dark_matter_plate",	"dark_matter_plate");
		red_matter_gear =	new ItemRedMatterGear	("red_matter_gear",		"red_matter_gear");
		red_matter_plate =	new ItemRedMatterPlate	("red_matter_plate",	"red_matter_plate");
		
		RegisterItem.register(dark_matter_gear);
		RegisterItem.register(dark_matter_plate);
		RegisterItem.register(red_matter_gear);
		RegisterItem.register(red_matter_plate);
	}
	
	public static void clientPreInit() {
		RegisterRender.register(dark_matter_gear);
		RegisterRender.register(dark_matter_plate);
		RegisterRender.register(red_matter_gear);
		RegisterRender.register(red_matter_plate);
	}
	
	public static void init() {
		OreDictionary.registerOre("gearDarkMatter",		dark_matter_gear);
		OreDictionary.registerOre("plateDarkMatter",	dark_matter_plate);
		OreDictionary.registerOre("gearRedMatter",		red_matter_gear);
		OreDictionary.registerOre("plateRedMatter",		red_matter_plate);
	}
}