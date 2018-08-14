package panszelescik.moreplates.items;

import net.minecraft.util.ResourceLocation;
import static panszelescik.moreplates.Reference.*;

public class ItemPlate extends ItemBase {
	
	public ItemPlate(String name) {
		super();
		name += "_plate";
		setTranslationKey(name);
		setRegistryName(new ResourceLocation(MODID, name));
	}
}