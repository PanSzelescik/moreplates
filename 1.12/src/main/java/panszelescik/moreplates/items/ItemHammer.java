package panszelescik.moreplates.items;

import net.minecraft.util.ResourceLocation;
import panszelescik.moreplates.config.Config;
import static panszelescik.moreplates.Reference.*;

public class ItemHammer extends ItemBase {

	public ItemHammer() {
		super();
		String name = "hammer";
		setTranslationKey(name);
		setRegistryName(new ResourceLocation(MODID, name));
		setMaxDamage(Config.durabilityHammer - 1);
		maxStackSize = 1;
		setContainerItem(this);
	}
}