package panszelescik.moreplates;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import panszelescik.moreplates.config.Config;
import panszelescik.moreplates.config.ConfigItems;
import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Items;
import panszelescik.moreplates.init.PluginLoader;

@Mod(modid = MorePlates.MODID, name = "More Plates", version = "@version@", dependencies = MorePlates.DEPENDENCIES, guiFactory = "panszelescik.moreplates.config.ModGuiFactory", acceptedMinecraftVersions = "[1.12.2,1.13)", updateJSON = "https://raw.githubusercontent.com/PanSzelescik/moreplates/master/update.json")
public class MorePlates {

    public static final String MODID = "moreplates";

    public static final CreativeTabs TAB = new CreativeTabs(MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.hammer);
        }
    };

    public Config config;
    public static final Logger logger = LogManager.getFormatterLogger(MODID);

    @Mod.EventHandler
    public void construction(FMLConstructionEvent e) {
        config = new Config();
        new ConfigItems();
        saveConfig();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        PluginLoader.addPlugins(e.getAsmData());
        PluginLoader.preInitPlugin();
        saveConfig();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        PluginLoader.postInitPlugin();
        PluginHelper.printAmount();
        saveConfig();
    }

    private void saveConfig() {
        if (Config.getCfg().hasChanged())
            Config.getCfg().save();
        if (ConfigItems.getCfg().hasChanged())
            ConfigItems.getCfg().save();
    }

    static final String DEPENDENCIES =
            "required-after:morelibs@[1.2.0,);"
                    + "after:actuallyadditions@[1.12.2-r144,);"
                    + "after:appliedenergistics2;"
                    + "after:avaritia;"
                    + "after:botania;"
                    + "after:calculator;"
                    + "after:draconicevolution;"
                    + "after:enderio@[5.0.39,);"
                    + "after:extrautils2;"
                    + "after:immersiveengineering;"
                    + "after:ic2;"
                    + "after:mekanism;"
                    + "after:mysticalagradditions;"
                    + "after:mysticalagriculture;"
                    + "after:plustic;"
                    + "after:pneumaticcraft;"
                    + "after:projecte;"
                    + "after:projectred-core;"
                    + "after:refinedstorage;"
                    + "after:soulshardstow;"
                    + "after:techreborn;"
                    + "after:thaumcraft;"
                    + "after:thermalexpansion;"
                    + "after:tconstruct;"
                    + "after:twilightforest";
}