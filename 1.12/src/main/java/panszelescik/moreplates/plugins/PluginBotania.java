package panszelescik.moreplates.plugins;

import static panszelescik.moreplates.MorePlates.*;

import net.minecraft.item.Item;
import panszelescik.moreplates.helpers.BotaniaHelper;

public class PluginBotania extends PluginBase {
	
	public static final String MODID = "botania";
	public static final String MODNAME = "Botania";
	
	public PluginBotania() {
		super(MODID, MODNAME);
	}
	
	Item elementium_gear;
	Item elementium_plate;
	Item gaia_spirit_gear;
	Item gaia_spirit_plate;
	Item manasteel_gear;
	Item manasteel_plate;
	Item terrasteel_gear;
	Item terrasteel_plate;
	
	public void preInit() {
		elementium_gear = gear("elementium");
		elementium_plate = plate("elementium");
		gaia_spirit_gear = gear("gaia_spirit");
		gaia_spirit_plate = plate("gaia_spirit");
		manasteel_gear = gear("manasteel");
		manasteel_plate = plate("manasteel");
		terrasteel_gear = gear("terrasteel");
		terrasteel_plate = plate("terrasteel");
		
		reg(ELEMENTIUM, elementium_gear, elementium_plate);
		regGaia(GAIA_SPIRIT, gaia_spirit_gear, gaia_spirit_plate);
		reg(MANASTEEL, manasteel_gear, manasteel_plate);
		reg(TERRASTEEL, terrasteel_gear, terrasteel_plate);
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