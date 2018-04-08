package panszelescik.moreplates.register;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import panszelescik.moreplates.MorePlates;

public class RegisterItem {
	
	public static void register(Item item) {
		item.setCreativeTab(MorePlates.items);
		ForgeRegistries.ITEMS.register(item);
	}
	
}