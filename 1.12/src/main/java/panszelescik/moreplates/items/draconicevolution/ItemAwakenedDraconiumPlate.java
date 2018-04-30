package panszelescik.moreplates.items.draconicevolution;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemAwakenedDraconiumPlate extends Item {

	public ItemAwakenedDraconiumPlate(String name) {
		setUnlocalizedName(name);
		setRegistryName(new ResourceLocation(Reference.MODID, name));
	}
}