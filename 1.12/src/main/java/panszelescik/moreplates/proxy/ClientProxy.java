package panszelescik.moreplates.proxy;

import panszelescik.moreplates.ModChecker;
import panszelescik.moreplates.init.Items;
import panszelescik.moreplates.init.PluginLoader;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		Items.registerRenders();
		PluginLoader.registerRenders();
	}
	
}