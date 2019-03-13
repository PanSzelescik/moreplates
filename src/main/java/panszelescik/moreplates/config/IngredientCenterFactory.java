package panszelescik.moreplates.config;

import com.google.gson.JsonObject;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.IIngredientFactory;
import net.minecraftforge.common.crafting.JsonContext;
import panszelescik.morelibs.api.MultiOreIngredient;

import javax.annotation.Nonnull;

public class IngredientCenterFactory implements IIngredientFactory {

    private static final String[] defaultNames = {"ingotIron", "ingotCopper", "ingotTin", "ingotBronze", "ingotConstructionAlloy"};

    @Nonnull
    @Override
    public Ingredient parse(JsonContext context, JsonObject json) {
        return new MultiOreIngredient(Config.getStrings("Center items in recipes", Config.CATEGORY_GENERAL, defaultNames, "Write here OreDict names of items to be center in recipes for Gears"));
    }
}