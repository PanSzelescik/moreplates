package panszelescik.moreplates.items.mekanism;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemOsmiumGear extends Item {

	public ItemOsmiumGear(String unlocalizedName, String registryName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
	}
	
}