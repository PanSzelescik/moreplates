package panszelescik.moreplates.items.appliedenergistics2;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemFluixPlate extends Item {

	public ItemFluixPlate(String unlocalizedName, String registryName) {
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Reference.MODID, registryName));
	}
}