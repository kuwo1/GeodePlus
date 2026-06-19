package net.kuwo1.geodeplus.world.feature;

import net.kuwo1.geodeplus.Geode;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ClampedNormalFloat;
import net.minecraft.util.valueproviders.UniformFloat;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import static net.kuwo1.geodeplus.world.feature.ModConfiguredFeatures.*;


public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> SELENITE_GEODE = createKey("selenite_geode");
    public static final ResourceKey<PlacedFeature> CELESTINE_GEODE = createKey("celestine_geode");
    public static final ResourceKey<PlacedFeature> CHOCOLATE_DIAMOND_GEODE = createKey("chocolate_diamond_geode");
    public static final ResourceKey<PlacedFeature> FLINT_GEODE = createKey("flint_geode");
    public static final ResourceKey<PlacedFeature> FLUORITE_GEODE = createKey("fluorite_geode");
    public static final ResourceKey<PlacedFeature> BERYL_GEODE = createKey("beryl_geode");
    public static final ResourceKey<PlacedFeature> SALT_GEODE = createKey("salt_geode");
    public static final ResourceKey<PlacedFeature> SPINEL_GEODE = createKey("spinel_geode");

    public static void bootstrap(final BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        Holder<ConfiguredFeature<?, ?>> seleniteGeode = configuredFeatures.getOrThrow(ModConfiguredFeatures.SELENITE_GEODE);

        Holder<ConfiguredFeature<?, ?>> celestineGeode = configuredFeatures.getOrThrow(ModConfiguredFeatures.CELESTINE_GEODE);

        Holder<ConfiguredFeature<?, ?>> chocolatediamondGeode = configuredFeatures.getOrThrow(ModConfiguredFeatures.CHOCOLATE_DIAMOND_GEODE);

        Holder<ConfiguredFeature<?, ?>> flintGeode = configuredFeatures.getOrThrow(ModConfiguredFeatures.FLINT_GEODE);

        Holder<ConfiguredFeature<?, ?>> fluoriteGeode = configuredFeatures.getOrThrow(ModConfiguredFeatures.FLUORITE_GEODE);

        Holder<ConfiguredFeature<?, ?>> berylGeode = configuredFeatures.getOrThrow(ModConfiguredFeatures.BERYL_GEODE);

        Holder<ConfiguredFeature<?, ?>> saltGeode = configuredFeatures.getOrThrow(ModConfiguredFeatures.SALT_GEODE);

        Holder<ConfiguredFeature<?, ?>> spinelGeode = configuredFeatures.getOrThrow(ModConfiguredFeatures.SPINEL_GEODE);

        register(context, SELENITE_GEODE, seleniteGeode, RarityFilter.onAverageOnceEvery(24),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
                        VerticalAnchor.absolute(30)), BiomeFilter.biome());
        register(context, CELESTINE_GEODE, celestineGeode, RarityFilter.onAverageOnceEvery(24),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
                        VerticalAnchor.absolute(30)), BiomeFilter.biome());
        register(context, CHOCOLATE_DIAMOND_GEODE, chocolatediamondGeode, RarityFilter.onAverageOnceEvery(24),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
                        VerticalAnchor.absolute(30)), BiomeFilter.biome());
        register(context, FLINT_GEODE, flintGeode, RarityFilter.onAverageOnceEvery(24),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
                        VerticalAnchor.absolute(30)), BiomeFilter.biome());
        register(context, FLUORITE_GEODE, fluoriteGeode, RarityFilter.onAverageOnceEvery(24),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
                        VerticalAnchor.absolute(30)), BiomeFilter.biome());
        register(context, BERYL_GEODE, berylGeode, RarityFilter.onAverageOnceEvery(24),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
                        VerticalAnchor.absolute(30)), BiomeFilter.biome());
        register(context, SALT_GEODE, saltGeode, RarityFilter.onAverageOnceEvery(24),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
                        VerticalAnchor.absolute(30)), BiomeFilter.biome());
        register(context, SPINEL_GEODE, spinelGeode, RarityFilter.onAverageOnceEvery(24),
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6),
                        VerticalAnchor.absolute(30)), BiomeFilter.biome());
    }

    public static ResourceKey<PlacedFeature> createKey(final String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(Geode.MOD_ID ,name));
    }
    public static void register(final BootstrapContext<PlacedFeature> context,
                                final ResourceKey<PlacedFeature> id,
                                final Holder<ConfiguredFeature<?, ?>> feature,
                                final PlacementModifier... placementModifiers) {
        context.register(id, new PlacedFeature(feature, List.of(placementModifiers)));
        }


}
