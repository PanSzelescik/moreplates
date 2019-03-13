package panszelescik.moreplates.config;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.IConfigElement;
import panszelescik.morelibs.api.Helper;
import panszelescik.morelibs.config.ModGuiConfigBase;
import panszelescik.moreplates.MorePlates;

import java.util.ArrayList;
import java.util.List;

public class ModGuiConfig extends ModGuiConfigBase {

    ModGuiConfig(GuiScreen guiScreen) {
        super(guiScreen, getConfigElements(), MorePlates.MODID, Helper.translate("config.moreplates.title"));
    }

    private static List<IConfigElement> getConfigElements() {
        List<IConfigElement> list = new ArrayList<>();
        for (String category : Config.CATEGORIES) {
            Config.getCfg().setCategoryLanguageKey(category, "config.moreplates.category." + category);
            list.add(new ConfigElement(Config.getCfg().getCategory(category)));
        }
        return list;
    }
}