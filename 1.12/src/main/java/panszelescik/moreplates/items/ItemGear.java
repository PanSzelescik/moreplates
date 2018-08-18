package panszelescik.moreplates.items;

import static panszelescik.moreplates.Reference.*;

import net.minecraft.util.ResourceLocation;

public class ItemGear extends ItemBase {
	
	public ItemGear(String name) {
		super();
		name += "_gear";
		setTranslationKey(MODID + "." + name);
		setRegistryName(new ResourceLocation(MODID, name));
	}
}