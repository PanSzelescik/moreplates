package pl.panszelescik.moreplates.forge;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;
import pl.panszelescik.moreplates.common.*;

public class ForgeIntegrations implements Integrations {

    private final CreativeModeTab creativeTab;

    public ForgeIntegrations() {
        this.creativeTab = new CreativeModeTab(MorePlates.MODID) {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(ForgeRegistries.ITEMS.getDelegateOrThrow(new ResourceLocation(MorePlates.MODID, MaterialType.WOOD.getRegistryName(ItemType.PLATE))));
            }
        };
    }

    @Override
    public Platform getPlatform() {
        return Platform.FORGE;
    }

    @Override
    public boolean isModEnabled(String modId) {
        return ModList.get().isLoaded(modId);
    }

    @Override
    public CreativeModeTab getCreativeTab() {
        return this.creativeTab;
    }

    @Override
    public boolean isItemEnabled(String key) {
        var configValue = MorePlatesForgeConfig.CONFIG.get(key);
        if (configValue == null) {
            return false;
        }

        var value = configValue.get();
        if (value instanceof Boolean boolValue) {
            return boolValue;
        }

        return false;
    }
}
