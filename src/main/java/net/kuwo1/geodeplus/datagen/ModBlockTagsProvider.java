package net.kuwo1.geodeplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.kuwo1.geodeplus.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.GEODEPACK_BRICKS)
                .add(ModBlocks.BASALT_BRICKS)
                .add(ModBlocks.SELENITE_BLOCK)
                .add(ModBlocks.CALCITE_BRICKS)
                .add(ModBlocks.GEODEPACK_BLOCK)
                .add(ModBlocks.CELESTINE_BLOCK)
                .add(ModBlocks.CELESTINE_BRICKS)
                .add(ModBlocks.GEODEPACK)
                .add(ModBlocks.BUDDING_CELESTINE)
                .add(ModBlocks.SMALL_CELESTINE_BUD)
                .add(ModBlocks.MEDIUM_CELESTINE_BUD)
                .add(ModBlocks.LARGE_CELESTINE_BUD)
                .add(ModBlocks.CELESTINE_CLUSTER)
                .add(ModBlocks.BERYL_BLOCK)
                .add(ModBlocks.BUDDING_BERYL)
                .add(ModBlocks.SMALL_BERYL_BUD)
                .add(ModBlocks.BERYL_BRICKS)
                .add(ModBlocks.AMETHYST_BRICKS)
                .add(ModBlocks.SELENITE_BRICKS)
                .add(ModBlocks.SPINEL_BLOCK)
                .add(ModBlocks.SPINEL_BRICKS)
                .add(ModBlocks.BUDDING_SELENITE)
                .add(ModBlocks.SALT_BLOCK)
                .add(ModBlocks.SALT_BRICKS)
                .add(ModBlocks.FLINT_BLOCK)
                .add(ModBlocks.FLINT_BRICKS)
                .add(ModBlocks.BASALT_BRICK_SLAB)
                .add(ModBlocks.BUDDING_FLINT)
                .add(ModBlocks.BASALT_BRICK_STAIRS)
                .add(ModBlocks.CALCITE_BRICK_STAIRS);

        valueLookupBuilder(BlockTags.STAIRS) .add(ModBlocks.BASALT_BRICK_STAIRS);
        valueLookupBuilder(BlockTags.STAIRS) .add(ModBlocks.CALCITE_BRICK_STAIRS);
        valueLookupBuilder(BlockTags.STAIRS) .add(ModBlocks.GEODEPACK_BRICK_STAIRS);


        valueLookupBuilder(BlockTags.SLABS) .add(ModBlocks.BASALT_BRICK_SLAB);
        valueLookupBuilder(BlockTags.SLABS) .add(ModBlocks.CALCITE_BRICK_SLAB);
        valueLookupBuilder(BlockTags.SLABS) .add(ModBlocks.GEODEPACK_BRICK_SLAB);


    }
}
