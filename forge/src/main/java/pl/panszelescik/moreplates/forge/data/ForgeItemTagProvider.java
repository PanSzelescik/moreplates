package pl.panszelescik.moreplates.forge.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import pl.panszelescik.moreplates.common.MorePlates;

public class ForgeItemTagProvider extends ItemTagsProvider {

    public ForgeItemTagProvider(DataGenerator arg, BlockTagsProvider arg2, @Nullable ExistingFileHelper existingFileHelper) {
        super(arg, arg2, MorePlates.MODID, existingFileHelper);
    }

    @Override
    protected void addTags() {

    }
}
