package net.kuwo1.geodeplus.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.kuwo1.geodeplus.Item.ModItems;
import net.kuwo1.geodeplus.block.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.BASALT_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.CALCITE_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.GEODEPACK_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.GEODEPACK_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.SELENITE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.GEODEPACK);
        blockModelGenerators.createTrivialCube(ModBlocks.CELESTINE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.CELESTINE_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.BUDDING_CELESTINE);
        blockModelGenerators.createTrivialCube(ModBlocks.SMALL_CELESTINE_BUD);
        blockModelGenerators.createTrivialCube(ModBlocks.MEDIUM_CELESTINE_BUD);
        blockModelGenerators.createTrivialCube(ModBlocks.LARGE_CELESTINE_BUD);
        blockModelGenerators.createTrivialCube(ModBlocks.CELESTINE_CLUSTER);
        blockModelGenerators.createTrivialCube(ModBlocks.BERYL_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.BUDDING_BERYL);
        blockModelGenerators.createTrivialCube(ModBlocks.SMALL_BERYL_BUD);
        blockModelGenerators.createTrivialCube(ModBlocks.BERYL_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.AMETHYST_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.SELENITE_BRICKS);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
    itemModelGenerators.generateFlatItem(ModItems.BASALTCLUMP, ModelTemplates.FLAT_ITEM);
    itemModelGenerators.generateFlatItem(ModItems.CALCITECLUMP, ModelTemplates.FLAT_ITEM);
    itemModelGenerators.generateFlatItem(ModItems.CELESTINESHARD, ModelTemplates.FLAT_ITEM);
    itemModelGenerators.generateFlatItem(ModItems.BERYLSHARD, ModelTemplates.FLAT_ITEM);
    itemModelGenerators.generateFlatItem(ModItems.SPINELSHARD, ModelTemplates.FLAT_ITEM);
    itemModelGenerators.generateFlatItem(ModItems.FLUORITESHARD, ModelTemplates.FLAT_ITEM);
    itemModelGenerators.generateFlatItem(ModItems.CHOCOLATEDIAMONDSHARD, ModelTemplates.FLAT_ITEM);
    itemModelGenerators.generateFlatItem(ModItems.SALTSHARD, ModelTemplates.FLAT_ITEM);
    itemModelGenerators.generateFlatItem(ModItems.SELENITESHARD, ModelTemplates.FLAT_ITEM);
    itemModelGenerators.generateFlatItem(ModItems.FLINTSHARD, ModelTemplates.FLAT_ITEM);
    }
}
