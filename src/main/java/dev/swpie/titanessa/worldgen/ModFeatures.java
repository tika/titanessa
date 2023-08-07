package dev.swpie.titanessa.worldgen;

import dev.swpie.titanessa.Titanessa;
import dev.swpie.titanessa.worldgen.feature.BallCluster;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFeatures {
    // Custom features
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Titanessa.MOD_ID);

    private static final String BALL_CLUSTER_FEATURE_NAME = "ball_cluster";

    public static final RegistryObject<Feature<ProbabilityFeatureConfiguration>> BALL_CLUSTER = FEATURES.register(BALL_CLUSTER_FEATURE_NAME, BallCluster::new);
}
