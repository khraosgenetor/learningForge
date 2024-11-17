package net.khraos.learningforge.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.khraos.learningforge.block.ModBlocks.FORGE_UTILS_BLOCKS;

/**
 * Author: khraos
 * Date: 11/17/24
 * Description: replace text here.
 */

public class Forge_Utils {

    public static final RegistryObject<Block> BRASS_BLOCK =
            registerFUBlock("brass_block", () ->
                    new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
            );

    public static final RegistryObject<Block> BRASS_BLOCK_UNREFINED =
            registerFUBlock("brass_unrefined_block", () ->
                    new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))
            );

    public static <T extends Block> RegistryObject<T> registerFUBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = FORGE_UTILS_BLOCKS.register(name, block);
        registerFUBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerFUBlockItem(String name, RegistryObject<T> block) {
        return ModBlockItems.FORGE_UTILS_BLOCK_ITEMS.register(
                name, () -> new BlockItem(block.get(), new Item.Properties())
        );
    }

    public static void register(IEventBus eventBus) {
        FORGE_UTILS_BLOCKS.register(eventBus);
    }

}