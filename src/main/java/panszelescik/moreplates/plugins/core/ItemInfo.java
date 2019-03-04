package panszelescik.moreplates.plugins.core;

import net.minecraft.util.ResourceLocation;

import java.util.Locale;

public enum ItemInfo {

    IRON(new ResourceLocation("forge:ingots/iron")),
    GOLD(new ResourceLocation("forge:ingots/gold")),
    REDSTONE(new ResourceLocation("forge:dusts/redstone"), Type.DUST),
    GLOWSTONE(new ResourceLocation("forge:dusts/glowstone"), Type.DUST),
    COAL(),
    DIAMOND(new ResourceLocation("forge:gems/diamond"), Type.GEM),
    EMERALD(new ResourceLocation("forge:gems/emerald"), Type.GEM),
    LAPIS_LAZULI(new ResourceLocation("forge:gems/lapis"), Type.GEM),
    NETHER_QUARTZ(new ResourceLocation("forge:gems/quartz"), Type.GEM),

    COPPER(new ResourceLocation("forge:ingots/copper")),
    TIN(new ResourceLocation("forge:ingots/tin")),
    SILVER(new ResourceLocation("forge:ingots/silver")),
    LEAD(new ResourceLocation("forge:ingots/lead")),
    ALUMINUM(new ResourceLocation("forge:ingots/aluminum")),
    NICKEL(new ResourceLocation("forge:ingots/nickel")),
    PLATINUM(new ResourceLocation("forge:ingots/platinum")),
    IRIDIUM(new ResourceLocation("forge:ingots/iridium")),
    MANA_INFUSED(new ResourceLocation("forge:ingots/mithril")),
    BRONZE(new ResourceLocation("forge:ingots/bronze")),
    CONSTANTAN(new ResourceLocation("forge:ingots/constantan")),
    ELECTRUM(new ResourceLocation("forge:ingots/electrum")),
    ENDERIUM(new ResourceLocation("forge:ingots/enderium")),
    INVAR(new ResourceLocation("forge:ingots/invar")),
    LUMIUM(new ResourceLocation("forge:ingots/lumium")),
    SIGNALUM(new ResourceLocation("forge:ingots/signalum")),
    SILICONN(new ResourceLocation("forge:ingots/silicon"), Type.INGOT),
    SILICON(new ResourceLocation("forge:items/silicon"), Type.ITEM),
    STEEL(new ResourceLocation("forge:ingots/steel")),

    ;

    ResourceLocation tag;
    Type type;

    ItemInfo(ResourceLocation tag, Type type) {
        this.tag = tag;
        this.type = type;
    }

    ItemInfo(ResourceLocation tag) {
        this.tag = tag;
    }

    ItemInfo() {}

    @Override
    public String toString() {
        return name().toLowerCase(Locale.ENGLISH);
    }

    public ResourceLocation getTag() {
        return tag;
    }

    public String getType() {
        if (type == null)
            return Type.INGOT.toString();
        else
            return type.toString();
    }

    public String getInput() {
        return getType() + getTag();
    }

    public enum Type {

        GEAR, PLATE, STICK, INGOT, CRYSTAL, GEM, ITEM, BLOCK, DUST;

        Type() {
        }

        @Override
        public String toString() {
            return name().toLowerCase(Locale.ENGLISH);
        }

        public String getTagName() {
            if (toString().equals(STICK.toString()))
                return "rods";
            return toString() + "s";
        }
    }
}
