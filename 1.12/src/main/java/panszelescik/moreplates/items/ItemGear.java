package panszelescik.moreplates.items;

import static panszelescik.moreplates.MorePlates.*;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemGear extends BaseItem {
	
	public ItemGear(String name) {
		super(name + "_gear");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(MODID + ":gear", "type=" + getRegistryName().toString().substring(11)));
	}
}