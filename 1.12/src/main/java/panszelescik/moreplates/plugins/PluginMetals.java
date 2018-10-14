package panszelescik.moreplates.plugins;

import static panszelescik.moreplates.config.Config.*;

public class PluginMetals extends PluginBase {
	
	public PluginMetals() {
		super("", "Metals");
	}
	
	public static boolean stickAluminum, stickBronze, stickConstantan, stickCopper, stickElectrum, stickEnderium, stickInvar, stickIridium, stickLead, stickLumium, stickMithril, stickNickel, stickPlatinum, stickSignalum, gearSilicon, plateSilicon, stickSilver, gearSteel, plateSteel, stickSteel, stickTin;
	
	public void preInit() {
		//Aluminum
		if (oreNameExists(INGOT + ALUMINUM)
		|| isLoaded("libvulpes")
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + ALUMINUM)
			&& !isLoaded(PluginImmersiveEngineering.MODID)) {
				regCustomStick(stickAluminum, ALUMINUM, "aluminum");
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
				regCustomStick(stickBronze, BRONZE, "bronze");
			}
		}
		//Constantan
		if (oreNameExists(INGOT + CONSTANTAN)
		|| isLoaded(PluginImmersiveEngineering.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + CONSTANTAN)) {
				regCustomStick(stickConstantan, CONSTANTAN, "constantan");
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
				regCustomStick(stickCopper, COPPER, "copper");
			}
		}
		//Electrum
		if (oreNameExists(INGOT + ELECTRUM)
		|| isLoaded(PluginImmersiveEngineering.MODID)
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + ELECTRUM)) {
				regCustomStick(stickElectrum, ELECTRUM, "electrum");
			}
		}
		//Enderium
		if (oreNameExists(INGOT + ENDERIUM)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + ENDERIUM)) {
				regCustomStick(stickEnderium, ENDERIUM, "enderium");
			}
		}
		//Invar
		if (oreNameExists(INGOT + INVAR)
		|| isLoaded(PluginPlusTiC.MODID)
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + INVAR)) {
				regCustomStick(stickInvar, INVAR, "invar");
			}
		}
		//Iridium
		if (oreNameExists(INGOT + IRIDIUM)
		|| isLoaded("advanced_solar_panels")
		|| isLoaded("libvulpes")
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + IRIDIUM)
			&& !isLoaded("libvulpes")) {
				regCustomStick(stickIridium, IRIDIUM, "iridium");
			}
		}
		//Lead
		if (oreNameExists(INGOT + LEAD)
		|| isLoaded(PluginImmersiveEngineering.MODID)
		|| isLoaded(PluginIndustrialCraft2.MODID)
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + LEAD)) {
				regCustomStick(stickLead, LEAD, "lead");
			}
		}
		//Lumium
		if (oreNameExists(INGOT + LUMIUM)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + LUMIUM)) {
				regCustomStick(stickLumium, LUMIUM, "lumium");
			}
		}
		//Mana Infused
		if (oreNameExists(INGOT + MITHRIL)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + MITHRIL)) {
				regCustomStick(stickMithril, MITHRIL, "mana_infused");
			}
		}
		//Nickel
		if (oreNameExists(INGOT + NICKEL)
		|| isLoaded(PluginImmersiveEngineering.MODID)
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + NICKEL)) {
				regCustomStick(stickNickel, NICKEL, "nickel");
			}
		}
		//Platinum
		if (oreNameExists(INGOT + PLATINUM)
		|| isLoaded(PluginTechReborn.MODID)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + PLATINUM)) {
				regCustomStick(stickPlatinum, PLATINUM, "platinum");
			}
		}
		//Signalum
		if (oreNameExists(INGOT + SIGNALUM)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + SIGNALUM)) {
				regCustomStick(stickSignalum, SIGNALUM, "signalum");
			}
		}
		//Silicon
		if (oreNameExists(INGOT + SILICON)
		|| oreNameExists(ITEM + SILICON)
		|| checkAE()
		|| checkRS()) {
			if (!oreNameExists(GEAR + SILICON)) {
				regCustomGear(gearSilicon, SILICON, "silicon");
			}
			if (!oreNameExists(PLATE + SILICON)
			&& !isLoaded("libvulpes")) {
				regCustomPlate(plateSilicon, SILICON, "silicon");
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
				regCustomStick(stickSilver, SILVER, "silver");
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
				regCustomGear(gearSteel, STEEL, "steel");
			}
			if (!oreNameExists(PLATE + STEEL)
			&& !isLoaded(PluginImmersiveEngineering.MODID)
			&& !isLoaded(PluginIndustrialCraft2.MODID)
			&& !isLoaded("libvulpes")
			&& !isLoaded(PluginTechReborn.MODID)
			&& !isLoaded("thermalfoundation")) {
				regCustomPlate(plateSteel, STEEL, "steel");
			}
			if (!oreNameExists(STICK + STEEL)
			&& !isLoaded(PluginImmersiveEngineering.MODID)
			&& !isLoaded("libvulpes")) {
				regCustomStick(stickSteel, STEEL, "steel");
			}
		}
		//Tin
		if (oreNameExists(INGOT + TIN)
		|| isLoaded("thermalfoundation")) {
			if (!oreNameExists(STICK + TIN)) {
				regCustomStick(stickTin, TIN, "tin");
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