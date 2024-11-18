package net.khraos.learningforge.block;

import net.khraos.learningforge.LearningForge;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Author: khraos
 * Date: 11/15/24
 * Description: mod items registerer
 */

public class ModBlockItems {
    public static final DeferredRegister<Item> FORGE_UTILS_BLOCK_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LearningForge.MOD_ID);

    public static final DeferredRegister<Item> FORGE_ORES_BLOCK_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LearningForge.MOD_ID);

    public static void register(IEventBus eventBus) {
        FORGE_UTILS_BLOCK_ITEMS.register(eventBus);
        FORGE_ORES_BLOCK_ITEMS.register(eventBus);
    }
}