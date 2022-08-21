package pl.panszelescik.moreplates.forge;

import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import net.minecraftforge.common.ForgeConfigSpec;
import pl.panszelescik.moreplates.common.ItemType;
import pl.panszelescik.moreplates.common.MaterialType;
import pl.panszelescik.moreplates.common.MorePlates;

import java.util.Objects;

public class MorePlatesForgeConfig {

    public static final ForgeConfigSpec SPEC;
    public static final Object2BooleanOpenHashMap<String> CONFIG = new Object2BooleanOpenHashMap<>();

    static {
        CONFIG.defaultReturnValue(false);

        var builder = new ForgeConfigSpec.Builder()
                .comment("More Plates settings")
                .push(MorePlates.ENABLED_ITEMS_PATH);

        String lastModId = null;
        for (var materialType : MaterialType.values()) {
            var modId = materialType.getModId();
            if (!Objects.equals(lastModId, modId)) {
                if (lastModId != null) {
                    builder.pop();
                }
                lastModId = modId;
                builder.push(modId);
            }

            for (var itemType : ItemType.values()) {
                var key = materialType.getRegistryName(itemType);
                var value = builder.define(key, true);

                CONFIG.put(MorePlates.ENABLED_ITEMS_PATH + "." + modId + "." + key, value.get().booleanValue());
            }
        }

        builder.pop(2);

        SPEC = builder.build();
    }
}
