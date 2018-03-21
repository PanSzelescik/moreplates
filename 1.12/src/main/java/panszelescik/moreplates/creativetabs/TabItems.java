package panszelescik.moreplates.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import panszelescik.moreplates.init.ModItems;

public class TabItems extends CreativeTabs{

	public TabItems() {
		super("items");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.hammer);
	}

}
