package panszelescik.moreplates.helpers;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.config.ConfigItems;
import panszelescik.moreplates.items.ItemGear;
import panszelescik.moreplates.items.ItemPlate;
import panszelescik.moreplates.items.ItemStick;

public class PluginHelper extends Strings {

    public static void reg(String ore, String name) {
        regGear(name, ore);
        regPlate(name, ore);
    }

    protected static void regGaia(String ore, String name) {
        Item gear = gear(name);
        if (ConfigItems.loadItem(gear)) {
            regItem(gear);
            oreGearGaia(ore, gear);
        }
        Item plate = plate(name);
        if (ConfigItems.loadItem(plate)) {
            regItem(plate);
            orePlateGaia(ore, plate);
        }
    }

    protected static void regGear(String name, String ore) {
        Item gear = gear(name);
        if (ConfigItems.loadItem(gear)) {
            regItem(gear);
            oreGear(ore, gear);
        }
    }

    protected static void regPlate(String name, String ore) {
        Item plate = plate(name);
        if (ConfigItems.loadItem(plate)) {
            regItem(plate);
            orePlate(ore, plate);
        }
    }

    protected static void regStick(String name, String ore) {
        Item stick = stick(name);
        if (ConfigItems.loadItem(stick)) {
            regItem(stick);
            oreStick(ore, stick);
        }
    }

    public static void regItem(Item item) {
        ForgeRegistries.ITEMS.register(item);
        MorePlates.logger.debug(INFO_REG_ITEM + getItemName(item));
    }

    private static Item gear(String name) {
        return new ItemGear(name);
    }

    private static Item plate(String name) {
        return new ItemPlate(name);
    }

    private static Item stick(String name) {
        return new ItemStick(name);
    }

    private static void oreGear(String ore, Item gear) {
        OreDictionary.registerOre("gear" + ore, gear);
    }

    private static void orePlate(String ore, Item plate) {
        OreDictionary.registerOre("plate" + ore, plate);
    }

    private static void oreStick(String ore, Item stick) {
        OreDictionary.registerOre("stick" + ore, stick);
    }

    private static void oreGearGaia(String ore, Item geargaia) {
        OreDictionary.registerOre(ore + "Gear", geargaia);
    }

    private static void orePlateGaia(String ore, Item plategaia) {
        OreDictionary.registerOre(ore + "Plate", plategaia);
    }

    protected static boolean contains(String name) {
        return Item.REGISTRY.containsKey(new ResourceLocation("moreplates:" + name));
    }
}