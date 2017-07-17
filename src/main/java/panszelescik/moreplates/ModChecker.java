package panszelescik.moreplates;

import net.minecraftforge.fml.common.Loader;

public class ModChecker {

	public static boolean isBotaniaLoaded;
	public static boolean isDraconicEvolutionLoaded;
	public static boolean isEnderIOLoaded;
	public static boolean isMekanismLoaded;
	public static boolean isRefinedStorageLoaded;
	public static boolean isTinkersConstructLoaded;
	
	public ModChecker() {
		this.isBotaniaLoaded = Loader.isModLoaded("botania");
		this.isDraconicEvolutionLoaded = Loader.isModLoaded("draconicevoulution");
		this.isEnderIOLoaded = Loader.isModLoaded("enderio");
		this.isMekanismLoaded = Loader.isModLoaded("mekanism");
		this.isRefinedStorageLoaded = Loader.isModLoaded("refinedstorage");
		this.isTinkersConstructLoaded = Loader.isModLoaded("tconstruct");
	}
	
	public static void printSuccessMessage() {
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
		if(isRefinedStorageLoaded) {
			MorePlates.logger.info("Refined Storage has been detected.");
		}
		if(isTinkersConstructLoaded) {
			MorePlates.logger.info("Tinkers' Construct has been detected.");
		}
	}
}