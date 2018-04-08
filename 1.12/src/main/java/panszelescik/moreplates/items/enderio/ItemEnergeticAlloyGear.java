package panszelescik.moreplates.items.enderio;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemEnergeticAlloyGear extends Item {

	public ItemEnergeticAlloyGear(String unlocalizedName, String registryName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
	}
	
}