package panszelescik.moreplates.items.tconstruct;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemKnightslimePlate extends Item {

	public ItemKnightslimePlate(String unlocalizedName, String registryName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
	}
	
}