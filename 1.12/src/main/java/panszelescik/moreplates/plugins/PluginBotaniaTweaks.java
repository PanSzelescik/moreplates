package panszelescik.moreplates.plugins;

import com.google.common.collect.ImmutableList;
import net.minecraft.init.Blocks;
import quaternary.botaniatweaks.recipe.AgglomerationRecipe;
import vazkii.botania.common.block.ModBlocks;
import vazkii.botania.common.item.ModItems;

import java.util.ArrayList;

import static panszelescik.moreplates.helpers.Helper.*;

public class PluginBotaniaTweaks {
	
	public static ArrayList<AgglomerationRecipe> recipes = new ArrayList<>();
	
	public static AgglomerationRecipe recipe;
	
	public static void postInit() {
		recipe = new AgglomerationRecipe(ImmutableList.of("gemDiamond", "plateManasteel", "ingotGold"), getOre("plateTerrasteel"), 500_000, 0x0000FF, 0x00FF00, ModBlocks.livingrock.getDefaultState(), Blocks.LAPIS_BLOCK.getDefaultState(), ModBlocks.livingrock.getDefaultState(), null, null, null);
		recipes.add(recipe);
	}
	
	private static void add() {
		//new AgglomerationRecipe(ImmutableList.of(), getOre(PLATE + inputOre), 500_000, 0x0000FF, 0x00FF00, arg5, arg6, arg7, arg8, arg9, arg10);
	}
}