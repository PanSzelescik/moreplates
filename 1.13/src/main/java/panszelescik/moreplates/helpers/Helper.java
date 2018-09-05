package panszelescik.moreplates.helpers;

import javax.annotation.Nullable;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.config.ConfigItems;

public abstract class Helper extends Strings {
	
	public static void reg(String ore, @Nullable Item gear, @Nullable Item plate) {
		if (gear != null)
			regGear(gear, ore);
		if (plate != null)
			regPlate(plate, ore);
	}
	
	public static void regGaia(String ore, @Nullable Item gear, @Nullable Item plate) {
		if (gear != null && ConfigItems.loadItem(gear)) {
			regItem(gear);
			oreGearGaia(ore, gear);
		}
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
	
	public static void regItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
		MorePlates.logger.debug(INFO_REG_ITEM + getItemNameFromItem(item));
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
	
	public static ItemStack getItemStack(Item item) {
		return item != null ? new ItemStack(item, 1, 0) : ItemStack.EMPTY;
	}
	
	public static String getItemName(ItemStack stack) {
		String name = "";
		name += stack.getDisplayName();
		return name;
	}
	
	public static boolean oreNameExists(String oreName) {
		return OreDictionary.doesOreNameExist(oreName) && OreDictionary.getOres(oreName, false).size() > 0;
	}
	
	public static ItemStack getOre(String oreName) {
		return getOre(oreName, 1);
	}
	
	public static ItemStack getOre(String oreName, int amount) {
		if (!oreNameExists(oreName))
			return ItemStack.EMPTY;
		return cloneStack(OreDictionary.getOres(oreName, false).get(0), amount);
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
	
	public static String getItemNameFromItemStack(String id, String name, int amount) {
		return getItemName(getItemStack(id, name, amount, 0));
	}
	
	public static String getItemNameFromItemStack(String id, String name) {
		return getItemName(getItemStack(id, name, 1, 0));
	}
	
	public static String getItemNameFromItem(Item item) {
		return getItemName(getItemStack(item));
	}
	
	public static void oreGear(String ore, Item gear) {
		ore = GEAR + ore;
		OreDictionary.registerOre(ore, gear);
		MorePlates.logger.debug(INFO_ORE + ore + INFO_9 + getItemNameFromItem(gear));
	}
	
	public static void orePlate(String ore, Item plate) {
		ore = PLATE + ore;
		OreDictionary.registerOre(ore, plate);
		MorePlates.logger.debug(INFO_ORE + ore + INFO_9 + getItemNameFromItem(plate));
	}
	
	public static void oreGearGaia(String ore, Item geargaia) {
		ore += "Gear";
		OreDictionary.registerOre(ore, geargaia);
		MorePlates.logger.debug(INFO_ORE + ore + INFO_9 + getItemNameFromItem(geargaia));
	}
	
	public static void orePlateGaia(String ore, Item plategaia) {
		ore += "Plate";
		OreDictionary.registerOre(ore, plategaia);
		MorePlates.logger.debug(INFO_ORE + ore + INFO_9 + getItemNameFromItem(plategaia));
	}
	
	//Deprecated, to change in 1.13
	public static String translate(String key) {
		return I18n.translateToLocal(key);
	}
	
	public static boolean checkIsNotNull(String ore) {
		return oreNameExists(ore);
	}
	
	public static boolean checkIsNotNull(String id, String input) {
		return getItemStack(id, input) != ItemStack.EMPTY;
	}
	
	public static boolean checkIsNotNull(String id, String input, int meta) {
		return getItemStack(id, input, 1, meta) != ItemStack.EMPTY;
	}
}