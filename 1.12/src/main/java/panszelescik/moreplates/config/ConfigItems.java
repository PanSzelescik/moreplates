package panszelescik.moreplates.config;

import static panszelescik.moreplates.MorePlates.*;

import net.minecraft.item.Item;
import panszelescik.morelibs.config.ConfigBase;

public class ConfigItems extends ConfigBase {
	
	public static final String CATEGORY_ITEMS = "items";
	
	public ConfigItems() {
		super(MODID + "/items", MODID);
	}
	
	@Override
	public void loadConfig() {
		getCfg().addCustomCategoryComment(CATEGORY_ITEMS, "Loading items settings");
		
		super.loadConfig();
	}
	
	public static boolean loadItem(Item item) {
		return getCfg().get(CATEGORY_ITEMS, item.getRegistryName().toString().substring(11), true).getBoolean();
	}
}