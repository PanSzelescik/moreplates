package panszelescik.moreplates.init;

import panszelescik.moreplates.ModChecker;
import panszelescik.moreplates.config.Config;
import panszelescik.moreplates.plugins.*;

public class PluginLoader {
	
	public static void preInit() {
		if (ModChecker.isAppliedEnergisticsLoaded & Config.loadAppliedEnergistics2)
			PluginAppliedEnergistics2.preInit();
		if (ModChecker.isBotaniaLoaded & Config.loadBotania)
			PluginBotania.preInit();
		if (ModChecker.isDraconicEvolutionLoaded & Config.loadDraconicEvolution)
			PluginDraconicEvolution.preInit();
		if (ModChecker.isEnderIOLoaded & Config.loadEnderIO)
			PluginEnderIO.preInit();
		if (ModChecker.isExtraUtilitiesLoaded & Config.loadExtraUtilities)
			PluginExtraUtilities.preInit();
		if (ModChecker.isMekanismLoaded & Config.loadMekanism)
			PluginMekanism.preInit();
		if (ModChecker.isMysticalAgradditionsLoaded & Config.loadMysticalAgradditions)
			PluginMysticalAgradditions.preInit();
		if (ModChecker.isMysticalAgricultureLoaded & Config.loadMysticalAgriculture)
			PluginMysticalAgriculture.preInit();
		if (ModChecker.isProjectELoaded & Config.loadProjectE)
			PluginProjectE.preInit();
		if (ModChecker.isProjectRedLoaded & Config.loadProjectRed)
			PluginProjectRed.preInit();
		if (ModChecker.isRefinedStorageLoaded & Config.loadRefinedStorage)
			PluginRefinedStorage.preInit();
		if (ModChecker.isTinkersConstructLoaded & Config.loadTinkersConstruct)
			PluginTinkersConstruct.preInit();
		PluginMultiMod.preInit();
	}
	
	public static void clientPreInit() {
		if (ModChecker.isAppliedEnergisticsLoaded & Config.loadAppliedEnergistics2)
			PluginAppliedEnergistics2.clientPreInit();
		if (ModChecker.isBotaniaLoaded & Config.loadBotania)
			PluginBotania.clientPreInit();
		if (ModChecker.isDraconicEvolutionLoaded & Config.loadDraconicEvolution)
			PluginDraconicEvolution.clientPreInit();
		if (ModChecker.isEnderIOLoaded & Config.loadEnderIO)
			PluginEnderIO.clientPreInit();
		if (ModChecker.isExtraUtilitiesLoaded & Config.loadExtraUtilities)
			PluginExtraUtilities.clientPreInit();
		if (ModChecker.isMekanismLoaded & Config.loadMekanism)
			PluginMekanism.clientPreInit();
		if (ModChecker.isMysticalAgradditionsLoaded & Config.loadMysticalAgradditions)
			PluginMysticalAgradditions.clientPreInit();
		if (ModChecker.isMysticalAgricultureLoaded & Config.loadMysticalAgriculture)
			PluginMysticalAgriculture.clientPreInit();
		if (ModChecker.isProjectELoaded & Config.loadProjectE)
			PluginProjectE.clientPreInit();
		if (ModChecker.isProjectRedLoaded & Config.loadProjectRed)
			PluginProjectRed.clientPreInit();
		if (ModChecker.isRefinedStorageLoaded & Config.loadRefinedStorage)
			PluginRefinedStorage.clientPreInit();
		if (ModChecker.isTinkersConstructLoaded & Config.loadTinkersConstruct)
			PluginTinkersConstruct.clientPreInit();
		PluginMultiMod.clientPreInit();
	}
	
	public static void init() {
		if (ModChecker.isAppliedEnergisticsLoaded & Config.loadAppliedEnergistics2)
			PluginAppliedEnergistics2.init();
		if (ModChecker.isBotaniaLoaded & Config.loadBotania)
			PluginBotania.init();
		if (ModChecker.isDraconicEvolutionLoaded & Config.loadDraconicEvolution)
			PluginDraconicEvolution.init();
		if (ModChecker.isEnderIOLoaded & Config.loadEnderIO)
			PluginEnderIO.init();
		if (ModChecker.isExtraUtilitiesLoaded & Config.loadExtraUtilities)
			PluginExtraUtilities.init();
		if (ModChecker.isMekanismLoaded & Config.loadMekanism)
			PluginMekanism.init();
		if (ModChecker.isMysticalAgradditionsLoaded & Config.loadMysticalAgradditions)
			PluginMysticalAgradditions.init();
		if (ModChecker.isMysticalAgricultureLoaded & Config.loadMysticalAgriculture)
			PluginMysticalAgriculture.init();
		if (ModChecker.isProjectELoaded & Config.loadProjectE)
			PluginProjectE.init();
		if (ModChecker.isProjectRedLoaded & Config.loadProjectRed)
			PluginProjectRed.init();
		if (ModChecker.isRefinedStorageLoaded & Config.loadRefinedStorage)
			PluginRefinedStorage.init();
		if (ModChecker.isTinkersConstructLoaded & Config.loadTinkersConstruct)
			PluginTinkersConstruct.init();
		PluginMultiMod.init();
	}
	
}