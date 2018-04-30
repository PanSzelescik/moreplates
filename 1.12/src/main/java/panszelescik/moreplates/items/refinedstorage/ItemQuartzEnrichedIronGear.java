package panszelescik.moreplates.items.refinedstorage;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemQuartzEnrichedIronGear extends Item {

	public ItemQuartzEnrichedIronGear(String name) {
		setUnlocalizedName(name);
		setRegistryName(new ResourceLocation(Reference.MODID, name));
	}
}