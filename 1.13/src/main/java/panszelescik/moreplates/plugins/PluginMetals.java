package panszelescik.moreplates.plugins;

import panszelescik.moreplates.plugins.core.Plugin;
import panszelescik.moreplates.plugins.helpers.PluginHelper;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = "", modname = PluginMetals.MODNAME, checkModid = false)
public class PluginMetals extends PluginHelper {

    public static final String MODNAME = "Metals";

    @Plugin.PreInit
    public static void preInit() {
        regStick(ALUMINUM);
    }

    /*@Plugin.PreInit
    public static void preInit() {
        //Aluminum
        if (oreNameExists(ALUMINUM)
                || isLoaded("libvulpes")
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(ALUMINUM, Type.STICK)
                    && !isLoaded(PluginImmersiveEngineering.MODID)) {
                regStick(ALUMINUM);
            }
        }
        //Bronze
        if (oreNameExists(BRONZE)
                || isLoaded("forestry")
                || isLoaded(PluginIndustrialCraft2.MODID)
                || isLoaded(PluginMekanism.MODID)
                || isLoaded(PluginTechReborn.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(BRONZE, Type.STICK)) {
                regStick(BRONZE);
            }
        }
        //Constantan
        if (oreNameExists(CONSTANTAN)
                || isLoaded(PluginImmersiveEngineering.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(CONSTANTAN, Type.STICK)) {
                regStick(CONSTANTAN);
            }
        }
        //Copper
        if (oreNameExists(COPPER)
                || isLoaded("forestry")
                || isLoaded(PluginImmersiveEngineering.MODID)
                || isLoaded(PluginIndustrialCraft2.MODID)
                || isLoaded("libvulpes")
                || isLoaded(PluginMekanism.MODID)
                || isLoaded(PluginProjectRed.MODID)
                || isLoaded(PluginTechReborn.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(COPPER, Type.STICK)
                    && !isLoaded("libvulpes")) {
                regStick(COPPER);
            }
        }
        //Electrum
        if (oreNameExists(ELECTRUM)
                || isLoaded(PluginImmersiveEngineering.MODID)
                || isLoaded(PluginTechReborn.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(ELECTRUM, Type.STICK)) {
                regStick(ELECTRUM);
            }
        }
        //Enderium
        if (oreNameExists(ENDERIUM)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(ENDERIUM, Type.STICK)) {
                regStick(ENDERIUM);
            }
        }
        //Invar
        if (oreNameExists(INVAR)
                || isLoaded(PluginPlusTiC.MODID)
                || isLoaded(PluginTechReborn.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(INVAR, Type.STICK)) {
                regStick(INVAR);
            }
        }
        //Iridium
        if (oreNameExists(IRIDIUM)
                || isLoaded("advanced_solar_panels")
                || isLoaded("libvulpes")
                || isLoaded(PluginTechReborn.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(IRIDIUM, Type.STICK)
                    && !isLoaded("libvulpes")) {
                regStick(IRIDIUM);
            }
        }
        //Lead
        if (oreNameExists(LEAD)
                || isLoaded(PluginImmersiveEngineering.MODID)
                || isLoaded(PluginIndustrialCraft2.MODID)
                || isLoaded(PluginTechReborn.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(LEAD, Type.STICK)) {
                regStick(LEAD);
            }
        }
        //Lumium
        if (oreNameExists(LUMIUM)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(LUMIUM, Type.STICK)) {
                regStick(LUMIUM);
            }
        }
        //Mana Infused
        if (oreNameExists(MANA_INFUSED)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(MANA_INFUSED, Type.STICK)) {
                regStick(MANA_INFUSED);
            }
        }
        //Nickel
        if (oreNameExists(NICKEL)
                || isLoaded(PluginImmersiveEngineering.MODID)
                || isLoaded(PluginTechReborn.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(NICKEL, Type.STICK)) {
                regStick(NICKEL);
            }
        }
        //Platinum
        if (oreNameExists(PLATINUM)
                || isLoaded(PluginTechReborn.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(PLATINUM, Type.STICK)) {
                regStick(PLATINUM);
            }
        }
        //Signalum
        if (oreNameExists(SIGNALUM)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(SIGNALUM, Type.STICK)) {
                regStick(SIGNALUM);
            }
        }
        //Silicon
        if (oreNameExists(SILICONN)
                || oreNameExists(SILICON)
                || checkAE()
                || checkRS()) {
            if (!oreNameExists(SILICON, Type.GEAR)) {
                regGear(SILICON);
            }
            if (!oreNameExists(SILICON, Type.PLATE)
                    && !isLoaded("libvulpes")) {
                regPlate(SILICON);
            }
        }
        //Silver
        if (oreNameExists(SILVER)
                || isLoaded(PluginImmersiveEngineering.MODID)
                || isLoaded(PluginIndustrialCraft2.MODID)
                || isLoaded(PluginProjectRed.MODID)
                || isLoaded(PluginTechReborn.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(SILVER, Type.STICK)) {
                regStick(SILVER);
            }
        }
        //Steel
        if (oreNameExists(STEEL)
                || isLoaded(PluginImmersiveEngineering.MODID)
                || isLoaded(PluginIndustrialCraft2.MODID)
                || isLoaded("libvulpes")
                || isLoaded(PluginTechReborn.MODID)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(STEEL, Type.GEAR)
                    && !isLoaded("libvulpes")
                    && !isLoaded("thermalfoundation")) {
                regGear(STEEL);
            }
            if (!oreNameExists(STEEL, Type.PLATE)
                    && !isLoaded(PluginImmersiveEngineering.MODID)
                    && !isLoaded(PluginIndustrialCraft2.MODID)
                    && !isLoaded("libvulpes")
                    && !isLoaded(PluginTechReborn.MODID)
                    && !isLoaded("thermalfoundation")) {
                regPlate(STEEL);
            }
            if (!oreNameExists(STEEL, Type.STICK)
                    && !isLoaded(PluginImmersiveEngineering.MODID)
                    && !isLoaded("libvulpes")) {
                regStick(STEEL);
            }
        }
        //Tin
        if (oreNameExists(TIN)
                || isLoaded("thermalfoundation")) {
            if (!oreNameExists(TIN, Type.STICK)) {
                regStick(TIN);
            }
        }
    }*/

    /*@Plugin.PostInit
    public static void postInit() {
        add(ALUMINUM, false, false, contains("aluminum_stick"));
        add(BRONZE, false, false, contains("bronze_stick"));
        add(CONSTANTAN, false, false, contains("constantan_stick"));
        add(COPPER, false, false, contains("copper_stick"));
        add(ELECTRUM, false, false, contains("electrum_stick"));
        add(ENDERIUM, false, false, contains("enderium_stick"));
        add(INVAR, false, false, contains("invar_stick"));
        add(IRIDIUM, false, false, contains("iridium_stick"));
        add(LEAD, false, false, contains("lead_stick"));
        add(LUMIUM, false, false, contains("lumium_stick"));
        add(MANA_INFUSED, false, false, contains("mana_infused_stick"));
        add(NICKEL, false, false, contains("nickel_stick"));
        add(PLATINUM, false, false, contains("platinum_stick"));
        add(SIGNALUM, false, false, contains("signalum_stick"));
        add(SILICONN, contains("silicon_gear"), contains("silicon_plate"));
        add(SILICON, contains("silicon_gear"), contains("silicon_plate"));
        add(SILVER, false, false, contains("silver_stick"));
        add(STEEL, contains("steel_gear"), contains("steel_plate"), contains("steel_stick"));
        add(TIN, false, false, contains("tin_stick"));

        addBlock(STEEL, 9, contains("steel_plate"));
    }

    private static boolean checkAE() {
        return Config.getBoolean(PluginAppliedEnergistics2.MODNAME, Config.CATEGORY_PLUGINS, "Enable this to load " + PluginAppliedEnergistics2.MODNAME + " plugin") && isLoaded(PluginAppliedEnergistics2.MODID);
    }

    private static boolean checkRS() {
        return Config.getBoolean(PluginRefinedStorage.MODNAME, Config.CATEGORY_PLUGINS, "Enable this to load " + PluginRefinedStorage.MODNAME + " plugin") && isLoaded(PluginRefinedStorage.MODID);
    }*/
}