package panszelescik.moreplates.items;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.Reference;
import panszelescik.moreplates.config.Config;

public class ItemHammer extends Item {

	public ItemHammer(String name) {
		setUnlocalizedName(name);
		setRegistryName(new ResourceLocation(Reference.MODID, name));
		setMaxDamage(Config.durabilityHammer - 1);
		maxStackSize = 1;
		setContainerItem(this);
	}
}