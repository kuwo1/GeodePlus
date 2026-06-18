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

import static net.kuwo1.geodeplus.world.feature.ModConfiguredFeatures.BASALT_GEODE;


public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> BASALT_GEODE = createKey("basalt_geode");

    public static void bootstrap(final BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);
        Holder<ConfiguredFeature<?, ?>> basaltGeode = configuredFeatures.getOrThrow(ModConfiguredFeatures.BASALT_GEODE);

        register(context, BASALT_GEODE, basaltGeode, RarityFilter.onAverageOnceEvery(24),
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
