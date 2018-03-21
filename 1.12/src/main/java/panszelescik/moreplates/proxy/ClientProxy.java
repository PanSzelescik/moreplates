package panszelescik.moreplates.proxy;

import panszelescik.moreplates.init.ModItems;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		ModItems.registerRenders();
	}
	
}
