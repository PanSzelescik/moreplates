package panszelescik.moreplates;

public class Reference {
	
	public static final String MODID =							"moreplates";
	public static final String NAME =							"More Plates";
	public static final String VERSION =						"4.0.0";
	public static final String UPDATE_JSON =					"https://raw.githubusercontent.com/PanSzelescik/moreplates/update/update.json";
	public static final String SERVER_PROXY_CLASS =				"panszelescik.moreplates.proxy.CommonProxy";
	public static final String CLIENT_PROXY_CLASS =				"panszelescik.moreplates.proxy.ClientProxy";
	public static final String ACCEPTED_MINECRAFT_VERSIONS =	"[1.12.2,1.13)";
	public static final String GUI_FACTORY = 					"panszelescik.moreplates.config.ModGuiFactory";
	public static final String COFHCORE_VERSION =				"4.4.0";
	public static final String ENDERIO_VERSION =				"5.0.21";
	public static final String IMMERSIVEENGINEERING_VERSION =	"0.12-81";
	public static final String THERMALEXPANSION_VERSION =		"5.4.1";
	public static final String DEPENDENCIES =					"after:cofhcore@[" + COFHCORE_VERSION + ",);"
															+	"after:enderio@[" + ENDERIO_VERSION + ",);"
															+	"after:immersiveengineering@[" + IMMERSIVEENGINEERING_VERSION + ",);"
															+	"after:thermalexpansion@[" + THERMALEXPANSION_VERSION + ",)";
}