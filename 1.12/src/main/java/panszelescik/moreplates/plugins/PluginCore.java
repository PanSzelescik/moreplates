package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.oredict.OreDictionary;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.helpers.IInit;
import panszelescik.moreplates.items.ItemGear;
import panszelescik.moreplates.items.ItemPlate;

public abstract class PluginCore extends Helper implements IInit {
	
	protected final String modid;
	protected final String modname;
	protected static boolean enable;
	protected boolean error;
	
	public PluginCore(String modid, String modname) {
		this.modid = modid;
		this.modname = modname;
	}
	
	@Override
	public abstract boolean preInitPlugin();

	@Override
	public abstract boolean initPlugin();
	
	public static boolean isEnabled() {
		return enable;
	}
	
	protected Item gear(String name) {
		return new ItemGear(name);
	}
	
	protected Item plate(String name) {
		return new ItemPlate(name);
	}
	
	protected ItemStack getItemStack(String name, int amount, int meta) {
		Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(modid + ":" + name));
		return item != null ? new ItemStack(item, amount, meta) : ItemStack.EMPTY;
	}
		
	protected ItemStack getItemStack(String name, int amount) {
		return getItemStack(name, amount, 0);
	}
	
	protected ItemStack getItemStack(String name) {
		return getItemStack(name, 1, 0);
	}
	
	protected String getItemNameFromItemStack(String name, int amount, int meta) {
		return getItemName(getItemStack(name, amount, meta));
	}
	
	protected String getItemNameFromItemStack(String name, int amount) {
		return getItemName(getItemStack(name, amount, 0));
	}
	
	protected String getItemNameFromItemStack(String name) {
		return getItemName(getItemStack(name, 1, 0));
	}
}