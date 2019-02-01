package panszelescik.moreplates.helpers;

import java.util.Locale;

public enum ItemInfo {

    IRON("Iron"),
    GOLD("Gold"),
    REDSTONE("Redstone", Type.DUST),
    GLOWSTONE("Glowstone", Type.DUST),
    COAL("Coal"),
    DIAMOND("Diamond", Type.GEM),
    EMERALD("Emerald", Type.GEM),
    LAPIS_LAZULI("Lapis", Type.GEM),
    NETHER_QUARTZ("Quartz", Type.GEM),

    COPPER("Copper"),
    TIN("Tin"),
    SILVER("Silver"),
    LEAD("Lead"),
    ALUMINUM("Aluminum"),
    NICKEL("Nickel"),
    PLATINUM("Platinum"),
    IRIDIUM("Iridium"),
    MANA_INFUSED("Mithril"),
    BRONZE("Bronze"),
    CONSTANTAN("Constantan"),
    ELECTRUM("Electrum"),
    ENDERIUM("Enderium"),
    INVAR("Invar"),
    LUMIUM("Lumium"),
    SIGNALUM("Signalum"),
    SILICONN("Silicon", Type.INGOT),
    SILICON("Silicon", Type.ITEM),
    STEEL("Steel"),

    BLACK_QUARTZ("QuartzBlack", Type.GEM),
    DIAMATINE("Diamatine"),
    EMERADIC("Emeradic"),
    ENORI("Enori"),
    PALIS("Palis"),
    RESTONIA("Restonia"),
    VOID("Void"),
    EMPOWERED_DIAMATINE("DiamatineEmpowered"),
    EMPOWERED_EMERADIC("EmeradicEmpowered"),
    EMPOWERED_ENORI("EnoriEmpowered"),
    EMPOWERED_PALIS("PalisEmpowered"),
    EMPOWERED_RESTONIA("RestoniaEmpowered"),
    EMPOWERED_VOID("VoidEmpowered"),

    CERTUS_QUARTZ("CertusQuartz", Type.CRYSTAL),
    FLUIX("Fluix", Type.CRYSTAL),
    PURE_FLUIX("PureFluix", Type.CRYSTAL),

    CRYSTAL_MATRIX("CrystalMatrix"),
    INFINITY("Infinity"),
    NEUTRONIUM("CosmicNeutronium"),

    ELEMENTIUM("ElvenElementium"),
    GAIA_SPIRIT("Gaia"),
    MANASTEEL("Manasteel"),
    TERRASTEEL("Terrasteel"),

    AMETHYST("Amethyst", Type.GEM),
    ENRICHED_GOLD("EnrichedGold"),
    REINFORCED_IRON("ReinforcedIron"),
    TANZANITE("Tanzanite", Type.GEM),

    DRACONIUM("Draconium"),
    AWAKENED_DRACONIUM("DraconiumAwakened"),

    CONDUCTIVE_IRON("ConductiveIron"),
    CRUDE_STEEL("CrudeSteel"),
    CRYSTALLINE_ALLOY("CrystallineAlloy"),
    CRYSTALLINE_PINK_SLIME("CrystallinePinkSlime"),
    DARK_STEEL("DarkSteel"),
    ELECTRICAL_STEEL("ElectricalSteel"),
    END_STEEL("EndSteel"),
    ENERGETIC_ALLOY("EnergeticAlloy"),
    ENERGETIC_SILVER("EnergeticSilver"),
    IRON_ALLOY("ConstructionAlloy"),
    MELODIC_ALLOY("MelodicAlloy"),
    PULSATING_IRON("PulsatingIron"),
    REDSTONE_ALLOY("RedstoneAlloy"),
    STELLAR_ALLOY("StellarAlloy"),
    SOULARIUM("Soularium"),
    VIBRANT_ALLOY("VibrantAlloy"),
    VIVID_ALLOY("VividAlloy"),

    DEMON("DemonicMetal"),
    ENCHANTED("EnchantedMetal"),
    EVIL_INFUSED_IRON("EvilMetal"),

    REFINED_GLOWSTONE("RefinedGlowstone"),
    OSMIUM("Osmium"),
    REFINED_OBSIDIAN("RefinedObsidian"),

    INSANIUM("Insanium"),

    INFERIUM("Inferium"),
    INTERMEDIUM("Intermedium"),
    PRUDENTIUM("Prudentium"),
    SOULIUM("Soulium"),
    SUPERIUM("Superium"),
    SUPREMIUM("Supremium"),

    ALUMITE("Alumite"),
    MIRION("Mirion"),
    OSGLOGLAS("Osgloglas"),
    OSMIRIDIUM("Osmiridium"),

    COMPRESSED_IRON("IronCompressed"),

    DARK_MATTER("DarkMatter"),
    RED_MATTER("RedMatter"),

    ELECTROTINE_ALLOY("ElectrotineAlloy"),
    RED_ALLOY("RedAlloy"),

    QUARTZ_ENRICHED_IRON("QuartzEnrichedIron"),

    CORRUPTED("Corrupted"),

    AMBER("Amber", Type.GEM),
    QUICKSILVER("Quicksilver"),

    ARDITE("Ardite"),
    COBALT("Cobalt"),
    KNIGHTSLIME("Knightslime"),
    MANYULLYN("Manyullyn"),
    PIG_IRON("Pigiron"),

    FIERY("Fiery"),
    IRONWOOD("Ironwood"),
    KNIGHTMETAL("Knightmetal"),
    ;

    String ore;
    Type type;

    ItemInfo(String ore, Type type) {
        this.ore = ore;
        this.type = type;
    }

    ItemInfo(String ore) {
        this.ore = ore;
    }

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ENGLISH);
    }

    public String getOre() {
        return ore;
    }

    public String getType() {
        if (type == null)
            return Type.INGOT.toString();
        else
            return type.toString();
    }

    public String getInput() {
        return getType() + getOre();
    }

    public enum Type {

        GEAR, PLATE, STICK, INGOT, CRYSTAL, GEM, ITEM, BLOCK, DUST;

        Type() {
        }

        @Override
        public String toString() {
            return name().toLowerCase(Locale.ENGLISH);
        }
    }
}
