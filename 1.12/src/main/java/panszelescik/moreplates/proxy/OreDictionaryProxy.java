package panszelescik.moreplates.proxy;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.helpers.Helper;

public class OreDictionaryProxy {
	
	//From CoFH Core
	public ItemStack getOre(String oreName, int amount) {
		if (!oreNameExists(oreName))
			return ItemStack.EMPTY;
		return Helper.cloneStack(OreDictionary.getOres(oreName, false).get(0), amount);
	}
	
	//From CoFH Core
	public boolean oreNameExists(String oreName) {
		return OreDictionary.doesOreNameExist(oreName) && OreDictionary.getOres(oreName, false).size() > 0;
	}
	
}