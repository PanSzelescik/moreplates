package panszelescik.moreplates;

import net.minecraftforge.fml.common.Loader;

import static panszelescik.moreplates.helpers.Strings.*;

public class ModChecker {
	
	public static boolean isAppliedEnergisticsLoaded;
	public static boolean isBotaniaLoaded;
	public static boolean isCalculatorLoaded;
	public static boolean isCoFHCoreLoaded;
	public static boolean isDraconicEvolutionLoaded;
	public static boolean isEnderIOLoaded;
	public static boolean isExtraUtilitiesLoaded;
	public static boolean isImmersiveEngineeringLoaded;
	public static boolean isMekanismLoaded;
	public static boolean isMysticalAgradditionsLoaded;
	public static boolean isMysticalAgricultureLoaded;
	public static boolean isProjectELoaded;
	public static boolean isProjectRedLoaded;
	public static boolean isRefinedStorageLoaded;
	public static boolean isThermalExpansionLoaded;
	public static boolean isTinkersConstructLoaded;
	
	private static String INFO = " has been detected.";
	
	public ModChecker() {
		isAppliedEnergisticsLoaded = Loader.isModLoaded(AE2_MODID);
		isBotaniaLoaded = Loader.isModLoaded(BOTANIA_MODID);
		isCalculatorLoaded = Loader.isModLoaded(CALCULATOR_MODID);
		isCoFHCoreLoaded =  Loader.isModLoaded(COFH_CORE_MODID);
		isDraconicEvolutionLoaded = Loader.isModLoaded(DRACONIC_MODID);
		isEnderIOLoaded = Loader.isModLoaded(ENDER_IO_MODID);
		isExtraUtilitiesLoaded = Loader.isModLoaded(EXTRA_UTILITIES_MODID);
		isImmersiveEngineeringLoaded = Loader.isModLoaded(IMMERSIVE_MODID);
		isMekanismLoaded = Loader.isModLoaded(MEKANISM_MODID);
		isMysticalAgradditionsLoaded = Loader.isModLoaded(M_AGRADDITIONS_MODID);
		isMysticalAgricultureLoaded = Loader.isModLoaded(M_AGRICULTURE_MODID);
		isProjectELoaded = Loader.isModLoaded(PROJECTE_MODID);
		isProjectRedLoaded = Loader.isModLoaded(PROJECT_RED_MODID);
		isRefinedStorageLoaded = Loader.isModLoaded(REFINED_STORAGE_MODID);
		isThermalExpansionLoaded = Loader.isModLoaded(THERMAL_MODID);
		isTinkersConstructLoaded = Loader.isModLoaded(TINKERS_MODID);
	}
	
	public static void printSuccessMessage() {
		if (isAppliedEnergisticsLoaded)
			MorePlates.logger.info(AE2_MODNAME + INFO);
		if (isBotaniaLoaded)
			MorePlates.logger.info(BOTANIA_MODNAME + INFO);
		if (isCalculatorLoaded)
			MorePlates.logger.info(CALCULATOR_MODNAME + INFO);
		if (isCoFHCoreLoaded)
			MorePlates.logger.info(COFH_CORE_MODNAME + INFO);
		if (isDraconicEvolutionLoaded)
			MorePlates.logger.info(DRACONIC_MODNAME + INFO);
		if (isEnderIOLoaded)
			MorePlates.logger.info(ENDER_IO_MODNAME + INFO);
		if (isExtraUtilitiesLoaded)
			MorePlates.logger.info(EXTRA_UTILITIES_MODNAME + INFO);
		if (isImmersiveEngineeringLoaded)
			MorePlates.logger.info(IMMERSIVE_MODNAME + INFO);
		if (isMekanismLoaded)
			MorePlates.logger.info(MEKANISM_MODNAME + INFO);
		if (isMysticalAgradditionsLoaded)
			MorePlates.logger.info(M_AGRADDITIONS_MODNAME + INFO);
		if (isMysticalAgricultureLoaded)
			MorePlates.logger.info(M_AGRICULTURE_MODNAME + INFO);
		if (isProjectELoaded)
			MorePlates.logger.info(PROJECTE_MODNAME + INFO);
		if (isProjectRedLoaded)
			MorePlates.logger.info(PROJECT_RED_MODNAME + INFO);
		if (isRefinedStorageLoaded)
			MorePlates.logger.info(REFINED_STORAGE_MODNAME + INFO);
		if (isThermalExpansionLoaded)
			MorePlates.logger.info(THERMAL_MODNAME + INFO);
		if (isTinkersConstructLoaded)
			MorePlates.logger.info(TINKERS_MODNAME + INFO);
	}
}