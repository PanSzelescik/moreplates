package panszelescik.moreplates.items;

import static panszelescik.moreplates.MorePlates.*;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import panszelescik.morelibs.api.ItemBase;

public class ItemStick extends ItemBase {
	
	public ItemStick(String name) {
		super(TAB);
		name += "_stick";
		setTranslationKey(MODID + "." + name);
		setRegistryName(new ResourceLocation(MODID, name));
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(MODID + ":stick", "type=" + getRegistryName().toString().substring(11)));
	}
}