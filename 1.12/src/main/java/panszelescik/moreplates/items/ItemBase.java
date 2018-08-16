package panszelescik.moreplates.items;

import static panszelescik.moreplates.MorePlates.*;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import panszelescik.moreplates.helpers.IModelRegister;

public class ItemBase extends Item implements IModelRegister {
	
	public ItemBase() {
		setCreativeTab(TAB);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
}