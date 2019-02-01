package panszelescik.moreplates.plugins;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.plugins.helpers.ActuallyAdditionsHelper;
import panszelescik.moreplates.plugins.core.ItemInfo;
import panszelescik.moreplates.plugins.helpers.PluginHelper;
import panszelescik.moreplates.plugins.core.Plugin;

import static panszelescik.moreplates.plugins.core.ItemInfo.*;

@Plugin(modid = PluginActuallyAdditions.MODID, modname = PluginActuallyAdditions.MODNAME)
public class PluginActuallyAdditions extends PluginHelper {

    public static final String MODID = "actuallyadditions";
    public static final String MODNAME = "Actually Additions";

    @Plugin.PreInit
    public static void preInit() {
        reg(BLACK_QUARTZ);
        reg(DIAMATINE);
        reg(EMERADIC);
        reg(ENORI);
        reg(PALIS);
        reg(RESTONIA);
        reg(VOID);

        reg(EMPOWERED_DIAMATINE);
        reg(EMPOWERED_EMERADIC);
        reg(EMPOWERED_ENORI);
        reg(EMPOWERED_PALIS);
        reg(EMPOWERED_RESTONIA);
        reg(EMPOWERED_VOID);
    }

    @Plugin.PostInit
    public static void postInit() {
        addEmpowerer(EMPOWERED_DIAMATINE, DIAMATINE, "dyeLightBlue", get(Items.CLAY_BALL), get(Items.CLAY_BALL), get(Blocks.CLAY));
        for (ItemStack ball : OreDictionary.getOres("slimeball"))
            addEmpowerer(EMPOWERED_EMERADIC, EMERADIC, "dyeLime", get(Blocks.TALLGRASS, 1), get(Blocks.SAPLING), ball.copy());
        addEmpowerer(EMPOWERED_ENORI, ENORI, "dyeGray", get(Items.SNOWBALL), get(Blocks.STONE_BUTTON), get(Blocks.COBBLESTONE));
        addEmpowerer(EMPOWERED_PALIS, PALIS, "dyeCyan", get(Items.PRISMARINE_SHARD), get(Items.PRISMARINE_SHARD), get(Items.PRISMARINE_SHARD));
        addEmpowerer(EMPOWERED_RESTONIA, RESTONIA, "dyeRed", get(Items.NETHERBRICK), get(Items.REDSTONE), get(Items.BRICK));
        addEmpowerer(EMPOWERED_VOID, VOID, "dyeBlack", get(Items.COAL, 1), get(Items.FLINT), get(Blocks.STONE));

        addReconstructor(DIAMATINE, DIAMOND, 60);
        addReconstructor(EMERADIC, EMERALD, 100);
        addReconstructor(ENORI, IRON, 80);
        addReconstructor(PALIS, LAPIS_LAZULI, 40);
        addReconstructor(RESTONIA, REDSTONE, 40);
        addReconstructor(VOID, COAL, 60);

        String name = "item_crystal";
        add(BLACK_QUARTZ);
        add(DIAMATINE, name, MODID, 2);
        add(EMERADIC, name, MODID, 4);
        add(ENORI, name, MODID, 5);
        add(PALIS, name, MODID, 1);
        add(RESTONIA, name, MODID, 0);
        add(VOID, name, MODID, 3);

        name = "item_crystal_empowered";
        add(EMPOWERED_DIAMATINE, name, MODID, 2);
        add(EMPOWERED_EMERADIC, name, MODID, 4);
        add(EMPOWERED_ENORI, name, MODID, 5);
        add(EMPOWERED_PALIS, name, MODID, 1);
        add(EMPOWERED_RESTONIA, name, MODID, 0);
        add(EMPOWERED_VOID, name, MODID, 3);

        name = "block_crystal";
        addBlock(BLACK_QUARTZ, "block_misc", 4, MODID, 2);
        addBlock(DIAMATINE, name, 9, MODID, 2);
        addBlock(EMERADIC, name, 9, MODID, 4);
        addBlock(ENORI, name, 9, MODID, 5);
        addBlock(PALIS, name, 9, MODID, 1);
        addBlock(RESTONIA, name, 9, MODID, 0);
        addBlock(VOID, name, 9, MODID, 3);

        name = "block_crystal_empowered";
        addBlock(EMPOWERED_DIAMATINE, name, 9, MODID, 2);
        addBlock(EMPOWERED_EMERADIC, name, 9, MODID, 4);
        addBlock(EMPOWERED_ENORI, name, 9, MODID, 5);
        addBlock(EMPOWERED_PALIS, name, 9, MODID, 1);
        addBlock(EMPOWERED_RESTONIA, name, 9, MODID, 0);
        addBlock(EMPOWERED_VOID, name, 9, MODID, 3);

        MorePlates.logger.info("Added " + ActuallyAdditionsHelper.AtomicReconstructorRecipes + " recipes to Atomic Reconstructor");
        MorePlates.logger.info("Added " + ActuallyAdditionsHelper.EmpowererRecipes + " recipes to Empowerer");
    }

    private static void addEmpowerer(ItemInfo output, ItemInfo input, String dye, ItemStack modifier2, ItemStack modifier3, ItemStack modifier4) {
        ActuallyAdditionsHelper.addEmpowerer(output.getOre(), input.getOre(), dye, modifier2, modifier3, modifier4);
    }

    private static void addReconstructor(ItemInfo output, ItemInfo input, int energy) {
        ActuallyAdditionsHelper.addReconstructor(output.getOre(), input.getOre(), energy);
    }
}