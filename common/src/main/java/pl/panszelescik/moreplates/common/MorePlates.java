package pl.panszelescik.moreplates.common;

import it.unimi.dsi.fastutil.Pair;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class MorePlates {

    public static final String MODID = "moreplates";
    public static final String ENABLED_ITEMS_PATH = "enabledItems";
    public static Integrations INTEGRATIONS;

    public static Stream<Pair<ResourceLocation, Supplier<Item>>> getItemsToRegister() {
        return /*Stream.concat(
                Stream.of(),*/ // TODO: Hammer Item
                MaterialType.getItemsToRegister()
        /*)*/;
    }
}