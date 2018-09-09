package panszelescik.moreplates.plugins;

import static panszelescik.moreplates.MorePlates.*;

import panszelescik.moreplates.helpers.*;

public class PluginBotania extends PluginBase {
	
	public static final String MODID = "botania";
	public static final String MODNAME = "Botania";
	
	public PluginBotania() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(ELEMENTIUM, "elementium");
		regGaia(GAIA_SPIRIT, "gaia_spirit");
		reg(MANASTEEL, "manasteel");
		reg(TERRASTEEL, "terrasteel");
	}
	
	public void postInit() {
		addElvenTrade(ELEMENTIUM, MANASTEEL);
		addManaInfusion(MANASTEEL, IRON);
		
		logger.info("Added " + BotaniaHelper.ElvenTradeRecipes + " recipes to Elven Trade");
		logger.info("Added " + BotaniaHelper.ManaInfusionRecipes + " Mana Infusion recipes");
	}
	
	private void addManaInfusion(String output, String input) {
		BotaniaHelper.addManaInfusion(output, input);
	}
	
	private void addElvenTrade(String output, String input) {
		BotaniaHelper.addElvenTrade(output, input);
	}
}