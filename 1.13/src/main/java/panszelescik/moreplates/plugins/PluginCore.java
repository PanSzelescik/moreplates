package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.helpers.IInit;
import panszelescik.moreplates.items.*;

public abstract class PluginCore extends Helper implements IInit {
	
	protected final String modid;
	protected final String modname;
	protected boolean enable;
	protected boolean error;
	
	public PluginCore(String modid, String modname) {
		this.modid = modid;
		this.modname = modname;
	}
	
	@Override
	public abstract boolean preInitPlugin();

	@Override
	public abstract boolean initPlugin();
	
	protected Item gear(String name) {
		return new ItemGear(name);
	}
	
	protected Item plate(String name) {
		return new ItemPlate(name);
	}
}