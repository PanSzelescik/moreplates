package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.items.mekanism.*;
import panszelescik.moreplates.register.*;

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
		
		RegisterItem.register(glowstone_gear);
		RegisterItem.register(glowstone_plate);
		RegisterItem.register(osmium_gear);
		RegisterItem.register(osmium_plate);
		RegisterItem.register(refined_obsidian_gear);
		RegisterItem.register(refined_obsidian_plate);
	}
	
	public static void clientPreInit() {
		RegisterRender.register(glowstone_gear);
		RegisterRender.register(glowstone_plate);
		RegisterRender.register(osmium_gear);
		RegisterRender.register(osmium_plate);
		RegisterRender.register(refined_obsidian_gear);
		RegisterRender.register(refined_obsidian_plate);
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