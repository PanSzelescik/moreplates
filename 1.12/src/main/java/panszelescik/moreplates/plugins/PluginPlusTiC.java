package panszelescik.moreplates.plugins;

public class PluginPlusTiC extends PluginBase {
	
	public static final String MODID = "plustic";
	public static final String MODNAME = "PlusTiC";
	
	public PluginPlusTiC() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(ALUMITE, "alumite");
		if (isLoaded(PluginBotania.MODID))
			reg(MIRION, "mirion");
		if (isLoaded(PluginMekanism.MODID))
			reg(OSGLOGLAS, "osgloglas");
		if (isLoaded(PluginMekanism.MODID) && isLoaded(PluginThermalExpansion.MODID))
			reg(OSMIRIDIUM, "osmiridium");
	}
}