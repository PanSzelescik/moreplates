package panszelescik.moreplates.init;

import java.util.ArrayList;

import panszelescik.moreplates.helpers.IInit;
import panszelescik.moreplates.plugins.*;

public class PluginLoader extends PluginList {
	
	private static ArrayList<IInit> initList = new ArrayList<>();
	
	public static void preInit() {
		pluginRecipeAdder = new PluginRecipeAdder();
		pluginMinecraft = new PluginMinecraft();
		pluginMetals = new PluginMetals();
		
		pluginActuallyAdditions = new PluginActuallyAdditions();
		pluginAppliedEnergistics2 = new PluginAppliedEnergistics2();
		pluginAvaritia = new PluginAvaritia();
		pluginBotania = new PluginBotania();
		pluginCalculator = new PluginCalculator();
		pluginDraconicEvolution = new PluginDraconicEvolution();
		pluginEnderIO = new PluginEnderIO();
		pluginExtraUtilities = new PluginExtraUtilities();
		pluginMekanism = new PluginMekanism();
		pluginMysticalAgradditions = new PluginMysticalAgradditions();
		pluginMysticalAgriculture = new PluginMysticalAgriculture();
		pluginPlusTiC = new PluginPlusTiC();
		pluginPneumaticCraft = new PluginPneumaticCraft();
		pluginProjectE = new PluginProjectE();
		pluginProjectRed = new PluginProjectRed();
		pluginRefinedStorage = new PluginRefinedStorage();
		pluginSoulShards = new PluginSoulShards();
		pluginThaumcraft = new PluginThaumcraft();
		pluginTinkersConstruct = new PluginTinkersConstruct();
		pluginTwilightForest = new PluginTwilightForest();
		
		
		initList.add(pluginRecipeAdder);
		initList.add(pluginMinecraft);
		initList.add(pluginMetals);
		
		initList.add(pluginActuallyAdditions);
		initList.add(pluginAppliedEnergistics2);
		initList.add(pluginAvaritia);
		initList.add(pluginBotania);
		initList.add(pluginCalculator);
		initList.add(pluginDraconicEvolution);
		initList.add(pluginEnderIO);
		initList.add(pluginExtraUtilities);
		initList.add(pluginMekanism);
		initList.add(pluginMysticalAgradditions);
		initList.add(pluginMysticalAgriculture);
		initList.add(pluginPlusTiC);
		initList.add(pluginPneumaticCraft);
		initList.add(pluginProjectE);
		initList.add(pluginProjectRed);
		initList.add(pluginRefinedStorage);
		initList.add(pluginSoulShards);
		initList.add(pluginThaumcraft);
		initList.add(pluginTinkersConstruct);
		initList.add(pluginTwilightForest);
		
		for (IInit init : initList)
			init.preInitPlugin();
	}
	
	public static void postInit() {
		for (IInit init : initList)
			init.initPlugin();
		
		initList.clear();
	}
}