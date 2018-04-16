package panszelescik.moreplates.proxy;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import panszelescik.moreplates.config.Config;
import panszelescik.moreplates.init.*;

@EventBusSubscriber
public class CommonProxy {

	public static Configuration config;
	
	public void preInit(FMLPreInitializationEvent event) {
		File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "moreplates.cfg"));
        Config.readConfig();
        
        Items.init();
		PluginLoader.init();
		
		Items.register();
		PluginLoader.register();
	}
	
	public void init(FMLInitializationEvent event) {
		PluginLoader.registerOreDict();
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		if (config.hasChanged())
			config.save();
	}
	
	public void registerRenders() {
		
	}
}