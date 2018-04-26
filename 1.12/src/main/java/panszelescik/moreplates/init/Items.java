package panszelescik.moreplates.init;

import net.minecraft.item.Item;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.items.*;

public class Items {
	
	public static Item hammer;
	
	public static void preInit() {
		hammer = new ItemHammer("hammer", "hammer");
		Helper.registerItem(hammer);
	}
	
	public static void clientPreInit() {
		Helper.registerRender(hammer);
	}
	
	public static void init() {
		
	}
	
}