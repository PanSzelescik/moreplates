package panszelescik.moreplates.items.extrautils2;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemEvilInfusedIronPlate extends Item {

	public ItemEvilInfusedIronPlate(String name) {
		setUnlocalizedName(name);
		setRegistryName(new ResourceLocation(Reference.MODID, name));
	}
}