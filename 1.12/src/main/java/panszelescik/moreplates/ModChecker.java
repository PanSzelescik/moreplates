package panszelescik.moreplates;

import net.minecraftforge.fml.common.Loader;

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
		isAppliedEnergisticsLoaded = Loader.isModLoaded("appliedenergistics2");
		isBotaniaLoaded = Loader.isModLoaded("botania");
		isCalculatorLoaded = Loader.isModLoaded("calculator");
		isCoFHCoreLoaded =  Loader.isModLoaded("cofhcore");
		isDraconicEvolutionLoaded = Loader.isModLoaded("draconicevolution");
		isEnderIOLoaded = Loader.isModLoaded("enderio");
		isExtraUtilitiesLoaded = Loader.isModLoaded("extrautils2");
		isImmersiveEngineeringLoaded = Loader.isModLoaded("immersiveengineering");
		isMekanismLoaded = Loader.isModLoaded("mekanism");
		isMysticalAgradditionsLoaded = Loader.isModLoaded("mysticalagradditions");
		isMysticalAgricultureLoaded = Loader.isModLoaded("mysticalagriculture");
		isProjectELoaded = Loader.isModLoaded("projecte");
		isProjectRedLoaded = Loader.isModLoaded("projectred-core");
		isRefinedStorageLoaded = Loader.isModLoaded("refinedstorage");
		isThermalExpansionLoaded = Loader.isModLoaded("thermalexpansion");
		isTinkersConstructLoaded = Loader.isModLoaded("tconstruct");
	}
	
	public static void printSuccessMessage() {
		if (isAppliedEnergisticsLoaded)
			MorePlates.logger.info("Applied Energistics 2" + INFO);
		if (isBotaniaLoaded)
			MorePlates.logger.info("Botania" + INFO);
		if (isCalculatorLoaded)
			MorePlates.logger.info("Calculator" + INFO);
		if (isCoFHCoreLoaded)
			MorePlates.logger.info("CoFH Core" + INFO);
		if (isDraconicEvolutionLoaded)
			MorePlates.logger.info("Draconic Evolution" + INFO);
		if (isEnderIOLoaded)
			MorePlates.logger.info("Ender IO" + INFO);
		if (isExtraUtilitiesLoaded)
			MorePlates.logger.info("Extra Utilities 2" + INFO);
		if (isImmersiveEngineeringLoaded)
			MorePlates.logger.info("Immersive Engineering" + INFO);
		if (isMekanismLoaded)
			MorePlates.logger.info("Mekanism" + INFO);
		if (isMysticalAgradditionsLoaded)
			MorePlates.logger.info("Mystical Agradditions" + INFO);
		if (isMysticalAgricultureLoaded)
			MorePlates.logger.info("Mystical Agriculture" + INFO);
		if (isProjectELoaded)
			MorePlates.logger.info("ProjectE" + INFO);
		if (isProjectRedLoaded)
			MorePlates.logger.info("Project Red" + INFO);
		if (isRefinedStorageLoaded)
			MorePlates.logger.info("Refined Storage" + INFO);
		if (isThermalExpansionLoaded)
			MorePlates.logger.info("Thermal Expansion" + INFO);
		if (isTinkersConstructLoaded)
			MorePlates.logger.info("Tinkers' Construct" + INFO);
	}
}