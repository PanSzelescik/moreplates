package panszelescik.moreplates.helpers;

import panszelescik.moreplates.plugins.PluginList;

public abstract class Strings extends PluginList {
	
	public static String CONFIG_TITLE = Helper.translate("config.moreplates.title");
	
	public static final String GEAR = "gear";
	public static final String PLATE = "plate";
	
	public static final String INGOT = "ingot";
	public static final String CRYSTAL = "crystal";
	public static final String GEM = "gem";
	public static final String ITEM = "item";
	public static final String BLOCK = "block";
	public static final String DUST = "dust";
	public static final String STICK = "stick";
	
	public static final String REFINED = "Refined";
	public static final String ALLOY = "Alloy";
	
	public static final String IRON = "Iron";
	public static final String GOLD = "Gold";
	public static final String STEEL = "Steel";
	public static final String REDSTONE = "Redstone";
	public static final String GLOWSTONE = "Glowstone";
	public static final String COAL = "Coal";
	public static final String DIAMOND = "Diamond";
	public static final String EMERALD = "Emerald";
	public static final String LAPIS = "Lapis";
	public static final String QUARTZ = "Quartz";
	
	public static final String COPPER = "Copper";
	public static final String TIN = "Tin";
	public static final String SILVER = "Silver";
	public static final String LEAD = "Lead";
	public static final String ALUMINUM = "Aluminum";
	public static final String NICKEL = "Nickel";
	public static final String PLATINUM = "Platinum";
	public static final String IRIDIUM = "Iridium";
	public static final String MITHRIL = "Mithril";
	public static final String BRONZE = "Bronze";
	public static final String CONSTANTAN = "Constantan";
	public static final String ELECTRUM = "Electrum";
	public static final String ENDERIUM = "Enderium";
	public static final String INVAR = "Invar";
	public static final String LUMIUM = "Lumium";
	public static final String SIGNALUM = "Signalum";
	
	private static final String STORAGE = "storage";
	private static final String MATERIAL = "material";
	
	public static final String DYE = "dye";
	public static final String DYE_LIGHT_BLUE = DYE + "LightBlue";
	public static final String DYE_GRAY = DYE + "Gray";
	public static final String DYE_LIME = DYE + "Lime";
	public static final String DYE_CYAN = DYE + "Cyan";
	public static final String DYE_RED = DYE + "Red";
	public static final String DYE_BLACK = DYE + "Black";
	
	//Infos
	private static final String INFO_1 = "Adding ";
	private static final String INFO_2 = " recipe";
	public static final String INFO_3 = " from: ";
	private static final String INFO_4 = "Registering ";
	private static final String INFO_5 = "item: ";
	private static final String INFO_6 = "render for: ";
	private static final String INFO_7 = "Ore Dictionary: ";
	public static final String INFO_8 = " for: ";
	public static final String INFO_9 = " to: ";
	
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
	
	public static final String INFO_COMPACTOR = INFO_1 + COMPACTOR_NAME + INFO_END;
	public static final String INFO_CUTTING_IC2 = INFO_1 + IC2_CUTTING_NAME + INFO_END;
	public static final String INFO_ELVEN_TRADE = INFO_1 + ELVEN_TRADE_NAME + INFO_END;
	public static final String INFO_EMPOWERER = INFO_1 + EMPOWERER_NAME + INFO_END;
	public static final String INFO_FORMER_IC2 = INFO_1 + IC2_FORMER_NAME + INFO_END;
	public static final String INFO_IE = INFO_1 + IE_MACHINE_NAME + INFO_END;
	public static final String INFO_INDUCTION_SMELTER = INFO_1 + INDUCTION_SMELTER_NAME + INFO_END;
	public static final String INFO_MANA_INFUSION = INFO_1 + MANA_INFUSION_NAME + INFO_END;
	public static final String INFO_RECONSTRUCTOR = INFO_1 + RECONSTRUCTOR_NAME + INFO_END;
	public static final String INFO_TECHREBORN = INFO_1 + TECHREBORN_MACHINE_NAME + INFO_END;
	public static final String INFO_REG_ITEM = INFO_4 + INFO_5;
	public static final String INFO_REG_RENDER = INFO_4 + INFO_6;
	public static final String INFO_ORE = INFO_1 + INFO_7;
	
	//Actually Additions
	public static final String EMPOWERED = "Empowered";
	
	public static final String BLACK_QUARTZ = "QuartzBlack";
	public static final String DIAMATINE = "Diamatine";
	public static final String EMERADIC = "Emeradic";
	public static final String ENORI = "Enori";
	public static final String PALIS = "Palis";
	public static final String RESTONIA = "Restonia";
	public static final String VOID = "Void";
	
	public static final String EMPOWERED_DIAMATINE = DIAMATINE + EMPOWERED;
	public static final String EMPOWERED_EMERADIC = EMERADIC + EMPOWERED;
	public static final String EMPOWERED_ENORI = ENORI + EMPOWERED;
	public static final String EMPOWERED_PALIS = PALIS + EMPOWERED;
	public static final String EMPOWERED_RESTONIA = RESTONIA + EMPOWERED;
	public static final String EMPOWERED_VOID = VOID + EMPOWERED;
	
	public static final String CRYSTAL_NAME = "item_crystal";
	public static final String EMPOWERED_CRYSTAL_NAME = CRYSTAL_NAME + "_empowered";
	
	public static final String BLACK_QUARTZ_BLOCK_NAME = BLOCK + "_misc";
	public static final String CRYSTAL_BLOCK_NAME = BLOCK + "_crystal";
	public static final String EMPOWERED_CRYSTAL_BLOCK_NAME = CRYSTAL_BLOCK_NAME + "_empowered";
	
	public static final int DIAMATINE_META = 2;
	public static final int EMERADIC_META = 4;
	public static final int ENORI_META = 5;
	public static final int PALIS_META = 1;
	public static final int RESTONIA_META = 0;
	public static final int VOID_META = 3;
	
	//Applied Energistics
	public static final String CERTUS_QUARTZ = "CertusQuartz";
	public static final String FLUIX = "Fluix";
	public static final String PURE_CERTUS_QUARTZ_NAME = "material";
	public static final String PURE_FLUIX = "Pure" + FLUIX;
	
	public static final int PURE_CERTUS_QUARTZ_META = 10;
	
	public static final String CERTUS_QUARTZ_BLOCK_NAME = "quartz_" + BLOCK;
	public static final String FLUIX_BLOCK_NAME = "fluix_" + BLOCK;
	
	//Avaritia
	public static final String CRYSTAL_MATRIX = "CrystalMatrix";
	public static final String INFINITY = "Infinity";
	public static final String NEUTRONIUM = "CosmicNeutronium";
	
	//Botania
	public static final String ELEMENTIUM = "ElvenElementium";
	public static final String GAIA_SPIRIT = "gaia";
	public static final String MANASTEEL = "Manasteel";
	public static final String TERRASTEEL = "Terrasteel";
	
	public static final String BOTANIA_NAME = STORAGE;
	
	public static final int ELEMENTIUM_META = 2;
	public static final int MANASTEEL_META = 0;
	public static final int TERRASTEEL_META = 1;
	
	//Calculator
	public static final String AMETHYST = "Amethyst";
	public static final String ENRICHED_GOLD = "Enriched" + GOLD;
	public static final String REINFORCED_IRON = "Reinforced" + IRON;
	public static final String TANZANITE = "Tanzanite";
	
	public static final String REINFORCED_IRON_NAME = "reinforcedironingot";
	public static final String CALCULATOR_NAME = MATERIAL;
	
	public static final int ENRICHED_GOLD_BLOCK_META = 2;
	public static final int REINFORCED_IRON_BLOCK_META = 3;
	
	//Draconic Evolution
	public static final String DRACONIUM = "Draconium";
	public static final String AWAKENED_DRACONIUM = DRACONIUM + "Awakened";
	
	//Ender IO
	public static final String COMBUSTIVE_METAL = "CombustiveMetal";
	public static final String CONDUCTIVE_IRON = "Conductive" + IRON;
	public static final String CRUDE_STEEL = "Crude" + STEEL;
	public static final String CRYSTALLINE_ALLOY = "Crystalline" + ALLOY;
	public static final String CRYSTALLINE_PINK_SLIME = "CrystallinePinkSlime";
	public static final String DARK_STEEL = "Dark" + STEEL;
	public static final String ELECTRICAL_STEEL = "Electrical" + STEEL;
	public static final String END_STEEL = "End" + STEEL;
	public static final String ENERGETIC_ALLOY = "Energetic" + ALLOY;
	public static final String ENERGETIC_SILVER = "EnergeticSilver";
	public static final String MELODIC_ALLOY = "Melodic" + ALLOY;
	public static final String PULSATING_IRON = "Pulsating" + IRON;
	public static final String REDSTONE_ALLOY = "Redstone" + ALLOY;
	public static final String STELLAR_ALLOY = "Stellar" + ALLOY;
	public static final String SOULARIUM = "Soularium";
	public static final String VIBRANT_ALLOY = "Vibrant" + ALLOY;
	
	//Extra Utilities
	public static final String EXU2_NAME = "ingredients";
	
	public static final String DEMON = "DemonicMetal";
	public static final String ENCHANTED = "EnchantedMetal";
	public static final String EVIL_INFUSED_IRON = "EvilMetal";
	
	public static final int DEMON_META = 11;
	public static final int ENCHANTED_META = 12;
	public static final int EVIL_INFUSED_IRON_META = 17;
	
	//Mekanism
	public static final String REFINED_GLOWSTONE = REFINED + GLOWSTONE;
	public static final String OSMIUM = "Osmium";
	public static final String REFINED_OBSIDIAN = REFINED + "Obsidian";
	
	//Mystical Agradditions
	public static final String INSANIUM = "Insanium";
	
	//Mystical Agriculture
	public static final String INFERIUM = "Inferium";
	public static final String INTERMEDIUM = "Intermedium";
	public static final String PRUDENTIUM = "Prudentium";
	public static final String SOULIUM = "Soulium";
	public static final String SUPERIUM = "Superium";
	public static final String SUPREMIUM = "Supremium";
	
	//PlusTiC
	public static final String ALUMITE = "Alumite";
	public static final String MIRION = "Mirion";
	public static final String OSGLOGLAS = "Osgloglas";
	public static final String OSMIRIDIUM = "Osmiridium";
	
	//PneumaticCraft
	public static final String COMPRESSED_IRON = IRON + "Compressed";
	
	//ProjectE
	public static final String DARK_MATTER = "DarkMatter";
	public static final String RED_MATTER = "RedMatter";
	
	public static final String MATTER_NAME = "item.pe_matter";
	public static final String MATTER_BLOCK_NAME = "matter_" + BLOCK;
	
	public static final int DARK_MATTER_META = 0;
	public static final int RED_MATTER_META = 1;
	
	//Project Red
	public static final String ELECTROTINE = "Electrotine" + ALLOY;
	public static final String RED_ALLOY = "Red" + ALLOY;
	
	//Refined Storage
	public static final String QUARTZ_ENRICHED_IRON = "QuartzEnriched" + IRON;
	
	public static final String QUARTZ_ENRICHED_IRON_NAME = "quartz_enriched_iron";
	public static final String QUARTZ_ENRICHED_IRON_BLOCK_NAME = QUARTZ_ENRICHED_IRON_NAME + "_" + BLOCK;
	
	//Soul Shards
	public static final String CORRUPTED = "Corrupted";
	
	//Thaumcraft
	public static final String AMBER = "Amber";
	public static final String QUICKSILVER = "Quicksilver";
	
	public static final String QUICKSILVER_NAME = "quicksilver";
	public static final String AMBER_BLOCK_NAME = "amber_" + BLOCK;
	
	//Tinkers' Construct
	public static final String ARDITE = "Ardite";
	public static final String COBALT = "Cobalt";
	public static final String KNIGHTSLIME = "Knightslime";
	public static final String MANYULLYN = "Manyullyn";
	public static final String PIG_IRON = "Pigiron";
	
	//Twilight Forest
	public static final String FIERY = "Fiery";
	public static final String IRONWOOD = IRON + "wood";
	public static final String KNIGHTMETAL = "Knightmetal";
	
	public static final String IRONWOOD_BLOCK_NAME = "knightmetal_" + BLOCK;
	
	//Silicon
	public static final String SILICON = "Silicon";
}
