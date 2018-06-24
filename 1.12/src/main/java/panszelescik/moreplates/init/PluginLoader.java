package panszelescik.moreplates.init;

import panszelescik.moreplates.plugins.*;

import static panszelescik.moreplates.ModChecker.*;
import static panszelescik.moreplates.config.Config.*;

public class PluginLoader {
	
	public static void preInit() {
		PluginVanilla.preInit();
		PluginMetals.preInit();
		if (isActuallyAdditionsLoaded & loadActuallyAdditions)
			PluginActuallyAdditions.preInit();
		if (isAppliedEnergisticsLoaded & loadAppliedEnergistics2)
			PluginAppliedEnergistics2.preInit();
		if (isAvaritiaLoaded & loadAvaritia)
			PluginAvaritia.preInit();
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
		if (isPlusTiCLoaded & loadPlusTiC)
			PluginPlusTiC.preInit();
		if (isPneumaticCraftLoaded & loadPneumaticCraft)
			PluginPneumaticCraft.preInit();
		if (isProjectELoaded & loadProjectE)
			PluginProjectE.preInit();
		if (isProjectRedLoaded & loadProjectRed)
			PluginProjectRed.preInit();
		if (isRefinedStorageLoaded & loadRefinedStorage)
			PluginRefinedStorage.preInit();
		if (isThaumcraftLoaded & loadThaumcraft)
			PluginThaumcraft.preInit();
		if (isTinkersConstructLoaded & loadTinkersConstruct)
			PluginTinkersConstruct.preInit();
		if (isTwilightForestLoaded & loadTwilightForest)
			PluginTwilightForest.preInit();
		PluginMultiMod.preInit();
	}
	
	public static void clientPreInit() {
		PluginVanilla.clientPreInit();
		PluginMetals.clientPreInit();
		if (isActuallyAdditionsLoaded & loadActuallyAdditions)
			PluginActuallyAdditions.clientPreInit();
		if (isAppliedEnergisticsLoaded & loadAppliedEnergistics2)
			PluginAppliedEnergistics2.clientPreInit();
		if (isAvaritiaLoaded & loadAvaritia)
			PluginAvaritia.clientPreInit();
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
		if (isPlusTiCLoaded & loadPlusTiC)
			PluginPlusTiC.clientPreInit();
		if (isPneumaticCraftLoaded & loadPneumaticCraft)
			PluginPneumaticCraft.clientPreInit();
		if (isProjectELoaded & loadProjectE)
			PluginProjectE.clientPreInit();
		if (isProjectRedLoaded & loadProjectRed)
			PluginProjectRed.clientPreInit();
		if (isRefinedStorageLoaded & loadRefinedStorage)
			PluginRefinedStorage.clientPreInit();
		if (isThaumcraftLoaded & loadThaumcraft)
			PluginThaumcraft.clientPreInit();
		if (isTinkersConstructLoaded & loadTinkersConstruct)
			PluginTinkersConstruct.clientPreInit();
		if (isTwilightForestLoaded & loadTwilightForest)
			PluginTwilightForest.clientPreInit();
		PluginMultiMod.clientPreInit();
	}
	
	public static void postInit() {
		if (isActuallyAdditionsLoaded & loadActuallyAdditionsRecipes)
			PluginActuallyAdditions.postInit();
		if (isBotaniaLoaded & loadBotaniaRecipes)
			PluginBotania.postInit();
		if (isImmersiveEngineeringLoaded & loadImmersiveEngineeringRecipes)
			PluginImmersiveEngineering.postInit();
		if (isIndustrialCraft2Loaded & loadIndustrialCraft2Recipes)
			PluginIndustrialCraft2.postInit();
		if (isTechRebornLoaded & loadTechRebornRecipes)
			PluginTechReborn.postInit();
		if (isThermalExpansionLoaded & loadThermalExpansionRecipes)
			PluginThermalExpansion.postInit();
	}
}