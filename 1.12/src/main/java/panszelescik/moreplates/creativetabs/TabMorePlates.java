package panszelescik.moreplates.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import panszelescik.moreplates.Reference;
import panszelescik.moreplates.init.Items;

public class TabMorePlates extends CreativeTabs {
	
	public TabMorePlates() {
		super(Reference.MODID);
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.hammer);
	}
}