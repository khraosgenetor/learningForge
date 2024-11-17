package net.khraos.learningforge.block;

import net.khraos.learningforge.LearningForge;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

/**
 * Author: khraos
 * Date: 11/15/24
 * Description: Mod Blocks registerer
 */

public class ModBlocks {
    public static final DeferredRegister<Block> FORGE_UTILS_BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LearningForge.MOD_ID);

    public static final RegistryObject<Block> BRASS_BLOCK =
            registerBlock("brass_block", () ->
                    new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
            );

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = FORGE_UTILS_BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModBlockItems.FORGE_UTILS_BLOCK_ITEMS.register(
                name, () -> new BlockItem(block.get(), new Item.Properties())
        );
    }

    public static void register(IEventBus eventBus) {
        FORGE_UTILS_BLOCKS.register(eventBus);
    }
}