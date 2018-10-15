package panszelescik.moreplates.config;

import static panszelescik.moreplates.config.Config.*;

import com.google.gson.JsonObject;

import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.IIngredientFactory;
import net.minecraftforge.common.crafting.JsonContext;
import panszelescik.morelibs.api.MultiOreIngredient;

public class IngredientCenterFactory implements IIngredientFactory {
	
	private static final String[] defaultNames = {"ingotIron", "ingotCopper", "ingotTin", "ingotBronze", "ingotConstructionAlloy"};
	
	@Override
	public Ingredient parse(JsonContext context, JsonObject json) {
		return new MultiOreIngredient(getStrings("Center items in recipes", CATEGORY_GENERAL, defaultNames, "Write here OreDict names of items to be center in recipes for Gears"));
	}
}