package panszelescik.moreplates.init;

import panszelescik.moreplates.ModChecker;
import panszelescik.moreplates.plugins.*;

public class PluginLoader {
	
	public static void init() {
		if (ModChecker.isAppliedEnergisticsLoaded)
			PluginAppliedEnergistics2.init();
		if (ModChecker.isBotaniaLoaded)
			PluginBotania.init();
		if (ModChecker.isDraconicEvolutionLoaded)
			PluginDraconicEvolution.init();
		if (ModChecker.isEnderIOLoaded)
			PluginEnderIO.init();
		if (ModChecker.isExtraUtilitiesLoaded)
			PluginExtraUtilities.init();
		if (ModChecker.isMekanismLoaded)
			PluginMekanism.init();
		if (ModChecker.isMysticalAgradditionsLoaded)
			PluginMysticalAgradditions.init();
		if (ModChecker.isMysticalAgricultureLoaded)
			PluginMysticalAgriculture.init();
		if (ModChecker.isProjectRedLoaded)
			PluginProjectRed.init();
		if (ModChecker.isRefinedStorageLoaded)
			PluginRefinedStorage.init();
		if (ModChecker.isTinkersConstructLoaded)
			PluginTinkersConstruct.init();
	}
	
	public static void register() {
		if (ModChecker.isAppliedEnergisticsLoaded)
			PluginAppliedEnergistics2.register();
		if (ModChecker.isBotaniaLoaded)
			PluginBotania.register();
		if (ModChecker.isDraconicEvolutionLoaded)
			PluginDraconicEvolution.register();
		if (ModChecker.isEnderIOLoaded)
			PluginEnderIO.register();
		if (ModChecker.isExtraUtilitiesLoaded)
			PluginExtraUtilities.register();
		if (ModChecker.isMekanismLoaded)
			PluginMekanism.register();
		if (ModChecker.isMysticalAgradditionsLoaded)
			PluginMysticalAgradditions.register();
		if (ModChecker.isMysticalAgricultureLoaded)
			PluginMysticalAgriculture.register();
		if (ModChecker.isProjectRedLoaded)
			PluginProjectRed.register();
		if (ModChecker.isRefinedStorageLoaded)
			PluginRefinedStorage.register();
		if (ModChecker.isTinkersConstructLoaded)
			PluginTinkersConstruct.register();
	}
	
	public static void registerRenders() {
		if (ModChecker.isAppliedEnergisticsLoaded)
			PluginAppliedEnergistics2.registerRenders();
		if (ModChecker.isBotaniaLoaded)
			PluginBotania.registerRenders();
		if (ModChecker.isDraconicEvolutionLoaded)
			PluginDraconicEvolution.registerRenders();
		if (ModChecker.isEnderIOLoaded)
			PluginEnderIO.registerRenders();
		if (ModChecker.isExtraUtilitiesLoaded)
			PluginExtraUtilities.registerRenders();
		if (ModChecker.isMekanismLoaded)
			PluginMekanism.registerRenders();
		if (ModChecker.isMysticalAgradditionsLoaded)
			PluginMysticalAgradditions.registerRenders();
		if (ModChecker.isMysticalAgricultureLoaded)
			PluginMysticalAgriculture.registerRenders();
		if (ModChecker.isProjectRedLoaded)
			PluginProjectRed.registerRenders();
		if (ModChecker.isRefinedStorageLoaded)
			PluginRefinedStorage.registerRenders();
		if (ModChecker.isTinkersConstructLoaded)
			PluginTinkersConstruct.registerRenders();
	}
	
	public static void registerOreDict() {
		if (ModChecker.isAppliedEnergisticsLoaded)
			PluginAppliedEnergistics2.registerOreDict();
		if (ModChecker.isBotaniaLoaded)
			PluginBotania.registerOreDict();
		if (ModChecker.isDraconicEvolutionLoaded)
			PluginDraconicEvolution.registerOreDict();
		if (ModChecker.isEnderIOLoaded)
			PluginEnderIO.registerOreDict();
		if (ModChecker.isExtraUtilitiesLoaded)
			PluginExtraUtilities.registerOreDict();
		if (ModChecker.isMekanismLoaded)
			PluginMekanism.registerOreDict();
		if (ModChecker.isMysticalAgradditionsLoaded)
			PluginMysticalAgradditions.registerOreDict();
		if (ModChecker.isMysticalAgricultureLoaded)
			PluginMysticalAgriculture.registerOreDict();
		if (ModChecker.isProjectRedLoaded)
			PluginProjectRed.registerOreDict();
		if (ModChecker.isRefinedStorageLoaded)
			PluginRefinedStorage.registerOreDict();
		if (ModChecker.isTinkersConstructLoaded)
			PluginTinkersConstruct.registerOreDict();
	}
	
}