package pl.panszelescik.moreplates.fabric;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import pl.panszelescik.moreplates.common.*;

public class FabricIntegrations implements Integrations {

    private final CreativeModeTab creativeTab;

    public FabricIntegrations() {
        this.creativeTab = FabricItemGroupBuilder
                .create(new ResourceLocation(MorePlates.MODID, "tab"))
                .icon(() -> new ItemStack(Registry.ITEM.get(new ResourceLocation(MorePlates.MODID, MaterialType.WOOD.getRegistryName(ItemType.PLATE)))))
                .build();
    }

    @Override
    public Platform getPlatform() {
        return Platform.FABRIC;
    }

    @Override
    public boolean isModEnabled(String modId) {
        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public CreativeModeTab getCreativeTab() {
        return this.creativeTab;
    }

    @Override
    public boolean isItemEnabled(String key) {
        return true; //TODO config
    }
}
