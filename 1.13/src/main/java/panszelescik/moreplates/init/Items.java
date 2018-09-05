package panszelescik.moreplates.init;

import static panszelescik.moreplates.helpers.Helper.*;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

public class Items {
	
	public static Item hammer;
	
	public static void preInit() {
		hammer = new ItemHammer();
		
		regItem(hammer);
	}
}