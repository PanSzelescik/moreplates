package panszelescik.moreplates.items;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.Reference;

import static panszelescik.moreplates.helpers.Strings.*;

import javax.annotation.Nonnull;

public class ItemPlate extends Item {
	
	public ItemPlate(@Nonnull String name) {
		name += "_plate";
		setUnlocalizedName(name);
		setRegistryName(new ResourceLocation(Reference.MODID, name));
		setCreativeTab(MorePlates.moreplates);
	}
}