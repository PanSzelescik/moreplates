package panszelescik.moreplates.items;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.config.Config;

import static panszelescik.moreplates.MorePlates.*;
import static panszelescik.moreplates.Reference.*;

import javax.annotation.Nonnull;

public class ItemHammer extends Item {

	public ItemHammer(@Nonnull String name) {
		setTranslationKey(name);
		setRegistryName(new ResourceLocation(MODID, name));
		setCreativeTab(TAB);
		setMaxDamage(Config.durabilityHammer - 1);
		maxStackSize = 1;
		setContainerItem(this);
	}
}