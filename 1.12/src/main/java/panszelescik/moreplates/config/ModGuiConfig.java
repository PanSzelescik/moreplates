package panszelescik.moreplates.config;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.config.GuiConfig;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.Reference;

public class ModGuiConfig extends GuiConfig {
	
	public ModGuiConfig(GuiScreen guiScreen) {
		super(
        	guiScreen,
        	MorePlates.instance.config.getConfigElements(),
        	Reference.MODID,
        	false,
        	false,
        	GuiConfig.getAbridgedConfigPath(MorePlates.instance.config.getConfig().toString())
			);
		}
}