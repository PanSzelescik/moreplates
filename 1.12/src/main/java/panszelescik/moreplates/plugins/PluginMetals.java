package panszelescik.moreplates.plugins;

import panszelescik.moreplates.config.Config;
import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = "", modname = PluginMetals.MODNAME, checkModid = false)
public class PluginMetals extends PluginHelper {

    public static final String MODNAME = "Metals";

    @Plugin.PreInit
    public static void preInit() {
        //Aluminum
        if (oreNameExists(INGOT + ALUMINUM)
                || isLoaded("libvulpes")
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(STICK + ALUMINUM)
                    && !isLoaded(PluginImmersiveEngineering.MODID)) {
                regStick("aluminum", ALUMINUM);
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
                regStick("bronze", BRONZE);
            }
        }
        //Constantan
        if (oreNameExists(INGOT + CONSTANTAN)
                || isLoaded(PluginImmersiveEngineering.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(STICK + CONSTANTAN)) {
                regStick("constantan", CONSTANTAN);
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
                regStick("copper", COPPER);
            }
        }
        //Electrum
        if (oreNameExists(INGOT + ELECTRUM)
                || isLoaded(PluginImmersiveEngineering.MODID)
                || isLoaded(PluginTechReborn.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(STICK + ELECTRUM)) {
                regStick("electrum", ELECTRUM);
            }
        }
        //Enderium
        if (oreNameExists(INGOT + ENDERIUM)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(STICK + ENDERIUM)) {
                regStick("enderium", ENDERIUM);
            }
        }
        //Invar
        if (oreNameExists(INGOT + INVAR)
                || isLoaded(PluginPlusTiC.MODID)
                || isLoaded(PluginTechReborn.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(STICK + INVAR)) {
                regStick("invar", INVAR);
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
                regStick("iridium", IRIDIUM);
            }
        }
        //Lead
        if (oreNameExists(INGOT + LEAD)
                || isLoaded(PluginImmersiveEngineering.MODID)
                || isLoaded(PluginIndustrialCraft2.MODID)
                || isLoaded(PluginTechReborn.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(STICK + LEAD)) {
                regStick("lead", LEAD);
            }
        }
        //Lumium
        if (oreNameExists(INGOT + LUMIUM)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(STICK + LUMIUM)) {
                regStick("lumium", LUMIUM);
            }
        }
        //Mana Infused
        if (oreNameExists(INGOT + MITHRIL)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(STICK + MITHRIL)) {
                regStick("mana_infused", MITHRIL);
            }
        }
        //Nickel
        if (oreNameExists(INGOT + NICKEL)
                || isLoaded(PluginImmersiveEngineering.MODID)
                || isLoaded(PluginTechReborn.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(STICK + NICKEL)) {
                regStick("nickel", NICKEL);
            }
        }
        //Platinum
        if (oreNameExists(INGOT + PLATINUM)
                || isLoaded(PluginTechReborn.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(STICK + PLATINUM)) {
                regStick("platinum", PLATINUM);
            }
        }
        //Signalum
        if (oreNameExists(INGOT + SIGNALUM)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(STICK + SIGNALUM)) {
                regStick("signalum", SIGNALUM);
            }
        }
        //Silicon
        if (oreNameExists(INGOT + SILICON)
                || oreNameExists(ITEM + SILICON)
                || checkAE()
                || checkRS()) {
            if (!oreNameExists(GEAR + SILICON)) {
                regGear("silicon", SILICON);
            }
            if (!oreNameExists(PLATE + SILICON)
                    && !isLoaded("libvulpes")) {
                regPlate("silicon", SILICON);
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
                regStick("silver", SILVER);
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
                regGear("steel", STEEL);
            }
            if (!oreNameExists(PLATE + STEEL)
                    && !isLoaded(PluginImmersiveEngineering.MODID)
                    && !isLoaded(PluginIndustrialCraft2.MODID)
                    && !isLoaded("libvulpes")
                    && !isLoaded(PluginTechReborn.MODID)
                    && !isLoaded("thermalfoundation")) {
                regPlate("steel", STEEL);
            }
            if (!oreNameExists(STICK + STEEL)
                    && !isLoaded(PluginImmersiveEngineering.MODID)
                    && !isLoaded("libvulpes")) {
                regStick("steel", STEEL);
            }
        }
        //Tin
        if (oreNameExists(INGOT + TIN)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(STICK + TIN)) {
                regStick("tin", TIN);
            }
        }
    }

    @Plugin.PostInit
    public static void postInit() {
        add(ALUMINUM, INGOT + ALUMINUM, false, false, contains("aluminum_stick"));
        add(BRONZE, INGOT + BRONZE, false, false, contains("bronze_stick"));
        add(CONSTANTAN, INGOT + CONSTANTAN, false, false, contains("constantan_stick"));
        add(COPPER, INGOT + COPPER, false, false, contains("copper_stick"));
        add(ELECTRUM, INGOT + ELECTRUM, false, false, contains("electrum_stick"));
        add(ENDERIUM, INGOT + ENDERIUM, false, false, contains("enderium_stick"));
        add(INVAR, INGOT + INVAR, false, false, contains("invar_stick"));
        add(IRIDIUM, INGOT + IRIDIUM, false, false, contains("iridium_stick"));
        add(LEAD, INGOT + LEAD, false, false, contains("lead_stick"));
        add(LUMIUM, INGOT + LUMIUM, false, false, contains("lumium_stick"));
        add(MITHRIL, INGOT + MITHRIL, false, false, contains("mithril_stick"));
        add(NICKEL, INGOT + NICKEL, false, false, contains("nickel_stick"));
        add(PLATINUM, INGOT + PLATINUM, false, false, contains("platinum_stick"));
        add(SIGNALUM, INGOT + SIGNALUM, false, false, contains("signalum_stick"));
        add(SILICON, INGOT + SILICON, contains("silicon_gear"), contains("silicon_plate"));
        add(SILICON, ITEM + SILICON, contains("silicon_gear"), contains("silicon_plate"));
        add(SILVER, INGOT + SILVER, false, false, contains("silver_stick"));
        add(STEEL, INGOT + STEEL, contains("steel_gear"), contains("steel_plate"), contains("steel_stick"));
        add(TIN, INGOT + TIN, false, false, contains("tin_stick"));

        addBlock(STEEL, 9, contains("steel_plate"));
    }

    private static boolean checkAE() {
        return Config.getBoolean(PluginAppliedEnergistics2.MODNAME, Config.CATEGORY_PLUGINS, "Enable this to load " + PluginAppliedEnergistics2.MODNAME + " plugin") && isLoaded(PluginAppliedEnergistics2.MODID);
    }

    private static boolean checkRS() {
        return Config.getBoolean(PluginRefinedStorage.MODNAME, Config.CATEGORY_PLUGINS, "Enable this to load " + PluginRefinedStorage.MODNAME + " plugin") && isLoaded(PluginRefinedStorage.MODID);
    }
}