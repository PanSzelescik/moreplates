package panszelescik.moreplates.init;

import panszelescik.moreplates.ModChecker;
import panszelescik.moreplates.config.Config;
import panszelescik.moreplates.plugins.*;

public class PluginLoader {
	
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
		if (ModChecker.isProjectRedLoaded & Config.loadProjectRed)
			PluginProjectRed.init();
		if (ModChecker.isRefinedStorageLoaded & Config.loadRefinedStorage)
			PluginRefinedStorage.init();
		if (ModChecker.isTinkersConstructLoaded & Config.loadTinkersConstruct)
			PluginTinkersConstruct.init();
		PluginMultiMod.init();
	}
	
	public static void register() {
		if (ModChecker.isAppliedEnergisticsLoaded & Config.loadAppliedEnergistics2)
			PluginAppliedEnergistics2.register();
		if (ModChecker.isBotaniaLoaded & Config.loadBotania)
			PluginBotania.register();
		if (ModChecker.isDraconicEvolutionLoaded & Config.loadDraconicEvolution)
			PluginDraconicEvolution.register();
		if (ModChecker.isEnderIOLoaded & Config.loadEnderIO)
			PluginEnderIO.register();
		if (ModChecker.isExtraUtilitiesLoaded & Config.loadExtraUtilities)
			PluginExtraUtilities.register();
		if (ModChecker.isMekanismLoaded & Config.loadMekanism)
			PluginMekanism.register();
		if (ModChecker.isMysticalAgradditionsLoaded & Config.loadMysticalAgradditions)
			PluginMysticalAgradditions.register();
		if (ModChecker.isMysticalAgricultureLoaded & Config.loadMysticalAgriculture)
			PluginMysticalAgriculture.register();
		if (ModChecker.isProjectRedLoaded & Config.loadProjectRed)
			PluginProjectRed.register();
		if (ModChecker.isRefinedStorageLoaded & Config.loadRefinedStorage)
			PluginRefinedStorage.register();
		if (ModChecker.isTinkersConstructLoaded & Config.loadTinkersConstruct)
			PluginTinkersConstruct.register();
		PluginMultiMod.register();
	}
	
	public static void registerRenders() {
		if (ModChecker.isAppliedEnergisticsLoaded & Config.loadAppliedEnergistics2)
			PluginAppliedEnergistics2.registerRenders();
		if (ModChecker.isBotaniaLoaded & Config.loadBotania)
			PluginBotania.registerRenders();
		if (ModChecker.isDraconicEvolutionLoaded & Config.loadDraconicEvolution)
			PluginDraconicEvolution.registerRenders();
		if (ModChecker.isEnderIOLoaded & Config.loadEnderIO)
			PluginEnderIO.registerRenders();
		if (ModChecker.isExtraUtilitiesLoaded & Config.loadExtraUtilities)
			PluginExtraUtilities.registerRenders();
		if (ModChecker.isMekanismLoaded & Config.loadMekanism)
			PluginMekanism.registerRenders();
		if (ModChecker.isMysticalAgradditionsLoaded & Config.loadMysticalAgradditions)
			PluginMysticalAgradditions.registerRenders();
		if (ModChecker.isMysticalAgricultureLoaded & Config.loadMysticalAgriculture)
			PluginMysticalAgriculture.registerRenders();
		if (ModChecker.isProjectRedLoaded & Config.loadProjectRed)
			PluginProjectRed.registerRenders();
		if (ModChecker.isRefinedStorageLoaded & Config.loadRefinedStorage)
			PluginRefinedStorage.registerRenders();
		if (ModChecker.isTinkersConstructLoaded & Config.loadTinkersConstruct)
			PluginTinkersConstruct.registerRenders();
		PluginMultiMod.registerRenders();
	}
	
	public static void registerOreDict() {
		if (ModChecker.isAppliedEnergisticsLoaded & Config.loadAppliedEnergistics2)
			PluginAppliedEnergistics2.registerOreDict();
		if (ModChecker.isBotaniaLoaded & Config.loadBotania)
			PluginBotania.registerOreDict();
		if (ModChecker.isDraconicEvolutionLoaded & Config.loadDraconicEvolution)
			PluginDraconicEvolution.registerOreDict();
		if (ModChecker.isEnderIOLoaded & Config.loadEnderIO)
			PluginEnderIO.registerOreDict();
		if (ModChecker.isExtraUtilitiesLoaded & Config.loadExtraUtilities)
			PluginExtraUtilities.registerOreDict();
		if (ModChecker.isMekanismLoaded & Config.loadMekanism)
			PluginMekanism.registerOreDict();
		if (ModChecker.isMysticalAgradditionsLoaded & Config.loadMysticalAgradditions)
			PluginMysticalAgradditions.registerOreDict();
		if (ModChecker.isMysticalAgricultureLoaded & Config.loadMysticalAgriculture)
			PluginMysticalAgriculture.registerOreDict();
		if (ModChecker.isProjectRedLoaded & Config.loadProjectRed)
			PluginProjectRed.registerOreDict();
		if (ModChecker.isRefinedStorageLoaded & Config.loadRefinedStorage)
			PluginRefinedStorage.registerOreDict();
		if (ModChecker.isTinkersConstructLoaded & Config.loadTinkersConstruct)
			PluginTinkersConstruct.registerOreDict();
		PluginMultiMod.registerOreDict();
	}
	
}