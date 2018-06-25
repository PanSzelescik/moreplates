package panszelescik.moreplates.init;

import panszelescik.moreplates.plugins.*;

import static panszelescik.moreplates.ModChecker.*;
import static panszelescik.moreplates.config.Config.*;

public class PluginLoader {
	
	public static void preInit() {
		if (loadVanilla)
			PluginVanilla.preInit();
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