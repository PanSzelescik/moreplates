package panszelescik.moreplates.items.refinedstorage;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemQuartzEnrichedIronPlate extends Item {

	public ItemQuartzEnrichedIronPlate(String name) {
		setUnlocalizedName(name);
		setRegistryName(new ResourceLocation(Reference.MODID, name));
	}
}