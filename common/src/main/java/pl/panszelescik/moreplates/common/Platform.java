package pl.panszelescik.moreplates.common;

public enum Platform {

    FABRIC,
    FORGE,
    ;

    public boolean isFabric() {
        return this == FABRIC;
    }

    public boolean isForge() {
        return this == FORGE;
    }
}
