package panszelescik.moreplates.items;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;
import panszelescik.moreplates.config.Config;

public class ItemHammer extends Item {

	public ItemHammer(String unlocalizedName, String registryName) {
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MODID, registryName));
		this.setMaxDamage(Config.durabilityHammer);
		this.maxStackSize = 1;
		this.setContainerItem(this);
	}
	
}