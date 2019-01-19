package panszelescik.moreplates.plugins;

import panszelescik.morelibs.api.Helper;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.helpers.*;
import panszelescik.moreplates.init.Plugin;
import panszelescik.moreplates.init.PluginLoader;

@Plugin(modid = "", modname = "Recipe Adder", checkModid = false, checkConfig = false)
public class PluginRecipeAdder extends PluginHelper {

    @Plugin.PostInit
    public static void postInit() {
        if (icEnabled() || ieEnabled() || thEnabled() || teEnabled()) {
            if (PluginLoader.isLoaded(PluginMinecraft.MODNAME)) {
                add(COAL, "coal", contains("coal_gear"), contains("coal_plate"));
                add(DIAMOND, GEM + DIAMOND, contains("diamond_gear"), contains("diamond_plate"));
                add(EMERALD, GEM + EMERALD, contains("emerald_gear"), contains("emerald_plate"));
                add(GLOWSTONE, DUST + GLOWSTONE, contains("glowstone_gear"), contains("glowstone_plate"));
                add(GOLD, INGOT + GOLD, contains("gold_gear"), contains("gold_plate"), contains("gold_stick"));
                add(IRON, INGOT + IRON, contains("iron_gear"), contains("iron_plate"), contains("iron_stick"));
                add(LAPIS, GEM + LAPIS, contains("lapis_lazuli_gear"), contains("lapis_lazuli_plate"));
                add(QUARTZ, GEM + QUARTZ, contains("nether_quartz_gear"), contains("nether_quartz_plate"));
                add(REDSTONE, DUST + REDSTONE, contains("redstone_gear"), contains("redstone_plate"));

                addBlock(COAL, 9, contains("coal_plate"));
                addBlock(DIAMOND, 9, contains("diamond_plate"));
                addBlock(EMERALD, 9, contains("emerald_plate"));
                addBlock(GLOWSTONE, 4, contains("glowstone_plate"));
                addBlock(GOLD, 9, contains("gold_plate"));
                addBlock(IRON, 9, contains("iron_plate"));
                addBlock(LAPIS, 9, contains("lapis_lazuli_plate"));
                addBlock(QUARTZ, 4, contains("nether_quartz_plate"));
                addBlock(REDSTONE, 9, contains("redstone_plate"));
            }
            if (PluginLoader.isLoaded(PluginMetals.MODNAME)) {
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
            if (PluginLoader.isLoaded(PluginActuallyAdditions.MODNAME)) {
                String id = PluginActuallyAdditions.MODID;
                add(BLACK_QUARTZ, GEM + BLACK_QUARTZ);
                add(DIAMATINE, CRYSTAL_NAME, id, DIAMATINE_META);
                add(EMERADIC, CRYSTAL_NAME, id, EMERADIC_META);
                add(ENORI, CRYSTAL_NAME, id, ENORI_META);
                add(PALIS, CRYSTAL_NAME, id, PALIS_META);
                add(RESTONIA, CRYSTAL_NAME, id, RESTONIA_META);
                add(VOID, CRYSTAL_NAME, id, VOID_META);

                add(EMPOWERED_DIAMATINE, EMPOWERED_CRYSTAL_NAME, id, DIAMATINE_META);
                add(EMPOWERED_EMERADIC, EMPOWERED_CRYSTAL_NAME, id, EMERADIC_META);
                add(EMPOWERED_ENORI, EMPOWERED_CRYSTAL_NAME, id, ENORI_META);
                add(EMPOWERED_PALIS, EMPOWERED_CRYSTAL_NAME, id, PALIS_META);
                add(EMPOWERED_RESTONIA, EMPOWERED_CRYSTAL_NAME, id, RESTONIA_META);
                add(EMPOWERED_VOID, EMPOWERED_CRYSTAL_NAME, id, VOID_META);

                addBlock(BLACK_QUARTZ, BLACK_QUARTZ_BLOCK_NAME, 4, id, 2);
                addBlock(DIAMATINE, CRYSTAL_BLOCK_NAME, 9, id, DIAMATINE_META);
                addBlock(EMERADIC, CRYSTAL_BLOCK_NAME, 9, id, EMERADIC_META);
                addBlock(ENORI, CRYSTAL_BLOCK_NAME, 9, id, ENORI_META);
                addBlock(PALIS, CRYSTAL_BLOCK_NAME, 9, id, PALIS_META);
                addBlock(RESTONIA, CRYSTAL_BLOCK_NAME, 9, id, RESTONIA_META);
                addBlock(VOID, CRYSTAL_BLOCK_NAME, 9, id, VOID_META);

                addBlock(EMPOWERED_DIAMATINE, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, DIAMATINE_META);
                addBlock(EMPOWERED_EMERADIC, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, EMERADIC_META);
                addBlock(EMPOWERED_ENORI, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, ENORI_META);
                addBlock(EMPOWERED_PALIS, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, PALIS_META);
                addBlock(EMPOWERED_RESTONIA, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, RESTONIA_META);
                addBlock(EMPOWERED_VOID, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, VOID_META);
            }
            if (PluginLoader.isLoaded(PluginAppliedEnergistics2.MODNAME)) {
                String id = PluginAppliedEnergistics2.MODID;
                add(CERTUS_QUARTZ, CRYSTAL + CERTUS_QUARTZ);
                add(CERTUS_QUARTZ, PURE_CERTUS_QUARTZ_NAME, id, PURE_CERTUS_QUARTZ_META);
                add(FLUIX, CRYSTAL + FLUIX);
                add(FLUIX, CRYSTAL + PURE_FLUIX);

                addBlock(CERTUS_QUARTZ, CERTUS_QUARTZ_BLOCK_NAME, 4, id);
                addBlock(FLUIX, FLUIX_BLOCK_NAME, 4, id);
            }
            if (PluginLoader.isLoaded(PluginAvaritia.MODNAME)) {
                add(CRYSTAL_MATRIX, INGOT + CRYSTAL_MATRIX);
                add(INFINITY, INGOT + INFINITY);
                add(NEUTRONIUM, INGOT + NEUTRONIUM);

                addBlock(CRYSTAL_MATRIX, 9);
                addBlock(INFINITY, 9);
                addBlock(NEUTRONIUM, 9);
            }
            if (PluginLoader.isLoaded(PluginBotania.MODNAME)) {
                String id = PluginBotania.MODID;
                add(ELEMENTIUM, INGOT + ELEMENTIUM);
                addGaia(GAIA_SPIRIT, GAIA_SPIRIT + "Ingot");
                add(MANASTEEL, INGOT + MANASTEEL);
                add(TERRASTEEL, INGOT + TERRASTEEL);

                addBlock(ELEMENTIUM, BOTANIA_NAME, 9, id, ELEMENTIUM_META);
                addBlock(MANASTEEL, BOTANIA_NAME, 9, id, MANASTEEL_META);
                addBlock(TERRASTEEL, BOTANIA_NAME, 9, id, TERRASTEEL_META);
            }
            if (PluginLoader.isLoaded(PluginCalculator.MODNAME)) {
                String id = PluginCalculator.MODID;
                add(AMETHYST, GEM + AMETHYST);
                add(ENRICHED_GOLD, INGOT + ENRICHED_GOLD);
                add(REINFORCED_IRON, REINFORCED_IRON_NAME, id);
                add(TANZANITE, GEM + TANZANITE);

                addBlock(ENRICHED_GOLD, CALCULATOR_NAME, 9, id, ENRICHED_GOLD_BLOCK_META);
                addBlock(REINFORCED_IRON, CALCULATOR_NAME, 9, id, REINFORCED_IRON_BLOCK_META);
            }
            if (PluginLoader.isLoaded(PluginDraconicEvolution.MODNAME)) {
                add(AWAKENED_DRACONIUM, INGOT + AWAKENED_DRACONIUM);
                add(DRACONIUM, INGOT + DRACONIUM);

                addBlock(AWAKENED_DRACONIUM, 9);
                addBlock(DRACONIUM, 9);
            }
            if (PluginLoader.isLoaded(PluginEnderIO.MODNAME)) {
                add(CONDUCTIVE_IRON, INGOT + CONDUCTIVE_IRON);
                add(DARK_STEEL, INGOT + DARK_STEEL);
                add(ELECTRICAL_STEEL, INGOT + ELECTRICAL_STEEL);
                add(END_STEEL, INGOT + END_STEEL);
                add(ENERGETIC_ALLOY, INGOT + ENERGETIC_ALLOY);
                add(IRON_ALLOY, INGOT + IRON_ALLOY);
                add(PULSATING_IRON, INGOT + PULSATING_IRON);
                add(REDSTONE_ALLOY, INGOT + REDSTONE_ALLOY);
                add(SOULARIUM, INGOT + SOULARIUM);
                add(VIBRANT_ALLOY, INGOT + VIBRANT_ALLOY);

                addBlock(CONDUCTIVE_IRON, 9);
                addBlock(DARK_STEEL, 9);
                addBlock(ELECTRICAL_STEEL, 9);
                addBlock(END_STEEL, 9);
                addBlock(ENERGETIC_ALLOY, 9);
                addBlock(IRON_ALLOY, 9);
                addBlock(PULSATING_IRON, 9);
                addBlock(REDSTONE_ALLOY, 9);
                addBlock(SOULARIUM, 9);
                addBlock(VIBRANT_ALLOY, 9);
            }
            if (PluginLoader.isLoaded(PluginEnderIOEndergy.MODNAME)) {
                add(CRUDE_STEEL, INGOT + CRUDE_STEEL);
                add(CRYSTALLINE_ALLOY, INGOT + CRYSTALLINE_ALLOY);
                add(CRYSTALLINE_PINK_SLIME, INGOT + CRYSTALLINE_PINK_SLIME);
                add(ENERGETIC_SILVER, INGOT + ENERGETIC_SILVER);
                add(MELODIC_ALLOY, INGOT + MELODIC_ALLOY);
                add(STELLAR_ALLOY, INGOT + STELLAR_ALLOY);
                add(VIVID_ALLOY, INGOT + VIVID_ALLOY);

                addBlock(CRUDE_STEEL, 9);
                addBlock(CRYSTALLINE_ALLOY, 9);
                addBlock(CRYSTALLINE_PINK_SLIME, 9);
                addBlock(ENERGETIC_SILVER, 9);
                addBlock(MELODIC_ALLOY, 9);
                addBlock(STELLAR_ALLOY, 9);
                addBlock(VIVID_ALLOY, 9);
            }
            if (PluginLoader.isLoaded(PluginExtraUtilities.MODNAME)) {
                add(DEMON, INGOT + DEMON);
                add(ENCHANTED, INGOT + ENCHANTED);
                add(EVIL_INFUSED_IRON, INGOT + EVIL_INFUSED_IRON);

                addBlock(DEMON, 9);
                addBlock(ENCHANTED, 9);
                addBlock(EVIL_INFUSED_IRON, 9);
            }
            if (PluginLoader.isLoaded(PluginMekanism.MODNAME)) {
                add(OSMIUM, INGOT + OSMIUM);
                add(REFINED_GLOWSTONE, INGOT + REFINED_GLOWSTONE);
                add(REFINED_OBSIDIAN, INGOT + REFINED_OBSIDIAN);

                addBlock(OSMIUM, 9);
                addBlock(REFINED_GLOWSTONE, 9);
                addBlock(REFINED_OBSIDIAN, 9);
            }
            if (PluginLoader.isLoaded(PluginMysticalAgradditions.MODNAME)) {
                add(INSANIUM, INGOT + INSANIUM);

                addBlock(INSANIUM, 9);
            }
            if (PluginLoader.isLoaded(PluginMysticalAgriculture.MODNAME)) {
                add(INFERIUM, INGOT + INFERIUM);
                add(INTERMEDIUM, INGOT + INTERMEDIUM);
                add(PRUDENTIUM, INGOT + PRUDENTIUM);
                add(SOULIUM, INGOT + SOULIUM);
                add(SUPERIUM, INGOT + SUPERIUM);
                add(SUPREMIUM, INGOT + SUPREMIUM);

                addBlock(INFERIUM, 9);
                addBlock(INTERMEDIUM, 9);
                addBlock(PRUDENTIUM, 9);
                addBlock(SOULIUM, 9);
                addBlock(SUPERIUM, 9);
                addBlock(SUPREMIUM, 9);
            }
            if (PluginLoader.isLoaded(PluginPlusTiC.MODNAME)) {
                add(ALUMITE, INGOT + ALUMITE);
                add(MIRION, INGOT + MIRION);
                add(OSGLOGLAS, INGOT + OSGLOGLAS);
                add(OSMIRIDIUM, INGOT + OSMIRIDIUM);

                addBlock(ALUMITE, 9);
                addBlock(MIRION, 9);
                addBlock(OSGLOGLAS, 9);
                addBlock(OSMIRIDIUM, 9);
            }
            if (PluginLoader.isLoaded(PluginPneumaticCraft.MODNAME)) {
                add(COMPRESSED_IRON, INGOT + COMPRESSED_IRON);

                addBlock(COMPRESSED_IRON, 9);
            }
            if (PluginLoader.isLoaded(PluginProjectE.MODNAME)) {
                String id = PluginProjectE.MODID;
                add(DARK_MATTER, MATTER_NAME, id, DARK_MATTER_META);
                add(RED_MATTER, MATTER_NAME, id, RED_MATTER_META);

                addBlock(DARK_MATTER, MATTER_BLOCK_NAME, 4, id, DARK_MATTER_META);
                addBlock(RED_MATTER, MATTER_BLOCK_NAME, 4, id, RED_MATTER_META);
            }
            if (PluginLoader.isLoaded(PluginProjectRed.MODNAME)) {
                add(ELECTROTINE, INGOT + ELECTROTINE);
                add(RED_ALLOY, INGOT + RED_ALLOY);
            }
            if (PluginLoader.isLoaded(PluginRefinedStorage.MODNAME)) {
                String id = PluginRefinedStorage.MODID;
                add(QUARTZ_ENRICHED_IRON, QUARTZ_ENRICHED_IRON_NAME, id);

                addBlock(QUARTZ_ENRICHED_IRON, QUARTZ_ENRICHED_IRON_BLOCK_NAME, 9, id);
            }
            if (PluginLoader.isLoaded(PluginSoulShards.MODNAME)) {
                add(CORRUPTED, INGOT + CORRUPTED);
            }
            if (PluginLoader.isLoaded(PluginThaumcraft.MODNAME)) {
                String id = PluginThaumcraft.MODID;
                add(AMBER, GEM + AMBER);
                add(QUICKSILVER, "quicksilver");

                addBlock(AMBER, AMBER_BLOCK_NAME, 9, id);
            }
            if (PluginLoader.isLoaded(PluginTinkersConstruct.MODNAME)) {
                add(ARDITE, INGOT + ARDITE);
                add(COBALT, INGOT + COBALT);
                add(KNIGHTSLIME, INGOT + KNIGHTSLIME);
                add(MANYULLYN, INGOT + MANYULLYN);
                add(PIG_IRON, INGOT + PIG_IRON);

                addBlock(ARDITE, 9);
                addBlock(COBALT, 9);
                addBlock(KNIGHTSLIME, 9);
                addBlock(MANYULLYN, 9);
                addBlock(PIG_IRON, 9);
            }
            if (PluginLoader.isLoaded(PluginTwilightForest.MODNAME)) {
                String id = PluginTwilightForest.MODID;
                add(FIERY, INGOT + FIERY);
                add(IRONWOOD, INGOT + IRONWOOD);
                add(KNIGHTMETAL, INGOT + KNIGHTMETAL);

                addBlock(FIERY, 9);
                addBlock(IRONWOOD, IRONWOOD_BLOCK_NAME, 9, id);
                addBlock(KNIGHTMETAL, 9);
            }
            if (ieEnabled()) {
                MorePlates.logger.info("Added " + ImmersiveEngineeringHelper.MetalPressRecipes + " recipes to Metal Press");
            }
            if (icEnabled()) {
                MorePlates.logger.info("Added " + IndustrialCraft2Helper.BlockCuttingMachineRecipes + " recipes to Block Cutting Machine");
                MorePlates.logger.info("Added " + IndustrialCraft2Helper.MetalFormerRecipes + " recipes to Metal Former");
            }
            if (thEnabled()) {
                MorePlates.logger.info("Added " + TechRebornHelper.CompressorRecipes + " recipes to Compressor");
            }
            if (teEnabled()) {
                MorePlates.logger.info("Added " + ThermalExpansionHelper.CompactorRecipes + " recipes to Compactor");
                MorePlates.logger.info("Added " + ThermalExpansionHelper.InductionSmelterRecipes + " recipes to Induction Smelter");
            }
        }
    }

    private static void add(String output, String input, boolean gear, boolean plate, boolean stick) {
        if (ieEnabled())
            ImmersiveEngineeringHelper.add(output, input, gear, plate, stick);
    }

    private static void add(String output, String input, boolean gear, boolean plate) {
        if (ieEnabled())
            ImmersiveEngineeringHelper.add(output, input, gear, plate, false);
        if (icEnabled())
            IndustrialCraft2Helper.add(output, input, plate);
        if (thEnabled())
            TechRebornHelper.add(output, input, plate);
        if (teEnabled())
            ThermalExpansionHelper.add(output, input, gear, plate);
    }

    private static void add(String output, String input) {
        if (ieEnabled())
            ImmersiveEngineeringHelper.add(output, input);
        if (icEnabled())
            IndustrialCraft2Helper.add(output, input);
        if (thEnabled())
            TechRebornHelper.add(output, input);
        if (teEnabled())
            ThermalExpansionHelper.add(output, input);
    }

    private static void add(String output, String input, String id) {
        if (ieEnabled())
            ImmersiveEngineeringHelper.add(output, input, id);
        if (icEnabled())
            IndustrialCraft2Helper.add(output, input, id);
        if (thEnabled())
            TechRebornHelper.add(output, input, id);
        if (teEnabled())
            ThermalExpansionHelper.add(output, input, id);
    }

    private static void add(String output, String input, String id, int meta) {
        if (ieEnabled())
            ImmersiveEngineeringHelper.add(output, input, id, meta);
        if (icEnabled())
            IndustrialCraft2Helper.add(output, input, id, meta);
        if (thEnabled())
            TechRebornHelper.add(output, input, id, meta);
        if (teEnabled())
            ThermalExpansionHelper.add(output, input, id, meta);
    }

    private static void addGaia(String output, String input) {
        if (ieEnabled())
            ImmersiveEngineeringHelper.addGaia(output, input);
        if (icEnabled())
            IndustrialCraft2Helper.addGaia(output, input);
        if (thEnabled())
            TechRebornHelper.addGaia(output, input);
        if (teEnabled())
            ThermalExpansionHelper.addGaia(output, input);
    }

    private static void addBlock(String name, int amount, boolean plate) {
        if (icEnabled())
            IndustrialCraft2Helper.addBlock(name, amount, plate);
        if (thEnabled())
            TechRebornHelper.addBlock(name, amount, plate);
    }

    private static void addBlock(String name, int amount) {
        if (icEnabled())
            IndustrialCraft2Helper.addBlock(name, amount);
        if (thEnabled())
            TechRebornHelper.addBlock(name, amount);
    }

    private static void addBlock(String output, String input, int amount, String id) {
        if (icEnabled())
            IndustrialCraft2Helper.addBlock(output, input, amount, id);
        if (thEnabled())
            TechRebornHelper.addBlock(output, input, amount, id);
    }

    private static void addBlock(String output, String input, int amount, String id, int meta) {
        if (icEnabled())
            IndustrialCraft2Helper.addBlock(output, input, amount, id, meta);
        if (thEnabled())
            TechRebornHelper.addBlock(output, input, amount, id, meta);
    }

    private static boolean icEnabled() {
        return PluginLoader.isLoaded(PluginIndustrialCraft2.MODNAME) && !Helper.isLoaded("ic2-classic-spmod");
    }

    private static boolean ieEnabled() {
        return PluginLoader.isLoaded(PluginImmersiveEngineering.MODNAME);
    }

    private static boolean thEnabled() {
        return PluginLoader.isLoaded(PluginTechReborn.MODNAME);
    }

    private static boolean teEnabled() {
        return PluginLoader.isLoaded(PluginThermalExpansion.MODNAME);
    }
}