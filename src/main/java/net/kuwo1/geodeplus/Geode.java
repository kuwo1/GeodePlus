package net.kuwo1.geodeplus;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.kuwo1.geodeplus.Item.ModItems;
import net.kuwo1.geodeplus.block.ModBlocks;
import net.kuwo1.geodeplus.creativemodetab.ModCreativeModeTabs;
import net.kuwo1.geodeplus.world.feature.ModPlacedFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.GenerationStep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Geode implements ModInitializer {
	public static final String MOD_ID = "geode";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModCreativeModeTabs.registerModCreativeModeTabs();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Decoration.LOCAL_MODIFICATIONS,
                ModPlacedFeatures.BASALT_GEODE);


	}
}