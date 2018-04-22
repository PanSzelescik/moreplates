package panszelescik.moreplates.items.projecte;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemDarkMatterGear extends Item {

	public ItemDarkMatterGear(String unlocalizedName, String registryName) {
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Reference.MODID, registryName));
	}
}