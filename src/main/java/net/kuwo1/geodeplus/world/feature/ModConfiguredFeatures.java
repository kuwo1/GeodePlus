package net.kuwo1.geodeplus.world.feature;

import net.kuwo1.geodeplus.Geode;
import net.kuwo1.geodeplus.block.ModBlocks;
import net.kuwo1.geodeplus.block.ModBlocks;
import net.kuwo1.geodeplus.tags.ModTags;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.GeodeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;



import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> BASALT_GEODE = registerKey("basalt_geode");

    public static void bootstrap(final BootstrapContext<ConfiguredFeature<?, ?>> context) {
        register(context, BASALT_GEODE, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.SELENITE_BLOCK),
                BlockStateProvider.simple(ModBlocks.BUDDING_SELENITE),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(Blocks.SMALL_AMETHYST_BUD.defaultBlockState(),
                        Blocks.MEDIUM_AMETHYST_BUD.defaultBlockState(),
                        Blocks.LARGE_AMETHYST_BUD.defaultBlockState(),
                        Blocks.AMETHYST_CLUSTER.defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7, 2.2, 3.2, 4.2),
                new GeodeCrackSettings(0.95, (double)2.0F, 2),
                0.35, 0.083, true,
                UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05, 1));

    }
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(Geode.MOD_ID, name));
    }

    public static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(final BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                         final ResourceKey<ConfiguredFeature<?, ?>> id,
                                                                                         final F feature,
                                                                                         final FC config) {
        context.register(id, new ConfiguredFeature(feature, config));
    }
    






}
