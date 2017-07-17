package panszelescik.moreplates.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.Reference;
import panszelescik.moreplates.items.ItemArditeGear;
import panszelescik.moreplates.items.ItemArditePlate;
import panszelescik.moreplates.items.ItemAwakenedDraconiumGear;
import panszelescik.moreplates.items.ItemAwakenedDraconiumPlate;
import panszelescik.moreplates.items.ItemCobaltGear;
import panszelescik.moreplates.items.ItemCobaltPlate;
import panszelescik.moreplates.items.ItemConductiveIronGear;
import panszelescik.moreplates.items.ItemConductiveIronPlate;
import panszelescik.moreplates.items.ItemDarkSteelGear;
import panszelescik.moreplates.items.ItemDarkSteelPlate;
import panszelescik.moreplates.items.ItemDraconiumGear;
import panszelescik.moreplates.items.ItemDraconiumPlate;
import panszelescik.moreplates.items.ItemElectricalSteelGear;
import panszelescik.moreplates.items.ItemElectricalSteelPlate;
import panszelescik.moreplates.items.ItemElementiumGear;
import panszelescik.moreplates.items.ItemElementiumPlate;
import panszelescik.moreplates.items.ItemEnergeticAlloyGear;
import panszelescik.moreplates.items.ItemEnergeticAlloyPlate;
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
	public static Item elementiumGear;
	public static Item elementiumPlate;
	public static Item energeticAlloyGear;
	public static Item energeticAlloyPlate;
	public static Item gaiaSpiritGear;
	public static Item gaiaSpiritPlate;
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
	public static Item pulsatingIronGear;
	public static Item pulsatingIronPlate;
	public static Item quartzEnrichedIronGear;
	public static Item quartzEnrichedIronPlate;
	public static Item redstoneAlloyGear;
	public static Item redstoneAlloyPlate;
	public static Item soulariumGear;
	public static Item soulariumPlate;
	public static Item terrasteelGear;
	public static Item terrasteelPlate;
	public static Item vibrantAlloyGear;
	public static Item vibrantAlloyPlate;
	
	public static void init() {
		arditeGear = new ItemArditeGear("ardite_gear", "ardite_gear");
		arditePlate = new ItemArditePlate("ardite_plate", "ardite_plate");
		awakenedDraconiumGear = new ItemAwakenedDraconiumGear("awakened_draconium_gear", "awakened_draconium_gear");
		awakenedDraconiumPlate = new ItemAwakenedDraconiumPlate("awakened_draconium_plate", "awakened_draconium_plate");
		cobaltGear = new ItemCobaltGear("cobalt_gear", "cobalt_gear");
		cobaltPlate = new ItemCobaltPlate("cobalt_plate", "cobalt_plate");
		conductiveIronGear = new ItemConductiveIronGear("conductive_iron_gear", "conductive_iron_gear");
		conductiveIronPlate = new ItemConductiveIronPlate("conductive_iron_plate", "conductive_iron_plate");
		darkSteelGear = new ItemDarkSteelGear("dark_steel_gear", "dark_steel_gear");
		darkSteelPlate = new ItemDarkSteelPlate("dark_steel_plate", "dark_steel_plate");
		draconiumGear = new ItemDraconiumGear("draconium_gear", "draconium_gear");
		draconiumPlate = new ItemDraconiumPlate("draconium_plate", "draconium_plate");
		electricalSteelGear = new ItemElectricalSteelGear("electrical_steel_gear", "electrical_steel_gear");
		electricalSteelPlate = new ItemElectricalSteelPlate("electrical_steel_plate", "electrical_steel_plate");
		elementiumGear = new ItemElementiumGear("elementium_gear", "elementium_gear");
		elementiumPlate = new ItemElementiumPlate("elementium_plate", "elementium_plate");
		energeticAlloyGear = new ItemEnergeticAlloyGear("energetic_alloy_gear", "energetic_alloy_gear");
		energeticAlloyPlate = new ItemEnergeticAlloyPlate("energetic_alloy_plate", "energetic_alloy_plate");
	}
	
	public static void register() {
		registerItem(arditeGear);
		registerItem(arditePlate);
		registerItem(awakenedDraconiumGear);
		registerItem(awakenedDraconiumPlate);
		registerItem(cobaltGear);
		registerItem(cobaltPlate);
		registerItem(conductiveIronGear);
		registerItem(conductiveIronPlate);
		registerItem(darkSteelGear);
		registerItem(darkSteelPlate);
		registerItem(draconiumGear);
		registerItem(draconiumPlate);
		registerItem(electricalSteelGear);
		registerItem(electricalSteelPlate);
		registerItem(elementiumGear);
		registerItem(elementiumPlate);
		registerItem(energeticAlloyGear);
		registerItem(energeticAlloyPlate);
	}
	
	public static void registerRenders() {
		registerRender(arditeGear);
		registerRender(arditePlate);
		registerRender(awakenedDraconiumGear);
		registerRender(awakenedDraconiumPlate);
		registerRender(cobaltGear);
		registerRender(cobaltPlate);
		registerRender(conductiveIronGear);
		registerRender(conductiveIronPlate);
		registerRender(darkSteelGear);
		registerRender(darkSteelPlate);
		registerRender(draconiumGear);
		registerRender(draconiumPlate);
		registerRender(electricalSteelGear);
		registerRender(electricalSteelPlate);
		registerRender(elementiumGear);
		registerRender(elementiumPlate);
		registerRender(energeticAlloyGear);
		registerRender(energeticAlloyPlate);
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
