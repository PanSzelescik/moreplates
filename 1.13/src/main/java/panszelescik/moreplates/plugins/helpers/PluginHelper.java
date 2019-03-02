package panszelescik.moreplates.plugins.helpers;

import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import panszelescik.morelibs.api.Helper;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.items.ItemGear;
import panszelescik.moreplates.items.ItemPlate;
import panszelescik.moreplates.items.ItemStick;
import panszelescik.moreplates.plugins.core.ItemInfo;

public class PluginHelper extends Helper {

    public static void reg(ItemInfo info) {
        regGear(info);
        regPlate(info);
    }

    protected static void regGear(ItemInfo info) {
        Item gear = new ItemGear(info.toString());
        //if (BaseConfig.loadItem(gear)) {
        regItem(gear);
        //}
    }

    protected static void regPlate(ItemInfo info) {
        Item plate = new ItemPlate(info.toString());
        //if (BaseConfig.loadItem(plate)) {
        regItem(plate);
        //}
    }

    protected static void regStick(ItemInfo info) {
        Item stick = new ItemStick(info.toString());
        //if (BaseConfig.loadItem(stick)) {
        regItem(stick);
        //}
    }

    private static void regItem(Item item) {
        ForgeRegistries.ITEMS.register(item);
        MorePlates.logger.debug("Registering item: " + item.getName().getString());
    }
}