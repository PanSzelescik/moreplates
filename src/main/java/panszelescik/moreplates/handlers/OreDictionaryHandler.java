package panszelescik.moreplates.handlers;

import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.ModChecker;
import panszelescik.moreplates.init.ModItems;

public class OreDictionaryHandler {

	public static void registerOreDictionary() {
		
		if(ModChecker.isAppliedEnergisticsLoaded) {
			OreDictionary.registerOre("gearCertusQuartz", ModItems.certusQuartzGear);
			OreDictionary.registerOre("plateCertusQuartz", ModItems.certusQuartzPlate);
			OreDictionary.registerOre("gearFluix", ModItems.fluixGear);
			OreDictionary.registerOre("plateFluix", ModItems.fluixPlate);
		}
		if(ModChecker.isBotaniaLoaded) {
			OreDictionary.registerOre("gearElvenElementium", ModItems.elementiumGear);
			OreDictionary.registerOre("plateElvenElementium", ModItems.elementiumPlate);
			OreDictionary.registerOre("gaiaGear", ModItems.gaiaSpiritGear);
			OreDictionary.registerOre("gaiaPlate", ModItems.gaiaSpiritPlate);
			OreDictionary.registerOre("gearManasteel", ModItems.manasteelGear);
			OreDictionary.registerOre("plateManasteel", ModItems.manasteelPlate);
			OreDictionary.registerOre("gearTerrasteel", ModItems.terrasteelGear);
			OreDictionary.registerOre("plateTerrasteel", ModItems.terrasteelPlate);
		}
		if(ModChecker.isDraconicEvolutionLoaded) {
			OreDictionary.registerOre("gearDraconiumAwakened", ModItems.awakenedDraconiumGear);
			OreDictionary.registerOre("plateDraconiumAwakened", ModItems.awakenedDraconiumPlate);
			OreDictionary.registerOre("gearDraconium", ModItems.draconiumGear);
			OreDictionary.registerOre("plateDraconium", ModItems.draconiumPlate);
		}
		if(ModChecker.isEnderIOLoaded) {
			OreDictionary.registerOre("gearConductiveIron", ModItems.conductiveIronGear);
			OreDictionary.registerOre("plateConductiveIron", ModItems.conductiveIronPlate);
			OreDictionary.registerOre("gearDarkSteel", ModItems.darkSteelGear);
			OreDictionary.registerOre("plateDarkSteel", ModItems.darkSteelPlate);
			OreDictionary.registerOre("gearElectricalSteel", ModItems.electricalSteelGear);
			OreDictionary.registerOre("plateElectricalSteel", ModItems.electricalSteelPlate);
			OreDictionary.registerOre("gearEnergeticAlloy", ModItems.energeticAlloyGear);
			OreDictionary.registerOre("plateEnergeticAlloy", ModItems.energeticAlloyPlate);
			OreDictionary.registerOre("gearPulsatingIron", ModItems.pulsatingIronGear);
			OreDictionary.registerOre("platePulsatingIron", ModItems.pulsatingIronPlate);
			OreDictionary.registerOre("gearRedstoneAlloy", ModItems.redstoneAlloyGear);
			OreDictionary.registerOre("plateRedstoneAlloy", ModItems.redstoneAlloyPlate);
			OreDictionary.registerOre("gearSoularium", ModItems.soulariumGear);
			OreDictionary.registerOre("plateSoularium", ModItems.soulariumPlate);
			OreDictionary.registerOre("gearVibrantAlloy", ModItems.vibrantAlloyGear);
			OreDictionary.registerOre("plateVibrantAlloy", ModItems.vibrantAlloyPlate);
		}
		if(ModChecker.isExtraUtilitiesLoaded) {
			OreDictionary.registerOre("gearDemon", ModItems.demonGear);
			OreDictionary.registerOre("plateDemon", ModItems.demonPlate);
			OreDictionary.registerOre("gearEnchanted", ModItems.enchantedGear);
			OreDictionary.registerOre("plateEnchanted", ModItems.enchantedPlate);
			OreDictionary.registerOre("gearEvilInfusedIron", ModItems.evilInfusedIronGear);
			OreDictionary.registerOre("plateEvilInfusedIron", ModItems.evilInfusedIronPlate);
		}
		if(ModChecker.isMekanismLoaded) {
			OreDictionary.registerOre("gearRefinedGlowstone", ModItems.glowstoneGear);
			OreDictionary.registerOre("plateRefinedGlowstone", ModItems.glowstonePlate);
			OreDictionary.registerOre("gearOsmium", ModItems.osmiumGear);
			OreDictionary.registerOre("plateOsmium", ModItems.osmiumPlate);
			OreDictionary.registerOre("gearRefinedObsidian", ModItems.refinedObsidianGear);
			OreDictionary.registerOre("plateRefinedObsidian", ModItems.refinedObsidianPlate);
		}
		if(ModChecker.isMysticalAgradditionsLoaded) {
			OreDictionary.registerOre("gearInsanium", ModItems.insaniumGear);
			OreDictionary.registerOre("plateInsanium", ModItems.insaniumPlate);
		}
		if(ModChecker.isMysticalAgricultureLoaded) {
			OreDictionary.registerOre("gearInferium", ModItems.inferiumGear);
			OreDictionary.registerOre("plateInferium", ModItems.inferiumPlate);
			OreDictionary.registerOre("gearIntermedium", ModItems.intermediumGear);
			OreDictionary.registerOre("plateIntermedium", ModItems.intermediumPlate);
			OreDictionary.registerOre("gearPrudentium", ModItems.prudentiumGear);
			OreDictionary.registerOre("platePrudentium", ModItems.prudentiumPlate);
			OreDictionary.registerOre("gearSoulium", ModItems.souliumGear);
			OreDictionary.registerOre("plateSoulium", ModItems.souliumPlate);
			OreDictionary.registerOre("gearSuperium", ModItems.superiumGear);
			OreDictionary.registerOre("plateSuperium", ModItems.superiumPlate);
			OreDictionary.registerOre("gearSupremium", ModItems.supremiumGear);
			OreDictionary.registerOre("plateSupremium", ModItems.supremiumPlate);
		}
		if(ModChecker.isProjectRedLoaded) {
			OreDictionary.registerOre("gearElectrotineAlloy", ModItems.electrotineAlloyGear);
			OreDictionary.registerOre("plateElectrotineAlloy", ModItems.electrotineAlloyGear);
			OreDictionary.registerOre("gearRedAlloy", ModItems.redAlloyGear);
			OreDictionary.registerOre("plateRedAlloy", ModItems.redAlloyPlate);
		}
		if(ModChecker.isRefinedStorageLoaded) {
			OreDictionary.registerOre("gearQuartzEnrichedIron", ModItems.quartzEnrichedIronGear);
			OreDictionary.registerOre("plateQuartzEnrichedIron", ModItems.quartzEnrichedIronPlate);
		}
		if(ModChecker.isTinkersConstructLoaded) {
			OreDictionary.registerOre("gearArdite", ModItems.arditeGear);
			OreDictionary.registerOre("plateArdite", ModItems.arditePlate);
			OreDictionary.registerOre("gearCobalt", ModItems.cobaltGear);
			OreDictionary.registerOre("plateCobalt", ModItems.cobaltPlate);
			OreDictionary.registerOre("gearKnightslime", ModItems.knightslimeGear);
			OreDictionary.registerOre("plateKnightslime", ModItems.knightslimePlate);
			OreDictionary.registerOre("gearManyullyn", ModItems.manyullynGear);
			OreDictionary.registerOre("plateManyullyn", ModItems.manyullynPlate);
			OreDictionary.registerOre("gearPigiron", ModItems.pigIronGear);
			OreDictionary.registerOre("platePigiron", ModItems.pigIronPlate);
		}
		
	}
	
}
