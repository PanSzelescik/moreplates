package panszelescik.moreplates.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import panszelescik.moreplates.ModChecker;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.Reference;
import panszelescik.moreplates.items.ItemArditeGear;
import panszelescik.moreplates.items.ItemArditePlate;
import panszelescik.moreplates.items.ItemAwakenedDraconiumGear;
import panszelescik.moreplates.items.ItemAwakenedDraconiumPlate;
import panszelescik.moreplates.items.ItemCertusQuartzGear;
import panszelescik.moreplates.items.ItemCertusQuartzPlate;
import panszelescik.moreplates.items.ItemCobaltGear;
import panszelescik.moreplates.items.ItemCobaltPlate;
import panszelescik.moreplates.items.ItemConductiveIronGear;
import panszelescik.moreplates.items.ItemConductiveIronPlate;
import panszelescik.moreplates.items.ItemDarkSteelGear;
import panszelescik.moreplates.items.ItemDarkSteelPlate;
import panszelescik.moreplates.items.ItemDemonGear;
import panszelescik.moreplates.items.ItemDemonPlate;
import panszelescik.moreplates.items.ItemDraconiumGear;
import panszelescik.moreplates.items.ItemDraconiumPlate;
import panszelescik.moreplates.items.ItemElectricalSteelGear;
import panszelescik.moreplates.items.ItemElectricalSteelPlate;
import panszelescik.moreplates.items.ItemElectrotineAlloyGear;
import panszelescik.moreplates.items.ItemElectrotineAlloyPlate;
import panszelescik.moreplates.items.ItemElementiumGear;
import panszelescik.moreplates.items.ItemElementiumPlate;
import panszelescik.moreplates.items.ItemEnchantedGear;
import panszelescik.moreplates.items.ItemEnchantedPlate;
import panszelescik.moreplates.items.ItemEnergeticAlloyGear;
import panszelescik.moreplates.items.ItemEnergeticAlloyPlate;
import panszelescik.moreplates.items.ItemEvilInfusedIronGear;
import panszelescik.moreplates.items.ItemEvilInfusedIronPlate;
import panszelescik.moreplates.items.ItemFluixGear;
import panszelescik.moreplates.items.ItemFluixPlate;
import panszelescik.moreplates.items.ItemGaiaSpiritGear;
import panszelescik.moreplates.items.ItemGaiaSpiritPlate;
import panszelescik.moreplates.items.ItemGlowstoneGear;
import panszelescik.moreplates.items.ItemGlowstonePlate;
import panszelescik.moreplates.items.ItemHammer;
import panszelescik.moreplates.items.ItemInferiumGear;
import panszelescik.moreplates.items.ItemInferiumPlate;
import panszelescik.moreplates.items.ItemInsaniumGear;
import panszelescik.moreplates.items.ItemInsaniumPlate;
import panszelescik.moreplates.items.ItemIntermediumGear;
import panszelescik.moreplates.items.ItemIntermediumPlate;
import panszelescik.moreplates.items.ItemKnightslimeGear;
import panszelescik.moreplates.items.ItemKnightslimePlate;
import panszelescik.moreplates.items.ItemManasteelGear;
import panszelescik.moreplates.items.ItemManasteelPlate;
import panszelescik.moreplates.items.ItemManyullynGear;
import panszelescik.moreplates.items.ItemManyullynPlate;
import panszelescik.moreplates.items.ItemOsmiumGear;
import panszelescik.moreplates.items.ItemOsmiumPlate;
import panszelescik.moreplates.items.ItemPigIronGear;
import panszelescik.moreplates.items.ItemPigIronPlate;
import panszelescik.moreplates.items.ItemPrudentiumGear;
import panszelescik.moreplates.items.ItemPrudentiumPlate;
import panszelescik.moreplates.items.ItemPulsatingIronGear;
import panszelescik.moreplates.items.ItemPulsatingIronPlate;
import panszelescik.moreplates.items.ItemQuartzEnrichedIronGear;
import panszelescik.moreplates.items.ItemQuartzEnrichedIronPlate;
import panszelescik.moreplates.items.ItemRedAlloyGear;
import panszelescik.moreplates.items.ItemRedAlloyPlate;
import panszelescik.moreplates.items.ItemRedstoneAlloyGear;
import panszelescik.moreplates.items.ItemRedstoneAlloyPlate;
import panszelescik.moreplates.items.ItemRefinedObsidianGear;
import panszelescik.moreplates.items.ItemRefinedObsidianPlate;
import panszelescik.moreplates.items.ItemSoulariumGear;
import panszelescik.moreplates.items.ItemSoulariumPlate;
import panszelescik.moreplates.items.ItemSouliumGear;
import panszelescik.moreplates.items.ItemSouliumPlate;
import panszelescik.moreplates.items.ItemSuperiumGear;
import panszelescik.moreplates.items.ItemSuperiumPlate;
import panszelescik.moreplates.items.ItemSupremiumGear;
import panszelescik.moreplates.items.ItemSupremiumPlate;
import panszelescik.moreplates.items.ItemTerrasteelGear;
import panszelescik.moreplates.items.ItemTerrasteelPlate;
import panszelescik.moreplates.items.ItemVibrantAlloyGear;
import panszelescik.moreplates.items.ItemVibrantAlloyPlate;
import panszelescik.moreplates.util.Utils;

public class ModItems {

	public static Item hammer;
	
	//Applied Energistics 2 and Applied Llamagistics
	
	public static Item certusQuartzGear;
	public static Item certusQuartzPlate;
	public static Item fluixGear;
	public static Item fluixPlate;
	
	//Botania
	
	public static Item elementiumGear;
	public static Item elementiumPlate;
	public static Item gaiaSpiritGear;
	public static Item gaiaSpiritPlate;
	public static Item manasteelGear;
	public static Item manasteelPlate;
	public static Item terrasteelGear;
	public static Item terrasteelPlate;
	
	//Draconic Evolution
	
	public static Item awakenedDraconiumGear;
	public static Item awakenedDraconiumPlate;
	public static Item draconiumGear;
	public static Item draconiumPlate;
	
	//Ender IO
	
	public static Item conductiveIronGear;
	public static Item conductiveIronPlate;
	public static Item darkSteelGear;
	public static Item darkSteelPlate;
	public static Item electricalSteelGear;
	public static Item electricalSteelPlate;
	public static Item energeticAlloyGear;
	public static Item energeticAlloyPlate;
	public static Item pulsatingIronGear;
	public static Item pulsatingIronPlate;
	public static Item redstoneAlloyGear;
	public static Item redstoneAlloyPlate;
	public static Item soulariumGear;
	public static Item soulariumPlate;
	public static Item vibrantAlloyGear;
	public static Item vibrantAlloyPlate;
	
	//Extra Utilities
	
	public static Item demonGear;
	public static Item demonPlate;
	public static Item enchantedGear;
	public static Item enchantedPlate;
	public static Item evilInfusedIronGear;
	public static Item evilInfusedIronPlate;
	
	//Mekanism
	
	public static Item glowstoneGear;
	public static Item glowstonePlate;
	public static Item osmiumGear;
	public static Item osmiumPlate;
	public static Item refinedObsidianGear;
	public static Item refinedObsidianPlate;
	
	//Mystical Agradditions
	
	public static Item insaniumGear;
	public static Item insaniumPlate;
	
	//Mystical Agriculture
	
	public static Item inferiumGear;
	public static Item inferiumPlate;
	public static Item intermediumGear;
	public static Item intermediumPlate;
	public static Item prudentiumGear;
	public static Item prudentiumPlate;
	public static Item souliumGear;
	public static Item souliumPlate;
	public static Item superiumGear;
	public static Item superiumPlate;
	public static Item supremiumGear;
	public static Item supremiumPlate;
	
	//Project Red
	
	public static Item electrotineAlloyGear;
	public static Item electrotineAlloyPlate;
	public static Item redAlloyGear;
	public static Item redAlloyPlate;
	
	//Refined Storage
	
	public static Item quartzEnrichedIronGear;
	public static Item quartzEnrichedIronPlate;
	
	//Tinkers' Construct
	
	public static Item arditeGear;
	public static Item arditePlate;
	public static Item cobaltGear;
	public static Item cobaltPlate;
	public static Item knightslimeGear;
	public static Item knightslimePlate;
	public static Item manyullynGear;
	public static Item manyullynPlate;
	public static Item pigIronGear;
	public static Item pigIronPlate;
	
	public static void init() {
		hammer = new ItemHammer("hammer", "hammer");
		if(ModChecker.isAppliedEnergisticsLoaded) {
			certusQuartzGear = new ItemCertusQuartzPlate("certus_quartz_gear", "certus_quartz_gear");
			certusQuartzPlate = new ItemCertusQuartzGear("certus_quartz_plate", "certus_quartz_plate");
			fluixGear = new ItemFluixGear("fluix_gear", "fluix_gear");
			fluixPlate = new ItemFluixPlate("fluix_plate", "fluix_plate");
		}
		if(ModChecker.isBotaniaLoaded) {
			elementiumGear = new ItemElementiumGear("elementium_gear", "elementium_gear");
			elementiumPlate = new ItemElementiumPlate("elementium_plate", "elementium_plate");
			gaiaSpiritGear = new ItemGaiaSpiritGear("gaia_spirit_gear", "gaia_spirit_gear");
			gaiaSpiritPlate = new ItemGaiaSpiritPlate("gaia_spirit_plate", "gaia_spirit_plate");
			manasteelGear = new ItemManasteelGear("manasteel_gear", "manasteel_gear");
			manasteelPlate = new ItemManasteelPlate("manasteel_plate", "manasteel_plate");
			terrasteelGear = new ItemTerrasteelGear("terrasteel_gear", "terrasteel_gear");
			terrasteelPlate = new ItemTerrasteelPlate("terrasteel_plate", "terrasteel_plate");
		}
		if(ModChecker.isDraconicEvolutionLoaded) {
			awakenedDraconiumGear = new ItemAwakenedDraconiumGear("awakened_draconium_gear", "awakened_draconium_gear");
			awakenedDraconiumPlate = new ItemAwakenedDraconiumPlate("awakened_draconium_plate", "awakened_draconium_plate");
			draconiumGear = new ItemDraconiumGear("draconium_gear", "draconium_gear");
			draconiumPlate = new ItemDraconiumPlate("draconium_plate", "draconium_plate");
		}
		if(ModChecker.isEnderIOLoaded) {
			conductiveIronGear = new ItemConductiveIronGear("conductive_iron_gear", "conductive_iron_gear");
			conductiveIronPlate = new ItemConductiveIronPlate("conductive_iron_plate", "conductive_iron_plate");
			darkSteelGear = new ItemDarkSteelGear("dark_steel_gear", "dark_steel_gear");
			darkSteelPlate = new ItemDarkSteelPlate("dark_steel_plate", "dark_steel_plate");
			electricalSteelGear = new ItemElectricalSteelGear("electrical_steel_gear", "electrical_steel_gear");
			electricalSteelPlate = new ItemElectricalSteelPlate("electrical_steel_plate", "electrical_steel_plate");
			energeticAlloyGear = new ItemEnergeticAlloyGear("energetic_alloy_gear", "energetic_alloy_gear");
			energeticAlloyPlate = new ItemEnergeticAlloyPlate("energetic_alloy_plate", "energetic_alloy_plate");
			pulsatingIronGear = new ItemPulsatingIronGear("pulsating_iron_gear", "pulsating_iron_gear");
			pulsatingIronPlate = new ItemPulsatingIronPlate("pulsating_iron_plate", "pulsating_iron_plate");
			redstoneAlloyGear = new ItemRedstoneAlloyGear("redstone_alloy_gear", "redstone_alloy_gear");
			redstoneAlloyPlate = new ItemRedstoneAlloyPlate("redstone_alloy_plate", "redstone_alloy_plate");
			soulariumGear = new ItemSoulariumGear("soularium_gear", "soularium_gear");
			soulariumPlate = new ItemSoulariumPlate("soularium_plate", "soularium_plate");
			vibrantAlloyGear = new ItemVibrantAlloyGear("vibrant_alloy_gear", "vibrant_alloy_gear");
			vibrantAlloyPlate = new ItemVibrantAlloyPlate("vibrant_alloy_plate", "vibrant_alloy_plate");
		}
		if(ModChecker.isExtraUtilitiesLoaded) {
			demonGear = new ItemDemonGear("demon_gear", "demon_gear");
			demonPlate = new ItemDemonPlate("demon_plate", "demon_plate");
			enchantedGear = new ItemEnchantedGear("enchanted_gear", "enchanted_gear");
			enchantedPlate = new ItemEnchantedPlate("enchanted_plate", "enchanted_plate");
			evilInfusedIronGear = new ItemEvilInfusedIronGear("evil_infused_iron_gear", "evil_infused_iron_gear");
			evilInfusedIronPlate = new ItemEvilInfusedIronPlate("evil_infused_iron_plate", "evil_infused_iron_plate");
		}
		if(ModChecker.isMekanismLoaded) {
			glowstoneGear = new ItemGlowstoneGear("glowstone_gear", "glowstone_gear");
			glowstonePlate = new ItemGlowstonePlate("glowstone_plate", "glowstone_plate");
			osmiumGear = new ItemOsmiumGear("osmium_gear", "osmium_gear");
			osmiumPlate = new ItemOsmiumPlate("osmium_plate", "osmium_plate");
			refinedObsidianGear = new ItemRefinedObsidianGear("refined_obsidian_gear", "refined_obsidian_gear");
			refinedObsidianPlate = new ItemRefinedObsidianPlate("refined_obsidian_plate", "refined_obsidian_plate");
		}
		if(ModChecker.isMysticalAgradditionsLoaded) {
			insaniumGear = new ItemInsaniumGear("insanium_gear", "insanium_gear");
			insaniumPlate = new ItemInsaniumPlate("insanium_plate", "insanium_plate");
		}
		if(ModChecker.isMysticalAgricultureLoaded) {
			inferiumGear  = new ItemInferiumGear("inferium_gear", "inferium_gear");
			inferiumPlate = new ItemInferiumPlate("inferium_plate", "inferium_plate");
			intermediumGear = new ItemIntermediumGear("intermedium_gear", "intermedium_gear");
			intermediumPlate = new ItemIntermediumPlate("intermedium_plate", "intermedium_plate");
			prudentiumGear = new ItemPrudentiumGear("prudentium_gear", "prudentium_gear");
			prudentiumPlate = new ItemPrudentiumPlate("prudentium_plate", "prudentium_plate");
			souliumGear = new ItemSouliumGear("soulium_gear", "soulium_gear");
			souliumPlate = new ItemSouliumPlate("soulium_plate", "soulium_plate");
			superiumGear = new ItemSuperiumGear("superium_gear", "superium_gear");
			superiumPlate = new ItemSuperiumPlate("superium_plate", "superium_plate");
			supremiumGear = new ItemSupremiumGear("supremium_gear", "supremium_gear");
			supremiumPlate = new ItemSupremiumPlate("supremium_plate", "supremium_plate");
		}
		if(ModChecker.isProjectRedLoaded) {
			electrotineAlloyGear = new ItemElectrotineAlloyGear("electrotine_alloy_gear", "electrotine_alloy_gear");
			electrotineAlloyPlate = new ItemElectrotineAlloyPlate("electrotine_alloy_plate", "electrotine_alloy_plate");
			redAlloyGear = new ItemRedAlloyGear("red_alloy_gear", "red_alloy_gear");
			redAlloyPlate = new ItemRedAlloyPlate("red_alloy_plate", "red_alloy_plate");
		}
		if(ModChecker.isRefinedStorageLoaded) {
			quartzEnrichedIronGear = new ItemQuartzEnrichedIronGear("quartz_enriched_iron_gear", "quartz_enriched_iron_gear");
			quartzEnrichedIronPlate = new ItemQuartzEnrichedIronPlate("quartz_enriched_iron_plate", "quartz_enriched_iron_plate");
		}
		if(ModChecker.isTinkersConstructLoaded) {
			arditeGear = new ItemArditeGear("ardite_gear", "ardite_gear");
			arditePlate = new ItemArditePlate("ardite_plate", "ardite_plate");
			cobaltGear = new ItemCobaltGear("cobalt_gear", "cobalt_gear");
			cobaltPlate = new ItemCobaltPlate("cobalt_plate", "cobalt_plate");
			knightslimeGear = new ItemKnightslimeGear("knightslime_gear", "knightslime_gear");
			knightslimePlate = new ItemKnightslimePlate("knightslime_plate", "knightslime_plate");
			manyullynGear = new ItemManyullynGear("manyullyn_gear", "manyullyn_gear");
			manyullynPlate = new ItemManyullynPlate("manyullyn_plate", "manyullyn_plate");
			pigIronGear = new ItemPigIronGear("pig_iron_gear", "pig_iron_gear");
			pigIronPlate = new ItemPigIronPlate("pig_iron_plate", "pig_iron_plate");
		}
	}
	
	public static void register() {
		registerItem(hammer);
		if(ModChecker.isAppliedEnergisticsLoaded) {
			registerItem(certusQuartzGear);
			registerItem(certusQuartzPlate);
			registerItem(fluixGear);
			registerItem(fluixPlate);
		}
		if(ModChecker.isBotaniaLoaded) {
			registerItem(elementiumGear);
			registerItem(elementiumPlate);
			registerItem(gaiaSpiritGear);
			registerItem(gaiaSpiritPlate);
			registerItem(manasteelGear);
			registerItem(manasteelPlate);
			registerItem(terrasteelGear);
			registerItem(terrasteelPlate);
		}
		if(ModChecker.isDraconicEvolutionLoaded) {
			registerItem(awakenedDraconiumGear);
			registerItem(awakenedDraconiumPlate);
			registerItem(draconiumGear);
			registerItem(draconiumPlate);
		}
		if(ModChecker.isEnderIOLoaded) {
			registerItem(conductiveIronGear);
			registerItem(conductiveIronPlate);
			registerItem(darkSteelGear);
			registerItem(darkSteelPlate);
			registerItem(electricalSteelGear);
			registerItem(electricalSteelPlate);
			registerItem(energeticAlloyGear);
			registerItem(energeticAlloyPlate);
			registerItem(pulsatingIronGear);
			registerItem(pulsatingIronPlate);
			registerItem(redstoneAlloyGear);
			registerItem(redstoneAlloyPlate);
			registerItem(soulariumGear);
			registerItem(soulariumPlate);
			registerItem(vibrantAlloyGear);
			registerItem(vibrantAlloyPlate);
		}
		if(ModChecker.isExtraUtilitiesLoaded) {
			registerItem(demonGear);
			registerItem(demonPlate);
			registerItem(enchantedGear);
			registerItem(enchantedPlate);
			registerItem(evilInfusedIronGear);
			registerItem(evilInfusedIronPlate);
		}
		if(ModChecker.isMekanismLoaded) {
			registerItem(glowstoneGear);
			registerItem(glowstonePlate);
			registerItem(osmiumGear);
			registerItem(osmiumPlate);
			registerItem(refinedObsidianGear);
			registerItem(refinedObsidianPlate);
		}
		if(ModChecker.isMysticalAgradditionsLoaded) {
			registerItem(insaniumGear);
			registerItem(insaniumPlate);
		}
		if(ModChecker.isMysticalAgricultureLoaded) {
			registerItem(inferiumGear);
			registerItem(inferiumPlate);
			registerItem(intermediumGear);
			registerItem(intermediumPlate);
			registerItem(prudentiumGear);
			registerItem(prudentiumPlate);
			registerItem(souliumGear);
			registerItem(souliumPlate);
			registerItem(superiumGear);
			registerItem(superiumPlate);
			registerItem(supremiumGear);
			registerItem(supremiumPlate);
		}
		if(ModChecker.isProjectRedLoaded) {
			registerItem(electrotineAlloyGear);
			registerItem(electrotineAlloyPlate);
			registerItem(redAlloyGear);
			registerItem(redAlloyPlate);
		}
		if(ModChecker.isRefinedStorageLoaded) {
			registerItem(quartzEnrichedIronGear);
			registerItem(quartzEnrichedIronPlate);
		}
		if(ModChecker.isTinkersConstructLoaded) {
			registerItem(arditeGear);
			registerItem(arditePlate);
			registerItem(cobaltGear);
			registerItem(cobaltPlate);
			registerItem(knightslimeGear);
			registerItem(knightslimePlate);
			registerItem(manyullynGear);
			registerItem(manyullynPlate);
			registerItem(pigIronGear);
			registerItem(pigIronPlate);
		}
	}
	
	public static void registerRenders() {
		registerRender(hammer);
		if(ModChecker.isAppliedEnergisticsLoaded) {
			registerRender(certusQuartzGear);
			registerRender(certusQuartzPlate);
			registerRender(fluixGear);
			registerRender(fluixPlate);
		}
		if(ModChecker.isBotaniaLoaded) {
			registerRender(elementiumGear);
			registerRender(elementiumPlate);
			registerRender(gaiaSpiritGear);
			registerRender(gaiaSpiritPlate);
			registerRender(manasteelGear);
			registerRender(manasteelPlate);
			registerRender(terrasteelGear);
			registerRender(terrasteelPlate);
		}
		if(ModChecker.isDraconicEvolutionLoaded) {
			registerRender(awakenedDraconiumGear);
			registerRender(awakenedDraconiumPlate);
			registerRender(draconiumGear);
			registerRender(draconiumPlate);
		}
		if(ModChecker.isEnderIOLoaded) {
			registerRender(conductiveIronGear);
			registerRender(conductiveIronPlate);
			registerRender(darkSteelGear);
			registerRender(darkSteelPlate);
			registerRender(electricalSteelGear);
			registerRender(electricalSteelPlate);
			registerRender(energeticAlloyGear);
			registerRender(energeticAlloyPlate);
			registerRender(pulsatingIronGear);
			registerRender(pulsatingIronPlate);
			registerRender(redstoneAlloyGear);
			registerRender(redstoneAlloyPlate);
			registerRender(soulariumGear);
			registerRender(soulariumPlate);
			registerRender(vibrantAlloyGear);
			registerRender(vibrantAlloyPlate);
		}
		if(ModChecker.isExtraUtilitiesLoaded) {
			registerRender(demonGear);
			registerRender(demonPlate);
			registerRender(enchantedGear);
			registerRender(enchantedPlate);
			registerRender(evilInfusedIronGear);
			registerRender(evilInfusedIronPlate);
		}
		if(ModChecker.isMekanismLoaded) {
			registerRender(glowstoneGear);
			registerRender(glowstonePlate);
			registerRender(osmiumGear);
			registerRender(osmiumPlate);
			registerRender(refinedObsidianGear);
			registerRender(refinedObsidianPlate);
		}
		if(ModChecker.isMysticalAgradditionsLoaded) {
			registerRender(insaniumGear);
			registerRender(insaniumPlate);
		}
		if(ModChecker.isMysticalAgricultureLoaded) {
			registerRender(inferiumGear);
			registerRender(inferiumPlate);
			registerRender(intermediumGear);
			registerRender(intermediumPlate);
			registerRender(prudentiumGear);
			registerRender(prudentiumPlate);
			registerRender(souliumGear);
			registerRender(souliumPlate);
			registerRender(superiumGear);
			registerRender(superiumPlate);
			registerRender(supremiumGear);
			registerRender(supremiumPlate);
		}
		if(ModChecker.isProjectRedLoaded) {
			registerRender(electrotineAlloyGear);
			registerRender(electrotineAlloyPlate);
			registerRender(redAlloyGear);
			registerRender(redAlloyPlate);
		}
		if(ModChecker.isRefinedStorageLoaded) {
			registerRender(quartzEnrichedIronGear);
			registerRender(quartzEnrichedIronPlate);
		}
		if(ModChecker.isTinkersConstructLoaded) {
			registerRender(arditeGear);
			registerRender(arditePlate);
			registerRender(cobaltGear);
			registerRender(cobaltPlate);
			registerRender(knightslimeGear);
			registerRender(knightslimePlate);
			registerRender(manyullynGear);
			registerRender(manyullynPlate);
			registerRender(pigIronGear);
			registerRender(pigIronPlate);
		}
	}
	
	public static void registerItem(Item item) {
		item.setCreativeTab(MorePlates.TabItems);
		ForgeRegistries.ITEMS.register(item);
		Utils.getLogger().info("Registered item " + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));
	}
	
}