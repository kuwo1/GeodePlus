package net.kuwo1.geodeplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.kuwo1.geodeplus.block.ModBlocks;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        dropSelf(ModBlocks.SELENITE_BLOCK);
        dropSelf(ModBlocks.GEODEPACK_BLOCK);
        dropSelf(ModBlocks.GEODEPACK_BRICKS);
        dropSelf(ModBlocks.CALCITE_BRICKS);
        dropSelf(ModBlocks.BASALT_BRICKS);
        dropSelf(ModBlocks.CELESTINE_BLOCK);
        dropSelf(ModBlocks.BUDDING_CELESTINE);
        dropSelf(ModBlocks.GEODEPACK);
        dropSelf(ModBlocks.CELESTINE_BRICKS);
        dropSelf(ModBlocks.SMALL_CELESTINE_BUD);
        dropSelf(ModBlocks.MEDIUM_CELESTINE_BUD);
        dropSelf(ModBlocks.LARGE_CELESTINE_BUD);
        dropSelf(ModBlocks.CELESTINE_CLUSTER);
        dropSelf(ModBlocks.BERYL_BLOCK);
        dropSelf(ModBlocks.BUDDING_BERYL);
        dropSelf(ModBlocks.BERYL_BRICKS);
        dropSelf(ModBlocks.AMETHYST_BRICKS);
        dropSelf(ModBlocks.SELENITE_BRICKS);
        dropSelf(ModBlocks.SPINEL_BLOCK);
        dropSelf(ModBlocks.SPINEL_BRICKS);
        dropSelf(ModBlocks.BUDDING_SELENITE);
        dropSelf(ModBlocks.SALT_BLOCK);
        dropSelf(ModBlocks.SALT_BRICKS);
        dropSelf(ModBlocks.FLINT_BLOCK);
        dropSelf(ModBlocks.FLINT_BRICKS);
        dropSelf(ModBlocks.BUDDING_FLINT);
        dropSelf(ModBlocks.CHOCOLATE_DIAMOND_BLOCK);
        dropSelf(ModBlocks.CHOCOLATE_DIAMOND_BRICKS);
        dropSelf(ModBlocks.BUDDING_CHOCOLATE_DIAMOND);
        dropSelf(ModBlocks.FLUORITE_BLOCK);
        dropSelf(ModBlocks.FLUORITE_BRICKS);
        dropSelf(ModBlocks.BUDDING_FLUORITE);
        dropSelf(ModBlocks.BUDDING_SALT);
        dropSelf(ModBlocks.BUDDING_SPINEL);

        dropSelf(ModBlocks.MAGIC_BLOCK);


        dropSelf(ModBlocks.BASALT_BRICK_STAIRS);
        dropSelf(ModBlocks.CALCITE_BRICK_STAIRS);
        dropSelf(ModBlocks.GEODEPACK_BRICK_STAIRS);
        dropSelf(ModBlocks.CHOCOLATE_DIAMOND_BRICK_STAIRS);
        dropSelf(ModBlocks.AMETHYST_BRICK_STAIRS);
        dropSelf(ModBlocks.FLUORITE_BRICK_STAIRS);

        add(ModBlocks.BASALT_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.CALCITE_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.GEODEPACK_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.CHOCOLATE_DIAMOND_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.AMETHYST_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.FLUORITE_BRICK_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.BASALT_BRICK_BUTTON);
        dropSelf(ModBlocks.CALCITE_BRICK_BUTTON);
        dropSelf(ModBlocks.GEODEPACK_BRICK_BUTTON);

        dropSelf(ModBlocks.BASALT_BRICK_PRESSURE_PLATE);
        dropSelf(ModBlocks.CALCITE_BRICK_PRESSURE_PLATE);
        dropSelf(ModBlocks.GEODEPACK_BRICK_PRESSURE_PLATE);

        dropSelf(ModBlocks.BASALT_BRICK_WALL);
        dropSelf(ModBlocks.CALCITE_BRICK_WALL);
        dropSelf(ModBlocks.GEODEPACK_BRICK_WALL);

    }
}
