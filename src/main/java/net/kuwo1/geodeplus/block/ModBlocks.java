package net.kuwo1.geodeplus.block;


import net.kuwo1.geodeplus.Geode;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModBlocks {
    public static final Block BASALT_BRICKS = registerBlock("basalt_bricks",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.BASALT)));
   public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.CALCITE)));
   public static final Block GEODEPACK_BRICKS = registerBlock("geodepack_bricks",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
   public static final Block GEODEPACK_BLOCK = registerBlock("geodepack_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
   public static final Block SELENITE_BLOCK = registerBlock("selenite_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block GEODEPACK = registerBlock("geodepack",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
   public static final Block CELESTINE_BLOCK = registerBlock("celestine_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
   public static final Block CELESTINE_BRICKS = registerBlock("celestine_bricks",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
   public static final Block BUDDING_CELESTINE = registerBlock("budding_celestine",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block SMALL_CELESTINE_BUD = registerBlock("small_celestine_bud",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block MEDIUM_CELESTINE_BUD = registerBlock("medium_celestine_bud",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block LARGE_CELESTINE_BUD = registerBlock("large_celestine_bud",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block CELESTINE_CLUSTER = registerBlock("celestine_cluster",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block BERYL_BLOCK = registerBlock("beryl_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block BUDDING_BERYL = registerBlock("budding_beryl",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block SMALL_BERYL_BUD = registerBlock("small_beryl_bud",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block BERYL_BRICKS = registerBlock("beryl_bricks",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block AMETHYST_BRICKS = registerBlock("amethyst_bricks",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block SELENITE_BRICKS = registerBlock("selenite_bricks",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block SPINEL_BLOCK = registerBlock("spinel_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block SPINEL_BRICKS = registerBlock("spinel_brick",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function){
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Geode.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Geode.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Geode.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Geode.MOD_ID, name)))));
    }


    public static void registerModBlocks(){
        Geode.LOGGER.info("Registering Mod Blocks for " + Geode.MOD_ID);


    }
}
