package dev.swpie.titanessa.datagen;

import dev.swpie.titanessa.item.ModBlocks;
import dev.swpie.titanessa.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.STARSTONE.get());

        add(ModBlocks.COSMIC_CORE.get(),
                (block) -> createOreDrop(ModBlocks.COSMIC_CORE.get(), ModItems.CELESTIUM_CHUNK.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
