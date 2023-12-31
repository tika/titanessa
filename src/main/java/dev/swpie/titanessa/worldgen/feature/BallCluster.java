package dev.swpie.titanessa.worldgen.feature;

import dev.swpie.titanessa.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;

public class BallCluster extends Feature<ProbabilityFeatureConfiguration> {
    public BallCluster() {
        super(ProbabilityFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<ProbabilityFeatureConfiguration> pContext) {
        WorldGenLevel worldgenlevel = pContext.level();
        BlockPos blockpos = pContext.origin();
        RandomSource random = pContext.random();

        // Should spawn?
        if (pContext.random().nextFloat() > pContext.config().probability) return false;

        int y = -40 - random.nextInt(20);

        BlockPos centre = new BlockPos(blockpos.getX(), y, blockpos.getZ());

        // If the centre is not air
        if (!worldgenlevel.getBlockState(centre).equals(Blocks.AIR.defaultBlockState())) {
            BlockState core = ModBlocks.COSMIC_CORE.get().defaultBlockState();
            BlockState starstone = ModBlocks.STARSTONE.get().defaultBlockState();

            worldgenlevel.setBlock(centre, core, 3);

            worldgenlevel.setBlock(centre.above(), starstone, 3);
            worldgenlevel.setBlock(centre.below(), starstone, 3);
            worldgenlevel.setBlock(centre.north(), starstone, 3);
            worldgenlevel.setBlock(centre.east(), starstone, 3);
            worldgenlevel.setBlock(centre.south(), starstone, 3);
            worldgenlevel.setBlock(centre.west(), starstone, 3);
        }

        return true;
    }
}
