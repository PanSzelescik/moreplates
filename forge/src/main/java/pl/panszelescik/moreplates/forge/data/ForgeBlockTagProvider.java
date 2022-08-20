package pl.panszelescik.moreplates.forge.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import pl.panszelescik.moreplates.common.MorePlates;

public class ForgeBlockTagProvider extends BlockTagsProvider {

    public ForgeBlockTagProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, MorePlates.MODID, helper);
    }

    @Override
    protected void addTags() {

    }
}
