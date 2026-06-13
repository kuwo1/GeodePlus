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
        dropSelf(ModBlocks.SMALL_BERYL_BUD);
        dropSelf(ModBlocks.BERYL_BRICKS);
        dropSelf(ModBlocks.AMETHYST_BRICKS);

    }
}
