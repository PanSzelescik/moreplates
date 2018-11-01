package panszelescik.moreplates.config;

import net.minecraft.client.gui.GuiScreen;
import panszelescik.morelibs.config.ModGuiFactoryBase;

public class ModGuiFactory extends ModGuiFactoryBase {
	
	@Override
	public GuiScreen createConfigGui(GuiScreen parentScreen) {
		return new ModGuiConfig(parentScreen);
	}
}