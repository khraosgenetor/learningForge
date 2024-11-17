package net.khraos.learningforge.block;

import net.khraos.learningforge.LearningForge;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Author: khraos
 * Date: 11/15/24
 * Description: Mod Blocks registerer
 */

public class ModBlocks {
    public static final DeferredRegister<Block> FORGE_UTILS_BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LearningForge.MOD_ID);

    public static void register(IEventBus eventBus) {
        Forge_Utils.register(eventBus);
    }
}