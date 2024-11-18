package net.khraos.learningforge.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.khraos.learningforge.block.ModBlocks.FORGE_ORES_BLOCKS;

/**
 * Author: khraos
 * Date: 11/18/24
 * Description: replace text here.
 */

public class Forge_Ores {

    public static final RegistryObject<Block> BRASS_ORE =
            registerFOBlock("brass_ore", () ->
                    new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE))
            );

    public static final RegistryObject<Block> DEEPSLATE_BRASS_ORE =
            registerFOBlock("deepslate_brass_ore", () ->
                    new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE))
            );

    public static final RegistryObject<Block> NETHER_BRASS_ORE =
            registerFOBlock("nether_brass_ore", () ->
                    new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_GOLD_ORE))
            );

    public static final RegistryObject<Block> END_STONE_BRASS_ORE =
            registerFOBlock("end_stone_brass_ore", () ->
                    new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE))
            );


    public static <T extends Block> RegistryObject<T> registerFOBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = FORGE_ORES_BLOCKS.register(name, block);
        registerFOBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerFOBlockItem(String name, RegistryObject<T> block) {
        return ModBlockItems.FORGE_ORES_BLOCK_ITEMS.register(
                name, () -> new BlockItem(block.get(), new Item.Properties())
        );
    }

    public static void register(IEventBus eventBus) {
        FORGE_ORES_BLOCKS.register(eventBus);
    }
}