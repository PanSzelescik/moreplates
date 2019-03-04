package panszelescik.moreplates.config;

import com.google.gson.JsonObject;
import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionSerializer;
import panszelescik.morelibs.api.Helper;

import java.util.function.BooleanSupplier;

public class TagExistsConditionFactory implements IConditionSerializer {

    public TagExistsConditionFactory() {
    }

    @Override
    public BooleanSupplier parse(JsonObject json) {
        String tagName = JsonUtils.getString(json, "tag");
        return () -> Helper.tagExists(tagName);
    }
}