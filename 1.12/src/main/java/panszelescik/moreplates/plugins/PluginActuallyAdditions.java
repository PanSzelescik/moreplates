package panszelescik.moreplates.plugins;

import static panszelescik.moreplates.MorePlates.*;

import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.helpers.ActuallyAdditionsHelper;

public class PluginActuallyAdditions extends PluginBase {
	
	public static final String MODID = "actuallyadditions";
	public static final String MODNAME = "Actually Additions";
	
	public PluginActuallyAdditions() {
		super(MODID, MODNAME);
	}
	
	Item black_quartz_gear;
	Item black_quartz_plate;
	Item diamatine_gear;
	Item diamatine_plate;
	Item emeradic_gear;
	Item emeradic_plate;
	Item enori_gear;
	Item enori_plate;
	Item palis_gear;
	Item palis_plate;
	Item restonia_gear;
	Item restonia_plate;
	Item void_gear;
	Item void_plate;
	
	Item empowered_diamatine_gear;
	Item empowered_diamatine_plate;
	Item empowered_emeradic_gear;
	Item empowered_emeradic_plate;
	Item empowered_enori_gear;
	Item empowered_enori_plate;
	Item empowered_palis_gear;
	Item empowered_palis_plate;
	Item empowered_restonia_gear;
	Item empowered_restonia_plate;
	Item empowered_void_gear;
	Item empowered_void_plate;
	
	public void preInit() {
		black_quartz_gear = gear("black_quartz");
		black_quartz_plate = plate("black_quartz");
		diamatine_gear = gear("diamatine");
		diamatine_plate = plate("diamatine");
		emeradic_gear = gear("emeradic");
		emeradic_plate = plate("emeradic");
		enori_gear = gear("enori");
		enori_plate = plate("enori");
		palis_gear = gear("palis");
		palis_plate = plate("palis");
		restonia_gear = gear("restonia");
		restonia_plate = plate("restonia");
		void_gear = gear("void");
		void_plate = plate("void");
		
		empowered_diamatine_gear = gear("empowered_diamatine");
		empowered_diamatine_plate = plate("empowered_diamatine");
		empowered_emeradic_gear = gear("empowered_emeradic");
		empowered_emeradic_plate = plate("empowered_emeradic");
		empowered_enori_gear = gear("empowered_enori");
		empowered_enori_plate = plate("empowered_enori");
		empowered_palis_gear = gear("empowered_palis");
		empowered_palis_plate = plate("empowered_palis");
		empowered_restonia_gear = gear("empowered_restonia");
		empowered_restonia_plate = plate("empowered_restonia");
		empowered_void_gear = gear("empowered_void");
		empowered_void_plate = plate("empowered_void");
		
		reg(BLACK_QUARTZ, black_quartz_gear, black_quartz_plate);
		reg(DIAMATINE, diamatine_gear, diamatine_plate);
		reg(EMERADIC, emeradic_gear, emeradic_plate);
		reg(ENORI, enori_gear, enori_plate);
		reg(PALIS, palis_gear, palis_plate);
		reg(RESTONIA, restonia_gear, restonia_plate);
		reg(VOID, void_gear, void_plate);
		
		reg(EMPOWERED_DIAMATINE, empowered_diamatine_gear, empowered_diamatine_plate);
		reg(EMPOWERED_EMERADIC, empowered_emeradic_gear, empowered_emeradic_plate);
		reg(EMPOWERED_ENORI, empowered_enori_gear, empowered_enori_plate);
		reg(EMPOWERED_PALIS, empowered_palis_gear, empowered_palis_plate);
		reg(EMPOWERED_RESTONIA, empowered_restonia_gear, empowered_restonia_plate);
		reg(EMPOWERED_VOID, empowered_void_gear, empowered_void_plate);
	}
	
	public void postInit() {
		addEmpowerer(EMPOWERED_DIAMATINE, DIAMATINE, DYE_LIGHT_BLUE, new ItemStack(Items.CLAY_BALL), new ItemStack(Items.CLAY_BALL), new ItemStack(Blocks.CLAY));
		List<ItemStack> balls = OreDictionary.getOres("slimeball");
		for (ItemStack ball : balls)
			addEmpowerer(EMPOWERED_EMERADIC, EMERADIC, DYE_LIME, new ItemStack(Blocks.TALLGRASS, 1, 1), new ItemStack(Blocks.SAPLING), ball.copy());
		addEmpowerer(EMPOWERED_ENORI, ENORI, DYE_GRAY, new ItemStack(Items.SNOWBALL), new ItemStack(Blocks.STONE_BUTTON), new ItemStack(Blocks.COBBLESTONE));
		addEmpowerer(EMPOWERED_PALIS, PALIS, DYE_CYAN, new ItemStack(Items.PRISMARINE_SHARD), new ItemStack(Items.PRISMARINE_SHARD), new ItemStack(Items.PRISMARINE_SHARD));
		addEmpowerer(EMPOWERED_RESTONIA, RESTONIA, DYE_RED, new ItemStack(Items.NETHERBRICK), new ItemStack(Items.REDSTONE), new ItemStack(Items.BRICK));
		addEmpowerer(EMPOWERED_VOID, VOID, DYE_BLACK, new ItemStack(Items.COAL, 1, 1), new ItemStack(Items.FLINT), new ItemStack(Blocks.STONE));
		
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