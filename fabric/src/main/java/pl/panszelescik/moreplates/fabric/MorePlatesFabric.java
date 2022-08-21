package pl.panszelescik.moreplates.fabric;

import it.unimi.dsi.fastutil.Pair;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import pl.panszelescik.moreplates.common.MorePlates;
import pl.panszelescik.moreplates.common.MaterialType;

import java.util.function.Supplier;

public class MorePlatesFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        MorePlates.INTEGRATIONS = new FabricIntegrations();

        try {
            MorePlatesFabricConfig.loadConfig(FabricLoader.getInstance().getConfigDir().toFile());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        MaterialType.getItemsToRegister().forEach(this::registerItem);
    }

    private void registerItem(Pair<ResourceLocation, Supplier<Item>> pair) {
        Registry.register(Registry.ITEM, pair.left(), pair.right().get());
    }
}