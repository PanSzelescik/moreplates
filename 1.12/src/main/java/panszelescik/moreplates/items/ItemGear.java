package panszelescik.moreplates.items;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;

import static panszelescik.moreplates.MorePlates.*;
import static panszelescik.moreplates.Reference.*;

import javax.annotation.Nonnull;

public class ItemGear extends Item {
	
	public ItemGear(@Nonnull String name) {
		name += "_gear";
		setTranslationKey(name);
		setRegistryName(new ResourceLocation(MODID, name));
		setCreativeTab(TAB);
	}
}