package panszelescik.moreplates;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import panszelescik.moreplates.config.BaseConfig;
import panszelescik.moreplates.config.ConfigOptionConditionFactory;
import panszelescik.moreplates.plugins.core.PluginLoader;

@Mod(MorePlates.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MorePlates {

    public static final String MODID = "moreplates";
    public static final Logger logger = LogManager.getFormatterLogger(MODID);

    public MorePlates() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, BaseConfig.SERVER_CONFIG);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        BaseConfig.loadConfig(BaseConfig.SERVER_CONFIG, FMLPaths.CONFIGDIR.get().resolve("moreplates.toml"));
    }

    public static final ItemGroup TAB = new ItemGroup(MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.hammer);
        }
    };

    private void setup(final FMLCommonSetupEvent e) {
        CraftingHelper.register(new ResourceLocation(MorePlates.MODID, "option_enabled"), new ConfigOptionConditionFactory());
    }

    /*
     * Because RegistryEvent is fired before FMLCommonSetupEvent
     */
    @SubscribeEvent
    public static void onItemRegistry(RegistryEvent.Register<Item> e) {
        PluginLoader.addPlugins();
        PluginLoader.preInitPlugin();
        ModItems.register(e.getRegistry());
    }
}