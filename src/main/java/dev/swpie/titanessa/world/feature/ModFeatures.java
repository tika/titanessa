package dev.swpie.titanessa.world.feature;

import dev.swpie.titanessa.Titanessa;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Titanessa.MOD_ID);

    public static final String COSMIC_VEIN_FEATURE_KEY = "cosmic_vein_feature";

    public static final RegistryObject<Feature<ProbabilityFeatureConfiguration>> COSMIC_VEIN = FEATURES.register(COSMIC_VEIN_FEATURE_KEY, () -> new CosmicVeinFeature(ProbabilityFeatureConfiguration.CODEC));
}
