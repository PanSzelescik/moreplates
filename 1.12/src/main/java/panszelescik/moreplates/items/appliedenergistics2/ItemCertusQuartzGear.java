package panszelescik.moreplates.items.appliedenergistics2;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemCertusQuartzGear extends Item {

	public ItemCertusQuartzGear(String name) {
		setUnlocalizedName(name);
		setRegistryName(new ResourceLocation(Reference.MODID, name));
	}
}