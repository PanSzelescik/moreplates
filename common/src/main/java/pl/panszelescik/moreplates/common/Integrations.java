package pl.panszelescik.moreplates.common;

import net.minecraft.world.item.CreativeModeTab;

public interface Integrations {

    Platform getPlatform();

    boolean isModEnabled(String modId);

    CreativeModeTab getCreativeTab();

    default boolean isItemEnabled(MaterialType materialType, ItemType itemType) {
        return isItemEnabled(MorePlates.ENABLED_ITEMS_PATH + "." + materialType.getModId() + "." + materialType.getName() + "_" + itemType.getName());
    }

    boolean isItemEnabled(String key);

    boolean isRunningDataGen();
}
