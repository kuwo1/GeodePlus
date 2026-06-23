package net.kuwo1.geodeplus.block;


import net.kuwo1.geodeplus.Geode;
import net.kuwo1.geodeplus.block.custom.MagicBlock;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.DirectionalPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.AmethystClusterBlock;

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
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block CELESTINE_BRICKS = registerBlock("celestine_bricks",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block BUDDING_CELESTINE = registerBlock("budding_celestine",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block SMALL_CELESTINE_BUD = registerBlock("small_celestine_bud",
            properties -> new AmethystClusterBlock(
                    3,
                    8,
                    properties
                            .strength(1.5F)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .lightLevel(state ->1)
                            .noOcclusion()));
   public static final Block MEDIUM_CELESTINE_BUD = registerBlock("medium_celestine_bud",
            properties -> new AmethystClusterBlock(
                    4,
                    10,
                    properties
                            .strength(1.5F)
                            .sound(SoundType.MEDIUM_AMETHYST_BUD)
                            .lightLevel(state ->2)
                            .noOcclusion()));
   public static final Block LARGE_CELESTINE_BUD = registerBlock("large_celestine_bud",
            properties -> new AmethystClusterBlock(
                    5,
                    10,
                    properties
                            .strength(1.5F)
                            .sound(SoundType.LARGE_AMETHYST_BUD)
                            .lightLevel(state ->4)
                            .noOcclusion()));
   public static final Block CELESTINE_CLUSTER = registerBlock("celestine_cluster",
            properties -> new AmethystClusterBlock(
                    7,
                    10,
                    properties
                            .strength(1.5F)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .lightLevel(state ->5)
                            .noOcclusion()));
   public static final Block SMALL_FLUORITE_BUD = registerBlock("small_fluorite_bud",
            properties -> new AmethystClusterBlock(
                    3,
                    8,
                    properties
                            .strength(1.5F)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .lightLevel(state ->1)
                            .noOcclusion()));
   public static final Block MEDIUM_FLUORITE_BUD = registerBlock("medium_fluorite_bud",
            properties -> new AmethystClusterBlock(
                    4,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->2)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
   public static final Block LARGE_FLUORITE_BUD = registerBlock("large_fluorite_bud",
            properties -> new AmethystClusterBlock(
                    5,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->4)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
   public static final Block FLUORITE_CLUSTER = registerBlock("fluorite_cluster",
            properties -> new AmethystClusterBlock(
                    7,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->5)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
   public static final Block SMALL_SALT_BUD = registerBlock("small_salt_bud",
            properties -> new AmethystClusterBlock(
                    3,
                    8,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->1)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
   public static final Block MEDIUM_SALT_BUD = registerBlock("medium_salt_bud",
            properties -> new AmethystClusterBlock(
                    4,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->2)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
   public static final Block LARGE_SALT_BUD = registerBlock("large_salt_bud",
            properties -> new AmethystClusterBlock(
                    5,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->4)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
   public static final Block SALT_CLUSTER = registerBlock("salt_cluster",
            properties -> new AmethystClusterBlock(
                    7,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->5)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
   public static final Block SMALL_SELENITE_BUD = registerBlock("small_selenite_bud",
            properties -> new AmethystClusterBlock(
                    3,
                    8,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->1)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
   public static final Block MEDIUM_SELENITE_BUD = registerBlock("medium_selenite_bud",
            properties -> new AmethystClusterBlock(
                    4,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->2)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
   public static final Block LARGE_SELENITE_BUD = registerBlock("large_selenite_bud",
            properties -> new AmethystClusterBlock(
                    5,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->4)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
   public static final Block SELENITE_CLUSTER = registerBlock("selenite_cluster",
            properties -> new AmethystClusterBlock(
                    7,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->5)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
   public static final Block SMALL_SPINEL_BUD = registerBlock("small_spinel_bud",
            properties -> new AmethystClusterBlock(
                    3,
                    8,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->1)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
   public static final Block MEDIUM_SPINEL_BUD = registerBlock("medium_spinel_bud",
            properties -> new AmethystClusterBlock(
                    4,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->2)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
   public static final Block LARGE_SPINEL_BUD = registerBlock("large_spinel_bud",
            properties -> new AmethystClusterBlock(
                    5,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->4)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
 public static final Block SPINEL_CLUSTER = registerBlock("spinel_cluster",
            properties -> new AmethystClusterBlock(
                    7,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->5)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
 public static final Block SMALL_FLINT_BUD = registerBlock("small_flint_bud",
            properties -> new AmethystClusterBlock(
                    3,
                    8,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->1)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
 public static final Block MEDIUM_FLINT_BUD = registerBlock("medium_flint_bud",
            properties -> new AmethystClusterBlock(
                    4,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->2)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
 public static final Block LARGE_FLINT_BUD = registerBlock("large_flint_bud",
            properties -> new AmethystClusterBlock(
                    5,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->4)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
 public static final Block FLINT_CLUSTER = registerBlock("flint_cluster",
            properties -> new AmethystClusterBlock(
                    7,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->5)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
 public static final Block SMALL_BERYL_BUD = registerBlock("small_beryl_bud",
            properties -> new AmethystClusterBlock(
                    3,
                    8,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->1)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
 public static final Block MEDIUM_BERYL_BUD = registerBlock("medium_beryl_bud",
            properties -> new AmethystClusterBlock(
                    4,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->2)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
 public static final Block LARGE_BERYL_BUD = registerBlock("large_beryl_bud",
            properties -> new AmethystClusterBlock(
                    5,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->4)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
 public static final Block BERYL_CLUSTER = registerBlock("beryl_cluster",
            properties -> new AmethystClusterBlock(
                    7,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->5)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
 public static final Block SMALL_CHOCOLATE_DIAMOND_BUD = registerBlock("small_chocolate_diamond_bud",
            properties -> new AmethystClusterBlock(
                    3,
                    8,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->1)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
 public static final Block MEDIUM_CHOCOLATE_DIAMOND_BUD = registerBlock("medium_chocolate_diamond_bud",
            properties -> new AmethystClusterBlock(
                    4,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->2)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
 public static final Block LARGE_CHOCOLATE_DIAMOND_BUD = registerBlock("large_chocolate_diamond_bud",
            properties -> new AmethystClusterBlock(
                    5,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->4)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));
 public static final Block CHOCOLATE_DIAMOND_CLUSTER = registerBlock("chocolate_diamond_cluster",
            properties -> new AmethystClusterBlock(
                    7,
                    10,
                    properties
                            .strength(1.5F)
                            .lightLevel(state ->5)
                            .sound(SoundType.SMALL_AMETHYST_BUD)
                            .noOcclusion()));




   public static final Block BERYL_BLOCK = registerBlock("beryl_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block BUDDING_BERYL = registerBlock("budding_beryl",
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
   public static final Block SPINEL_BRICKS = registerBlock("spinel_bricks",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block BUDDING_SELENITE = registerBlock("budding_selenite",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block SALT_BLOCK = registerBlock("salt_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
   public static final Block SALT_BRICKS = registerBlock("salt_bricks",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block FLINT_BLOCK = registerBlock("flint_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final Block FLINT_BRICKS = registerBlock("flint_bricks",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block BUDDING_FLINT = registerBlock("budding_flint",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block CHOCOLATE_DIAMOND_BLOCK = registerBlock("chocolate_diamond_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block CHOCOLATE_DIAMOND_BRICKS = registerBlock("chocolate_diamond_bricks",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block BUDDING_CHOCOLATE_DIAMOND = registerBlock("budding_chocolate_diamond",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block FLUORITE_BLOCK = registerBlock("fluorite_block",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block FLUORITE_BRICKS = registerBlock("fluorite_bricks",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block BUDDING_FLUORITE = registerBlock("budding_fluorite",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block BUDDING_SALT = registerBlock("budding_salt",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));
    public static final Block BUDDING_SPINEL = registerBlock("budding_spinel",
            properties -> new Block(properties.strength(3f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final Block MAGIC_BLOCK = registerBlock("magic_block",
            properties -> new MagicBlock(properties.strength(2f)
                    .requiresCorrectToolForDrops().sound(SoundType.AMETHYST)));

    public static final Block BASALT_BRICK_STAIRS = registerBlock("basalt_brick_stairs",
            properties -> new StairBlock(ModBlocks.BASALT_BRICKS.defaultBlockState(),
                    properties.strength(4f).sound(SoundType.BASALT).requiresCorrectToolForDrops()));
    public static final Block CHOCOLATE_DIAMOND_BRICK_STAIRS = registerBlock("chocolate_diamond_brick_stairs",
            properties -> new StairBlock(ModBlocks.BASALT_BRICKS.defaultBlockState(),
                    properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            properties -> new StairBlock(ModBlocks.BASALT_BRICKS.defaultBlockState(),
                    properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block GEODEPACK_BRICK_STAIRS = registerBlock("geodepack_brick_stairs",
            properties -> new StairBlock(ModBlocks.BASALT_BRICKS.defaultBlockState(),
                    properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block AMETHYST_BRICK_STAIRS = registerBlock("amethyst_brick_stairs",
            properties -> new StairBlock(ModBlocks.BASALT_BRICKS.defaultBlockState(),
                    properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block FLUORITE_BRICK_STAIRS = registerBlock("fluorite_brick_stairs",
            properties -> new StairBlock(ModBlocks.BASALT_BRICKS.defaultBlockState(),
                    properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block SALT_BRICK_STAIRS = registerBlock("salt_brick_stairs",
            properties -> new StairBlock(ModBlocks.BASALT_BRICKS.defaultBlockState(),
                    properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block SELENITE_BRICK_STAIRS = registerBlock("selenite_brick_stairs",
            properties -> new StairBlock(ModBlocks.BASALT_BRICKS.defaultBlockState(),
                    properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block FLINT_BRICK_STAIRS = registerBlock("flint_brick_stairs",
            properties -> new StairBlock(ModBlocks.BASALT_BRICKS.defaultBlockState(),
                    properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block SPINEL_BRICK_STAIRS = registerBlock("spinel_brick_stairs",
            properties -> new StairBlock(ModBlocks.BASALT_BRICKS.defaultBlockState(),
                    properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block BERYL_BRICK_STAIRS = registerBlock("beryl_brick_stairs",
            properties -> new StairBlock(ModBlocks.BASALT_BRICKS.defaultBlockState(),
                    properties.strength(4f).requiresCorrectToolForDrops()));

    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            properties -> new SlabBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block BASALT_BRICK_SLAB = registerBlock("basalt_brick_slab",
            properties -> new SlabBlock(properties.strength(4f).sound(SoundType.BASALT).requiresCorrectToolForDrops()));
    public static final Block GEODEPACK_BRICK_SLAB = registerBlock("geodepack_brick_slab",
            properties -> new SlabBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block CHOCOLATE_DIAMOND_BRICK_SLAB = registerBlock("chocolate_diamond_brick_slab",
            properties -> new SlabBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block AMETHYST_BRICK_SLAB = registerBlock("amethyst_brick_slab",
            properties -> new SlabBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block FLUORITE_BRICK_SLAB = registerBlock("fluorite_brick_slab",
            properties -> new SlabBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block SALT_BRICK_SLAB = registerBlock("salt_brick_slab",
            properties -> new SlabBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block SELENITE_BRICK_SLAB = registerBlock("selenite_brick_slab",
            properties -> new SlabBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block FLINT_BRICK_SLAB = registerBlock("flint_brick_slab",
            properties -> new SlabBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block SPINEL_BRICK_SLAB = registerBlock("spinel_brick_slab",
            properties -> new SlabBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block BERYL_BRICK_SLAB = registerBlock("beryl_brick_slab",
            properties -> new SlabBlock(properties.strength(4f).requiresCorrectToolForDrops()));

    public static final Block BASALT_BRICK_BUTTON = registerBlock("basalt_brick_button",
            properties -> new ButtonBlock(BlockSetType.IRON,20,
                    properties.strength(3f).sound(SoundType.BASALT).noCollision()));
    public static final Block CALCITE_BRICK_BUTTON = registerBlock("calcite_brick_button",
            properties -> new ButtonBlock(BlockSetType.IRON,20,
                    properties.strength(3f).noCollision()));
    public static final Block GEODEPACK_BRICK_BUTTON = registerBlock("geodepack_brick_button",
            properties -> new ButtonBlock(BlockSetType.IRON,20,
                    properties.strength(3f).noCollision()));

    public static final Block BASALT_BRICK_PRESSURE_PLATE = registerBlock("basalt_brick_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.IRON,
                    properties
                            .mapColor(MapColor.STONE)
                            .forceSolidOn()
                            .noCollision()
                            .strength(0.5F)
                            .sound(SoundType.BASALT)
                            .pushReaction(PushReaction.DESTROY)));
    public static final Block CALCITE_BRICK_PRESSURE_PLATE = registerBlock("calcite_brick_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.IRON,
                    properties
                            .mapColor(MapColor.STONE)
                            .forceSolidOn()
                            .noCollision()
                            .strength(0.5F)
                            .pushReaction(PushReaction.DESTROY)));
    public static final Block GEODEPACK_BRICK_PRESSURE_PLATE = registerBlock("geodepack_brick_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.IRON,
                    properties
                            .mapColor(MapColor.STONE)
                            .forceSolidOn()
                            .noCollision()
                            .strength(0.5F)
                            .pushReaction(PushReaction.DESTROY)));

    public static final Block BASALT_BRICK_WALL = registerBlock("basalt_brick_wall",
            properties -> new WallBlock(properties.strength(4f).sound(SoundType.BASALT).requiresCorrectToolForDrops()));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            properties -> new WallBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block GEODEPACK_BRICK_WALL = registerBlock("geodepack_brick_wall",
            properties -> new WallBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block SALT_BRICK_WALL = registerBlock("salt_brick_wall",
            properties -> new WallBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block SELENITE_BRICK_WALL = registerBlock("selenite_brick_wall",
            properties -> new WallBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block CHOCOLATE_DIAMOND_BRICK_WALL = registerBlock("chocolate_diamond_brick_wall",
            properties -> new WallBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block FLUORITE_BRICK_WALL = registerBlock("fluorite_brick_wall",
            properties -> new WallBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block FLINT_BRICK_WALL = registerBlock("flint_brick_wall",
            properties -> new WallBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block SPINEL_BRICK_WALL = registerBlock("spinel_brick_wall",
            properties -> new WallBlock(properties.strength(4f).requiresCorrectToolForDrops()));
    public static final Block BERYL_BRICK_WALL = registerBlock("beryl_brick_wall",
            properties -> new WallBlock(properties.strength(4f).requiresCorrectToolForDrops()));




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
