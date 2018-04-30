package panszelescik.moreplates.items.mekanism;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;

public class ItemRefinedObsidianPlate extends Item {

	public ItemRefinedObsidianPlate(String name) {
		setUnlocalizedName(name);
		setRegistryName(new ResourceLocation(Reference.MODID, name));
	}
}