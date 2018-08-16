package panszelescik.moreplates.plugins;

import static panszelescik.moreplates.MorePlates.*;
import static panszelescik.moreplates.plugins.PluginMinecraft.*;

import net.minecraftforge.fml.common.Loader;
import panszelescik.moreplates.helpers.TechRebornHelper;

public class PluginTechReborn extends PluginBase {
	
	public static final String MODID = "techreborn";
	public static final String MODNAME = "Tech Reborn";
	public static int CompressorRecipes = 0;
	
	public PluginTechReborn() {
		super(MODID, MODNAME);
	}
	
	public void postInit() {
		if (PluginActuallyAdditions.isEnabled()) {
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
		if (PluginAppliedEnergistics2.isEnabled()) {	
			String id = PluginAppliedEnergistics2.MODID;
			add(CERTUS_QUARTZ, CRYSTAL + CERTUS_QUARTZ);
			add(CERTUS_QUARTZ, PURE_CERTUS_QUARTZ_NAME, id, PURE_CERTUS_QUARTZ_META);
			add(FLUIX, CRYSTAL + FLUIX);
			add(FLUIX, CRYSTAL + PURE_FLUIX);
			
			addBlock(CERTUS_QUARTZ, CERTUS_QUARTZ_BLOCK_NAME, 4, id);
			addBlock(FLUIX, FLUIX_BLOCK_NAME, 4, id);
		}
		if (PluginAvaritia.isEnabled()) {
			add(CRYSTAL_MATRIX, INGOT + CRYSTAL_MATRIX);
			//add(INFINITY, INGOT + INFINITY);
			add(NEUTRONIUM, INGOT + NEUTRONIUM);
			
			addBlock(CRYSTAL_MATRIX, 9);
			//addBlock(INFINITY, 9);
			addBlock(NEUTRONIUM, 9);
		}
		if (PluginBotania.isEnabled()) {
			String id = PluginBotania.MODID;
			add(ELEMENTIUM, INGOT + ELEMENTIUM);
			addGaia(GAIA_SPIRIT, GAIA_SPIRIT + "Ingot");
			//add(MANASTEEL, INGOT + MANASTEEL);
			//add(TERRASTEEL, INGOT + TERRASTEEL);
			
			addBlock(ELEMENTIUM, BOTANIA_NAME, 9, id, ELEMENTIUM_META);
			addBlock(MANASTEEL, BOTANIA_NAME, 9, id, MANASTEEL_META);
			addBlock(TERRASTEEL, BOTANIA_NAME, 9, id, TERRASTEEL_META);
		}
		if (PluginCalculator.isEnabled()) {
			String id = PluginCalculator.MODID;
			add(AMETHYST, GEM + AMETHYST);
			add(ENRICHED_GOLD, INGOT + ENRICHED_GOLD);
			add(REINFORCED_IRON, REINFORCED_IRON_NAME, id);
			add(TANZANITE, GEM + TANZANITE);
			
			addBlock(ENRICHED_GOLD, CALCULATOR_NAME, 9, id, ENRICHED_GOLD_BLOCK_META);
			addBlock(REINFORCED_IRON, CALCULATOR_NAME, 9, id, REINFORCED_IRON_BLOCK_META);
		}
		if (PluginDraconicEvolution.isEnabled()) {
			add(AWAKENED_DRACONIUM, INGOT + AWAKENED_DRACONIUM);
			//add(DRACONIUM, INGOT + DRACONIUM);
			
			addBlock(AWAKENED_DRACONIUM, 9);
			//addBlock(DRACONIUM, 9);
		}
		if (PluginEnderIO.isEnabled()) {
			add(CONDUCTIVE_IRON, INGOT + CONDUCTIVE_IRON);
			add(DARK_STEEL, INGOT + DARK_STEEL);
			add(ELECTRICAL_STEEL, INGOT + ELECTRICAL_STEEL);
			add(END_STEEL, INGOT + END_STEEL);
			add(ENERGETIC_ALLOY, INGOT + ENERGETIC_ALLOY);
			add(PULSATING_IRON, INGOT + PULSATING_IRON);
			add(REDSTONE_ALLOY, INGOT + REDSTONE_ALLOY);
			//add(SOULARIUM, INGOT + SOULARIUM);
			add(VIBRANT_ALLOY, INGOT + VIBRANT_ALLOY);
			
			addBlock(CONDUCTIVE_IRON, 9);
			addBlock(DARK_STEEL, 9);
			addBlock(ELECTRICAL_STEEL, 9);
			addBlock(END_STEEL, 9);
			addBlock(ENERGETIC_ALLOY, 9);
			addBlock(PULSATING_IRON, 9);
			addBlock(REDSTONE_ALLOY, 9);
			//addBlock(SOULARIUM, 9);
			addBlock(VIBRANT_ALLOY, 9);
		}
		if (PluginEnderIOEndergy.isEnabled()) {
			add(COMBUSTIVE_METAL, INGOT + COMBUSTIVE_METAL);
			add(CRUDE_STEEL, INGOT + CRUDE_STEEL);
			add(CRYSTALLINE_ALLOY, INGOT + CRYSTALLINE_ALLOY);
			add(MELODIC_ALLOY, INGOT + MELODIC_ALLOY);
			add(STELLAR_ALLOY, INGOT + STELLAR_ALLOY);
			
			addBlock(COMBUSTIVE_METAL, 9);
			addBlock(CRUDE_STEEL, 9);
			addBlock(CRYSTALLINE_ALLOY, 9);
			addBlock(MELODIC_ALLOY, 9);
			addBlock(STELLAR_ALLOY, 9);
		}
		if (PluginExtraUtilities.isEnabled()) {
			add(DEMON, INGOT + DEMON);
			add(ENCHANTED, INGOT + ENCHANTED);
			add(EVIL_INFUSED_IRON, INGOT + EVIL_INFUSED_IRON);
			
			addBlock(DEMON, 9);
			addBlock(ENCHANTED, 9);
			addBlock(EVIL_INFUSED_IRON, 9);
		}
		if (PluginMekanism.isEnabled()) {
			add(REFINED_GLOWSTONE, INGOT + REFINED_GLOWSTONE);
			//add(OSMIUM, INGOT + OSMIUM);
			add(REFINED_OBSIDIAN, INGOT + REFINED_OBSIDIAN);
			
			addBlock(REFINED_GLOWSTONE, 9);
			//addBlock(OSMIUM, 9);
			addBlock(REFINED_OBSIDIAN, 9);
		}
		if (PluginMinecraft.isEnabled()) {
			add(COAL, "coal", plateCoal);
			add(DIAMOND, GEM + DIAMOND, plateDiamond);
			add(EMERALD, GEM + EMERALD, plateEmerald);
			add(GLOWSTONE, DUST + GLOWSTONE, plateGlowstone);
			add(GOLD, INGOT + GOLD, plateGold);
			add(IRON, INGOT + IRON, plateIron);
			add(LAPIS, GEM + LAPIS, plateLapisLazuli);
			add(QUARTZ, GEM + QUARTZ, plateNetherQuartz);
			add(REDSTONE, DUST + REDSTONE, plateRedstone);
			
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
		if (PluginMultiMod.isEnabled()) {
			add(SILICON, ITEM + SILICON);
		}
		/*if (PluginMysticalAgradditions.isEnabled()) {
			add(INSANIUM, INGOT + INSANIUM);
			
			addBlock(INSANIUM, 9);
		}*/
		/*if (PluginMysticalAgriculture.isEnabled()) {
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
		}*/
		/*if (PluginPlusTiC.isEnabled()) {
			add(ALUMITE, INGOT + ALUMITE);
			
			addBlock(ALUMITE, 9);
			if (Loader.isModLoaded(PluginBotania.MODID)) {
				add(MIRION, INGOT + MIRION);
				
				addBlock(MIRION, 9);
			}
			if (Loader.isModLoaded(PluginMekanism.MODID)) {
				add(OSGLOGLAS, INGOT + OSGLOGLAS);
				
				addBlock(OSGLOGLAS, 9);
			}
			if (Loader.isModLoaded(PluginMekanism.MODID) && Loader.isModLoaded(PluginThermalExpansion.MODID)) {
				add(OSMIRIDIUM, INGOT + OSMIRIDIUM);
				
				addBlock(OSMIRIDIUM, 9);
			}
		}*/
		if (PluginPneumaticCraft.isEnabled()) {
			add(COMPRESSED_IRON, INGOT + COMPRESSED_IRON);
			
			addBlock(COMPRESSED_IRON, 9);
		}
		if (PluginProjectE.isEnabled()) {
			String id = PluginProjectE.MODID;
			add(DARK_MATTER, MATTER_NAME, id, DARK_MATTER_META);
			add(RED_MATTER, MATTER_NAME, id, RED_MATTER_META);
			
			addBlock(DARK_MATTER, MATTER_BLOCK_NAME, 4, id, DARK_MATTER_META);
			addBlock(RED_MATTER, MATTER_BLOCK_NAME, 4, id, RED_MATTER_META);
		}
		if (PluginProjectRed.isEnabled()) {
			add(ELECTROTINE, INGOT + ELECTROTINE);
			add(RED_ALLOY, INGOT + RED_ALLOY);
		}
		if (PluginRefinedStorage.isEnabled()) {
			String id = PluginRefinedStorage.MODID;
			add(QUARTZ_ENRICHED_IRON, QUARTZ_ENRICHED_IRON_NAME, id);
			
			addBlock(QUARTZ_ENRICHED_IRON, QUARTZ_ENRICHED_IRON_BLOCK_NAME, 9, id);
		}
		if (PluginThaumcraft.isEnabled()) {
			String id = PluginThaumcraft.MODID;
			add(AMBER, GEM + AMBER);
			add(QUICKSILVER, "quicksilver");
			
			addBlock(AMBER, AMBER_BLOCK_NAME, 9, id);
		}
		/*if (PluginTinkersConstruct.isEnabled()) {
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
		}*/
		if (PluginTwilightForest.isEnabled()) {
			String id = PluginTwilightForest.MODID;
			add(FIERY, INGOT + FIERY);
			//add(IRONWOOD, INGOT + IRONWOOD);
			add(KNIGHTMETAL, INGOT + KNIGHTMETAL);
			
			addBlock(FIERY, 9);
			addBlock(IRONWOOD, IRONWOOD_BLOCK_NAME, 9, id);
			addBlock(KNIGHTMETAL, 9);
		}
		
		logger.info("Added " + CompressorRecipes + " recipes to Compressor");
	}
	
	private void add(String output, String input, boolean plate) {
		TechRebornHelper.add(output, input, plate);
	}
	
	private void add(String output, String input) {
		TechRebornHelper.add(output, input);
	}
	
	private void add(String output, String input, String id) {
		TechRebornHelper.add(output, input, id);
	}
	
	private void add(String output, String input, String id, int meta) {
		TechRebornHelper.add(output, input, id, meta);
	}
	
	private void addGaia(String output, String input) {
		TechRebornHelper.addGaia(output, input);
	}
	
	private void addBlock(String name, int amount, boolean plate) {
		TechRebornHelper.addBlock(name, amount, plate);
	}
	
	private void addBlock(String name, int amount) {
		TechRebornHelper.addBlock(name, amount);
	}
	
	private void addBlock(String output, String input, int amount, String id) {
		TechRebornHelper.addBlock(output, input, amount, id);
	}
	
	private void addBlock(String output, String input, int amount, String id, int meta) {
		TechRebornHelper.addBlock(output, input, amount, id, meta);
	}
}