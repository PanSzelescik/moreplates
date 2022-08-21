package pl.panszelescik.moreplates.forge;

import it.unimi.dsi.fastutil.Pair;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import pl.panszelescik.moreplates.common.MorePlates;

import java.util.function.Supplier;

@Mod(MorePlates.MODID)
public class MorePlatesForge {

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MorePlates.MODID);

    public MorePlatesForge() {
        MorePlates.INTEGRATIONS = new ForgeIntegrations();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MorePlatesForgeConfig.SPEC);

        MorePlates.getItemsToRegister().forEach(this::registerItem);
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private void registerItem(Pair<ResourceLocation, Supplier<Item>> pair) {
        ITEMS.register(pair.left().getPath(), pair.right());
    }
}