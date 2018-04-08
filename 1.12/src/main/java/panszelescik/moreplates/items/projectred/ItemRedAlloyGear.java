package panszelescik.moreplates.items.projectred;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemRedAlloyGear extends Item {

	public ItemRedAlloyGear(String unlocalizedName, String registryName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
	}
	
}