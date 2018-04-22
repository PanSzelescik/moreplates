package panszelescik.moreplates.items;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;
import panszelescik.moreplates.config.Config;

public class ItemHammer extends Item {

	public ItemHammer(String unlocalizedName, String registryName) {
		setUnlocalizedName(unlocalizedName);
		setRegistryName(new ResourceLocation(Reference.MODID, registryName));
		setMaxDamage(Config.durabilityHammer);
		maxStackSize = 1;
		setContainerItem(this);
	}
}