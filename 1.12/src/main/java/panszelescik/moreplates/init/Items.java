package panszelescik.moreplates.init;

import net.minecraft.item.Item;
import panszelescik.moreplates.items.*;

import static panszelescik.moreplates.helpers.Helper.*;

public class Items {
	
	public static Item hammer;
	
	public static void preInit() {
		hammer = new ItemHammer("hammer");
		
		registerItem(hammer);
	}
	
	public static void clientPreInit() {
		registerRender(hammer);
	}
	
	public static void init() {
		
	}
}