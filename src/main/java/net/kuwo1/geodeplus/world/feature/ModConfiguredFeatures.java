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
    public static final ResourceKey<ConfiguredFeature<?, ?>> SELENITE_GEODE = registerKey("selenite_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CELESTINE_GEODE = registerKey("celestine_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHOCOLATE_DIAMOND_GEODE = registerKey("chocolate_diamond_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLINT_GEODE = registerKey("flint_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLUORITE_GEODE = registerKey("fluorite_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BERYL_GEODE = registerKey("beryl_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SALT_GEODE = registerKey("salt_geode");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPINEL_GEODE = registerKey("spinel_geode");

    public static void bootstrap(final BootstrapContext<ConfiguredFeature<?, ?>> context) {
        register(context, SELENITE_GEODE, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.SELENITE_BLOCK),
                BlockStateProvider.simple(ModBlocks.BUDDING_SELENITE),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.SMALL_SELENITE_BUD.defaultBlockState(),
                        ModBlocks.MEDIUM_SELENITE_BUD.defaultBlockState(),
                        ModBlocks.LARGE_SELENITE_BUD.defaultBlockState(),
                        ModBlocks.SELENITE_CLUSTER.defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7, 2.2, 3.2, 4.2),
                new GeodeCrackSettings(0.95, (double)2.0F, 2),
                0.35, 0.083, true,
                UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05, 1));

        register(context, CELESTINE_GEODE, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.CELESTINE_BLOCK),
                BlockStateProvider.simple(ModBlocks.BUDDING_CELESTINE),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.SMALL_CELESTINE_BUD.defaultBlockState(),
                        ModBlocks.MEDIUM_CELESTINE_BUD.defaultBlockState(),
                        ModBlocks.LARGE_CELESTINE_BUD.defaultBlockState(),
                        ModBlocks.CELESTINE_CLUSTER.defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7, 2.2, 3.2, 4.2),
                new GeodeCrackSettings(0.95, (double)2.0F, 2),
                0.35, 0.083, true,
                UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05, 1));

        register(context, CHOCOLATE_DIAMOND_GEODE, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.CHOCOLATE_DIAMOND_BLOCK),
                BlockStateProvider.simple(ModBlocks.BUDDING_CHOCOLATE_DIAMOND),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.SMALL_CHOCOLATE_DIAMOND_BUD.defaultBlockState(),
                        ModBlocks.MEDIUM_CHOCOLATE_DIAMOND_BUD.defaultBlockState(),
                        ModBlocks.LARGE_CHOCOLATE_DIAMOND_BUD.defaultBlockState(),
                        ModBlocks.CHOCOLATE_DIAMOND_CLUSTER.defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7, 2.2, 3.2, 4.2),
                new GeodeCrackSettings(0.95, (double)2.0F, 2),
                0.35, 0.083, true,
                UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05, 1));

        register(context, FLINT_GEODE, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.FLINT_BLOCK),
                BlockStateProvider.simple(ModBlocks.BUDDING_FLINT),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.SMALL_FLINT_BUD.defaultBlockState(),
                        ModBlocks.MEDIUM_FLINT_BUD.defaultBlockState(),
                        ModBlocks.LARGE_FLINT_BUD.defaultBlockState(),
                        ModBlocks.FLINT_CLUSTER.defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7, 2.2, 3.2, 4.2),
                new GeodeCrackSettings(0.95, (double)2.0F, 2),
                0.35, 0.083, true,
                UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05, 1));

        register(context, FLUORITE_GEODE, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.FLUORITE_BLOCK),
                BlockStateProvider.simple(ModBlocks.BUDDING_FLUORITE),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.SMALL_FLUORITE_BUD.defaultBlockState(),
                        ModBlocks.MEDIUM_FLUORITE_BUD.defaultBlockState(),
                        ModBlocks.LARGE_FLUORITE_BUD.defaultBlockState(),
                        ModBlocks.FLUORITE_CLUSTER.defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7, 2.2, 3.2, 4.2),
                new GeodeCrackSettings(0.95, (double)2.0F, 2),
                0.35, 0.083, true,
                UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05, 1));

        register(context, BERYL_GEODE, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.BERYL_BLOCK),
                BlockStateProvider.simple(ModBlocks.BUDDING_BERYL),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.SMALL_BERYL_BUD.defaultBlockState(),
                        ModBlocks.MEDIUM_BERYL_BUD.defaultBlockState(),
                        ModBlocks.LARGE_BERYL_BUD.defaultBlockState(),
                        ModBlocks.BERYL_CLUSTER.defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7, 2.2, 3.2, 4.2),
                new GeodeCrackSettings(0.95, (double)2.0F, 2),
                0.35, 0.083, true,
                UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05, 1));

        register(context, SALT_GEODE, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.SALT_BLOCK),
                BlockStateProvider.simple(ModBlocks.BUDDING_SALT),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.SMALL_SALT_BUD.defaultBlockState(),
                        ModBlocks.MEDIUM_SALT_BUD.defaultBlockState(),
                        ModBlocks.LARGE_SALT_BUD.defaultBlockState(),
                        ModBlocks.SALT_CLUSTER.defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7, 2.2, 3.2, 4.2),
                new GeodeCrackSettings(0.95, (double)2.0F, 2),
                0.35, 0.083, true,
                UniformInt.of(4, 6), UniformInt.of(3, 4), UniformInt.of(1, 2), -16, 16, 0.05, 1));

        register(context, SPINEL_GEODE, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.SPINEL_BLOCK),
                BlockStateProvider.simple(ModBlocks.BUDDING_SPINEL),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.SMALL_SPINEL_BUD.defaultBlockState(),
                        ModBlocks.MEDIUM_SPINEL_BUD.defaultBlockState(),
                        ModBlocks.LARGE_SPINEL_BUD.defaultBlockState(),
                        ModBlocks.SPINEL_CLUSTER.defaultBlockState()),
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
