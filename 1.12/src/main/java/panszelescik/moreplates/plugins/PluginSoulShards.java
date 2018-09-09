package panszelescik.moreplates.plugins;

public class PluginSoulShards extends PluginBase {
	
	public static final String MODID = "soulshardstow";
	public static final String MODNAME = "Soul Shards - The Old Ways";
	
	public PluginSoulShards() {
		super(MODID, MODNAME);
	}
	
	public void preInit() {
		reg(CORRUPTED, "corrupted");
	}
}