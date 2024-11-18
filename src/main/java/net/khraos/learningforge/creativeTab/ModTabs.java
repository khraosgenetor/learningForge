package net.khraos.learningforge.creativeTab;

import net.khraos.learningforge.LearningForge;
import net.khraos.learningforge.block.ModBlocks;
import net.khraos.learningforge.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

/**
 * Author: khraos
 * Date: 11/15/24
 * Description: mod tabs registerer
 */

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LearningForge.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FORGE_ORES = MOD_TABS.register(
            "forge_ores", () -> CreativeModeTab.builder()
                    .icon(
                            () -> new ItemStack(net.khraos.learningforge.block.Forge_Ores.BRASS_ORE.get())
                    )
                    .title(Component.translatable("forge_ores.forgetabs"))
                    .displayItems((pParameters, pOutput) -> {
                        for (RegistryObject<Block> block : ModBlocks.FORGE_ORES_BLOCKS.getEntries()) {
                            pOutput.accept(block.get());
                        }
                    })
                    .build()
    );

    public static final RegistryObject<CreativeModeTab> FORGE_UTILS = MOD_TABS.register(
            "forge_utils", () -> CreativeModeTab.builder()
                    .icon(
                            () -> new ItemStack(net.khraos.learningforge.item.Forge_Utils.BRASS_INGOT.get())
                    )
                    .title(Component.translatable("forge_utils.forgetabs"))
                    .displayItems((itemDisplayParameters, output) -> {

                        for (RegistryObject<Item> item : ModItems.FORGE_UTILS_ITEMS.getEntries()) {
                            output.accept(item.get());
                        }

                        for (RegistryObject<Block> block : ModBlocks.FORGE_UTILS_BLOCKS.getEntries()) {
                            output.accept(block.get());
                        }

                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        MOD_TABS.register(eventBus);
    }
}