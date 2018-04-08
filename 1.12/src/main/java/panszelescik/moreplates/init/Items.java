package panszelescik.moreplates.init;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;
import panszelescik.moreplates.register.RegisterItem;
import panszelescik.moreplates.register.RegisterRender;

public class Items {
	
	public static Item hammer;
	
	public static void init() {
		hammer = new ItemHammer("hammer", "hammer");
	}
	
	public static void register() {
		RegisterItem.register(hammer);
	}
	
	public static void registerRenders() {
		RegisterRender.register(hammer);
	}
	
}