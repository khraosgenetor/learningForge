package net.khraos.learningforge;

import net.khraos.learningforge.block.ModBlocks;
import net.khraos.learningforge.creativeTab.ModTabs;
import net.khraos.learningforge.item.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;

/**
 * Author: khraos
 * Date: 11/15/24
 * Description: register code for ModItems, ModBlocks and ModTabs
 */

public class ModClassRegistrar {
    public static void main(IEventBus eventBus) {
        ModItems.register(eventBus);
        ModTabs.register(eventBus);
        ModBlocks.register(eventBus);
    }
}