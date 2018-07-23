package panszelescik.moreplates.init;

import panszelescik.moreplates.plugins.*;

import static panszelescik.moreplates.ModChecker.*;
import static panszelescik.moreplates.config.Config.*;

public class PluginLoader {
	
	public static void preInit() {
		if (Minecraft)
			PluginMinecraft.preInit();
		if (isActuallyAdditionsLoaded & ActuallyAdditions)
			PluginActuallyAdditions.preInit();
		if (isAppliedEnergisticsLoaded & AppliedEnergistics2)
			PluginAppliedEnergistics2.preInit();
		if (isAvaritiaLoaded & Avaritia)
			PluginAvaritia.preInit();
		if (isBotaniaLoaded & Botania)
			PluginBotania.preInit();
		if (isCalculatorLoaded & Calculator)
			PluginCalculator.preInit();
		if (isDraconicEvolutionLoaded & DraconicEvolution)
			PluginDraconicEvolution.preInit();
		if (isEnderIOLoaded & EnderIO)
			PluginEnderIO.preInit();
		if (isExtraUtilitiesLoaded & ExtraUtilities)
			PluginExtraUtilities.preInit();
		if (isMekanismLoaded & Mekanism)
			PluginMekanism.preInit();
		if (isMysticalAgradditionsLoaded & MysticalAgradditions)
			PluginMysticalAgradditions.preInit();
		if (isMysticalAgricultureLoaded & MysticalAgriculture)
			PluginMysticalAgriculture.preInit();
		if (isPlusTiCLoaded & PlusTiC)
			PluginPlusTiC.preInit();
		if (isPneumaticCraftLoaded & PneumaticCraft)
			PluginPneumaticCraft.preInit();
		if (isProjectELoaded & ProjectE)
			PluginProjectE.preInit();
		if (isProjectRedLoaded & ProjectRed)
			PluginProjectRed.preInit();
		if (isRefinedStorageLoaded & RefinedStorage)
			PluginRefinedStorage.preInit();
		if (isThaumcraftLoaded & Thaumcraft)
			PluginThaumcraft.preInit();
		if (isTinkersConstructLoaded & TinkersConstruct)
			PluginTinkersConstruct.preInit();
		if (isTwilightForestLoaded & TwilightForest)
			PluginTwilightForest.preInit();
		PluginMultiMod.preInit();
	}
	
	public static void postInit() {
		if (isActuallyAdditionsLoaded & ActuallyAdditionsRecipes)
			PluginActuallyAdditions.postInit();
		if (isBotaniaLoaded & BotaniaRecipes)
			PluginBotania.postInit();
		if (isImmersiveEngineeringLoaded & ImmersiveEngineeringRecipes)
			PluginImmersiveEngineering.postInit();
		if (isIndustrialCraft2Loaded & IndustrialCraft2Recipes)
			PluginIndustrialCraft2.postInit();
		if (isTechRebornLoaded & TechRebornRecipes)
			PluginTechReborn.postInit();
		if (isThermalExpansionLoaded & ThermalExpansionRecipes)
			PluginThermalExpansion.postInit();
	}
}