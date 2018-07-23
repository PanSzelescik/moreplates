package panszelescik.moreplates.items;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;

import static panszelescik.moreplates.MorePlates.*;
import static panszelescik.moreplates.Reference.*;

import javax.annotation.Nonnull;

public class ItemPlate extends Item {
	
	public ItemPlate(@Nonnull String name) {
		name += "_plate";
		setTranslationKey(name);
		setRegistryName(new ResourceLocation(MODID, name));
		setCreativeTab(TAB);
	}
}