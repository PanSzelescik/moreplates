package panszelescik.moreplates.helpers;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import panszelescik.moreplates.MorePlates;
import panszelescik.moreplates.config.ConfigItems;
import panszelescik.moreplates.items.*;

public abstract class Helper extends Strings {
	
	public void reg(String ore, String name) {
		Item gear = gear(name);
		regGear(gear, ore);
		Item plate = plate(name);
		regPlate(plate, ore);
	}
	
	public void regGaia(String ore, String name) {
		Item gear = gear(name);
		if (ConfigItems.loadItem(gear)) {
			regItem(gear);
			oreGearGaia(ore, gear);
		}
		Item plate = plate(name);
		if (plate != null && ConfigItems.loadItem(plate)) {
			regItem(plate);
			orePlateGaia(ore, plate);
		}
	}
	
	public static void regGear(Item gear, String ore) {
		if (ConfigItems.loadItem(gear)) {
			regItem(gear);
			oreGear(ore, gear);
		}
	}
	
	public static void regPlate(Item plate, String ore) {
		if (ConfigItems.loadItem(plate)) {
			regItem(plate);
			orePlate(ore, plate);
		}
	}
	
	public static void regStick(Item stick, String ore) {
		if (ConfigItems.loadItem(stick)) {
			regItem(stick);
			oreStick(ore, stick);
		}
	}
	
	public static void regItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
		MorePlates.logger.debug(INFO_REG_ITEM + getItemNameFromItem(item));
	}
	
	public Item gear(String name) {
		return new ItemGear(name);
	}
	
	public Item plate(String name) {
		return new ItemPlate(name);
	}
	
	public Item stick(String name) {
		return new ItemStick(name);
	}
}