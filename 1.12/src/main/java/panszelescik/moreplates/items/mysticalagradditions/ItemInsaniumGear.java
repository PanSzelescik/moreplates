package panszelescik.moreplates.items.mysticalagradditions;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemInsaniumGear extends Item {

	public ItemInsaniumGear(String unlocalizedName, String registryName) {
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Reference.MODID, registryName));
	}
}