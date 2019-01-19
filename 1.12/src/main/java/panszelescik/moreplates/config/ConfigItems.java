package panszelescik.moreplates.config;

import net.minecraft.item.Item;
import panszelescik.morelibs.config.ConfigBase;
import panszelescik.moreplates.MorePlates;

public class ConfigItems extends ConfigBase {

    static final String CATEGORY_ITEMS = "items";

    public ConfigItems() {
        super(MorePlates.MODID + "/items", MorePlates.MODID);
    }

    @Override
    public void loadConfig() {
        getCfg().addCustomCategoryComment(CATEGORY_ITEMS, "Loading items settings");

        super.loadConfig();
    }

    public static boolean loadItem(Item item) {
        return getCfg().get(CATEGORY_ITEMS, item.getRegistryName().toString().substring(11), true).getBoolean();
    }
}