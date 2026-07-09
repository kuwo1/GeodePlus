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
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.GEODEPACK_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.BASALT_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.SELENITE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.GEODEPACK_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.CELESTINE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.CELESTINE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.BUDDING_CELESTINE))
                .add(ModBlocks.getRK(ModBlocks.SMALL_CELESTINE_BUD))
                .add(ModBlocks.getRK(ModBlocks.MEDIUM_CELESTINE_BUD))
                .add(ModBlocks.getRK(ModBlocks.LARGE_CELESTINE_BUD))
                .add(ModBlocks.getRK(ModBlocks.CELESTINE_CLUSTER))
                .add(ModBlocks.getRK(ModBlocks.BERYL_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.BUDDING_BERYL))
                .add(ModBlocks.getRK(ModBlocks.BERYL_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.AMETHYST_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.SELENITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.SPINEL_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.SPINEL_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.BUDDING_SELENITE))
                .add(ModBlocks.getRK(ModBlocks.SALT_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.SALT_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.FLINT_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.FLINT_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.BASALT_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.BUDDING_FLINT))
                .add(ModBlocks.getRK(ModBlocks.BASALT_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.CHOCOLATE_DIAMOND_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.CHOCOLATE_DIAMOND_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.BUDDING_CHOCOLATE_DIAMOND))
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_BLOCK))
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.BUDDING_FLUORITE))
                .add(ModBlocks.getRK(ModBlocks.BUDDING_SALT))
                .add(ModBlocks.getRK(ModBlocks.BUDDING_SPINEL))
                .add(ModBlocks.getRK(ModBlocks.SMALL_FLUORITE_BUD))
                .add(ModBlocks.getRK(ModBlocks.MEDIUM_FLUORITE_BUD))
                .add(ModBlocks.getRK(ModBlocks.LARGE_FLUORITE_BUD))
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_CLUSTER))
                .add(ModBlocks.getRK(ModBlocks.SMALL_SALT_BUD))
                .add(ModBlocks.getRK(ModBlocks.MEDIUM_SALT_BUD))
                .add(ModBlocks.getRK(ModBlocks.LARGE_SALT_BUD))
                .add(ModBlocks.getRK(ModBlocks.SALT_CLUSTER))
                .add(ModBlocks.getRK(ModBlocks.SMALL_SELENITE_BUD))
                .add(ModBlocks.getRK(ModBlocks.MEDIUM_SELENITE_BUD))
                .add(ModBlocks.getRK(ModBlocks.LARGE_SELENITE_BUD))
                .add(ModBlocks.getRK(ModBlocks.SELENITE_CLUSTER))
                .add(ModBlocks.getRK(ModBlocks.SMALL_SPINEL_BUD))
                .add(ModBlocks.getRK(ModBlocks.MEDIUM_SPINEL_BUD))
                .add(ModBlocks.getRK(ModBlocks.LARGE_SPINEL_BUD))
                .add(ModBlocks.getRK(ModBlocks.SPINEL_CLUSTER))
                .add(ModBlocks.getRK(ModBlocks.SMALL_FLINT_BUD))
                .add(ModBlocks.getRK(ModBlocks.MEDIUM_FLINT_BUD))
                .add(ModBlocks.getRK(ModBlocks.LARGE_FLINT_BUD))
                .add(ModBlocks.getRK(ModBlocks.FLINT_CLUSTER))
                .add(ModBlocks.getRK(ModBlocks.SMALL_BERYL_BUD))
                .add(ModBlocks.getRK(ModBlocks.MEDIUM_BERYL_BUD))
                .add(ModBlocks.getRK(ModBlocks.LARGE_BERYL_BUD))
                .add(ModBlocks.getRK(ModBlocks.BERYL_CLUSTER))
                .add(ModBlocks.getRK(ModBlocks.SMALL_CHOCOLATE_DIAMOND_BUD))
                .add(ModBlocks.getRK(ModBlocks.MEDIUM_CHOCOLATE_DIAMOND_BUD))
                .add(ModBlocks.getRK(ModBlocks.LARGE_CHOCOLATE_DIAMOND_BUD))
                .add(ModBlocks.getRK(ModBlocks.CHOCOLATE_DIAMOND_CLUSTER))
                .add(ModBlocks.getRK(ModBlocks.BASALT_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.GEODEPACK_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.CHOCOLATE_DIAMOND_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.AMETHYST_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.SALT_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.SELENITE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.FLINT_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.SPINEL_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.BERYL_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.CELESTINE_BRICK_STAIRS))
                .add(ModBlocks.getRK(ModBlocks.BASALT_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.GEODEPACK_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.AMETHYST_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.FLUORITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.SALT_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.SELENITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.FLINT_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.SELENITE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.FLINT_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.SPINEL_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.BERYL_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks.CELESTINE_BRICK_SLAB))
                .add(ModBlocks.getRK(ModBlocks. BASALT_BRICK_BUTTON))
                .add(ModBlocks.getRK(ModBlocks. CALCITE_BRICK_BUTTON))
                .add(ModBlocks.getRK(ModBlocks. GEODEPACK_BRICK_BUTTON))
                .add(ModBlocks.getRK(ModBlocks.BASALT_BRICK_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.GEODEPACK_BRICK_PRESSURE_PLATE))
                .add(ModBlocks.getRK(ModBlocks.CRACKED_BASALT_BRICKS))
                .add(ModBlocks.getRK(ModBlocks.CRACKED_CALCITE_BRICKS));



         tag(BlockTags.STAIRS) .add(ModBlocks.getRK(ModBlocks.BASALT_BRICK_STAIRS));
         tag(BlockTags.STAIRS) .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_STAIRS));
         tag(BlockTags.STAIRS) .add(ModBlocks.getRK(ModBlocks.GEODEPACK_BRICK_STAIRS));
         tag(BlockTags.STAIRS) .add(ModBlocks.getRK(ModBlocks.CHOCOLATE_DIAMOND_BRICK_STAIRS));
         tag(BlockTags.STAIRS) .add(ModBlocks.getRK(ModBlocks.AMETHYST_BRICK_STAIRS));
         tag(BlockTags.STAIRS) .add(ModBlocks.getRK(ModBlocks.FLUORITE_BRICK_STAIRS));
         tag(BlockTags.STAIRS) .add(ModBlocks.getRK(ModBlocks.SALT_BRICK_STAIRS));
         tag(BlockTags.STAIRS) .add(ModBlocks.getRK(ModBlocks.SELENITE_BRICK_STAIRS));
         tag(BlockTags.STAIRS) .add(ModBlocks.getRK(ModBlocks.FLINT_BRICK_STAIRS));
         tag(BlockTags.STAIRS) .add(ModBlocks.getRK(ModBlocks.SPINEL_BRICK_STAIRS));
         tag(BlockTags.STAIRS) .add(ModBlocks.getRK(ModBlocks.BERYL_BRICK_STAIRS));
         tag(BlockTags.STAIRS) .add(ModBlocks.getRK(ModBlocks.CELESTINE_BRICK_STAIRS));


        tag(BlockTags.SLABS) .add(ModBlocks.getRK(ModBlocks.BASALT_BRICK_SLAB));
        tag(BlockTags.SLABS) .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_SLAB));
        tag(BlockTags.SLABS) .add(ModBlocks.getRK(ModBlocks.GEODEPACK_BRICK_SLAB));
        tag(BlockTags.SLABS) .add(ModBlocks.getRK(ModBlocks.AMETHYST_BRICK_SLAB));
        tag(BlockTags.SLABS) .add(ModBlocks.getRK(ModBlocks.FLUORITE_BRICK_SLAB));
        tag(BlockTags.SLABS) .add(ModBlocks.getRK(ModBlocks.SALT_BRICK_SLAB));
        tag(BlockTags.SLABS) .add(ModBlocks.getRK(ModBlocks.SELENITE_BRICK_SLAB));
        tag(BlockTags.SLABS) .add(ModBlocks.getRK(ModBlocks.FLINT_BRICK_SLAB));
        tag(BlockTags.SLABS) .add(ModBlocks.getRK(ModBlocks.SPINEL_BRICK_SLAB));
        tag(BlockTags.SLABS) .add(ModBlocks.getRK(ModBlocks.BERYL_BRICK_SLAB));
        tag(BlockTags.SLABS) .add(ModBlocks.getRK(ModBlocks.CELESTINE_BRICK_SLAB));

        tag(BlockTags.BUTTONS) .add(ModBlocks.getRK(ModBlocks. BASALT_BRICK_BUTTON));
        tag(BlockTags.BUTTONS) .add(ModBlocks.getRK(ModBlocks. CALCITE_BRICK_BUTTON));
        tag(BlockTags.BUTTONS) .add(ModBlocks.getRK(ModBlocks. GEODEPACK_BRICK_BUTTON));

        tag(BlockTags.PRESSURE_PLATES) .add(ModBlocks.getRK(ModBlocks.BASALT_BRICK_PRESSURE_PLATE));
        tag(BlockTags.PRESSURE_PLATES) .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_PRESSURE_PLATE));
        tag(BlockTags.PRESSURE_PLATES) .add(ModBlocks.getRK(ModBlocks.GEODEPACK_BRICK_PRESSURE_PLATE));

        tag(BlockTags.WALLS) .add(ModBlocks.getRK(ModBlocks.BASALT_BRICK_WALL));
        tag(BlockTags.WALLS) .add(ModBlocks.getRK(ModBlocks.CALCITE_BRICK_WALL));
        tag(BlockTags.WALLS) .add(ModBlocks.getRK(ModBlocks.GEODEPACK_BRICK_WALL));
        tag(BlockTags.WALLS) .add(ModBlocks.getRK(ModBlocks.SALT_BRICK_WALL));
        tag(BlockTags.WALLS) .add(ModBlocks.getRK(ModBlocks.SELENITE_BRICK_WALL));
        tag(BlockTags.WALLS) .add(ModBlocks.getRK(ModBlocks.CHOCOLATE_DIAMOND_BRICK_WALL));
        tag(BlockTags.WALLS) .add(ModBlocks.getRK(ModBlocks.FLUORITE_BRICK_WALL));
        tag(BlockTags.WALLS) .add(ModBlocks.getRK(ModBlocks.FLINT_BRICK_WALL));
        tag(BlockTags.WALLS) .add(ModBlocks.getRK(ModBlocks.SPINEL_BRICK_WALL));
        tag(BlockTags.WALLS) .add(ModBlocks.getRK(ModBlocks.BERYL_BRICK_WALL));
        tag(BlockTags.WALLS) .add(ModBlocks.getRK(ModBlocks.CELESTINE_BRICK_WALL));


    }
}
