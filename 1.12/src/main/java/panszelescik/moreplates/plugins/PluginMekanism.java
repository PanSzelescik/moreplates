package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.items.mekanism.*;

public class PluginMekanism {
	
	public static Item glowstone_gear;
	public static Item glowstone_plate;
	public static Item osmium_gear;
	public static Item osmium_plate;
	public static Item refined_obsidian_gear;
	public static Item refined_obsidian_plate;
	
	public static void preInit() {
		glowstone_gear =			new ItemGlowstoneGear			("glowstone_gear",			"glowstone_gear");
		glowstone_plate =			new ItemGlowstonePlate			("glowstone_plate",			"glowstone_plate");
		osmium_gear =				new ItemOsmiumGear				("osmium_gear",				"osmium_gear");
		osmium_plate =				new ItemOsmiumPlate				("osmium_plate",			"osmium_plate");
		refined_obsidian_gear =		new ItemRefinedObsidianGear		("refined_obsidian_gear",	"refined_obsidian_gear");
		refined_obsidian_plate =	new ItemRefinedObsidianPlate	("refined_obsidian_plate",	"refined_obsidian_plate");
		
		Helper.registerItem(glowstone_gear);
		Helper.registerItem(glowstone_plate);
		Helper.registerItem(osmium_gear);
		Helper.registerItem(osmium_plate);
		Helper.registerItem(refined_obsidian_gear);
		Helper.registerItem(refined_obsidian_plate);
	}
	
	public static void clientPreInit() {
		Helper.registerRender(glowstone_gear);
		Helper.registerRender(glowstone_plate);
		Helper.registerRender(osmium_gear);
		Helper.registerRender(osmium_plate);
		Helper.registerRender(refined_obsidian_gear);
		Helper.registerRender(refined_obsidian_plate);
	}
	
	public static void init() {
		OreDictionary.registerOre("gearRefinedGlowstone",	glowstone_gear);
		OreDictionary.registerOre("plateRefinedGlowstone",	glowstone_plate);
		OreDictionary.registerOre("gearOsmium",				osmium_gear);
		OreDictionary.registerOre("plateOsmium",			osmium_plate);
		OreDictionary.registerOre("gearRefinedObsidian",	refined_obsidian_gear);
		OreDictionary.registerOre("plateRefinedObsidian",	refined_obsidian_plate);
	}
	
}