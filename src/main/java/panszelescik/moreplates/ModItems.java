package panszelescik.moreplates;

import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import panszelescik.moreplates.items.ItemHammer;

public class ModItems {

    public static final ItemHammer hammer = new ItemHammer();

    @SubscribeEvent
    public static void register(IForgeRegistry<Item> r) {
        r.register(hammer);
    }
}