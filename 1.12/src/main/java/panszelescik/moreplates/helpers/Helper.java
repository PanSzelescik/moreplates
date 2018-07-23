package panszelescik.moreplates.helpers;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.items.*;
import panszelescik.moreplates.proxy.OreDictionaryProxy;

import static panszelescik.moreplates.Reference.*;
import static panszelescik.moreplates.helpers.Strings.*;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Helper {
	
	private static boolean CLIENT = FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT;
	
	public static OreDictionaryProxy oreProxy = new OreDictionaryProxy();
	
	public static void reg(@Nonnull String ore, @Nullable Item gear, @Nullable Item plate) {
		if (gear != null)
			regGear(gear, ore);
		if (plate != null)
			regPlate(plate, ore);
	}
	
	public static void regGaia(@Nonnull String ore, @Nullable Item gear, @Nullable Item plate) {
		if (gear != null) {
			regItem(gear);
			oreGearGaia(ore, gear);
		}
		if (plate != null) {
			regItem(plate);
			orePlateGaia(ore, plate);
		}
	}
	
	public static void regGear(@Nonnull Item gear, @Nonnull String ore) {
		regItem(gear);
		oreGear(ore, gear);
	}
	
	public static void regPlate(@Nonnull Item plate, @Nonnull String ore) {
		regItem(plate);
		orePlate(ore, plate);
	}
	
	public static void regItem(@Nonnull Item item) {
		register(item);
		if (CLIENT)
			regRender(item);
	}
	
	private static void register(@Nonnull Item item) {
		ForgeRegistries.ITEMS.register(item);
		MorePlates.logger.debug(INFO_REG_ITEM + getItemNameFromItem(item));
	}
	
	private static void regRender(@Nonnull Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(MODID, item.getTranslationKey().substring(5)), "inventory"));
		MorePlates.logger.debug(INFO_REG_RENDER + getItemNameFromItem(item));
	}
	
	//From CoFH Core
	public static ItemStack getItemStack(@Nonnull String id, @Nonnull String name, int amount, int meta) {
		Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(id + ":" + name));
		return item != null ? new ItemStack(item, amount, meta) : ItemStack.EMPTY;
	}
	
	//From CoFH Core
	public static ItemStack getItemStack(@Nonnull String id, @Nonnull String name, int amount) {
		return getItemStack(id, name, amount, 0);
	}
	
	//From CoFH Core
	public static ItemStack getItemStack(@Nonnull String id, @Nonnull String name) {
		return getItemStack(id, name, 1, 0);
	}
	
	public static ItemStack getItemStack(@Nonnull Item item) {
		return item != null ? new ItemStack(item, 1, 0) : ItemStack.EMPTY;
	}
	
	//From CoFH Core
	public static String getItemName(@Nonnull ItemStack stack) {
		String name = "";
		name += stack.getDisplayName();
		return name;
	}
	
	//From CoFH Core
	public static boolean oreNameExists(@Nonnull String oreName) {
		return oreProxy.oreNameExists(oreName);
	}
	
	//From CoFH Core
	public static ItemStack getOre(@Nonnull String oreName) {
		return getOre(oreName, 1);
	}
	
	//From CoFH Core
	public static ItemStack getOre(@Nonnull String oreName, int amount) {
		return oreProxy.getOre(oreName, amount);
	}
	
	//From CoFH Core
	public static ItemStack cloneStack(@Nonnull ItemStack stack, int stackSize) {
		if (stack.isEmpty())
			return ItemStack.EMPTY;
		ItemStack retStack = stack.copy();
		retStack.setCount(stackSize);

		return retStack;
	}
	
	public static String getItemNameFromOre(@Nonnull String oreName) {
		return getItemName(getOre(oreName));
	}
	
	public static String getItemNameFromItemStack(@Nonnull String id, @Nonnull String name, int amount, int meta) {
		return getItemName(getItemStack(id, name, amount, meta));
	}
	
	public static String getItemNameFromItemStack(@Nonnull String id, @Nonnull String name, int amount) {
		return getItemName(getItemStack(id, name, amount, 0));
	}
	
	public static String getItemNameFromItemStack(@Nonnull String id, @Nonnull String name) {
		return getItemName(getItemStack(id, name, 1, 0));
	}
	
	public static String getItemNameFromItem(@Nonnull Item item) {
		return getItemName(getItemStack(item));
	}
	
	public static void oreGear(@Nonnull String ore, @Nonnull Item gear) {
		ore = GEAR + ore;
		OreDictionary.registerOre(ore, gear);
		MorePlates.logger.debug(INFO_ORE + ore + INFO_9 + getItemNameFromItem(gear));
	}
	
	public static void orePlate(@Nonnull String ore, @Nonnull Item plate) {
		ore = PLATE + ore;
		OreDictionary.registerOre(ore, plate);
		MorePlates.logger.debug(INFO_ORE + ore + INFO_9 + getItemNameFromItem(plate));
	}
	
	public static void oreGearGaia(@Nonnull String ore, @Nonnull Item geargaia) {
		ore += "Gear";
		OreDictionary.registerOre(ore, geargaia);
		MorePlates.logger.debug(INFO_ORE + ore + INFO_9 + getItemNameFromItem(geargaia));
	}
	
	public static void orePlateGaia(@Nonnull String ore, @Nonnull Item plategaia) {
		ore += "Plate";
		OreDictionary.registerOre(ore, plategaia);
		MorePlates.logger.debug(INFO_ORE + ore + INFO_9 + getItemNameFromItem(plategaia));
	}
}