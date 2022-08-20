package pl.panszelescik.moreplates.common;

import it.unimi.dsi.fastutil.Pair;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Locale;
import java.util.function.Supplier;
import java.util.stream.Stream;

public enum MaterialType {

    WOOD(ResourceLocation.DEFAULT_NAMESPACE, ItemTags.PLANKS.location()),
    STONE(ResourceLocation.DEFAULT_NAMESPACE, ItemTags.STONE_CRAFTING_MATERIALS.location()),
    ;

    private final String modId;
    private final @Nullable ResourceLocation tag;

    // Creates Material with different Tags depends on Platform
    MaterialType(String modId, @Nullable ResourceLocation forgeTag, @Nullable ResourceLocation fabricTag) {
        this.modId = modId;
        this.tag = MorePlates.INTEGRATIONS.getPlatform().isForge() ? forgeTag : fabricTag;
    }

    // Creates Material with given Tag only on given Platform
    MaterialType(String modId, ResourceLocation tag, Platform platform) {
        this(
                modId,
                platform.equals(Platform.FORGE) ? tag : null,
                platform.equals(Platform.FABRIC) ? tag : null
        );
    }

    // Creates Material with Ingredient with the same Tag in Forge and Fabric
    MaterialType(String modId, ResourceLocation tag) {
        this(modId, tag, tag);
    }

    public String getName() {
        return this.name().toLowerCase(Locale.ROOT);
    }

    public String getNiceName() {
        var name = this.getName();
        return name.substring(0, 1).toUpperCase(Locale.ROOT) + name.substring(1);
    }

    public String getModId() {
        return this.modId;
    }

    public String getRegistryName(ItemType type) {
        return this.getName() + "_" + type.getName();
    }

    public ResourceLocation getResourceLocation(ItemType type) {
        return new ResourceLocation(MorePlates.MODID, this.getRegistryName(type));
    }

    public @Nullable ResourceLocation getTag() {
        return this.tag;
    }

    public boolean isMaterialEnabled() {
        return this.getTag() != null && MorePlates.INTEGRATIONS.isModEnabled(this.getModId());
    }

    public boolean isItemEnabled(ItemType type) {
        return this.isMaterialEnabled() && MorePlates.INTEGRATIONS.isItemEnabled(this, type);
    }

    private Pair<ResourceLocation, Supplier<Item>> getMaterialItem(ItemType type) {
        return Pair.of(this.getResourceLocation(type), () -> new Item(new Item.Properties().tab(MorePlates.INTEGRATIONS.getCreativeTab())));
    }

    private Stream<Pair<ResourceLocation, Supplier<Item>>> getMaterialItems() {
        return Arrays.stream(ItemType.values())
                .filter(this::isItemEnabled)
                .map(this::getMaterialItem);
    }

    public static Stream<Pair<ResourceLocation, Supplier<Item>>> getItemsToRegister() {
        return Arrays.stream(MaterialType.values())
                .flatMap(MaterialType::getMaterialItems);
    }
}
