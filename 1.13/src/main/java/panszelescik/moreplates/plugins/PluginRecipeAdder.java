package panszelescik.moreplates.plugins;

import static panszelescik.moreplates.MorePlates.*;
import static panszelescik.moreplates.config.Config.*;
import static panszelescik.moreplates.plugins.PluginMetals.*;
import static panszelescik.moreplates.plugins.PluginMinecraft.*;

import panszelescik.moreplates.helpers.*;

public class PluginRecipeAdder extends PluginBase {

	public PluginRecipeAdder() {
		super("", "");
	}
	
	public void postInit() {
		if (isEnabled(pluginMinecraft)) {
			add(COAL, "coal", gearCoal, plateCoal);
			add(DIAMOND, GEM + DIAMOND, gearDiamond, plateDiamond);
			add(EMERALD, GEM + EMERALD, gearEmerald, plateEmerald);
			add(GLOWSTONE, DUST + GLOWSTONE, gearGlowstone, plateGlowstone);
			add(GOLD, INGOT + GOLD, gearGold, plateGold, stickGold);
			add(IRON, INGOT + IRON, gearIron, plateIron, stickIron);
			add(LAPIS, GEM + LAPIS, gearLapisLazuli, plateLapisLazuli);
			add(QUARTZ, GEM + QUARTZ, gearNetherQuartz, plateNetherQuartz);
			add(REDSTONE, DUST + REDSTONE, gearRedstone, plateRedstone);
			
			addBlock(COAL, 9, plateCoal);
			addBlock(DIAMOND, 9, plateDiamond);
			addBlock(EMERALD, 9, plateEmerald);
			addBlock(GLOWSTONE, 4, plateGlowstone);
			addBlock(GOLD, 9, plateGold);
			addBlock(IRON, 9, plateIron);
			addBlock(LAPIS, 9, plateLapisLazuli);
			addBlock(QUARTZ, 4, plateNetherQuartz);
			addBlock(REDSTONE, 9, plateRedstone);
		}
		if (isEnabled(pluginMetals)) {
			add(ALUMINUM, INGOT + ALUMINUM, false, false, stickAluminum);
			add(BRONZE, INGOT + BRONZE, false, false, stickBronze);
			add(CONSTANTAN, INGOT + CONSTANTAN, false, false, stickConstantan);
			add(COPPER, INGOT + COPPER, false, false, stickCopper);
			add(ELECTRUM, INGOT + ELECTRUM, false, false, stickElectrum);
			add(ENDERIUM, INGOT + ENDERIUM, false, false, stickEnderium);
			add(INVAR, INGOT + INVAR, false, false, stickInvar);
			add(IRIDIUM, INGOT + IRIDIUM, false, false, stickIridium);
			add(LEAD, INGOT + LEAD, false, false, stickLead);
			add(LUMIUM, INGOT + LUMIUM, false, false, stickLumium);
			add(MITHRIL, INGOT + MITHRIL, false, false, stickMithril);
			add(NICKEL, INGOT + NICKEL, false, false, stickNickel);
			add(PLATINUM, INGOT + PLATINUM, false, false, stickPlatinum);
			add(SIGNALUM, INGOT + SIGNALUM, false, false, stickSignalum);
			add(SILICON, ITEM + SILICON, gearSilicon, plateSilicon);
			add(SILVER, INGOT + SILVER, false, false, stickSilver);
			add(STEEL, INGOT + STEEL, gearSteel, plateSteel, stickSteel);
			add(TIN, INGOT + TIN, false, false, stickTin);
			
			addBlock(STEEL, 9, plateSteel);
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
			
			addBlock(BLACK_QUARTZ, BLACK_QUARTZ_BLOCK_NAME, 4, id, 2);
			addBlock(DIAMATINE, CRYSTAL_BLOCK_NAME, 9, id, DIAMATINE_META);
			addBlock(EMERADIC, CRYSTAL_BLOCK_NAME, 9, id, EMERADIC_META);
			addBlock(ENORI, CRYSTAL_BLOCK_NAME, 9, id, ENORI_META);
			addBlock(PALIS, CRYSTAL_BLOCK_NAME, 9, id, PALIS_META);
			addBlock(RESTONIA, CRYSTAL_BLOCK_NAME, 9, id, RESTONIA_META);
			addBlock(VOID, CRYSTAL_BLOCK_NAME, 9, id, VOID_META);
			
			addBlock(EMPOWERED_DIAMATINE, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, DIAMATINE_META);
			addBlock(EMPOWERED_EMERADIC, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, EMERADIC_META);
			addBlock(EMPOWERED_ENORI, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, ENORI_META);
			addBlock(EMPOWERED_PALIS, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, PALIS_META);
			addBlock(EMPOWERED_RESTONIA, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, RESTONIA_META);
			addBlock(EMPOWERED_VOID, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, id, VOID_META);
		}
		if (isEnabled(pluginAppliedEnergistics2)) {	
			String id = PluginAppliedEnergistics2.MODID;
			add(CERTUS_QUARTZ, CRYSTAL + CERTUS_QUARTZ);
			add(CERTUS_QUARTZ, PURE_CERTUS_QUARTZ_NAME, id, PURE_CERTUS_QUARTZ_META);
			add(FLUIX, CRYSTAL + FLUIX);
			add(FLUIX, CRYSTAL + PURE_FLUIX);
			
			addBlock(CERTUS_QUARTZ, CERTUS_QUARTZ_BLOCK_NAME, 4, id);
			addBlock(FLUIX, FLUIX_BLOCK_NAME, 4, id);
		}
		if (isEnabled(pluginAvaritia)) {
			add(CRYSTAL_MATRIX, INGOT + CRYSTAL_MATRIX);
			add(INFINITY, INGOT + INFINITY);
			add(NEUTRONIUM, INGOT + NEUTRONIUM);
			
			addBlock(CRYSTAL_MATRIX, 9);
			addBlock(INFINITY, 9);
			addBlock(NEUTRONIUM, 9);
		}
		if (isEnabled(pluginBotania)) {
			String id = PluginBotania.MODID;
			add(ELEMENTIUM, INGOT + ELEMENTIUM);
			addGaia(GAIA_SPIRIT, GAIA_SPIRIT + "Ingot");
			add(MANASTEEL, INGOT + MANASTEEL);
			add(TERRASTEEL, INGOT + TERRASTEEL);
			
			addBlock(ELEMENTIUM, BOTANIA_NAME, 9, id, ELEMENTIUM_META);
			addBlock(MANASTEEL, BOTANIA_NAME, 9, id, MANASTEEL_META);
			addBlock(TERRASTEEL, BOTANIA_NAME, 9, id, TERRASTEEL_META);
		}
		if (isEnabled(pluginCalculator)) {
			String id = PluginCalculator.MODID;
			add(AMETHYST, GEM + AMETHYST);
			add(ENRICHED_GOLD, INGOT + ENRICHED_GOLD);
			add(REINFORCED_IRON, REINFORCED_IRON_NAME, id);
			add(TANZANITE, GEM + TANZANITE);
			
			addBlock(ENRICHED_GOLD, CALCULATOR_NAME, 9, id, ENRICHED_GOLD_BLOCK_META);
			addBlock(REINFORCED_IRON, CALCULATOR_NAME, 9, id, REINFORCED_IRON_BLOCK_META);
		}
		if (isEnabled(pluginDraconicEvolution)) {
			add(AWAKENED_DRACONIUM, INGOT + AWAKENED_DRACONIUM);
			add(DRACONIUM, INGOT + DRACONIUM);
			
			addBlock(AWAKENED_DRACONIUM, 9);
			addBlock(DRACONIUM, 9);
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
			
			addBlock(COMBUSTIVE_METAL, 9);
			addBlock(CONDUCTIVE_IRON, 9);
			addBlock(CRUDE_STEEL, 9);
			addBlock(CRYSTALLINE_ALLOY, 9);
			addBlock(CRYSTALLINE_PINK_SLIME, 9);
			addBlock(DARK_STEEL, 9);
			addBlock(ELECTRICAL_STEEL, 9);
			addBlock(END_STEEL, 9);
			addBlock(ENERGETIC_ALLOY, 9);
			addBlock(ENERGETIC_SILVER, 9);
			addBlock(MELODIC_ALLOY, 9);
			addBlock(PULSATING_IRON, 9);
			addBlock(REDSTONE_ALLOY, 9);
			addBlock(SOULARIUM, 9);
			addBlock(STELLAR_ALLOY, 9);
			addBlock(VIBRANT_ALLOY, 9);
		}
		if (isEnabled(pluginExtraUtilities)) {
			add(DEMON, INGOT + DEMON);
			add(ENCHANTED, INGOT + ENCHANTED);
			add(EVIL_INFUSED_IRON, INGOT + EVIL_INFUSED_IRON);
			
			addBlock(DEMON, 9);
			addBlock(ENCHANTED, 9);
			addBlock(EVIL_INFUSED_IRON, 9);
		}
		if (isEnabled(pluginMekanism)) {
			add(OSMIUM, INGOT + OSMIUM);
			add(REFINED_GLOWSTONE, INGOT + REFINED_GLOWSTONE);
			add(REFINED_OBSIDIAN, INGOT + REFINED_OBSIDIAN);
			
			addBlock(OSMIUM, 9);
			addBlock(REFINED_GLOWSTONE, 9);
			addBlock(REFINED_OBSIDIAN, 9);
		}
		if (isEnabled(pluginMysticalAgradditions)) {
			add(INSANIUM, INGOT + INSANIUM);
			
			addBlock(INSANIUM, 9);
		}
		if (isEnabled(pluginMysticalAgriculture)) {
			add(INFERIUM, INGOT + INFERIUM);
			add(INTERMEDIUM, INGOT + INTERMEDIUM);
			add(PRUDENTIUM, INGOT + PRUDENTIUM);
			add(SOULIUM, INGOT + SOULIUM);
			add(SUPERIUM, INGOT + SUPERIUM);
			add(SUPREMIUM, INGOT + SUPREMIUM);
			
			addBlock(INFERIUM, 9);
			addBlock(INTERMEDIUM, 9);
			addBlock(PRUDENTIUM, 9);
			addBlock(SOULIUM, 9);
			addBlock(SUPERIUM, 9);
			addBlock(SUPREMIUM, 9);
		}
		if (isEnabled(pluginPlusTiC)) {
			add(ALUMITE, INGOT + ALUMITE);
			add(MIRION, INGOT + MIRION);
			add(OSGLOGLAS, INGOT + OSGLOGLAS);
			add(OSMIRIDIUM, INGOT + OSMIRIDIUM);
			
			addBlock(ALUMITE, 9);
			addBlock(MIRION, 9);
			addBlock(OSGLOGLAS, 9);
			addBlock(OSMIRIDIUM, 9);
		}
		if (isEnabled(pluginPneumaticCraft)) {
			add(COMPRESSED_IRON, INGOT + COMPRESSED_IRON);
			
			addBlock(COMPRESSED_IRON, 9);
		}
		if (isEnabled(pluginProjectE)) {
			String id = PluginProjectE.MODID;
			add(DARK_MATTER, MATTER_NAME, id, DARK_MATTER_META);
			add(RED_MATTER, MATTER_NAME, id, RED_MATTER_META);
			
			addBlock(DARK_MATTER, MATTER_BLOCK_NAME, 4, id, DARK_MATTER_META);
			addBlock(RED_MATTER, MATTER_BLOCK_NAME, 4, id, RED_MATTER_META);
		}
		if (isEnabled(pluginProjectRed)) {
			add(ELECTROTINE, INGOT + ELECTROTINE);
			add(RED_ALLOY, INGOT + RED_ALLOY);
		}
		if (isEnabled(pluginRefinedStorage)) {
			String id = PluginRefinedStorage.MODID;
			add(QUARTZ_ENRICHED_IRON, QUARTZ_ENRICHED_IRON_NAME, id);
			
			addBlock(QUARTZ_ENRICHED_IRON, QUARTZ_ENRICHED_IRON_BLOCK_NAME, 9, id);
		}
		if (isEnabled(pluginSoulShards)) {
			add(CORRUPTED, INGOT + CORRUPTED);
		}
		if (isEnabled(pluginThaumcraft)) {
			String id = PluginThaumcraft.MODID;
			add(AMBER, GEM + AMBER);
			add(QUICKSILVER, "quicksilver");
			
			addBlock(AMBER, AMBER_BLOCK_NAME, 9, id);
		}
		if (isEnabled(pluginTinkersConstruct)) {
			add(ARDITE, INGOT + ARDITE);
			add(COBALT, INGOT + COBALT);
			add(KNIGHTSLIME, INGOT + KNIGHTSLIME);
			add(MANYULLYN, INGOT + MANYULLYN);
			add(PIG_IRON, INGOT + PIG_IRON);
			
			addBlock(ARDITE, 9);
			addBlock(COBALT, 9);
			addBlock(KNIGHTSLIME, 9);
			addBlock(MANYULLYN, 9);
			addBlock(PIG_IRON, 9);
		}
		if (isEnabled(pluginTwilightForest)) {
			String id = PluginTwilightForest.MODID;
			add(FIERY, INGOT + FIERY);
			add(IRONWOOD, INGOT + IRONWOOD);
			add(KNIGHTMETAL, INGOT + KNIGHTMETAL);
			
			addBlock(FIERY, 9);
			addBlock(IRONWOOD, IRONWOOD_BLOCK_NAME, 9, id);
			addBlock(KNIGHTMETAL, 9);
		}
		if (ieEnabled()) {
			logger.info("Added " + ImmersiveEngineeringHelper.MetalPressRecipes + " recipes to Metal Press");
		}
		if (icEnabled()) {
			logger.info("Added " + IndustrialCraft2Helper.BlockCuttingMachineRecipes + " recipes to Block Cutting Machine");
			logger.info("Added " + IndustrialCraft2Helper.MetalFormerRecipes + " recipes to Metal Former");
		}
		if (thEnabled()) {
			logger.info("Added " + TechRebornHelper.CompressorRecipes + " recipes to Compressor");
		}
		if (teEnabled()) {
			logger.info("Added " + ThermalExpansionHelper.CompactorRecipes + " recipes to Compactor");
			logger.info("Added " + ThermalExpansionHelper.InductionSmelterRecipes + " recipes to Induction Smelter");
		}
	}
	
	private void add(String output, String input, boolean gear, boolean plate, boolean stick) {
		if (ieEnabled())
			ImmersiveEngineeringHelper.add(output, input, gear, plate, stick);
	}
	
	private void add(String output, String input, boolean gear, boolean plate) {
		if (ieEnabled())
			ImmersiveEngineeringHelper.add(output, input, gear, plate, false);
		if (icEnabled())
			IndustrialCraft2Helper.add(output, input, plate);
		if (thEnabled())
			TechRebornHelper.add(output, input, plate);
		if (teEnabled())
			ThermalExpansionHelper.add(output, input, gear, plate);
	}
	
	private void add(String output, String input) {
		if (ieEnabled())
			ImmersiveEngineeringHelper.add(output, input);
		if (icEnabled())
			IndustrialCraft2Helper.add(output, input);
		if (thEnabled())
			TechRebornHelper.add(output, input);
		if (teEnabled())
			ThermalExpansionHelper.add(output, input);
	}
	
	private void add(String output, String input, String id) {
		if (ieEnabled())
			ImmersiveEngineeringHelper.add(output, input, id);
		if (icEnabled())
			IndustrialCraft2Helper.add(output, input, id);
		if (thEnabled())
			TechRebornHelper.add(output, input, id);
		if (teEnabled())
			ThermalExpansionHelper.add(output, input, id);
	}
	
	private void add(String output, String input, String id, int meta) {
		if (ieEnabled())
			ImmersiveEngineeringHelper.add(output, input, id, meta);
		if (icEnabled())
			IndustrialCraft2Helper.add(output, input, id, meta);
		if (thEnabled())
			TechRebornHelper.add(output, input, id, meta);
		if (teEnabled())
			ThermalExpansionHelper.add(output, input, id, meta);
	}
	
	private void addGaia(String output, String input) {
		if (ieEnabled())
			ImmersiveEngineeringHelper.addGaia(output, input);
		if (icEnabled())
			IndustrialCraft2Helper.addGaia(output, input);
		if (thEnabled())
			TechRebornHelper.addGaia(output, input);
		if (teEnabled())
			ThermalExpansionHelper.addGaia(output, input);
	}
	
	private void addBlock(String name, int amount, boolean plate) {
		if (icEnabled())
			IndustrialCraft2Helper.addBlock(name, amount, plate);
		if (thEnabled())
			TechRebornHelper.addBlock(name, amount, plate);
	}
	
	private void addBlock(String name, int amount) {
		if (icEnabled())
			IndustrialCraft2Helper.addBlock(name, amount);
		if (thEnabled())
			TechRebornHelper.addBlock(name, amount);
	}
	
	private void addBlock(String output, String input, int amount, String id) {
		if (icEnabled())
			IndustrialCraft2Helper.addBlock(output, input, amount, id);
		if (thEnabled())
			TechRebornHelper.addBlock(output, input, amount, id);
	}
	
	private void addBlock(String output, String input, int amount, String id, int meta) {
		if (icEnabled())
			IndustrialCraft2Helper.addBlock(output, input, amount, id, meta);
		if (thEnabled())
			TechRebornHelper.addBlock(output, input, amount, id, meta);
	}
	
	private boolean icEnabled() {
		return getBoolean(PluginIndustrialCraft2.MODNAME, CATEGORY_PLUGINS, "Enable this to load " + PluginIndustrialCraft2.MODNAME + " plugin") && isLoaded(PluginIndustrialCraft2.MODID) && !isLoaded("ic2-classic-spmod");
	}
	
	private boolean ieEnabled() {
		return getBoolean(PluginImmersiveEngineering.MODNAME, CATEGORY_PLUGINS, "Enable this to load " + PluginImmersiveEngineering.MODNAME + " plugin") && isLoaded(PluginImmersiveEngineering.MODID);
	}
	
	private boolean thEnabled() {
		return getBoolean(PluginTechReborn.MODNAME, CATEGORY_PLUGINS, "Enable this to load " + PluginTechReborn.MODNAME + " plugin") && isLoaded(PluginTechReborn.MODID);
	}
	
	private boolean teEnabled() {
		return getBoolean(PluginThermalExpansion.MODNAME, CATEGORY_PLUGINS, "Enable this to load " + PluginThermalExpansion.MODNAME + " plugin") && isLoaded(PluginThermalExpansion.MODID);
	}
}