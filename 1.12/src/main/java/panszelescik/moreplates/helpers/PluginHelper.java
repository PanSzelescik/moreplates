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
import panszelescik.moreplates.plugins.PluginImmersiveEngineering;
import panszelescik.moreplates.plugins.PluginIndustrialCraft2;
import panszelescik.moreplates.plugins.PluginTechReborn;
import panszelescik.moreplates.plugins.PluginThermalExpansion;

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

    protected static void add(String output, String input, boolean gear, boolean plate, boolean stick) {
        if (ieEnabled())
            ImmersiveEngineeringHelper.add(output, input, gear, plate, stick);
    }

    protected static void add(String output, String input, boolean gear, boolean plate) {
        if (ieEnabled())
            ImmersiveEngineeringHelper.add(output, input, gear, plate, false);
        if (icEnabled())
            IndustrialCraft2Helper.add(output, input, plate);
        if (thEnabled())
            TechRebornHelper.add(output, input, plate);
        if (teEnabled())
            ThermalExpansionHelper.add(output, input, gear, plate);
    }

    protected static void add(String output, String input) {
        if (ieEnabled())
            ImmersiveEngineeringHelper.add(output, input);
        if (icEnabled())
            IndustrialCraft2Helper.add(output, input);
        if (thEnabled())
            TechRebornHelper.add(output, input);
        if (teEnabled())
            ThermalExpansionHelper.add(output, input);
    }

    protected static void add(String output, String input, String id) {
        if (ieEnabled())
            ImmersiveEngineeringHelper.add(output, input, id);
        if (icEnabled())
            IndustrialCraft2Helper.add(output, input, id);
        if (thEnabled())
            TechRebornHelper.add(output, input, id);
        if (teEnabled())
            ThermalExpansionHelper.add(output, input, id);
    }

    protected static void add(String output, String input, String id, int meta) {
        if (ieEnabled())
            ImmersiveEngineeringHelper.add(output, input, id, meta);
        if (icEnabled())
            IndustrialCraft2Helper.add(output, input, id, meta);
        if (thEnabled())
            TechRebornHelper.add(output, input, id, meta);
        if (teEnabled())
            ThermalExpansionHelper.add(output, input, id, meta);
    }

    protected static void addGaia(String output, String input) {
        if (ieEnabled())
            ImmersiveEngineeringHelper.addGaia(output, input);
        if (icEnabled())
            IndustrialCraft2Helper.addGaia(output, input);
        if (thEnabled())
            TechRebornHelper.addGaia(output, input);
        if (teEnabled())
            ThermalExpansionHelper.addGaia(output, input);
    }

    protected static void addBlock(String name, int amount, boolean plate) {
        if (icEnabled())
            IndustrialCraft2Helper.addBlock(name, amount, plate);
        if (thEnabled())
            TechRebornHelper.addBlock(name, amount, plate);
    }

    protected static void addBlock(String name, int amount) {
        if (icEnabled())
            IndustrialCraft2Helper.addBlock(name, amount);
        if (thEnabled())
            TechRebornHelper.addBlock(name, amount);
    }

    protected static void addBlock(String output, String input, int amount, String id) {
        if (icEnabled())
            IndustrialCraft2Helper.addBlock(output, input, amount, id);
        if (thEnabled())
            TechRebornHelper.addBlock(output, input, amount, id);
    }

    protected static void addBlock(String output, String input, int amount, String id, int meta) {
        if (icEnabled())
            IndustrialCraft2Helper.addBlock(output, input, amount, id, meta);
        if (thEnabled())
            TechRebornHelper.addBlock(output, input, amount, id, meta);
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