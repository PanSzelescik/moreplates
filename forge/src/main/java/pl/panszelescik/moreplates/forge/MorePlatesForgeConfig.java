package pl.panszelescik.moreplates.forge;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraftforge.common.ForgeConfigSpec;
import pl.panszelescik.moreplates.common.ItemType;
import pl.panszelescik.moreplates.common.MaterialType;

import java.util.Map;
import java.util.Objects;

public class MorePlatesForgeConfig {

    public static final ForgeConfigSpec SPEC;
    public static final Map<String, ForgeConfigSpec.ConfigValue<?>> CONFIG = new Object2ObjectOpenHashMap<>();

    static {
        var builder = new ForgeConfigSpec.Builder()
                .comment("More Plates settings")
                .push("enabledItems");

        String lastModId = null;
        for (MaterialType materialType : MaterialType.values()) {
            var modId = materialType.getModId();
            if (!Objects.equals(lastModId, modId)) {
                if (lastModId != null) {
                    builder.pop();
                }
                builder.push(lastModId = modId);
            }

            for (ItemType itemType : ItemType.values()) {
                var key = materialType.getRegistryName(itemType);
                var value = builder.define(key, true);

                CONFIG.put(key, value);
            }
        }

        builder.pop(2);

        SPEC = builder.build();
    }
}
