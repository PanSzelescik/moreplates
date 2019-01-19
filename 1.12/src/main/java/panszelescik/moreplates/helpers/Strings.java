package panszelescik.moreplates.helpers;

import panszelescik.morelibs.api.Helper;

public abstract class Strings extends Helper {

    public static String CONFIG_TITLE = translate("config.moreplates.title");

    protected static final String GEAR = "gear";
    protected static final String PLATE = "plate";

    protected static final String INGOT = "ingot";
    protected static final String CRYSTAL = "crystal";
    protected static final String GEM = "gem";
    protected static final String ITEM = "item";
    static final String BLOCK = "block";
    protected static final String DUST = "dust";
    protected static final String STICK = "stick";

    private static final String REFINED = "Refined";
    private static final String ALLOY = "Alloy";

    protected static final String IRON = "Iron";
    protected static final String GOLD = "Gold";
    protected static final String STEEL = "Steel";
    protected static final String REDSTONE = "Redstone";
    protected static final String GLOWSTONE = "Glowstone";
    protected static final String COAL = "Coal";
    protected static final String DIAMOND = "Diamond";
    protected static final String EMERALD = "Emerald";
    protected static final String LAPIS = "Lapis";
    protected static final String QUARTZ = "Quartz";

    protected static final String COPPER = "Copper";
    protected static final String TIN = "Tin";
    protected static final String SILVER = "Silver";
    protected static final String LEAD = "Lead";
    protected static final String ALUMINUM = "Aluminum";
    protected static final String NICKEL = "Nickel";
    protected static final String PLATINUM = "Platinum";
    protected static final String IRIDIUM = "Iridium";
    protected static final String MITHRIL = "Mithril";
    protected static final String BRONZE = "Bronze";
    protected static final String CONSTANTAN = "Constantan";
    protected static final String ELECTRUM = "Electrum";
    protected static final String ENDERIUM = "Enderium";
    protected static final String INVAR = "Invar";
    protected static final String LUMIUM = "Lumium";
    protected static final String SIGNALUM = "Signalum";

    private static final String STORAGE = "storage";
    private static final String MATERIAL = "material";

    private static final String DYE = "dye";
    protected static final String DYE_LIGHT_BLUE = DYE + "LightBlue";
    protected static final String DYE_GRAY = DYE + "Gray";
    protected static final String DYE_LIME = DYE + "Lime";
    protected static final String DYE_CYAN = DYE + "Cyan";
    protected static final String DYE_RED = DYE + "Red";
    protected static final String DYE_BLACK = DYE + "Black";

    //Infos
    private static final String INFO_1 = "Adding ";
    private static final String INFO_2 = " recipe";
    static final String INFO_3 = " from: ";
    private static final String INFO_4 = "Registering ";
    private static final String INFO_5 = "item: ";
    private static final String INFO_8 = " for: ";

    private static final String COMPACTOR_NAME = "Compactor";
    private static final String ELVEN_TRADE_NAME = "Elven Trade";
    private static final String EMPOWERER_NAME = "Empowerer";
    private static final String IC2_CUTTING_NAME = "Block Cutting Machine";
    private static final String IC2_FORMER_NAME = "Metal Former";
    private static final String IE_MACHINE_NAME = "Metal Press";
    private static final String INDUCTION_SMELTER_NAME = "Induction Smelter";
    private static final String MANA_INFUSION_NAME = "Mana Infusion";
    private static final String RECONSTRUCTOR_NAME = "Atomic Reconstructor";
    private static final String TECHREBORN_MACHINE_NAME = "Compressor";

    private static final String INFO_END = INFO_2 + INFO_8;

    static final String INFO_COMPACTOR = INFO_1 + COMPACTOR_NAME + INFO_END;
    static final String INFO_CUTTING_IC2 = INFO_1 + IC2_CUTTING_NAME + INFO_END;
    static final String INFO_ELVEN_TRADE = INFO_1 + ELVEN_TRADE_NAME + INFO_END;
    static final String INFO_EMPOWERER = INFO_1 + EMPOWERER_NAME + INFO_END;
    static final String INFO_FORMER_IC2 = INFO_1 + IC2_FORMER_NAME + INFO_END;
    static final String INFO_IE = INFO_1 + IE_MACHINE_NAME + INFO_END;
    static final String INFO_INDUCTION_SMELTER = INFO_1 + INDUCTION_SMELTER_NAME + INFO_END;
    static final String INFO_MANA_INFUSION = INFO_1 + MANA_INFUSION_NAME + INFO_END;
    static final String INFO_RECONSTRUCTOR = INFO_1 + RECONSTRUCTOR_NAME + INFO_END;
    static final String INFO_TECHREBORN = INFO_1 + TECHREBORN_MACHINE_NAME + INFO_END;
    static final String INFO_REG_ITEM = INFO_4 + INFO_5;

    //Actually Additions
    private static final String EMPOWERED = "Empowered";

    protected static final String BLACK_QUARTZ = "QuartzBlack";
    protected static final String DIAMATINE = "Diamatine";
    protected static final String EMERADIC = "Emeradic";
    protected static final String ENORI = "Enori";
    protected static final String PALIS = "Palis";
    protected static final String RESTONIA = "Restonia";
    protected static final String VOID = "VoidAA";

    protected static final String EMPOWERED_DIAMATINE = DIAMATINE + EMPOWERED;
    protected static final String EMPOWERED_EMERADIC = EMERADIC + EMPOWERED;
    protected static final String EMPOWERED_ENORI = ENORI + EMPOWERED;
    protected static final String EMPOWERED_PALIS = PALIS + EMPOWERED;
    protected static final String EMPOWERED_RESTONIA = RESTONIA + EMPOWERED;
    protected static final String EMPOWERED_VOID = "Void" + EMPOWERED;

    protected static final String CRYSTAL_NAME = "item_crystal";
    protected static final String EMPOWERED_CRYSTAL_NAME = CRYSTAL_NAME + "_empowered";

    protected static final String BLACK_QUARTZ_BLOCK_NAME = BLOCK + "_misc";
    protected static final String CRYSTAL_BLOCK_NAME = BLOCK + "_crystal";
    protected static final String EMPOWERED_CRYSTAL_BLOCK_NAME = CRYSTAL_BLOCK_NAME + "_empowered";

    protected static final int DIAMATINE_META = 2;
    protected static final int EMERADIC_META = 4;
    protected static final int ENORI_META = 5;
    protected static final int PALIS_META = 1;
    protected static final int RESTONIA_META = 0;
    protected static final int VOID_META = 3;

    //Applied Energistics
    protected static final String CERTUS_QUARTZ = "CertusQuartz";
    protected static final String FLUIX = "Fluix";
    protected static final String PURE_CERTUS_QUARTZ_NAME = "material";
    protected static final String PURE_FLUIX = "Pure" + FLUIX;

    protected static final int PURE_CERTUS_QUARTZ_META = 10;

    protected static final String CERTUS_QUARTZ_BLOCK_NAME = "quartz_" + BLOCK;
    protected static final String FLUIX_BLOCK_NAME = "fluix_" + BLOCK;

    //Avaritia
    protected static final String CRYSTAL_MATRIX = "CrystalMatrix";
    protected static final String INFINITY = "Infinity";
    protected static final String NEUTRONIUM = "CosmicNeutronium";

    //Botania
    protected static final String ELEMENTIUM = "ElvenElementium";
    protected static final String GAIA_SPIRIT = "gaia";
    protected static final String MANASTEEL = "Manasteel";
    protected static final String TERRASTEEL = "Terrasteel";

    protected static final String BOTANIA_NAME = STORAGE;

    protected static final int ELEMENTIUM_META = 2;
    protected static final int MANASTEEL_META = 0;
    protected static final int TERRASTEEL_META = 1;

    //Calculator
    protected static final String AMETHYST = "Amethyst";
    protected static final String ENRICHED_GOLD = "Enriched" + GOLD;
    protected static final String REINFORCED_IRON = "Reinforced" + IRON;
    protected static final String TANZANITE = "Tanzanite";

    protected static final String REINFORCED_IRON_NAME = "reinforcedironingot";
    protected static final String CALCULATOR_NAME = MATERIAL;

    protected static final int ENRICHED_GOLD_BLOCK_META = 2;
    protected static final int REINFORCED_IRON_BLOCK_META = 3;

    //Draconic Evolution
    protected static final String DRACONIUM = "Draconium";
    protected static final String AWAKENED_DRACONIUM = DRACONIUM + "Awakened";

    //Ender IO
    protected static final String CONDUCTIVE_IRON = "Conductive" + IRON;
    protected static final String CRUDE_STEEL = "Crude" + STEEL;
    protected static final String CRYSTALLINE_ALLOY = "Crystalline" + ALLOY;
    protected static final String CRYSTALLINE_PINK_SLIME = "CrystallinePinkSlime";
    protected static final String DARK_STEEL = "Dark" + STEEL;
    protected static final String ELECTRICAL_STEEL = "Electrical" + STEEL;
    protected static final String END_STEEL = "End" + STEEL;
    protected static final String ENERGETIC_ALLOY = "Energetic" + ALLOY;
    protected static final String ENERGETIC_SILVER = "EnergeticSilver";
    protected static final String IRON_ALLOY = "Construction" + ALLOY;
    protected static final String MELODIC_ALLOY = "Melodic" + ALLOY;
    protected static final String PULSATING_IRON = "Pulsating" + IRON;
    protected static final String REDSTONE_ALLOY = "Redstone" + ALLOY;
    protected static final String STELLAR_ALLOY = "Stellar" + ALLOY;
    protected static final String SOULARIUM = "Soularium";
    protected static final String VIBRANT_ALLOY = "Vibrant" + ALLOY;
    protected static final String VIVID_ALLOY = "Vivid" + ALLOY;

    //Extra Utilities
    protected static final String DEMON = "DemonicMetal";
    protected static final String ENCHANTED = "EnchantedMetal";
    protected static final String EVIL_INFUSED_IRON = "EvilMetal";

    //Mekanism
    protected static final String REFINED_GLOWSTONE = REFINED + GLOWSTONE;
    protected static final String OSMIUM = "Osmium";
    protected static final String REFINED_OBSIDIAN = REFINED + "Obsidian";

    //Mystical Agradditions
    protected static final String INSANIUM = "Insanium";

    //Mystical Agriculture
    protected static final String INFERIUM = "Inferium";
    protected static final String INTERMEDIUM = "Intermedium";
    protected static final String PRUDENTIUM = "Prudentium";
    protected static final String SOULIUM = "Soulium";
    protected static final String SUPERIUM = "Superium";
    protected static final String SUPREMIUM = "Supremium";

    //PlusTiC
    protected static final String ALUMITE = "Alumite";
    protected static final String MIRION = "Mirion";
    protected static final String OSGLOGLAS = "Osgloglas";
    protected static final String OSMIRIDIUM = "Osmiridium";

    //PneumaticCraft
    protected static final String COMPRESSED_IRON = IRON + "Compressed";

    //ProjectE
    protected static final String DARK_MATTER = "DarkMatter";
    protected static final String RED_MATTER = "RedMatter";

    protected static final String MATTER_NAME = "item.pe_matter";
    protected static final String MATTER_BLOCK_NAME = "matter_" + BLOCK;

    protected static final int DARK_MATTER_META = 0;
    protected static final int RED_MATTER_META = 1;

    //Project Red
    protected static final String ELECTROTINE = "Electrotine" + ALLOY;
    protected static final String RED_ALLOY = "Red" + ALLOY;

    //Refined Storage
    protected static final String QUARTZ_ENRICHED_IRON = "QuartzEnriched" + IRON;

    protected static final String QUARTZ_ENRICHED_IRON_NAME = "quartz_enriched_iron";
    protected static final String QUARTZ_ENRICHED_IRON_BLOCK_NAME = QUARTZ_ENRICHED_IRON_NAME + "_" + BLOCK;

    //Soul Shards
    protected static final String CORRUPTED = "Corrupted";

    //Thaumcraft
    protected static final String AMBER = "Amber";
    protected static final String QUICKSILVER = "Quicksilver";

    protected static final String AMBER_BLOCK_NAME = "amber_" + BLOCK;

    //Tinkers' Construct
    protected static final String ARDITE = "Ardite";
    protected static final String COBALT = "Cobalt";
    protected static final String KNIGHTSLIME = "Knightslime";
    protected static final String MANYULLYN = "Manyullyn";
    protected static final String PIG_IRON = "Pigiron";

    //Twilight Forest
    protected static final String FIERY = "Fiery";
    protected static final String IRONWOOD = IRON + "wood";
    protected static final String KNIGHTMETAL = "Knightmetal";

    protected static final String IRONWOOD_BLOCK_NAME = "knightmetal_" + BLOCK;

    //Silicon
    protected static final String SILICON = "Silicon";
}
