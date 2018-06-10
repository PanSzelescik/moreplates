package panszelescik.moreplates.helpers;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.Reference;
import panszelescik.moreplates.proxy.OreDictionaryProxy;

import static panszelescik.moreplates.helpers.Strings.*;

public class Helper {
	
	public static OreDictionaryProxy oreProxy = new OreDictionaryProxy();
	
	public static void registerItem(Item item) {
		item.setCreativeTab(MorePlates.items);
		ForgeRegistries.ITEMS.register(item);
		MorePlates.logger.debug(INFO_REG_ITEM + getItemName(getItemStack(item)));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		MorePlates.logger.debug(INFO_REG_RENDER + getItemName(getItemStack(item)));
	}
	
	//From CoFH Core
	public static ItemStack getItemStack(String id, String name, int amount, int meta) {
		Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(id + ":" + name));
		return item != null ? new ItemStack(item, amount, meta) : ItemStack.EMPTY;
	}
	
	//From CoFH Core
	public static ItemStack getItemStack(String id, String name, int amount) {
		return getItemStack(id, name, amount, 0);
	}
	
	//From CoFH Core
	public static ItemStack getItemStack(String id, String name) {
		return getItemStack(id, name, 1, 0);
	}
	
	public static ItemStack getItemStack(Item item) {
		return item != null ? new ItemStack(item, 1, 0) : ItemStack.EMPTY;
	}
	
	//From CoFH Core
	public static String getItemName(ItemStack stack) {
		String name = "";
		name += stack.getDisplayName();
		return name;
	}
	
	//From CoFH Core
	public static boolean oreNameExists(String oreName) {
		return oreProxy.oreNameExists(oreName);
	}
	
	//From CoFH Core
	public static ItemStack getOre(String oreName) {
		return getOre(oreName, 1);
	}
	
	//From CoFH Core
	public static ItemStack getOre(String oreName, int amount) {
		return oreProxy.getOre(oreName, amount);
	}
	
	//From CoFH Core
	public static ItemStack cloneStack(ItemStack stack, int stackSize) {
		if (stack.isEmpty())
			return ItemStack.EMPTY;
		ItemStack retStack = stack.copy();
		retStack.setCount(stackSize);

		return retStack;
	}
	
	public static String getItemNameFromOre (String oreName) {
		return getItemName(getOre(oreName));
	}
	
	public static String getItemNameFromItemStack (String id, String name, int amount, int meta) {
		return getItemName(getItemStack(id, name, amount, meta));
	}
	
	public static String getItemNameFromItemStack (String id, String name, int amount) {
		return getItemName(getItemStack(id, name, amount, 0));
	}
	
	public static String getItemNameFromItemStack (String id, String name) {
		return getItemName(getItemStack(id, name, 1, 0));
	}
	
	public static void oreGear(String ore, Item item) {
		ore = GEAR + ore;
		OreDictionary.registerOre(ore, item);
		MorePlates.logger.debug(INFO_ORE + ore + INFO_9 + getItemName(getItemStack(item)));
	}
	
	public static void orePlate(String ore, Item item) {
		ore = PLATE + ore;
		OreDictionary.registerOre(ore, item);
		MorePlates.logger.debug(INFO_ORE + ore + INFO_9 + getItemName(getItemStack(item)));
	}
	
	public static void oreGearGaia(String ore, Item item) {
		ore += "Gear";
		OreDictionary.registerOre(ore, item);
		MorePlates.logger.debug(INFO_ORE + ore + INFO_9 + getItemName(getItemStack(item)));
	}
	
	public static void orePlateGaia(String ore, Item item) {
		ore += "Plate";
		OreDictionary.registerOre(ore, item);
		MorePlates.logger.debug(INFO_ORE + ore + INFO_9 + getItemName(getItemStack(item)));
	}
}