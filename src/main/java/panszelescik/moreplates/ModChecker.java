package panszelescik.moreplates;

import net.minecraftforge.fml.common.Loader;

public class ModChecker {

	public static boolean isAppliedEnergisticsLoaded;
	public static boolean isBotaniaLoaded;
	public static boolean isDraconicEvolutionLoaded;
	public static boolean isEnderIOLoaded;
	public static boolean isMekanismLoaded;
	public static boolean isMysticalAgradditionsLoaded;
	public static boolean isMysticalAgricultureLoaded;
	public static boolean isProjectRedLoaded;
	public static boolean isRefinedStorageLoaded;
	public static boolean isTinkersConstructLoaded;
	
	public ModChecker() {
		this.isAppliedEnergisticsLoaded = Loader.isModLoaded("appliedenergistics2");
		this.isBotaniaLoaded = Loader.isModLoaded("botania");
		this.isDraconicEvolutionLoaded = Loader.isModLoaded("draconicevolution");
		this.isEnderIOLoaded = Loader.isModLoaded("enderio");
		this.isMekanismLoaded = Loader.isModLoaded("mekanism");
		this.isMysticalAgradditionsLoaded = Loader.isModLoaded("mysticalagradditions");
		this.isMysticalAgricultureLoaded = Loader.isModLoaded("mysticalagriculture");
		this.isProjectRedLoaded = Loader.isModLoaded("projectred-core");
		this.isRefinedStorageLoaded = Loader.isModLoaded("refinedstorage");
		this.isTinkersConstructLoaded = Loader.isModLoaded("tconstruct");
	}
	
	public static void printSuccessMessage() {
		if(isAppliedEnergisticsLoaded) {
			MorePlates.logger.info("Applied Energistics 2 or Applied Llamagistics has been detected.");
		}
		if(isBotaniaLoaded) {
			MorePlates.logger.info("Botania has been detected.");
		}
		if(isDraconicEvolutionLoaded) {
			MorePlates.logger.info("Draconic Evolution has been detected.");
		}
		if(isEnderIOLoaded) {
			MorePlates.logger.info("Ender IO has been detected.");
		}
		if(isMekanismLoaded) {
			MorePlates.logger.info("Mekanism has been detected.");
		}
		if(isMysticalAgradditionsLoaded) {
			MorePlates.logger.info("Mystical Agradditions has been detected.");
		}
		if(isMysticalAgricultureLoaded) {
			MorePlates.logger.info("Mystical Agriculture has been detected.");
		}
		if(isProjectRedLoaded) {
			MorePlates.logger.info("Project Red has been detected.");
		}
		if(isRefinedStorageLoaded) {
			MorePlates.logger.info("Refined Storage has been detected.");
		}
		if(isTinkersConstructLoaded) {
			MorePlates.logger.info("Tinkers' Construct has been detected.");
		}
	}
}
