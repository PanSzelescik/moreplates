package panszelescik.moreplates.plugins;

import static panszelescik.moreplates.MorePlates.*;

import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.helpers.ActuallyAdditionsHelper;

public class PluginActuallyAdditions extends PluginBase {
	
	public static final String MODID = "actuallyadditions";
	public static final String MODNAME = "Actually Additions";
	
	public PluginActuallyAdditions() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(BLACK_QUARTZ, "black_quartz");
		reg(DIAMATINE, "diamatine");
		reg(EMERADIC, "emeradic");
		reg(ENORI, "enori");
		reg(PALIS, "palis");
		reg(RESTONIA, "restonia");
		reg(VOID, "void");
		
		reg(EMPOWERED_DIAMATINE, "empowered_diamatine");
		reg(EMPOWERED_EMERADIC, "empowered_emeradic");
		reg(EMPOWERED_ENORI, "empowered_enori");
		reg(EMPOWERED_PALIS, "empowered_palis");
		reg(EMPOWERED_RESTONIA, "empowered_restonia");
		reg(EMPOWERED_VOID, "empowered_void");
	}
	
	public void postInit() {
		addEmpowerer(EMPOWERED_DIAMATINE, DIAMATINE, DYE_LIGHT_BLUE, getItemStack(Items.CLAY_BALL), getItemStack(Items.CLAY_BALL), getItemStack(Blocks.CLAY));
		List<ItemStack> balls = OreDictionary.getOres("slimeball");
		for (ItemStack ball : balls)
			addEmpowerer(EMPOWERED_EMERADIC, EMERADIC, DYE_LIME, getItemStack(Blocks.TALLGRASS, 1), getItemStack(Blocks.SAPLING), ball.copy());
		addEmpowerer(EMPOWERED_ENORI, ENORI, DYE_GRAY, getItemStack(Items.SNOWBALL), getItemStack(Blocks.STONE_BUTTON), getItemStack(Blocks.COBBLESTONE));
		addEmpowerer(EMPOWERED_PALIS, PALIS, DYE_CYAN, getItemStack(Items.PRISMARINE_SHARD), getItemStack(Items.PRISMARINE_SHARD), getItemStack(Items.PRISMARINE_SHARD));
		addEmpowerer(EMPOWERED_RESTONIA, RESTONIA, DYE_RED, getItemStack(Items.NETHERBRICK), getItemStack(Items.REDSTONE), getItemStack(Items.BRICK));
		addEmpowerer(EMPOWERED_VOID, VOID, DYE_BLACK, getItemStack(Items.COAL, 1), getItemStack(Items.FLINT), getItemStack(Blocks.STONE));
		
		addReconstructor(DIAMATINE, DIAMOND, 60);
		addReconstructor(EMERADIC, EMERALD, 100);
		addReconstructor(ENORI, IRON, 80);
		addReconstructor(PALIS, LAPIS, 40);
		addReconstructor(RESTONIA, REDSTONE, 40);
		addReconstructor(VOID, COAL, 60);
		
		logger.info("Added " + ActuallyAdditionsHelper.AtomicReconstructorRecipes + " recipes to Atomic Reconstructor");
		logger.info("Added " + ActuallyAdditionsHelper.EmpowererRecipes + " recipes to Empowerer");
	}
	
	private void addEmpowerer(String output, String input, String dye, ItemStack modifier2, ItemStack modifier3, ItemStack modifier4) {
		ActuallyAdditionsHelper.addEmpowerer(output, input, dye, modifier2, modifier3, modifier4);
	}
	
	private void addReconstructor(String output, String input, int energy) {
		ActuallyAdditionsHelper.addReconstructor(output, input, energy);
	}
}