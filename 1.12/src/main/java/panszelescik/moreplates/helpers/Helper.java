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

import static panszelescik.moreplates.helpers.Strings.*;

public class Helper {
	
	public static void registerItem(Item item) {
		item.setCreativeTab(MorePlates.items);
		ForgeRegistries.ITEMS.register(item);
	}
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
	}
	//@author King Lemming
	public static ItemStack getItemStack(String id, String name, int amount, int meta) {
		Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(id + ":" + name));
		return item != null ? new ItemStack(item, amount, meta) : ItemStack.EMPTY;
	}
	//@author King Lemming
	public static ItemStack getItemStack(String id, String name, int amount) {
		return getItemStack(id, name, amount, 0);
	}
	//@author King Lemming
	public static ItemStack getItemStack(String id, String name) {
		return getItemStack(id, name, 1, 0);
	}
	public static void oreGear(String ore, Item item) {
		OreDictionary.registerOre(GEAR + ore, item);
	}
	public static void orePlate(String ore, Item item) {
		OreDictionary.registerOre(PLATE + ore, item);
	}
	public static void oreGearGaia(String ore, Item item) {
		OreDictionary.registerOre(ore + "Gear", item);
	}
	public static void orePlateGaia(String ore, Item item) {
		OreDictionary.registerOre(ore + "Plate", item);
	}
}