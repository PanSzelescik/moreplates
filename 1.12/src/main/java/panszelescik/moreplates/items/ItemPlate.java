package panszelescik.moreplates.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import panszelescik.moreplates.MorePlates;

public class ItemPlate extends BaseItem {

    public ItemPlate(String name) {
        super(name + "_plate");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(MorePlates.MODID + ":plate", "type=" + getRegistryName().toString().substring(11)));
    }
}