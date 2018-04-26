package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.items.appliedenergistics2.*;

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
		
		Helper.registerItem(certus_quartz_gear);
		Helper.registerItem(certus_quartz_plate);
		Helper.registerItem(fluix_gear);
		Helper.registerItem(fluix_plate);
	}
	
	public static void clientPreInit() {
		Helper.registerRender(certus_quartz_gear);
		Helper.registerRender(certus_quartz_plate);
		Helper.registerRender(fluix_gear);
		Helper.registerRender(fluix_plate);
	}
	
	public static void init() {
		OreDictionary.registerOre("gearCertusQuartz",	certus_quartz_gear);
		OreDictionary.registerOre("plateCertusQuartz",	certus_quartz_plate);
		OreDictionary.registerOre("gearFluix",			fluix_gear);
		OreDictionary.registerOre("plateFluix",			fluix_plate);
	}
}