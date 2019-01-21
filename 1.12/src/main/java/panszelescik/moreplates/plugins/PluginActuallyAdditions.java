package panszelescik.moreplates.plugins;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.helpers.ActuallyAdditionsHelper;
import panszelescik.moreplates.helpers.PluginHelper;
import panszelescik.moreplates.init.Plugin;

@Plugin(modid = PluginActuallyAdditions.MODID, modname = PluginActuallyAdditions.MODNAME)
public class PluginActuallyAdditions extends PluginHelper {

    public static final String MODID = "actuallyadditions";
    public static final String MODNAME = "Actually Additions";

    @Plugin.PreInit
    public static void preInit() {
        reg(BLACK_QUARTZ, "black_quartz");
        reg(DIAMATINE, "diamatine");
        reg(EMERADIC, "emeradic");
        reg(ENORI, "enori");
        reg(PALIS, "palis");
        reg(RESTONIA, "restonia");
        reg(VOID, "void");

        reg(EMPOWERED_DIAMATINE, "empowered_diamatine");
        reg(EMPOWERED_EMERADIC, "empowered_emeradic");
        reg(EMPOWERED_ENORI, "empowered_enori");
        reg(EMPOWERED_PALIS, "empowered_palis");
        reg(EMPOWERED_RESTONIA, "empowered_restonia");
        reg(EMPOWERED_VOID, "empowered_void");
    }

    @Plugin.PostInit
    public static void postInit() {
        addEmpowerer(EMPOWERED_DIAMATINE, DIAMATINE, DYE_LIGHT_BLUE, get(Items.CLAY_BALL), get(Items.CLAY_BALL), get(Blocks.CLAY));
        for (ItemStack ball : OreDictionary.getOres("slimeball"))
            addEmpowerer(EMPOWERED_EMERADIC, EMERADIC, DYE_LIME, get(Blocks.TALLGRASS, 1), get(Blocks.SAPLING), ball.copy());
        addEmpowerer(EMPOWERED_ENORI, ENORI, DYE_GRAY, get(Items.SNOWBALL), get(Blocks.STONE_BUTTON), get(Blocks.COBBLESTONE));
        addEmpowerer(EMPOWERED_PALIS, PALIS, DYE_CYAN, get(Items.PRISMARINE_SHARD), get(Items.PRISMARINE_SHARD), get(Items.PRISMARINE_SHARD));
        addEmpowerer(EMPOWERED_RESTONIA, RESTONIA, DYE_RED, get(Items.NETHERBRICK), get(Items.REDSTONE), get(Items.BRICK));
        addEmpowerer(EMPOWERED_VOID, VOID, DYE_BLACK, get(Items.COAL, 1), get(Items.FLINT), get(Blocks.STONE));

        addReconstructor(DIAMATINE, DIAMOND, 60);
        addReconstructor(EMERADIC, EMERALD, 100);
        addReconstructor(ENORI, IRON, 80);
        addReconstructor(PALIS, LAPIS, 40);
        addReconstructor(RESTONIA, REDSTONE, 40);
        addReconstructor(VOID, COAL, 60);

        add(BLACK_QUARTZ, GEM + BLACK_QUARTZ);
        add(DIAMATINE, CRYSTAL_NAME, MODID, DIAMATINE_META);
        add(EMERADIC, CRYSTAL_NAME, MODID, EMERADIC_META);
        add(ENORI, CRYSTAL_NAME, MODID, ENORI_META);
        add(PALIS, CRYSTAL_NAME, MODID, PALIS_META);
        add(RESTONIA, CRYSTAL_NAME, MODID, RESTONIA_META);
        add(VOID, CRYSTAL_NAME, MODID, VOID_META);

        add(EMPOWERED_DIAMATINE, EMPOWERED_CRYSTAL_NAME, MODID, DIAMATINE_META);
        add(EMPOWERED_EMERADIC, EMPOWERED_CRYSTAL_NAME, MODID, EMERADIC_META);
        add(EMPOWERED_ENORI, EMPOWERED_CRYSTAL_NAME, MODID, ENORI_META);
        add(EMPOWERED_PALIS, EMPOWERED_CRYSTAL_NAME, MODID, PALIS_META);
        add(EMPOWERED_RESTONIA, EMPOWERED_CRYSTAL_NAME, MODID, RESTONIA_META);
        add(EMPOWERED_VOID, EMPOWERED_CRYSTAL_NAME, MODID, VOID_META);

        addBlock(BLACK_QUARTZ, BLACK_QUARTZ_BLOCK_NAME, 4, MODID, 2);
        addBlock(DIAMATINE, CRYSTAL_BLOCK_NAME, 9, MODID, DIAMATINE_META);
        addBlock(EMERADIC, CRYSTAL_BLOCK_NAME, 9, MODID, EMERADIC_META);
        addBlock(ENORI, CRYSTAL_BLOCK_NAME, 9, MODID, ENORI_META);
        addBlock(PALIS, CRYSTAL_BLOCK_NAME, 9, MODID, PALIS_META);
        addBlock(RESTONIA, CRYSTAL_BLOCK_NAME, 9, MODID, RESTONIA_META);
        addBlock(VOID, CRYSTAL_BLOCK_NAME, 9, MODID, VOID_META);

        addBlock(EMPOWERED_DIAMATINE, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, MODID, DIAMATINE_META);
        addBlock(EMPOWERED_EMERADIC, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, MODID, EMERADIC_META);
        addBlock(EMPOWERED_ENORI, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, MODID, ENORI_META);
        addBlock(EMPOWERED_PALIS, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, MODID, PALIS_META);
        addBlock(EMPOWERED_RESTONIA, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, MODID, RESTONIA_META);
        addBlock(EMPOWERED_VOID, EMPOWERED_CRYSTAL_BLOCK_NAME, 9, MODID, VOID_META);

        MorePlates.logger.info("Added " + ActuallyAdditionsHelper.AtomicReconstructorRecipes + " recipes to Atomic Reconstructor");
        MorePlates.logger.info("Added " + ActuallyAdditionsHelper.EmpowererRecipes + " recipes to Empowerer");
    }

    private static void addEmpowerer(String output, String input, String dye, ItemStack modifier2, ItemStack modifier3, ItemStack modifier4) {
        ActuallyAdditionsHelper.addEmpowerer(output, input, dye, modifier2, modifier3, modifier4);
    }

    private static void addReconstructor(String output, String input, int energy) {
        ActuallyAdditionsHelper.addReconstructor(output, input, energy);
    }
}