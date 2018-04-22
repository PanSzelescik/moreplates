package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.items.appliedenergistics2.*;
import panszelescik.moreplates.register.*;

public class PluginAppliedEnergistics2 {
	
	public static Item certus_quartz_gear;
	public static Item certus_quartz_plate;
	public static Item fluix_gear;
	public static Item fluix_plate;
	
	public static void preInit() {
		certus_quartz_gear =	new ItemCertusQuartzGear	("certus_quartz_gear",	"certus_quartz_gear");
		certus_quartz_plate =	new ItemCertusQuartzPlate	("certus_quartz_plate",	"certus_quartz_plate");
		fluix_gear =			new ItemFluixGear			("fluix_gear",			"fluix_gear");
		fluix_plate =			new ItemFluixPlate			("fluix_plate",			"fluix_plate");
		
		RegisterItem.register(certus_quartz_gear);
		RegisterItem.register(certus_quartz_plate);
		RegisterItem.register(fluix_gear);
		RegisterItem.register(fluix_plate);
	}
	
	public static void clientPreInit() {
		RegisterRender.register(certus_quartz_gear);
		RegisterRender.register(certus_quartz_plate);
		RegisterRender.register(fluix_gear);
		RegisterRender.register(fluix_plate);
	}
	
	public static void init() {
		OreDictionary.registerOre("gearCertusQuartz",	certus_quartz_gear);
		OreDictionary.registerOre("plateCertusQuartz",	certus_quartz_plate);
		OreDictionary.registerOre("gearFluix",			fluix_gear);
		OreDictionary.registerOre("plateFluix",			fluix_plate);
	}
}