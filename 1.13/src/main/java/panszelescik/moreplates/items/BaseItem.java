package panszelescik.moreplates.items;

import net.minecraft.item.Item;
import panszelescik.morelibs.api.ItemBase;
import panszelescik.moreplates.MorePlates;

public class BaseItem extends ItemBase {

    protected BaseItem(String name) {
        super(new Item.Properties().group(MorePlates.TAB), MorePlates.MODID, name);
    }
}