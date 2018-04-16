package panszelescik.moreplates.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import panszelescik.moreplates.init.Items;

public class TabItems extends CreativeTabs {
	
	public TabItems() {
		super("items");
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.hammer);
	}
	
}