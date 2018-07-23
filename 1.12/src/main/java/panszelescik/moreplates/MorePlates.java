package panszelescik.moreplates;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import panszelescik.moreplates.config.Config;
import panszelescik.moreplates.init.Items;
import panszelescik.moreplates.init.PluginLoader;
//import panszelescik.moreplates.proxy.CommonProxy;

import static panszelescik.moreplates.Reference.*;

@Mod(
		modid = MODID, 
		name = NAME, 
		version = VERSION, 
		dependencies = DEPENDENCIES, 
		guiFactory = GUI_FACTORY, 
		acceptedMinecraftVersions = ACCEPTED_MINECRAFT_VERSIONS, 
		updateJSON = UPDATE_JSON
	)
public class MorePlates {
	
	public static final Logger logger = LogManager.getFormatterLogger(MODID);
	public static final CreativeTabs TAB = new CreativeTabs(MODID) {
		
		@Override
		public ItemStack createIcon() {
			return new ItemStack(Items.hammer);
		}
	};
	
	@Mod.Instance(MODID)
	public static MorePlates instance;
	
	public Config config;
	public static ModChecker modChecker;
	
	//@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	//public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		logger.info("Started PreInitialization.");
		config = new Config(event.getSuggestedConfigurationFile());
		
		modChecker = new ModChecker();
		modChecker.printSuccessMessage();
		
		Items.preInit();
		PluginLoader.preInit();
		//proxy.preInit(event);
		logger.info("Completed PreInitialization.");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		logger.info("Started PostInitialization.");
		PluginLoader.postInit();
		//proxy.postInit(event);
		logger.info("Completed PostInitialization.");
	}
}