package dev.swpie.titanessa.item;

import dev.swpie.titanessa.Titanessa;
import dev.swpie.titanessa.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Titanessa.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TITANESSA_TAB = CREATIVE_MODE_TABS.register("titanessa_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.CELESTIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.titanessa_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // ModItems
                        pOutput.accept(ModItems.CELESTIUM_INGOT.get());
                        pOutput.accept(ModItems.CELESTIUM_CHUNK.get());

                        pOutput.accept(ModItems.CELESTIUM_HELMET.get());
                        pOutput.accept(ModItems.CELESTIUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.CELESTIUM_LEGGINGS.get());
                        pOutput.accept(ModItems.CELESTIUM_BOOTS.get());

                        // ModBlocks
                        pOutput.accept(ModBlocks.COSMIC_CORE.get());
                        pOutput.accept(ModBlocks.STARSTONE.get());
                        pOutput.accept(ModBlocks.CELESTIUM_BLOCK.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
