package panszelescik.moreplates.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import panszelescik.moreplates.MorePlates;

public class ItemGear extends BaseItem {

    public ItemGear(String name) {
        super(name + "_gear");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(MorePlates.MODID + ":gear", "type=" + getRegistryName().toString().substring(11)));
    }
}