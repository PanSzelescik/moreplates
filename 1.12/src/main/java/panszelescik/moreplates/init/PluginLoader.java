package panszelescik.moreplates.init;

import java.util.ArrayList;

import panszelescik.moreplates.config.Config;
import panszelescik.moreplates.helpers.IInit;
import panszelescik.moreplates.plugins.*;

public class PluginLoader {
	
	private static ArrayList<IInit> initList = new ArrayList<>();
	
	private static PluginActuallyAdditions pluginActuallyAdditions;
	private static PluginAppliedEnergistics2 pluginAppliedEnergistics2;
	private static PluginAvaritia pluginAvaritia;
	private static PluginBotania pluginBotania;
	private static PluginCalculator pluginCalculator;
	private static PluginDraconicEvolution pluginDraconicEvolution;
	private static PluginEnderIO pluginEnderIO;
	private static PluginExtraUtilities pluginExtraUtilities;
	private static PluginImmersiveEngineering pluginImmersiveEngineering;
	private static PluginIndustrialCraft2 pluginIndustrialCraft2;
	private static PluginMekanism pluginMekanism;
	private static PluginMinecraft pluginMinecraft;
	private static PluginMultiMod pluginMultiMod;
	private static PluginMysticalAgradditions pluginMysticalAgradditions;
	private static PluginMysticalAgriculture pluginMysticalAgriculture;
	private static PluginPlusTiC pluginPlusTiC;
	private static PluginPneumaticCraft pluginPneumaticCraft;
	private static PluginProjectE pluginProjectE;
	private static PluginProjectRed pluginProjectRed;
	private static PluginRefinedStorage pluginRefinedStorage;
	private static PluginTechReborn pluginTechReborn;
	private static PluginThaumcraft pluginThaumcraft;
	private static PluginThermalExpansion pluginThermalExpansion;
	private static PluginTinkersConstruct pluginTinkersConstruct;
	private static PluginTwilightForest pluginTwilightForest;
	
	public static void preInit() {
		pluginActuallyAdditions = new PluginActuallyAdditions();
		pluginAppliedEnergistics2 = new PluginAppliedEnergistics2();
		pluginAvaritia = new PluginAvaritia();
		pluginBotania = new PluginBotania();
		pluginCalculator = new PluginCalculator();
		pluginDraconicEvolution = new PluginDraconicEvolution();
		pluginEnderIO = new PluginEnderIO();
		pluginExtraUtilities = new PluginExtraUtilities();
		pluginImmersiveEngineering = new PluginImmersiveEngineering();
		pluginIndustrialCraft2 = new PluginIndustrialCraft2();
		pluginMekanism = new PluginMekanism();
		pluginMinecraft = new PluginMinecraft();
		pluginMultiMod = new PluginMultiMod();
		pluginMysticalAgradditions = new PluginMysticalAgradditions();
		pluginMysticalAgriculture = new PluginMysticalAgriculture();
		pluginPlusTiC = new PluginPlusTiC();
		pluginPneumaticCraft = new PluginPneumaticCraft();
		pluginProjectE = new PluginProjectE();
		pluginProjectRed = new PluginProjectRed();
		pluginRefinedStorage = new PluginRefinedStorage();
		pluginTechReborn = new PluginTechReborn();
		pluginThaumcraft = new PluginThaumcraft();
		pluginThermalExpansion = new PluginThermalExpansion();
		pluginTinkersConstruct = new PluginTinkersConstruct();
		pluginTwilightForest = new PluginTwilightForest();
		
		initList.add(pluginActuallyAdditions);
		initList.add(pluginAppliedEnergistics2);
		initList.add(pluginAvaritia);
		initList.add(pluginBotania);
		initList.add(pluginCalculator);
		initList.add(pluginDraconicEvolution);
		initList.add(pluginEnderIO);
		initList.add(pluginExtraUtilities);
		initList.add(pluginImmersiveEngineering);
		initList.add(pluginIndustrialCraft2);
		initList.add(pluginMekanism);
		initList.add(pluginMinecraft);
		initList.add(pluginMultiMod);
		initList.add(pluginMysticalAgradditions);
		initList.add(pluginMysticalAgriculture);
		initList.add(pluginPlusTiC);
		initList.add(pluginPneumaticCraft);
		initList.add(pluginProjectE);
		initList.add(pluginProjectRed);
		initList.add(pluginRefinedStorage);
		initList.add(pluginTechReborn);
		initList.add(pluginThaumcraft);
		initList.add(pluginThermalExpansion);
		initList.add(pluginTinkersConstruct);
		initList.add(pluginTwilightForest);
		
		for (IInit init : initList)
			init.preInitPlugin();
		if (Config.cfg.hasChanged())
			Config.cfg.save();
	}
	
	public static void postInit() {
		for (IInit init : initList)
			init.initPlugin();
	}
}