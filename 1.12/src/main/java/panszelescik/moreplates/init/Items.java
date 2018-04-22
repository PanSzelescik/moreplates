package panszelescik.moreplates.init;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;
import panszelescik.moreplates.register.*;

public class Items {
	
	public static Item hammer;
	
	public static void preInit() {
		hammer = new ItemHammer("hammer", "hammer");
		RegisterItem.register(hammer);
	}
	
	public static void clientPreInit() {
		RegisterRender.register(hammer);
	}
	
	public static void init() {
		
	}
	
}