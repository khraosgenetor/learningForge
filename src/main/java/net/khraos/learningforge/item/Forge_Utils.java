package net.khraos.learningforge.item;

import net.khraos.learningforge.item.MetalDetectorItem.MetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import static net.khraos.learningforge.item.ModItems.FORGE_UTILS_ITEMS;

/**
 * Author: khraos
 * Date: 11/17/24
 * Description: replace text here.
 */

public class Forge_Utils {
    public static final RegistryObject<Item> BRASS_INGOT = FORGE_UTILS_ITEMS.register(
            "brass_ingot", () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> BRASS_UNREFINED = FORGE_UTILS_ITEMS.register(
            "brass_unrefined", () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> METAL_DETECTOR_ITEM = FORGE_UTILS_ITEMS.register(
            "metal_detector", () -> new MetalDetectorItem(new Item.Properties().durability(100))
    );

    public static void register(IEventBus eventBus) {
        FORGE_UTILS_ITEMS.register(eventBus);
    }
}