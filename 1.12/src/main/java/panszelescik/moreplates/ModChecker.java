package panszelescik.moreplates;

import net.minecraftforge.fml.common.Loader;

public class ModChecker {
	
	public static boolean isAppliedEnergisticsLoaded;
	public static boolean isBotaniaLoaded;
	public static boolean isCalculatorLoaded;
	public static boolean isDraconicEvolutionLoaded;
	public static boolean isEnderIOLoaded;
	public static boolean isExtraUtilitiesLoaded;
	public static boolean isMekanismLoaded;
	public static boolean isMysticalAgradditionsLoaded;
	public static boolean isMysticalAgricultureLoaded;
	public static boolean isProjectELoaded;
	public static boolean isProjectRedLoaded;
	public static boolean isRefinedStorageLoaded;
	public static boolean isTinkersConstructLoaded;
	
	public ModChecker() {
		isAppliedEnergisticsLoaded =	Loader.isModLoaded("appliedenergistics2");
		isBotaniaLoaded =				Loader.isModLoaded("botania");
		isCalculatorLoaded =			Loader.isModLoaded("calculator");
		isDraconicEvolutionLoaded =		Loader.isModLoaded("draconicevolution");
		isEnderIOLoaded =				Loader.isModLoaded("enderio");
		isExtraUtilitiesLoaded =		Loader.isModLoaded("extrautils2");
		isMekanismLoaded =				Loader.isModLoaded("mekanism");
		isMysticalAgradditionsLoaded =	Loader.isModLoaded("mysticalagradditions");
		isMysticalAgricultureLoaded =	Loader.isModLoaded("mysticalagriculture");
		isProjectELoaded = 				Loader.isModLoaded("projecte");
		isProjectRedLoaded =			Loader.isModLoaded("projectred-core");
		isRefinedStorageLoaded =		Loader.isModLoaded("refinedstorage");
		isTinkersConstructLoaded =		Loader.isModLoaded("tconstruct");
	}
	
	public static void printSuccessMessage() {
		if (isAppliedEnergisticsLoaded)
			MorePlates.logger.info("Applied Energistics 2 has been detected.");
		if (isBotaniaLoaded)
			MorePlates.logger.info("Botania has been detected.");
		if (isCalculatorLoaded)
			MorePlates.logger.info("Calculator has been detected.");
		if (isDraconicEvolutionLoaded)
			MorePlates.logger.info("Draconic Evolution has been detected.");
		if (isEnderIOLoaded)
			MorePlates.logger.info("Ender IO has been detected.");
		if (isExtraUtilitiesLoaded)
			MorePlates.logger.info("Extra Utilities 2 has been detected.");
		if (isMekanismLoaded)
			MorePlates.logger.info("Mekanism has been detected.");
		if (isMysticalAgradditionsLoaded)
			MorePlates.logger.info("Mystical Agradditions has been detected.");
		if (isMysticalAgricultureLoaded)
			MorePlates.logger.info("Mystical Agriculture has been detected.");
		if (isProjectELoaded)
			MorePlates.logger.info("ProjectE has been detected.");
		if (isProjectRedLoaded)
			MorePlates.logger.info("Project Red has been detected.");
		if (isRefinedStorageLoaded)
			MorePlates.logger.info("Refined Storage has been detected.");
		if (isTinkersConstructLoaded)
			MorePlates.logger.info("Tinkers' Construct has been detected.");
	}
}