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
        blockModelGenerators.createTrivialCube(ModBlocks.BERYL_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.SELENITE_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.SPINEL_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.SPINEL_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.BUDDING_SELENITE);
        blockModelGenerators.createTrivialCube(ModBlocks.SALT_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.SALT_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.FLINT_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.FLINT_BRICKS);
        blockModelGenerators.createTrivialCube(ModBlocks.BUDDING_FLINT);
        blockModelGenerators.createTrivialCube(ModBlocks.CHOCOLATE_DIAMOND_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.BUDDING_CHOCOLATE_DIAMOND);
        blockModelGenerators.createTrivialCube(ModBlocks.FLUORITE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.BUDDING_FLUORITE);
        blockModelGenerators.createTrivialCube(ModBlocks.BUDDING_SALT);
        blockModelGenerators.createTrivialCube(ModBlocks.BUDDING_SPINEL);

        blockModelGenerators.createTrivialCube(ModBlocks.MAGIC_BLOCK);


        blockModelGenerators.family(ModBlocks.BASALT_BRICKS)
                .stairs(ModBlocks.BASALT_BRICK_STAIRS)
                .slab(ModBlocks.BASALT_BRICK_SLAB)
                .button(ModBlocks.BASALT_BRICK_BUTTON)
                .pressurePlate(ModBlocks.BASALT_BRICK_PRESSURE_PLATE)
                .wall(ModBlocks.BASALT_BRICK_WALL);

        blockModelGenerators.family(ModBlocks.CALCITE_BRICKS)
                .stairs(ModBlocks.CALCITE_BRICK_STAIRS)
                .slab(ModBlocks.CALCITE_BRICK_SLAB)
                .button(ModBlocks.CALCITE_BRICK_BUTTON)
                .pressurePlate(ModBlocks.CALCITE_BRICK_PRESSURE_PLATE)
                .wall(ModBlocks.CALCITE_BRICK_WALL);
        blockModelGenerators.family(ModBlocks.GEODEPACK_BRICKS)
                .stairs(ModBlocks.GEODEPACK_BRICK_STAIRS)
                .slab(ModBlocks.GEODEPACK_BRICK_SLAB)
                .button(ModBlocks.GEODEPACK_BRICK_BUTTON)
                .pressurePlate(ModBlocks.GEODEPACK_BRICK_PRESSURE_PLATE)
                .wall(ModBlocks.GEODEPACK_BRICK_WALL);
        blockModelGenerators.family(ModBlocks.CHOCOLATE_DIAMOND_BRICKS)
                .stairs(ModBlocks.CHOCOLATE_DIAMOND_BRICK_STAIRS)
                .slab(ModBlocks.CHOCOLATE_DIAMOND_BRICK_SLAB);
        blockModelGenerators.family(ModBlocks.AMETHYST_BRICKS)
                .stairs(ModBlocks.AMETHYST_BRICK_STAIRS)
                .slab(ModBlocks.AMETHYST_BRICK_SLAB);
        blockModelGenerators.family(ModBlocks.FLUORITE_BRICKS)
                .stairs(ModBlocks.FLUORITE_BRICK_STAIRS)
                .slab(ModBlocks.FLUORITE_BRICK_SLAB);




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
