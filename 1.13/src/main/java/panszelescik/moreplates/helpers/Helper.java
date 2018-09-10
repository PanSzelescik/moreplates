package panszelescik.moreplates.helpers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.config.ConfigItems;
import panszelescik.moreplates.items.*;

public abstract class Helper extends Strings {
	
	public void reg(String ore, String name) {
		Item gear = gear(name);
		regGear(gear, ore);
		Item plate = plate(name);
		regPlate(plate, ore);
	}
	
	public void regGaia(String ore, String name) {
		Item gear = gear(name);
		if (ConfigItems.loadItem(gear)) {
			regItem(gear);
			oreGearGaia(ore, gear);
		}
		Item plate = plate(name);
		if (plate != null && ConfigItems.loadItem(plate)) {
			regItem(plate);
			orePlateGaia(ore, plate);
		}
	}
	
	public static void regGear(Item gear, String ore) {
		if (ConfigItems.loadItem(gear)) {
			regItem(gear);
			oreGear(ore, gear);
		}
	}
	
	public static void regPlate(Item plate, String ore) {
		if (ConfigItems.loadItem(plate)) {
			regItem(plate);
			orePlate(ore, plate);
		}
	}
	
	public static void regStick(Item stick, String ore) {
		if (ConfigItems.loadItem(stick)) {
			regItem(stick);
			oreStick(ore, stick);
		}
	}
	
	public static void regItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
		MorePlates.logger.debug(INFO_REG_ITEM + getItemNameFromItem(item));
	}
	
	public Item gear(String name) {
		return new ItemGear(name);
	}
	
	public Item plate(String name) {
		return new ItemPlate(name);
	}
	
	public Item stick(String name) {
		return new ItemStick(name);
	}
	
	public static ItemStack getItemStack(String id, String name, int amount, int meta) {
		Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(id + ":" + name));
		return item != null ? new ItemStack(item, amount, meta) : ItemStack.EMPTY;
	}
	
	public static ItemStack getItemStack(String id, String name, int amount) {
		return getItemStack(id, name, amount, 0);
	}
	
	public static ItemStack getItemStack(String id, String name) {
		return getItemStack(id, name, 1, 0);
	}
	
	public static ItemStack getItemStack(Block block, int meta) {
		return block != null ? new ItemStack(block, 1, meta) : ItemStack.EMPTY;
	}
	
	public static ItemStack getItemStack(Item item, int meta) {
		return item != null ? new ItemStack(item, 1, meta) : ItemStack.EMPTY;
	}
	
	public static ItemStack getItemStack(Block block) {
		return getItemStack(block, 1);
	}
	
	public static ItemStack getItemStack(Item item) {
		return getItemStack(item, 1);
	}
	
	public static String getItemName(ItemStack stack) {
		return stack.getTranslationKey();
	}
	
	public static boolean oreNameExists(String oreName) {
		return OreDictionary.doesOreNameExist(oreName) && OreDictionary.getOres(oreName, false).size() > 0;
	}
	
	public static ItemStack getOre(String oreName, int amount) {
		if (!oreNameExists(oreName))
			return ItemStack.EMPTY;
		return cloneStack(OreDictionary.getOres(oreName, false).get(0), amount);
	}
	
	public static ItemStack getOre(String oreName) {
		return getOre(oreName, 1);
	}
	
	public static ItemStack cloneStack(ItemStack stack, int stackSize) {
		if (stack.isEmpty())
			return ItemStack.EMPTY;
		ItemStack retStack = stack.copy();
		retStack.setCount(stackSize);

		return retStack;
	}
	
	public static String getItemNameFromOre(String oreName) {
		return getItemName(getOre(oreName));
	}
	
	public static String getItemNameFromItemStack(String id, String name, int amount, int meta) {
		return getItemName(getItemStack(id, name, amount, meta));
	}
	
	public static String getItemNameFromItemStack(String id, String name) {
		return getItemName(getItemStack(id, name, 1, 0));
	}
	
	public static String getItemNameFromItem(Item item) {
		return getItemName(getItemStack(item));
	}
	
	public static void oreGear(String ore, Item gear) {
		OreDictionary.registerOre(GEAR + ore, gear);
	}
	
	public static void orePlate(String ore, Item plate) {
		OreDictionary.registerOre(PLATE + ore, plate);
	}
	
	public static void oreStick(String ore, Item stick) {
		OreDictionary.registerOre(STICK + ore, stick);
	}
	
	public static void oreGearGaia(String ore, Item geargaia) {
		OreDictionary.registerOre(ore + "Gear", geargaia);
	}
	
	public static void orePlateGaia(String ore, Item plategaia) {
		OreDictionary.registerOre(ore + "Plate", plategaia);
	}
	
	//Deprecated, to change in 1.13
	public static String translate(String key) {
		return I18n.translateToLocal(key);
	}
	
	public static boolean isLoaded(String modid) {
		return Loader.isModLoaded(modid);
	}
	
	public static boolean checkIsNotNull(String id, String input) {
		return getItemStack(id, input) != ItemStack.EMPTY;
	}
	
	public static boolean checkIsNotNull(String id, String input, int meta) {
		return getItemStack(id, input, 1, meta) != ItemStack.EMPTY;
	}
}