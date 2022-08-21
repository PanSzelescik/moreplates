package pl.panszelescik.moreplates.fabric;

import com.google.gson.*;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import org.apache.commons.io.FileUtils;
import pl.panszelescik.moreplates.common.ItemType;
import pl.panszelescik.moreplates.common.MaterialType;
import pl.panszelescik.moreplates.common.MorePlates;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class MorePlatesFabricConfig {

    public static final Object2BooleanOpenHashMap<String> CONFIG = new Object2BooleanOpenHashMap<>();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void loadConfig(File configDir) throws IOException {
        CONFIG.defaultReturnValue(false);

        var file = new File(configDir, MorePlates.MODID + ".json");

        if (file.exists()) {
            loadConfigFile(file);
        } else {
            loadFromJson(new JsonObject());
        }

        saveConfig(file);
    }

    private static void loadConfigFile(File configFile) throws IOException {
        var string = FileUtils.readFileToString(configFile, StandardCharsets.UTF_8);
        var json = JsonParser.parseString(string).getAsJsonObject();
        loadFromJson(json);
    }

    private static void loadFromJson(JsonObject json) {
        var enabledItems = JsonUtils.getSafeJsonObject(json, MorePlates.ENABLED_ITEMS_PATH);

        String lastModId = null;
        var modObject = new JsonObject();
        for (var materialType : MaterialType.values()) {
            var modId = materialType.getModId();
            if (!Objects.equals(lastModId, modId)) {
                lastModId = modId;
                modObject = JsonUtils.getSafeJsonObject(enabledItems, modId);
            }
            
            for (var itemType : ItemType.values()) {
                var key = materialType.getRegistryName(itemType);
                var value = JsonUtils.getSafeBoolean(modObject, key, () -> true);

                CONFIG.put(MorePlates.ENABLED_ITEMS_PATH + "." + modId + "." + key, value);
            }
        }
    }

    private static void saveConfig(File configFile) throws IOException {
        var json = new JsonObject();

        for (var entry : CONFIG.object2BooleanEntrySet()) {
            var object = json;
            var splitted = entry.getKey().split("\\.");

            for (int i = 0; i < splitted.length; i++) {
                var subKey = splitted[i];

                if (i == splitted.length - 1) {
                    object.addProperty(subKey, entry.getBooleanValue());
                } else {
                    var subObject = JsonUtils.getSafeJsonObject(object, subKey, () -> null);
                    if (subObject == null) {
                        subObject = new JsonObject();
                        object.add(subKey, subObject);
                    }

                    object = subObject;
                }
            }
        }

        var string = GSON.toJson(json);
        FileUtils.writeStringToFile(configFile, string, StandardCharsets.UTF_8);
    }
}
