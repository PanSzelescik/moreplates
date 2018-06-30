package panszelescik.moreplates.items;

import javax.annotation.Nonnull;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.Reference;
import panszelescik.moreplates.config.Config;

public class ItemHammer extends Item {

	public ItemHammer(@Nonnull String name) {
		setUnlocalizedName(name);
		setRegistryName(new ResourceLocation(Reference.MODID, name));
		setCreativeTab(MorePlates.moreplates);
		setMaxDamage(Config.durabilityHammer - 1);
		maxStackSize = 1;
		setContainerItem(this);
	}
}