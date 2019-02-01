package panszelescik.moreplates.plugins;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.helpers.BotaniaHelper;
import panszelescik.moreplates.helpers.ItemInfo;
import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;
import vazkii.botania.common.item.ModItems;

import static panszelescik.moreplates.helpers.ItemInfo.*;

@Plugin(modid = PluginBotania.MODID, modname = PluginBotania.MODNAME)
public class PluginBotania extends PluginHelper {

    public static final String MODID = "botania";
    public static final String MODNAME = "Botania";

    @Plugin.PreInit
    public static void preInit() {
        OreDictionary.registerOre("ingotGaia", new ItemStack(ModItems.manaResource, 1, 14));
        MorePlates.logger.warn("This is not an error! I only registering this for easier adding recipes. Please ignore it.");
        reg(ELEMENTIUM);
        reg(GAIA_SPIRIT);
        reg(MANASTEEL);
        reg(TERRASTEEL);
    }

    @Plugin.PostInit
    public static void postInit() {
        addElvenTrade(ELEMENTIUM, MANASTEEL);
        addManaInfusion(MANASTEEL, IRON);

        add(ELEMENTIUM);
        add(GAIA_SPIRIT);
        add(MANASTEEL);
        add(TERRASTEEL);

        String name = "storage";
        addBlock(ELEMENTIUM, name, 9, MODID, 2);
        addBlock(MANASTEEL, name, 9, MODID, 0);
        addBlock(TERRASTEEL, name, 9, MODID, 1);

        MorePlates.logger.info("Added " + BotaniaHelper.ElvenTradeRecipes + " recipes to Elven Trade");
        MorePlates.logger.info("Added " + BotaniaHelper.ManaInfusionRecipes + " Mana Infusion recipes");
    }

    private static void addManaInfusion(ItemInfo output, ItemInfo input) {
        BotaniaHelper.addManaInfusion(output.getOre(), input.getOre());
    }

    private static void addElvenTrade(ItemInfo output, ItemInfo input) {
        BotaniaHelper.addElvenTrade(output.getOre(), input.getOre());
    }
}