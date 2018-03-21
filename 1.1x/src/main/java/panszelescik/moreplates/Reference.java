package panszelescik.moreplates;

public class Reference {

	public static final String MODID = "moreplates";
	public static final String NAME = "MorePlates";
	public static final String VERSION = "2.6.1";
	public static final String UPDATE_JSON = "https://raw.githubusercontent.com/PanSzelescik/moreplates/update/update.json";
	public static final String SERVER_PROXY_CLASS = "panszelescik.moreplates.proxy.CommonProxy";
	public static final String CLIENT_PROXY_CLASS = "panszelescik.moreplates.proxy.ClientProxy";
	public static final String ACCEPTED_MINECRAFT_VERSIONS = "[1.10,1.12)";
	public static final String FORGE_10_VERSION = "12.18.3.2511";
	public static final String FORGE_11_VERSION = "13.20.1.2588";
	public static final String COMPATLAYER_VERSION = "0.3.1";
	public static final String DEPENDENCIES = 
			"required-after:compatlayer@[" + Reference.COMPATLAYER_VERSION + ",);" +
			"after:Forge@[" + Reference.FORGE_10_VERSION + ",);" +
			"after:forge@[" + Reference.FORGE_11_VERSION + ",)";
	
}
