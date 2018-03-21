package panszelescik.moreplates;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import panszelescik.moreplates.creativetabs.TabItems;
import panszelescik.moreplates.handlers.OreDictionaryHandler;
import panszelescik.moreplates.init.ModItems;
import panszelescik.moreplates.proxy.CommonProxy;
import panszelescik.moreplates.util.Utils;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_MINECRAFT_VERSIONS, updateJSON = Reference.UPDATE_JSON)
public class MorePlates {
	
	public static final Logger logger = LogManager.getFormatterLogger(Reference.MODID);

	public static final CreativeTabs items = new TabItems();
	
	@Mod.Instance(Reference.MODID)
	public static MorePlates instance;
	
	public static ModChecker modChecker;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		modChecker = new ModChecker();
		modChecker.printSuccessMessage();
		
		ModItems.init();
		ModItems.register();
		Utils.getLogger().info("Pre Initialize");
		
		proxy.registerRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		OreDictionaryHandler.registerOreDictionary();
		Utils.getLogger().info("Initialize");
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		Utils.getLogger().info("Post Initialize");
	}
	
}
