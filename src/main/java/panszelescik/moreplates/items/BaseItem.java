package panszelescik.moreplates.items;

import panszelescik.morelibs.api.ItemBase;
import panszelescik.moreplates.MorePlates;

public class BaseItem extends ItemBase {

    protected BaseItem(String name) {
        super(MorePlates.TAB, MorePlates.MODID, name);
    }
}