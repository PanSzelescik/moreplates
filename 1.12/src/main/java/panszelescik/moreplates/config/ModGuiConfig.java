package panszelescik.moreplates.config;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.IConfigElement;
import panszelescik.morelibs.config.ModGuiConfigBase;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.helpers.Strings;

import java.util.ArrayList;
import java.util.List;

public class ModGuiConfig extends ModGuiConfigBase {

    ModGuiConfig(GuiScreen guiScreen) {
        super(guiScreen, getConfigElements(), MorePlates.MODID, Strings.CONFIG_TITLE);
    }

    private static List<IConfigElement> getConfigElements() {
        List<IConfigElement> list = new ArrayList<>();
        for (String category : Config.CATEGORIES) {
            Config.getCfg().setCategoryLanguageKey(category, "config.moreplates.category." + category);
            list.add(new ConfigElement(Config.getCfg().getCategory(category)));
        }
        ConfigItems.getCfg().setCategoryLanguageKey(ConfigItems.CATEGORY_ITEMS, "config.moreplates.category." + ConfigItems.CATEGORY_ITEMS);
        list.add(new ConfigElement(ConfigItems.getCfg().getCategory(ConfigItems.CATEGORY_ITEMS)));
        return list;
    }
}