package panszelescik.moreplates.items;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import panszelescik.moreplates.helpers.IModelRegister;

import static panszelescik.moreplates.MorePlates.*;
import static panszelescik.moreplates.Reference.*;

public class ItemBase extends Item implements IModelRegister {
	
	public ItemBase() {
		setCreativeTab(TAB);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(new ResourceLocation(MODID, this.getTranslationKey().substring(5)), "inventory"));
	}
	
}