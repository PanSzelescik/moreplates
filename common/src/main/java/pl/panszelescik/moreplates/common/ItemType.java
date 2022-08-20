package pl.panszelescik.moreplates.common;

import java.util.Locale;

public enum ItemType {

    PLATE,
    ;

    public String getName() {
        return this.name().toLowerCase();
    }

    public String getNiceName() {
        var name = this.getName();
        return name.substring(0, 1).toUpperCase(Locale.ROOT) + name.substring(1);
    }

    public boolean isPlate() {
        return this == PLATE;
    }
}
