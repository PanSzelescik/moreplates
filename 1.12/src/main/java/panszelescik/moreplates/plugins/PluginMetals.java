package panszelescik.moreplates.plugins;

import static panszelescik.moreplates.config.Config.CATEGORY_PLUGINS;
import static panszelescik.moreplates.config.Config.getBoolean;

import net.minecraft.item.Item;

public class PluginMetals extends PluginBase {
	
	public PluginMetals() {
		super("", "Metals");
	}
	
	Item aluminum_stick;
	Item bronze_stick;
	Item constantan_stick;
	Item copper_stick;
	Item electrum_stick;
	Item enderium_stick;
	Item invar_stick;
	Item iridium_stick;
	Item lead_stick;
	Item lumium_stick;
	Item mithril_stick;
	Item nickel_stick;
	Item platinum_stick;
	Item signalum_stick;
	Item silicon_gear;
	Item silicon_plate;
	Item silver_stick;
	Item steel_gear;
	Item steel_plate;
	Item steel_stick;
	Item tin_stick;
	
	public static boolean stickAluminum;
	public static boolean stickBronze;
	public static boolean stickConstantan;
	public static boolean stickCopper;
	public static boolean stickElectrum;
	public static boolean stickEnderium;
	public static boolean stickInvar;
	public static boolean stickIridium;
	public static boolean stickLead;
	public static boolean stickLumium;
	public static boolean stickMithril;
	public static boolean stickNickel;
	public static boolean stickPlatinum;
	public static boolean stickSignalum;
	public static boolean gearSilicon;
	public static boolean plateSilicon;
	public static boolean stickSilver;
	public static boolean gearSteel;
	public static boolean plateSteel;
	public static boolean stickSteel;
	public static boolean stickTin;
	
	public void preInit() {
		//Aluminum
		if (oreNameExists(INGOT + ALUMINUM)
		|| isLoaded("libvulpes")
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + ALUMINUM)
			&& !isLoaded(PluginImmersiveEngineering.MODID)) {
				regCustomStick(aluminum_stick, stickAluminum, ALUMINUM, "aluminum");
			}
		}
		//Bronze
		if (oreNameExists(INGOT + BRONZE)
		|| isLoaded("forestry")
		|| isLoaded(PluginIndustrialCraft2.MODID)
		|| isLoaded(PluginMekanism.MODID)
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + BRONZE)) {
				regCustomStick(bronze_stick, stickBronze, BRONZE, "bronze");
			}
		}
		//Constantan
		if (oreNameExists(INGOT + CONSTANTAN)
		|| isLoaded(PluginImmersiveEngineering.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + CONSTANTAN)) {
				regCustomStick(constantan_stick, stickConstantan, CONSTANTAN, "constantan");
			}
		}
		//Copper
		if (oreNameExists(INGOT + COPPER)
		|| isLoaded("forestry")
		|| isLoaded(PluginImmersiveEngineering.MODID)
		|| isLoaded(PluginIndustrialCraft2.MODID)
		|| isLoaded("libvulpes")
		|| isLoaded(PluginMekanism.MODID)
		|| isLoaded(PluginProjectRed.MODID)
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + COPPER)
			&& !isLoaded("libvulpes")) {
				regCustomStick(copper_stick, stickCopper, COPPER, "copper");
			}
		}
		//Electrum
		if (oreNameExists(INGOT + ELECTRUM)
		|| isLoaded(PluginImmersiveEngineering.MODID)
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + ELECTRUM)) {
				regCustomStick(electrum_stick, stickElectrum, ELECTRUM, "electrum");
			}
		}
		//Enderium
		if (oreNameExists(INGOT + ENDERIUM)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + ENDERIUM)) {
				regCustomStick(enderium_stick, stickEnderium, ENDERIUM, "enderium");
			}
		}
		//Invar
		if (oreNameExists(INGOT + INVAR)
		|| isLoaded(PluginPlusTiC.MODID)
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + INVAR)) {
				regCustomStick(invar_stick, stickInvar, INVAR, "invar");
			}
		}
		//Iridium
		if (oreNameExists(INGOT + IRIDIUM)
		//|| isLoaded("advancedsolarpanels")
		|| isLoaded("libvulpes")
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + IRIDIUM)
			&& !isLoaded("libvulpes")) {
				regCustomStick(iridium_stick, stickIridium, IRIDIUM, "iridium");
			}
		}
		//Lead
		if (oreNameExists(INGOT + LEAD)
		|| isLoaded(PluginImmersiveEngineering.MODID)
		|| isLoaded(PluginIndustrialCraft2.MODID)
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + LEAD)) {
				regCustomStick(lead_stick, stickLead, LEAD, "lead");
			}
		}
		//Lumium
		if (oreNameExists(INGOT + LUMIUM)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + LUMIUM)) {
				regCustomStick(lumium_stick, stickLumium, LUMIUM, "lumium");
			}
		}
		//Mana Infused
		if (oreNameExists(INGOT + MITHRIL)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + MITHRIL)) {
				regCustomStick(mithril_stick, stickMithril, MITHRIL, "mana_infused");
			}
		}
		//Nickel
		if (oreNameExists(INGOT + NICKEL)
		|| isLoaded(PluginImmersiveEngineering.MODID)
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + NICKEL)) {
				regCustomStick(nickel_stick, stickNickel, NICKEL, "nickel");
			}
		}
		//Platinum
		if (oreNameExists(INGOT + PLATINUM)
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + PLATINUM)) {
				regCustomStick(platinum_stick, stickPlatinum, PLATINUM, "platinum");
			}
		}
		//Signalum
		if (oreNameExists(INGOT + SIGNALUM)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + SIGNALUM)) {
				regCustomStick(signalum_stick, stickSignalum, SIGNALUM, "signalum");
			}
		}
		//Silicon
		if (oreNameExists(ITEM + SILICON)
		|| checkAE()
		|| checkRS()) {
			if (!oreNameExists(GEAR + SILICON)) {
				regCustomGear(silicon_gear, gearSilicon, SILICON, "silicon");
			}
			if (!oreNameExists(PLATE + SILICON)
			&& !isLoaded("libvulpes")) {
				regCustomPlate(silicon_plate, plateSilicon, SILICON, "silicon");
			}
		}
		//Silver
		if (oreNameExists(INGOT + SILVER)
		|| isLoaded(PluginImmersiveEngineering.MODID)
		|| isLoaded(PluginIndustrialCraft2.MODID)
		|| isLoaded(PluginProjectRed.MODID)
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + SILVER)) {
				regCustomStick(silver_stick, stickSilver, SILVER, "silver");
			}
		}
		//Steel
		if (oreNameExists(INGOT + STEEL)
		|| isLoaded(PluginImmersiveEngineering.MODID)
		|| isLoaded(PluginIndustrialCraft2.MODID)
		|| isLoaded("libvulpes")
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(GEAR + STEEL)
			&& !isLoaded("libvulpes")
			&& !isLoaded("thermalfoundation")) {
				regCustomGear(steel_gear, gearSteel, STEEL, "steel");
			}
			if (!oreNameExists(PLATE + STEEL)
			&& !isLoaded(PluginImmersiveEngineering.MODID)
			&& !isLoaded(PluginIndustrialCraft2.MODID)
			&& !isLoaded("libvulpes")
			&& !isLoaded(PluginTechReborn.MODID)
			&& !isLoaded("thermalfoundation")) {
				regCustomPlate(steel_plate, plateSteel, STEEL, "steel");
			}
			if (!oreNameExists(STICK + STEEL)
			&& !isLoaded(PluginImmersiveEngineering.MODID)
			&& !isLoaded("libvulpes")) {
				regCustomStick(steel_stick, stickSteel, STEEL, "steel");
			}
		}
		//Tin
		if (oreNameExists(INGOT + TIN)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + TIN)) {
				regCustomStick(tin_stick, stickTin, TIN, "tin");
			}
		}
	}
	private boolean checkAE() {
		return getBoolean(PluginAppliedEnergistics2.MODNAME, CATEGORY_PLUGINS, "Enable this to load " + PluginAppliedEnergistics2.MODNAME + " plugin") && isLoaded(PluginAppliedEnergistics2.MODID);
	}
	private boolean checkRS() {
		return getBoolean(PluginRefinedStorage.MODNAME, CATEGORY_PLUGINS, "Enable this to load " + PluginRefinedStorage.MODNAME + " plugin") && isLoaded(PluginRefinedStorage.MODID);
	}
}