package panszelescik.moreplates.plugins;

import static panszelescik.moreplates.MorePlates.*;
import static panszelescik.moreplates.plugins.PluginMetals.*;
import static panszelescik.moreplates.plugins.PluginMinecraft.*;

import panszelescik.moreplates.helpers.ThermalExpansionHelper;

public class PluginThermalExpansion extends PluginBase {
	
	public static final String MODID = "thermalexpansion";
	public static final String MODNAME = "Thermal Expansion";
	
	public PluginThermalExpansion() {
		super(MODID, MODNAME);
	}
	
	public void postInit() {
		if (isEnabled(pluginMinecraft)) {
			add(COAL, "coal", gearCoal, plateCoal);
			add(DIAMOND, GEM + DIAMOND, gearDiamond, plateDiamond);
			add(EMERALD, GEM + EMERALD, gearEmerald, plateEmerald);
			add(GLOWSTONE, DUST + GLOWSTONE, gearGlowstone, plateGlowstone);
			add(GOLD, INGOT + GOLD, gearGold, plateGold);
			add(IRON, INGOT + IRON, gearIron, plateIron);
			add(LAPIS, GEM + LAPIS, gearLapisLazuli, plateLapisLazuli);
			add(QUARTZ, GEM + QUARTZ, gearNetherQuartz, plateNetherQuartz);
			add(REDSTONE, DUST + REDSTONE, gearRedstone, plateRedstone);
		}
		if (isEnabled(pluginMetals)) {
			add(SILICON, ITEM + SILICON, gearSilicon, plateSilicon);
			add(STEEL, INGOT + STEEL, gearSteel, plateSteel);
		}
		if (isEnabled(pluginActuallyAdditions)) {
			String id = PluginActuallyAdditions.MODID;
			add(BLACK_QUARTZ, GEM + BLACK_QUARTZ);
			add(DIAMATINE, CRYSTAL_NAME, id, DIAMATINE_META);
			add(EMERADIC, CRYSTAL_NAME, id, EMERADIC_META);
			add(ENORI, CRYSTAL_NAME, id, ENORI_META);
			add(PALIS, CRYSTAL_NAME, id, PALIS_META);
			add(RESTONIA, CRYSTAL_NAME, id, RESTONIA_META);
			add(VOID, CRYSTAL_NAME, id, VOID_META);
			
			add(EMPOWERED_DIAMATINE, EMPOWERED_CRYSTAL_NAME, id, DIAMATINE_META);
			add(EMPOWERED_EMERADIC, EMPOWERED_CRYSTAL_NAME, id, EMERADIC_META);
			add(EMPOWERED_ENORI, EMPOWERED_CRYSTAL_NAME, id, ENORI_META);
			add(EMPOWERED_PALIS, EMPOWERED_CRYSTAL_NAME, id, PALIS_META);
			add(EMPOWERED_RESTONIA, EMPOWERED_CRYSTAL_NAME, id, RESTONIA_META);
			add(EMPOWERED_VOID, EMPOWERED_CRYSTAL_NAME, id, VOID_META);
		}
		if (isEnabled(pluginAppliedEnergistics2)) {	
			String id = PluginAppliedEnergistics2.MODID;
			add(CERTUS_QUARTZ, CRYSTAL + CERTUS_QUARTZ);
			add(CERTUS_QUARTZ, PURE_CERTUS_QUARTZ_NAME, id, PURE_CERTUS_QUARTZ_META);
			add(FLUIX, CRYSTAL + FLUIX);
			add(FLUIX, CRYSTAL + PURE_FLUIX);
		}
		if (isEnabled(pluginAvaritia)) {
			add(CRYSTAL_MATRIX, INGOT + CRYSTAL_MATRIX);
			add(INFINITY, INGOT + INFINITY);
			add(NEUTRONIUM, INGOT + NEUTRONIUM);
		}
		if (isEnabled(pluginBotania)) {
			add(ELEMENTIUM, INGOT + ELEMENTIUM);
			addGaia(GAIA_SPIRIT, GAIA_SPIRIT + "Ingot");
			add(MANASTEEL, INGOT + MANASTEEL);
			add(TERRASTEEL, INGOT + TERRASTEEL);
		}
		if (isEnabled(pluginCalculator)) {
			String id = PluginCalculator.MODID;
			add(AMETHYST, GEM + AMETHYST);
			add(ENRICHED_GOLD, INGOT + ENRICHED_GOLD);
			add(REINFORCED_IRON, REINFORCED_IRON_NAME, id);
			add(TANZANITE, GEM + TANZANITE);
		}
		if (isEnabled(pluginDraconicEvolution)) {
			add(AWAKENED_DRACONIUM, INGOT + AWAKENED_DRACONIUM);
			add(DRACONIUM, INGOT + DRACONIUM);
		}
		if (isEnabled(pluginEnderIO)) {
			add(COMBUSTIVE_METAL, INGOT + COMBUSTIVE_METAL);
			add(CONDUCTIVE_IRON, INGOT + CONDUCTIVE_IRON);
			add(CRUDE_STEEL, INGOT + CRUDE_STEEL);
			add(CRYSTALLINE_ALLOY, INGOT + CRYSTALLINE_ALLOY);
			add(CRYSTALLINE_PINK_SLIME, INGOT + CRYSTALLINE_PINK_SLIME);
			add(DARK_STEEL, INGOT + DARK_STEEL);
			add(ELECTRICAL_STEEL, INGOT + ELECTRICAL_STEEL);
			add(END_STEEL, INGOT + END_STEEL);
			add(ENERGETIC_ALLOY, INGOT + ENERGETIC_ALLOY);
			add(ENERGETIC_SILVER, INGOT + ENERGETIC_SILVER);
			add(MELODIC_ALLOY, INGOT + MELODIC_ALLOY);
			add(PULSATING_IRON, INGOT + PULSATING_IRON);
			add(REDSTONE_ALLOY, INGOT + REDSTONE_ALLOY);
			add(SOULARIUM, INGOT + SOULARIUM);
			add(STELLAR_ALLOY, INGOT + STELLAR_ALLOY);
			add(VIBRANT_ALLOY, INGOT + VIBRANT_ALLOY);
		}
		if (isEnabled(pluginExtraUtilities)) {
			add(DEMON, INGOT + DEMON);
			add(ENCHANTED, INGOT + ENCHANTED);
			add(EVIL_INFUSED_IRON, INGOT + EVIL_INFUSED_IRON);
		}
		if (isEnabled(pluginMekanism)) {
			add(GLOWSTONE, INGOT + GLOWSTONE);
			add(OSMIUM, INGOT + OSMIUM);
			add(REFINED_OBSIDIAN, INGOT + REFINED_OBSIDIAN);
		}
		if (isEnabled(pluginMysticalAgradditions)) {
			add(INSANIUM, INGOT + INSANIUM);
		}
		if (isEnabled(pluginMysticalAgriculture)) {
			add(INFERIUM, INGOT + INFERIUM);
			add(INTERMEDIUM, INGOT + INTERMEDIUM);
			add(PRUDENTIUM, INGOT + PRUDENTIUM);
			add(SOULIUM, INGOT + SOULIUM);
			add(SUPERIUM, INGOT + SUPERIUM);
			add(SUPREMIUM, INGOT + SUPREMIUM);
		}
		if (isEnabled(pluginPlusTiC)) {
			add(ALUMITE, INGOT + ALUMITE);
			add(MIRION, INGOT + MIRION);
			add(OSGLOGLAS, INGOT + OSGLOGLAS);
			add(OSMIRIDIUM, INGOT + OSMIRIDIUM);
		}
		if (isEnabled(pluginPneumaticCraft)) {
			add(COMPRESSED_IRON, INGOT + COMPRESSED_IRON);
		}
		if (isEnabled(pluginProjectE)) {
			String id = PluginProjectE.MODID;
			add(DARK_MATTER, MATTER_NAME, id, DARK_MATTER_META);
			add(RED_MATTER, MATTER_NAME, id, RED_MATTER_META);
		}
		if (isEnabled(pluginProjectRed)) {
			add(ELECTROTINE, INGOT + ELECTROTINE);
			add(RED_ALLOY, INGOT + RED_ALLOY);
		}
		if (isEnabled(pluginRefinedStorage)) {
			String id = PluginRefinedStorage.MODID;
			add(QUARTZ_ENRICHED_IRON, QUARTZ_ENRICHED_IRON_NAME, id);
		}
		if (isEnabled(pluginSoulShards)) {
			add(CORRUPTED, INGOT + CORRUPTED);
		}
		if (isEnabled(pluginThaumcraft)) {
			add(AMBER, GEM + AMBER);
			add(QUICKSILVER, "quicksilver");
		}
		if (isEnabled(pluginTinkersConstruct)) {
			add(ARDITE, INGOT + ARDITE);
			add(COBALT, INGOT + COBALT);
			add(KNIGHTSLIME, INGOT + KNIGHTSLIME);
			add(MANYULLYN, INGOT + MANYULLYN);
			add(PIG_IRON, INGOT + PIG_IRON);
		}
		if (isEnabled(pluginTwilightForest)) {
			add(FIERY, INGOT + FIERY);
			add(IRONWOOD, INGOT + IRONWOOD);
			add(KNIGHTMETAL, INGOT + KNIGHTMETAL);
		}
		
		logger.info("Added " + ThermalExpansionHelper.CompactorRecipes + " recipes to Compactor");
		logger.info("Added " + ThermalExpansionHelper.InductionSmelterRecipes + " recipes to Induction Smelter");
	}
	
	private void add(String output, String inputOre, boolean gear, boolean plate) {
		ThermalExpansionHelper.add(output, inputOre, gear, plate);
	}
	
	private void add(String output, String inputOre) {
		ThermalExpansionHelper.add(output, inputOre);
	}
	
	private void add(String output, String input, String id) {
		ThermalExpansionHelper.add(output, input, id);
	}
	
	private void add(String output, String input, String id, int meta) {
		ThermalExpansionHelper.add(output, input, id, meta);
	}
	
	private void addGaia(String output, String input) {
		ThermalExpansionHelper.addGaia(output, input);
	}
}