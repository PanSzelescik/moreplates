package panszelescik.moreplates.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import panszelescik.moreplates.ModChecker;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.Reference;
import panszelescik.moreplates.items.*;
import panszelescik.moreplates.util.Utils;

public class ModItems {

	public static Item arditeGear;
	public static Item arditePlate;
	public static Item awakenedDraconiumGear;
	public static Item awakenedDraconiumPlate;
	public static Item cobaltGear;
	public static Item cobaltPlate;
	public static Item conductiveIronGear;
	public static Item conductiveIronPlate;
	public static Item darkSteelGear;
	public static Item darkSteelPlate;
	public static Item draconiumGear;
	public static Item draconiumPlate;
	public static Item electricalSteelGear;
	public static Item electricalSteelPlate;
	public static Item electrotineAlloyGear;
	public static Item electrotineAlloyPlate;
	public static Item elementiumGear;
	public static Item elementiumPlate;
	public static Item energeticAlloyGear;
	public static Item energeticAlloyPlate;
	public static Item gaiaSpiritGear;
	public static Item gaiaSpiritPlate;
	public static Item hammer;
	public static Item inferiumGear;
	public static Item inferiumPlate;
	public static Item insaniumGear;
	public static Item insaniumPlate;
	public static Item intermediumGear;
	public static Item intermediumPlate;
	public static Item knightslimeGear;
	public static Item knightslimePlate;
	public static Item manasteelGear;
	public static Item manasteelPlate;
	public static Item manyullynGear;
	public static Item manyullynPlate;
	public static Item osmiumGear;
	public static Item osmiumPlate;
	public static Item pigIronGear;
	public static Item pigIronPlate;
	public static Item prudentiumGear;
	public static Item prudentiumPlate;
	public static Item pulsatingIronGear;
	public static Item pulsatingIronPlate;
	public static Item quartzEnrichedIronGear;
	public static Item quartzEnrichedIronPlate;
	public static Item redAlloyGear;
	public static Item redAlloyPlate;
	public static Item redstoneAlloyGear;
	public static Item redstoneAlloyPlate;
	public static Item soulariumGear;
	public static Item soulariumPlate;
	public static Item souliumGear;
	public static Item souliumPlate;
	public static Item superiumGear;
	public static Item superiumPlate;
	public static Item supremiumGear;
	public static Item supremiumPlate;
	public static Item terrasteelGear;
	public static Item terrasteelPlate;
	public static Item vibrantAlloyGear;
	public static Item vibrantAlloyPlate;
	
	public static void init() {
		hammer = new ItemHammer("hammer", "hammer");
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
		if(ModChecker.isMekanismLoaded) {
			osmiumGear = new ItemOsmiumGear("osmium_gear", "osmium_gear");
			osmiumPlate = new ItemOsmiumPlate("osmium_plate", "osmium_plate");
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
		if(ModChecker.isMekanismLoaded) {
			registerItem(osmiumGear);
			registerItem(osmiumPlate);
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
		if(ModChecker.isMekanismLoaded) {
			registerRender(osmiumGear);
			registerRender(osmiumPlate);
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
		item.setCreativeTab(MorePlates.items);
		ForgeRegistries.ITEMS.register(item);
		Utils.getLogger().info("Registered item " + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Register render for " + item.getUnlocalizedName().substring(5));
	}
	
}
