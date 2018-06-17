package panszelescik.moreplates;

public class Reference {
	
	public static final String MODID = "moreplates";
	public static final String NAME = "More Plates";
	public static final String VERSION = "5.0.0";
	public static final String UPDATE_JSON = "https://raw.githubusercontent.com/PanSzelescik/moreplates/master/update.json";
	public static final String SERVER_PROXY_CLASS = "panszelescik.moreplates.proxy.CommonProxy";
	public static final String CLIENT_PROXY_CLASS = "panszelescik.moreplates.proxy.ClientProxy";
	public static final String ACCEPTED_MINECRAFT_VERSIONS = "[1.12.2,1.13)";
	public static final String GUI_FACTORY = "panszelescik.moreplates.config.ModGuiFactory";
	public static final String ACTUALLY_VERSION = "1.12.2-r135";
	public static final String IC2_VERSION = "2.8.78-ex112";
	public static final String IMMERSIVE_VERSION = "0.12-82";
	public static final String THERMAL_VERSION = "5.4.2";
	public static final String DEPENDENCIES = 
			  "after:actuallyadditions@[" + ACTUALLY_VERSION + ",);"
			+ "after:appliedenergistics2;"
			+ "after:avaritia;"
			+ "after:botania;"
			+ "after:botaniatweaks;"
			+ "after:calculator;"
			+ "after:draconicevolution;"
			+ "after:enderio;"
			+ "after:extrautils2;"
			+ "after:ic2@[" + IC2_VERSION + ",);"
			+ "after:immersiveengineering@[" + IMMERSIVE_VERSION + ",);"
			+ "after:mekanism;"
			+ "after:mysticalagradditions;"
			+ "after:mysticalagriculture;"
			+ "after:plustic;"
			+ "after:pneumaticcraft;"
			+ "after:projecte;"
			+ "after:projectred-core;"
			+ "after:reborncore;"
			+ "after:refinedstorage;"
			+ "after:techreborn;"
			+ "after:thaumcraft;"
			+ "after:thermalexpansion@[" + THERMAL_VERSION + ",);"
			+ "after:tconstruct;"
			+ "after:twilightforest";
}