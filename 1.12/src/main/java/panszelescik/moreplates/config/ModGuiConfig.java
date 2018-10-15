package panszelescik.moreplates.config;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.helpers.Strings;

public class ModGuiConfig extends GuiConfig {
	
	public ModGuiConfig(GuiScreen guiScreen) {
		super(
        	guiScreen,
        	getConfigElements(),
        	MorePlates.MODID,
        	false,
        	true,
        	Strings.CONFIG_TITLE
			);
	}
	
	private static List<IConfigElement> getConfigElements() {
		List<IConfigElement> list = new ArrayList<>();		
		for (String category : Config.CATEGORIES) {
			Config.cfg.setCategoryLanguageKey(category, "config.moreplates.category." + category);
			list.add(new ConfigElement(Config.cfg.getCategory(category)));
		}
		ConfigItems.cfg.setCategoryLanguageKey(ConfigItems.CATEGORY_ITEMS, "config.moreplates.category." + ConfigItems.CATEGORY_ITEMS);
		list.add(new ConfigElement(ConfigItems.cfg.getCategory(ConfigItems.CATEGORY_ITEMS)));
		return list;
	}
}