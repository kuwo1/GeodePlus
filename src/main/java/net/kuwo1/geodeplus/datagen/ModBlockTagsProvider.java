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
                .add(ModBlocks.BUDDING_CELESTINE)
                .add(ModBlocks.SMALL_CELESTINE_BUD)
                .add(ModBlocks.MEDIUM_CELESTINE_BUD)
                .add(ModBlocks.LARGE_CELESTINE_BUD)
                .add(ModBlocks.CELESTINE_CLUSTER)
                .add(ModBlocks.BERYL_BLOCK)
                .add(ModBlocks.BUDDING_BERYL)
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
                .add(ModBlocks.CALCITE_BRICK_STAIRS)
                .add(ModBlocks.CHOCOLATE_DIAMOND_BLOCK)
                .add(ModBlocks.CHOCOLATE_DIAMOND_BRICKS)
                .add(ModBlocks.BUDDING_CHOCOLATE_DIAMOND)
                .add(ModBlocks.FLUORITE_BLOCK)
                .add(ModBlocks.FLUORITE_BRICKS)
                .add(ModBlocks.BUDDING_FLUORITE)
                .add(ModBlocks.BUDDING_SALT)
                .add(ModBlocks.BUDDING_SPINEL)
                .add(ModBlocks.SMALL_FLUORITE_BUD)
                .add(ModBlocks.MEDIUM_FLUORITE_BUD)
                .add(ModBlocks.LARGE_FLUORITE_BUD)
                .add(ModBlocks.FLUORITE_CLUSTER)
                .add(ModBlocks.SMALL_SALT_BUD)
                .add(ModBlocks.MEDIUM_SALT_BUD)
                .add(ModBlocks.LARGE_SALT_BUD)
                .add(ModBlocks.SALT_CLUSTER)
                .add(ModBlocks.SMALL_SELENITE_BUD)
                .add(ModBlocks.MEDIUM_SELENITE_BUD)
                .add(ModBlocks.LARGE_SELENITE_BUD)
                .add(ModBlocks.SELENITE_CLUSTER)
                .add(ModBlocks.SMALL_SPINEL_BUD)
                .add(ModBlocks.MEDIUM_SPINEL_BUD)
                .add(ModBlocks.LARGE_SPINEL_BUD)
                .add(ModBlocks.SPINEL_CLUSTER)
                .add(ModBlocks.SMALL_FLINT_BUD)
                .add(ModBlocks.MEDIUM_FLINT_BUD)
                .add(ModBlocks.LARGE_FLINT_BUD)
                .add(ModBlocks.FLINT_CLUSTER)
                .add(ModBlocks.SMALL_BERYL_BUD)
                .add(ModBlocks.MEDIUM_BERYL_BUD)
                .add(ModBlocks.LARGE_BERYL_BUD)
                .add(ModBlocks.BERYL_CLUSTER)
                .add(ModBlocks.SMALL_CHOCOLATE_DIAMOND_BUD)
                .add(ModBlocks.MEDIUM_CHOCOLATE_DIAMOND_BUD)
                .add(ModBlocks.LARGE_CHOCOLATE_DIAMOND_BUD)
                .add(ModBlocks.CHOCOLATE_DIAMOND_CLUSTER)
                .add(ModBlocks.BASALT_BRICK_STAIRS)
                .add(ModBlocks.CALCITE_BRICK_STAIRS)
                .add(ModBlocks.GEODEPACK_BRICK_STAIRS)
                .add(ModBlocks.CHOCOLATE_DIAMOND_BRICK_STAIRS)
                .add(ModBlocks.AMETHYST_BRICK_STAIRS)
                .add(ModBlocks.FLUORITE_BRICK_STAIRS)
                .add(ModBlocks.SALT_BRICK_STAIRS)
                .add(ModBlocks.SELENITE_BRICK_STAIRS)
                .add(ModBlocks.FLINT_BRICK_STAIRS)
                .add(ModBlocks.SPINEL_BRICK_STAIRS)
                .add(ModBlocks.BERYL_BRICK_STAIRS)
                .add(ModBlocks.CELESTINE_BRICK_STAIRS)
                .add(ModBlocks.BASALT_BRICK_SLAB)
                .add(ModBlocks.CALCITE_BRICK_SLAB)
                .add(ModBlocks.GEODEPACK_BRICK_SLAB)
                .add(ModBlocks.AMETHYST_BRICK_SLAB)
                .add(ModBlocks.FLUORITE_BRICK_SLAB)
                .add(ModBlocks.SALT_BRICK_SLAB)
                .add(ModBlocks.SELENITE_BRICK_SLAB)
                .add(ModBlocks.FLINT_BRICK_SLAB)
                .add(ModBlocks.SELENITE_BRICK_SLAB)
                .add(ModBlocks.FLINT_BRICK_SLAB)
                .add(ModBlocks.SPINEL_BRICK_SLAB)
                .add(ModBlocks.BERYL_BRICK_SLAB)
                .add(ModBlocks.CELESTINE_BRICK_SLAB)


                .add(ModBlocks.MAGIC_BLOCK);

         valueLookupBuilder(BlockTags.STAIRS) .add(ModBlocks.BASALT_BRICK_STAIRS);
         valueLookupBuilder(BlockTags.STAIRS) .add(ModBlocks.CALCITE_BRICK_STAIRS);
         valueLookupBuilder(BlockTags.STAIRS) .add(ModBlocks.GEODEPACK_BRICK_STAIRS);
         valueLookupBuilder(BlockTags.STAIRS) .add(ModBlocks.CHOCOLATE_DIAMOND_BRICK_STAIRS);
         valueLookupBuilder(BlockTags.STAIRS) .add(ModBlocks.AMETHYST_BRICK_STAIRS);
         valueLookupBuilder(BlockTags.STAIRS) .add(ModBlocks.FLUORITE_BRICK_STAIRS);
         valueLookupBuilder(BlockTags.STAIRS) .add(ModBlocks.SALT_BRICK_STAIRS);
         valueLookupBuilder(BlockTags.STAIRS) .add(ModBlocks.SELENITE_BRICK_STAIRS);
         valueLookupBuilder(BlockTags.STAIRS) .add(ModBlocks.FLINT_BRICK_STAIRS);
         valueLookupBuilder(BlockTags.STAIRS) .add(ModBlocks.SPINEL_BRICK_STAIRS);
         valueLookupBuilder(BlockTags.STAIRS) .add(ModBlocks.BERYL_BRICK_STAIRS);
         valueLookupBuilder(BlockTags.STAIRS) .add(ModBlocks.CELESTINE_BRICK_STAIRS);


        valueLookupBuilder(BlockTags.SLABS) .add(ModBlocks.BASALT_BRICK_SLAB);
        valueLookupBuilder(BlockTags.SLABS) .add(ModBlocks.CALCITE_BRICK_SLAB);
        valueLookupBuilder(BlockTags.SLABS) .add(ModBlocks.GEODEPACK_BRICK_SLAB);
        valueLookupBuilder(BlockTags.SLABS) .add(ModBlocks.AMETHYST_BRICK_SLAB);
        valueLookupBuilder(BlockTags.SLABS) .add(ModBlocks.FLUORITE_BRICK_SLAB);
        valueLookupBuilder(BlockTags.SLABS) .add(ModBlocks.SALT_BRICK_SLAB);
        valueLookupBuilder(BlockTags.SLABS) .add(ModBlocks.SELENITE_BRICK_SLAB);
        valueLookupBuilder(BlockTags.SLABS) .add(ModBlocks.FLINT_BRICK_SLAB);
        valueLookupBuilder(BlockTags.SLABS) .add(ModBlocks.SPINEL_BRICK_SLAB);
        valueLookupBuilder(BlockTags.SLABS) .add(ModBlocks.BERYL_BRICK_SLAB);
        valueLookupBuilder(BlockTags.SLABS) .add(ModBlocks.CELESTINE_BRICK_SLAB);

        valueLookupBuilder(BlockTags.BUTTONS) .add(ModBlocks. BASALT_BRICK_BUTTON);
        valueLookupBuilder(BlockTags.BUTTONS) .add(ModBlocks. CALCITE_BRICK_BUTTON);
        valueLookupBuilder(BlockTags.BUTTONS) .add(ModBlocks. GEODEPACK_BRICK_BUTTON);

        valueLookupBuilder(BlockTags.PRESSURE_PLATES) .add(ModBlocks.BASALT_BRICK_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.PRESSURE_PLATES) .add(ModBlocks.CALCITE_BRICK_PRESSURE_PLATE);
        valueLookupBuilder(BlockTags.PRESSURE_PLATES) .add(ModBlocks.GEODEPACK_BRICK_PRESSURE_PLATE);

        valueLookupBuilder(BlockTags.WALLS) .add(ModBlocks.BASALT_BRICK_WALL);
        valueLookupBuilder(BlockTags.WALLS) .add(ModBlocks.CALCITE_BRICK_WALL);
        valueLookupBuilder(BlockTags.WALLS) .add(ModBlocks.GEODEPACK_BRICK_WALL);
        valueLookupBuilder(BlockTags.WALLS) .add(ModBlocks.SALT_BRICK_WALL);
        valueLookupBuilder(BlockTags.WALLS) .add(ModBlocks.SELENITE_BRICK_WALL);
        valueLookupBuilder(BlockTags.WALLS) .add(ModBlocks.CHOCOLATE_DIAMOND_BRICK_WALL);
        valueLookupBuilder(BlockTags.WALLS) .add(ModBlocks.FLUORITE_BRICK_WALL);
        valueLookupBuilder(BlockTags.WALLS) .add(ModBlocks.FLINT_BRICK_WALL);
        valueLookupBuilder(BlockTags.WALLS) .add(ModBlocks.SPINEL_BRICK_WALL);
        valueLookupBuilder(BlockTags.WALLS) .add(ModBlocks.BERYL_BRICK_WALL);
        valueLookupBuilder(BlockTags.WALLS) .add(ModBlocks.CELESTINE_BRICK_WALL);


    }
}
