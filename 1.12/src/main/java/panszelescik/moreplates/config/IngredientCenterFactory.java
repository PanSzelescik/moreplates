package panszelescik.moreplates.config;

import static panszelescik.moreplates.config.Config.*;

import com.google.gson.JsonObject;

import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.IIngredientFactory;
import net.minecraftforge.common.crafting.JsonContext;
import panszelescik.moreplates.helpers.BigOreIngredient;

public class IngredientCenterFactory implements IIngredientFactory {
	
	@Override
	public Ingredient parse(JsonContext context, JsonObject json) {
		return new BigOreIngredient(getOres());
	}
	
	private static String[] getOres() {
		return getStrings("Center items in recipes", CATEGORY_GENERAL, new String[] {"ingotIron", "ingotCopper", "ingotTin", "ingotBronze", "ingotConstructionAlloy"}, "Write here OreDict names of items to be center in recipes for Gears");
	}
}