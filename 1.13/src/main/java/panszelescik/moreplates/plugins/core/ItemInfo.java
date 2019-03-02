package panszelescik.moreplates.plugins.core;

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
