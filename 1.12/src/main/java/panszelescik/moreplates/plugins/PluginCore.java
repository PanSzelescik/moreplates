package panszelescik.moreplates.plugins;

import net.minecraft.item.Item;
import panszelescik.morelibs.api.IInitPlugin;
import panszelescik.moreplates.helpers.Helper;
import panszelescik.moreplates.items.*;

public abstract class PluginCore extends Helper implements IInitPlugin {
	
	protected final String modid;
	protected final String modname;
	protected boolean enable;
	protected boolean error;
	
	public PluginCore(String modid, String modname) {
		this.modid = modid;
		this.modname = modname;
	}
	
	@Override
	public abstract boolean preInitPlugin();

	@Override
	public abstract boolean initPlugin();
	
	protected void regCustomGear(boolean bool, String ore, String name) {
		Item gear = gear(name);
		regGear(gear, ore);
		bool = true;
	}
	
	protected void regCustomPlate(boolean bool, String ore, String name) {
		Item plate = plate(name);
		regPlate(plate, ore);
		bool = true;
	}
	
	protected void regCustomStick(boolean bool, String ore, String name) {
		Item stick = stick(name);
		regStick(stick, ore);
		bool = true;
	}
}