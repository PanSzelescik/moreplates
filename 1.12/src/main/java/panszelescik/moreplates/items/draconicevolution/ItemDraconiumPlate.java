package panszelescik.moreplates.items.draconicevolution;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemDraconiumPlate extends Item {

	public ItemDraconiumPlate(String unlocalizedName, String registryName) {
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Reference.MODID, registryName));
	}
}