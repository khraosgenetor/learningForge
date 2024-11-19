package net.khraos.learningforge.item.MetalDetectorItem;

import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

/**
 * Author: khraos
 * Date: 11/19/24
 * Description: replace text here.
 */

public class MetalDetectorItem extends Item {

    public MetalDetectorItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide()) {
            BlockPos blockPos = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            boolean foundBlock = false;

            for (int i = 0; i <= blockPos.getY() + 64 ; i++) {
                BlockState state = pContext.getLevel().getBlockState(blockPos.below(i));

                if(isValuableBlock(state)) {
                    printCoords(blockPos.below(i), player, state.getBlock());
                    foundBlock = true;
                    break;
                }
            }

            if(!foundBlock) {
                player.sendSystemMessage(Component.literal("Found no Valuable Ores!"));
            }
        }

        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(), pContext.getItemInHand().getEquipmentSlot());

        return InteractionResult.SUCCESS;
    }

    private void printCoords(BlockPos pos, Player player, Block block) {
        player.sendSystemMessage(Component.literal("Found " + I18n.get(block.getDescriptionId()) + " at (" +
                pos.getX() + ", " + pos.getY() + ", " + pos.getZ() + ")"
                ));
    }

    private boolean isValuableBlock(BlockState state) {
        isValuableOre valuableOre = new isValuableOre();
        return valuableOre.isValuableOre(state);
    }
}