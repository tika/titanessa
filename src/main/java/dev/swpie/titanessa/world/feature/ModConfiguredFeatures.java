package dev.swpie.titanessa.world.feature;

import dev.swpie.titanessa.Titanessa;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModConfiguredFeatures {

    // Register all configured feature keys
    public static final ResourceKey<ConfiguredFeature<?, ?>> COSMIC_VEIN_KEY = registerKey("cosmic_vein_feature");




    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

        ConfiguredFeature<?, ?> COSMIC_VEIN = new ConfiguredFeature<>(
                ModFeatures.COSMIC_VEIN.get(),
                new ProbabilityFeatureConfiguration(0.6F)
        );

        context.register(COSMIC_VEIN_KEY, COSMIC_VEIN);

//        register(context, COSMIC_VEIN_KEY, new CosmicVeinFeature(ProbabilityFeatureConfiguration.CODEC), );

//        List<OreConfiguration.TargetBlockState> overworldStarstone = List.of(OreConfiguration.target(stoneReplaceables,
//                        ModBlocks.STARSTONE.get().defaultBlockState()),
//                OreConfiguration.target(deepslateReplaceables, ModBlocks.STARSTONE.get().defaultBlockState()));
//
//        context.register(STARSTONE_KEY, new ConfiguredFeature<>(
//                new CosmicVeinFeature(OreConfiguration.CODEC), new OreConfiguration(overworldStarstone, 9)
//        ));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Titanessa.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(
            BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
