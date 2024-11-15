package net.khraos.learningforge.item;

import net.khraos.learningforge.LearningForge;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Author: khraos
 * Date: 11/15/24
 * Description: mod items registerer
 */

public class ModItems {
    public static final DeferredRegister<Item> FORGE_UTILS_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LearningForge.MOD_ID);

    public static final RegistryObject<Item> BRASS_INGOT = FORGE_UTILS_ITEMS.register(
            "brass_ingot", () -> new Item(new Item.Properties())
    );

    public static void register(IEventBus eventBus) {
        FORGE_UTILS_ITEMS.register(eventBus);
    }
}