package panszelescik.moreplates.proxy;

import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import panszelescik.moreplates.init.*;

@EventBusSubscriber
public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
		Items.preInit();
		PluginLoader.preInit();
	}
	
	public void init(FMLInitializationEvent event) {
		Items.init();
		PluginLoader.init();
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}