package net.khraos.learningforge.item.MetalDetectorItem;

import net.khraos.learningforge.block.Forge_Ores;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: khraos
 * Date: 11/19/24
 * Description: replace text here.
 */

public class isValuableOre {

    private static final List<Block> VANILLA_ORES = new ArrayList<>();
    private static final List<Block> MODDED_ORES = new ArrayList<>();

    static {
        // Add vanilla ores
        VANILLA_ORES.add(Blocks.COPPER_ORE);
        VANILLA_ORES.add(Blocks.COAL_ORE);
        VANILLA_ORES.add(Blocks.IRON_ORE);
        VANILLA_ORES.add(Blocks.GOLD_ORE);
        VANILLA_ORES.add(Blocks.DIAMOND_ORE);

        VANILLA_ORES.add(Blocks.DEEPSLATE_COPPER_ORE);
        VANILLA_ORES.add(Blocks.DEEPSLATE_COAL_ORE);
        VANILLA_ORES.add(Blocks.DEEPSLATE_IRON_ORE);
        VANILLA_ORES.add(Blocks.DEEPSLATE_GOLD_ORE);
        VANILLA_ORES.add(Blocks.DEEPSLATE_DIAMOND_ORE);

        // Add modded ores
        MODDED_ORES.add(Forge_Ores.BRASS_ORE.get());
        MODDED_ORES.add(Forge_Ores.DEEPSLATE_BRASS_ORE.get());
        MODDED_ORES.add(Forge_Ores.NETHER_BRASS_ORE.get());
        MODDED_ORES.add(Forge_Ores.END_STONE_BRASS_ORE.get());
    }

    public boolean isValuableOre(BlockState state) {
        for (Block block : VANILLA_ORES) {
            if (state.is(block)) {
                return true;
            }
        }
        for (Block block : MODDED_ORES) {
            if (state.is(block)) {
                return true;
            }
        }
        return false;
    }

}