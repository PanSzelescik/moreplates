package panszelescik.moreplates.init;

import panszelescik.moreplates.plugins.*;

import static panszelescik.moreplates.ModChecker.*;
import static panszelescik.moreplates.config.Config.*;

public class PluginLoader {
	
	public static void preInit() {
		if (isAppliedEnergisticsLoaded & loadAppliedEnergistics2)
			PluginAppliedEnergistics2.preInit();
		if (isBotaniaLoaded & loadBotania)
			PluginBotania.preInit();
		if (isCalculatorLoaded & loadCalculator)
			PluginCalculator.preInit();
		if (isDraconicEvolutionLoaded & loadDraconicEvolution)
			PluginDraconicEvolution.preInit();
		if (isEnderIOLoaded & loadEnderIO)
			PluginEnderIO.preInit();
		if (isExtraUtilitiesLoaded & loadExtraUtilities)
			PluginExtraUtilities.preInit();
		if (isMekanismLoaded & loadMekanism)
			PluginMekanism.preInit();
		if (isMysticalAgradditionsLoaded & loadMysticalAgradditions)
			PluginMysticalAgradditions.preInit();
		if (isMysticalAgricultureLoaded & loadMysticalAgriculture)
			PluginMysticalAgriculture.preInit();
		if (isProjectELoaded & loadProjectE)
			PluginProjectE.preInit();
		if (isProjectRedLoaded & loadProjectRed)
			PluginProjectRed.preInit();
		if (isRefinedStorageLoaded & loadRefinedStorage)
			PluginRefinedStorage.preInit();
		if (isTinkersConstructLoaded & loadTinkersConstruct)
			PluginTinkersConstruct.preInit();
		PluginMultiMod.preInit();
	}
	
	public static void clientPreInit() {
		if (isAppliedEnergisticsLoaded & loadAppliedEnergistics2)
			PluginAppliedEnergistics2.clientPreInit();
		if (isBotaniaLoaded & loadBotania)
			PluginBotania.clientPreInit();
		if (isCalculatorLoaded & loadCalculator)
			PluginCalculator.clientPreInit();
		if (isDraconicEvolutionLoaded & loadDraconicEvolution)
			PluginDraconicEvolution.clientPreInit();
		if (isEnderIOLoaded & loadEnderIO)
			PluginEnderIO.clientPreInit();
		if (isExtraUtilitiesLoaded & loadExtraUtilities)
			PluginExtraUtilities.clientPreInit();
		if (isMekanismLoaded & loadMekanism)
			PluginMekanism.clientPreInit();
		if (isMysticalAgradditionsLoaded & loadMysticalAgradditions)
			PluginMysticalAgradditions.clientPreInit();
		if (isMysticalAgricultureLoaded & loadMysticalAgriculture)
			PluginMysticalAgriculture.clientPreInit();
		if (isProjectELoaded & loadProjectE)
			PluginProjectE.clientPreInit();
		if (isProjectRedLoaded & loadProjectRed)
			PluginProjectRed.clientPreInit();
		if (isRefinedStorageLoaded & loadRefinedStorage)
			PluginRefinedStorage.clientPreInit();
		if (isTinkersConstructLoaded & loadTinkersConstruct)
			PluginTinkersConstruct.clientPreInit();
		PluginMultiMod.clientPreInit();
	}
	
	public static void init() {
		if (isAppliedEnergisticsLoaded & loadAppliedEnergistics2)
			PluginAppliedEnergistics2.init();
		if (isBotaniaLoaded & loadBotania)
			PluginBotania.init();
		if (isCalculatorLoaded & loadCalculator)
			PluginCalculator.init();
		if (isDraconicEvolutionLoaded & loadDraconicEvolution)
			PluginDraconicEvolution.init();
		if (isEnderIOLoaded & loadEnderIO)
			PluginEnderIO.init();
		if (isExtraUtilitiesLoaded & loadExtraUtilities)
			PluginExtraUtilities.init();
		if (isMekanismLoaded & loadMekanism)
			PluginMekanism.init();
		if (isMysticalAgradditionsLoaded & loadMysticalAgradditions)
			PluginMysticalAgradditions.init();
		if (isMysticalAgricultureLoaded & loadMysticalAgriculture)
			PluginMysticalAgriculture.init();
		if (isProjectELoaded & loadProjectE)
			PluginProjectE.init();
		if (isProjectRedLoaded & loadProjectRed)
			PluginProjectRed.init();
		if (isRefinedStorageLoaded & loadRefinedStorage)
			PluginRefinedStorage.init();
		if (isTinkersConstructLoaded & loadTinkersConstruct)
			PluginTinkersConstruct.init();
		PluginMultiMod.init();
	}
	
	public static void postInit() {
		if (isCoFHCoreLoaded & isImmersiveEngineeringLoaded & loadImmersiveEngineering)
			PluginImmersiveEngineering.postInit();
		if (isThermalExpansionLoaded & loadThermalExpansion)
			PluginThermalExpansion.postInit();
	}
	
}