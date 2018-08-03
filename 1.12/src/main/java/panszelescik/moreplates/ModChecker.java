package panszelescik.moreplates;

import net.minecraftforge.fml.common.Loader;

import static panszelescik.moreplates.helpers.Strings.*;

public class ModChecker {
	
	public static boolean isActuallyAdditionsLoaded;
	public static boolean isAppliedEnergisticsLoaded;
	public static boolean isAvaritiaLoaded;
	public static boolean isBotaniaLoaded;
	public static boolean isCalculatorLoaded;
	public static boolean isDraconicEvolutionLoaded;
	public static boolean isEnderIOLoaded;
	public static boolean isEnderIOEndergyLoaded;
	public static boolean isExtraUtilitiesLoaded;
	public static boolean isImmersiveEngineeringLoaded;
	public static boolean isIndustrialCraft2Loaded;
	public static boolean isMekanismLoaded;
	public static boolean isMysticalAgradditionsLoaded;
	public static boolean isMysticalAgricultureLoaded;
	public static boolean isPlusTiCLoaded;
	public static boolean isPneumaticCraftLoaded;
	public static boolean isProjectELoaded;
	public static boolean isProjectRedLoaded;
	public static boolean isRefinedStorageLoaded;
	public static boolean isTechRebornLoaded;
	public static boolean isThaumcraftLoaded;
	public static boolean isThermalExpansionLoaded;
	public static boolean isTinkersConstructLoaded;
	public static boolean isTwilightForestLoaded;
	
	private static String INFO = " has been detected.";
	
	public ModChecker() {
		isActuallyAdditionsLoaded = Loader.isModLoaded(ACTUALLY_MODID);
		isAppliedEnergisticsLoaded = Loader.isModLoaded(AE2_MODID);
		isAvaritiaLoaded = Loader.isModLoaded(AVARITIA_MODID);
		isBotaniaLoaded = Loader.isModLoaded(BOTANIA_MODID);
		isCalculatorLoaded = Loader.isModLoaded(CALCULATOR_MODID);
		isDraconicEvolutionLoaded = Loader.isModLoaded(DRACONIC_MODID);
		isEnderIOLoaded = Loader.isModLoaded(ENDER_IO_MODID);
		isEnderIOEndergyLoaded = Loader.isModLoaded(ENDER_IO_ENDERGY_MODID);
		isExtraUtilitiesLoaded = Loader.isModLoaded(EXTRA_UTILITIES_MODID);
		isImmersiveEngineeringLoaded = Loader.isModLoaded(IMMERSIVE_MODID);
		isIndustrialCraft2Loaded = Loader.isModLoaded(IC2_MODID);
		isMekanismLoaded = Loader.isModLoaded(MEKANISM_MODID);
		isMysticalAgradditionsLoaded = Loader.isModLoaded(M_AGRADDITIONS_MODID);
		isMysticalAgricultureLoaded = Loader.isModLoaded(M_AGRICULTURE_MODID);
		isPlusTiCLoaded = Loader.isModLoaded(PLUSTIC_MODID);
		isPneumaticCraftLoaded = Loader.isModLoaded(PNEUMATIC_MODID);
		isProjectELoaded = Loader.isModLoaded(PROJECTE_MODID);
		isProjectRedLoaded = Loader.isModLoaded(PROJECT_RED_MODID);
		isRefinedStorageLoaded = Loader.isModLoaded(REFINED_STORAGE_MODID);
		isTechRebornLoaded = Loader.isModLoaded(TECHREBORN_MODID);
		isThaumcraftLoaded = Loader.isModLoaded(THAUMCRAFT_MODID);
		isThermalExpansionLoaded = Loader.isModLoaded(THERMAL_MODID);
		isTinkersConstructLoaded = Loader.isModLoaded(TINKERS_MODID);
		isTwilightForestLoaded = Loader.isModLoaded(TWILIGHT_MODID);
	}
	
	public static void printSuccessMessage() {
		if (isActuallyAdditionsLoaded)
			MorePlates.logger.info(ACTUALLY_MODNAME + INFO);
		if (isAppliedEnergisticsLoaded)
			MorePlates.logger.info(AE2_MODNAME + INFO);
		if (isAvaritiaLoaded)
			MorePlates.logger.info(AVARITIA_MODNAME + INFO);
		if (isBotaniaLoaded)
			MorePlates.logger.info(BOTANIA_MODNAME + INFO);
		if (isCalculatorLoaded)
			MorePlates.logger.info(CALCULATOR_MODNAME + INFO);
		if (isDraconicEvolutionLoaded)
			MorePlates.logger.info(DRACONIC_MODNAME + INFO);
		if (isEnderIOLoaded)
			MorePlates.logger.info(ENDER_IO_MODNAME + INFO);
		if (isEnderIOEndergyLoaded)
			MorePlates.logger.info(ENDER_IO_ENDERGY_MODNAME + INFO);
		if (isExtraUtilitiesLoaded)
			MorePlates.logger.info(EXTRA_UTILITIES_MODNAME + INFO);
		if (isImmersiveEngineeringLoaded)
			MorePlates.logger.info(IMMERSIVE_MODNAME + INFO);
		if (isIndustrialCraft2Loaded)
			MorePlates.logger.info(IC2_MODNAME + INFO);
		if (isMekanismLoaded)
			MorePlates.logger.info(MEKANISM_MODNAME + INFO);
		if (isMysticalAgradditionsLoaded)
			MorePlates.logger.info(M_AGRADDITIONS_MODNAME + INFO);
		if (isMysticalAgricultureLoaded)
			MorePlates.logger.info(M_AGRICULTURE_MODNAME + INFO);
		if (isPlusTiCLoaded)
			MorePlates.logger.info(PLUSTIC_MODNAME + INFO);
		if (isPneumaticCraftLoaded)
			MorePlates.logger.info(PNEUMATIC_MODNAME + INFO);
		if (isProjectELoaded)
			MorePlates.logger.info(PROJECTE_MODNAME + INFO);
		if (isProjectRedLoaded)
			MorePlates.logger.info(PROJECT_RED_MODNAME + INFO);
		if (isRefinedStorageLoaded)
			MorePlates.logger.info(REFINED_STORAGE_MODNAME + INFO);
		if (isTechRebornLoaded)
			MorePlates.logger.info(TECHREBORN_MODNAME + INFO);
		if (isThaumcraftLoaded)
			MorePlates.logger.info(THAUMCRAFT_MODNAME + INFO);
		if (isThermalExpansionLoaded)
			MorePlates.logger.info(THERMAL_MODNAME + INFO);
		if (isTinkersConstructLoaded)
			MorePlates.logger.info(TINKERS_MODNAME + INFO);
		if (isTwilightForestLoaded)
			MorePlates.logger.info(TWILIGHT_MODNAME + INFO);
	}
}