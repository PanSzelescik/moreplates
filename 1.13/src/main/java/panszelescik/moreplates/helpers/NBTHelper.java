package panszelescik.moreplates.helpers;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class NBTHelper {
	
	public static NBTTagCompound getTag(ItemStack stack) {
		if (!stack.hasTagCompound())
			stack.setTagCompound(new NBTTagCompound());
		return stack.getTagCompound();
	}
	
	public static boolean hasTag(ItemStack stack) {
		return stack.hasTagCompound();
	}
	
	public static int getInt(ItemStack stack, String key) {
		return hasTag(stack) ? getTag(stack).getInteger(key) : 0;
	}
	
	public static void setInt(ItemStack stack, String key, int val) {
		getTag(stack).setInteger(key, val);
	}
}