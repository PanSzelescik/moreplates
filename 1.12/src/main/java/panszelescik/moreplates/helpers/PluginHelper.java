package panszelescik.moreplates.helpers;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.morelibs.api.Helper;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.config.Config;
import panszelescik.moreplates.items.ItemGear;
import panszelescik.moreplates.items.ItemPlate;
import panszelescik.moreplates.items.ItemStick;
import panszelescik.moreplates.plugins.PluginImmersiveEngineering;
import panszelescik.moreplates.plugins.PluginIndustrialCraft2;
import panszelescik.moreplates.plugins.PluginTechReborn;
import panszelescik.moreplates.plugins.PluginThermalExpansion;

public class PluginHelper extends Helper {

    public static void reg(ItemInfo info) {
        regGear(info);
        regPlate(info);
    }

    protected static void regGear(ItemInfo info) {
        Item gear = new ItemGear(info.toString());
        if (Config.loadItem(gear)) {
            regItem(gear);
            OreDictionary.registerOre("gear" + info.getOre(), gear);
        }
    }

    protected static void regPlate(ItemInfo info) {
        Item plate = new ItemPlate(info.toString());
        if (Config.loadItem(plate)) {
            regItem(plate);
            OreDictionary.registerOre("plate" + info.getOre(), plate);
        }
    }

    protected static void regStick(ItemInfo info) {
        Item stick = new ItemStick(info.toString());
        if (Config.loadItem(stick)) {
            regItem(stick);
            OreDictionary.registerOre("stick" + info.getOre(), stick);
        }
    }

    private static void regItem(Item item) {
        ForgeRegistries.ITEMS.register(item);
        MorePlates.logger.debug("Registering item: " + getItemName(item));
    }

    protected static boolean contains(String name) {
        return Item.REGISTRY.containsKey(new ResourceLocation("moreplates:" + name));
    }

    protected static boolean oreNameExists(ItemInfo ore) {
        return oreNameExists(ore.getInput());
    }

    protected static boolean oreNameExists(ItemInfo ore, ItemInfo.Type type) {
        return oreNameExists(type.toString() + ore.getOre());
    }

    protected static void add(ItemInfo output, String input, boolean gear, boolean plate) {
        if (ieEnabled())
            ImmersiveEngineeringHelper.add(output.getOre(), input, gear, plate, false);
        if (icEnabled())
            IndustrialCraft2Helper.add(output.getOre(), input, plate);
        if (thEnabled())
            TechRebornHelper.add(output.getOre(), input, plate);
        if (teEnabled())
            ThermalExpansionHelper.add(output.getOre(), input, gear, plate);
    }

    protected static void add(ItemInfo item, boolean gear, boolean plate) {
        add(item, gear, plate, false);
    }

    protected static void add(ItemInfo item, boolean gear, boolean plate, boolean stick) {
        if (ieEnabled())
            ImmersiveEngineeringHelper.add(item.getOre(), item.getInput(), gear, plate, stick);
        if (icEnabled())
            IndustrialCraft2Helper.add(item.getOre(), item.getInput(), plate);
        if (thEnabled())
            TechRebornHelper.add(item.getOre(), item.getInput(), plate);
        if (teEnabled())
            ThermalExpansionHelper.add(item.getOre(), item.getInput(), gear, plate);
    }

    protected static void add(ItemInfo item) {
        add(item, item);
    }

    protected static void add(ItemInfo output, ItemInfo input) {
        if (ieEnabled())
            ImmersiveEngineeringHelper.add(output.getOre(), input.getInput());
        if (icEnabled())
            IndustrialCraft2Helper.add(output.getOre(), input.getInput());
        if (thEnabled())
            TechRebornHelper.add(output.getOre(), input.getInput());
        if (teEnabled())
            ThermalExpansionHelper.add(output.getOre(), input.getInput());
    }

    protected static void add(ItemInfo output, String input, String id) {
        add(output, input, id, 0);
    }

    protected static void add(ItemInfo output, String input, String id, int meta) {
        if (ieEnabled())
            ImmersiveEngineeringHelper.add(output.getOre(), input, id, meta);
        if (icEnabled())
            IndustrialCraft2Helper.add(output.getOre(), input, id, meta);
        if (thEnabled())
            TechRebornHelper.add(output.getOre(), input, id, meta);
        if (teEnabled())
            ThermalExpansionHelper.add(output.getOre(), input, id, meta);
    }

    protected static void addBlock(ItemInfo name, int amount, boolean plate) {
        if (icEnabled())
            IndustrialCraft2Helper.addBlock(name.getOre(), amount, plate);
        if (thEnabled())
            TechRebornHelper.addBlock(name.getOre(), amount, plate);
    }

    protected static void addBlock(ItemInfo name) {
        addBlock(name, 9);
    }

    protected static void addBlock(ItemInfo name, int amount) {
        if (icEnabled())
            IndustrialCraft2Helper.addBlock(name.getOre(), amount);
        if (thEnabled())
            TechRebornHelper.addBlock(name.getOre(), amount);
    }

    protected static void addBlock(ItemInfo output, String input, int amount, String id) {
        addBlock(output, input, amount, id, 0);
    }

    protected static void addBlock(ItemInfo output, String input, int amount, String id, int meta) {
        if (icEnabled())
            IndustrialCraft2Helper.addBlock(output.getOre(), input, amount, id, meta);
        if (thEnabled())
            TechRebornHelper.addBlock(output.getOre(), input, amount, id, meta);
    }

    private static boolean icEnabled() {
        return isLoaded(PluginIndustrialCraft2.MODNAME) && !isLoaded("ic2-classic-spmod");
    }

    private static boolean ieEnabled() {
        return isLoaded(PluginImmersiveEngineering.MODID);
    }

    private static boolean thEnabled() {
        return isLoaded(PluginTechReborn.MODID);
    }

    private static boolean teEnabled() {
        return isLoaded(PluginThermalExpansion.MODID);
    }

    public static void printAmount() {
        if (ieEnabled()) {
            MorePlates.logger.info("Added " + ImmersiveEngineeringHelper.MetalPressRecipes + " recipes to Metal Press");
        }
        if (icEnabled()) {
            MorePlates.logger.info("Added " + IndustrialCraft2Helper.BlockCuttingMachineRecipes + " recipes to Block Cutting Machine");
            MorePlates.logger.info("Added " + IndustrialCraft2Helper.MetalFormerRecipes + " recipes to Metal Former");
        }
        if (thEnabled()) {
            MorePlates.logger.info("Added " + TechRebornHelper.CompressorRecipes + " recipes to Compressor");
        }
        if (teEnabled()) {
            MorePlates.logger.info("Added " + ThermalExpansionHelper.CompactorRecipes + " recipes to Compactor");
            MorePlates.logger.info("Added " + ThermalExpansionHelper.InductionSmelterRecipes + " recipes to Induction Smelter");
        }
    }
}