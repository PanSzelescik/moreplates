package panszelescik.moreplates.items;

import static panszelescik.moreplates.Reference.*;

import net.minecraft.util.ResourceLocation;

public class ItemPlate extends ItemBase {
	
	public ItemPlate(String name) {
		super();
		name += "_plate";
		setTranslationKey(MODID + "." + name);
		setRegistryName(new ResourceLocation(MODID, name));
	}
}