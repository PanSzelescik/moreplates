package panszelescik.moreplates.items;

import net.minecraft.util.ResourceLocation;

import static panszelescik.moreplates.Reference.*;

public class ItemGear extends ItemBase {
	
	public ItemGear(String name) {
		super();
		name += "_gear";
		setTranslationKey(name);
		setRegistryName(new ResourceLocation(MODID, name));
	}
}