package net.kuwo1.geodeplus.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.kuwo1.geodeplus.Geode;
import net.kuwo1.geodeplus.Item.ModItems;
import net.kuwo1.geodeplus.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab GEODE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Geode.MOD_ID, "geode_items"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(ModItems.BASALTCLUMP))
                    .title(Component.translatable("creativemodetab.geode.geode_items"))
                    .displayItems((parameters, output) -> {
                      output.accept(ModItems.BASALTCLUMP);
                      output.accept(ModItems.CALCITECLUMP);
                      output.accept(ModItems.CELESTINESHARD);
                      output.accept(ModItems.BERYLSHARD);
                      output.accept(ModItems.SPINELSHARD);
                      output.accept(ModItems.FLUORITESHARD);
                      output.accept(ModItems.CHOCOLATEDIAMONDSHARD);
                      output.accept(ModItems.SALTSHARD);
                      output.accept(ModItems.SELENITESHARD);
                      output.accept(ModItems.FLINTSHARD);


                    }).build());

    public static final CreativeModeTab GEODE_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Geode.MOD_ID, "geode_blocks"),
            FabricCreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.BASALT_BRICKS))
                    .title(Component.translatable("creativemodetab.geode.geode_blocks"))
                    .displayItems((parameters, output) -> {
                      output.accept(ModBlocks.BASALT_BRICKS);
                      output.accept(ModBlocks.CALCITE_BRICKS);
                      output.accept(ModBlocks.GEODEPACK_BRICKS);
                      output.accept(ModBlocks.GEODEPACK_BLOCK);
                      output.accept(ModBlocks.SELENITE_BLOCK);
                      output.accept(ModBlocks.CELESTINE_BLOCK);
                      output.accept(ModBlocks.CELESTINE_BRICKS);
                      output.accept(ModBlocks.BUDDING_CELESTINE);
                      output.accept(ModBlocks.SMALL_CELESTINE_BUD);
                      output.accept(ModBlocks.MEDIUM_CELESTINE_BUD);
                      output.accept(ModBlocks.LARGE_CELESTINE_BUD);
                      output.accept(ModBlocks.CELESTINE_CLUSTER);
                      output.accept(ModBlocks.BERYL_BLOCK);
                      output.accept(ModBlocks.BUDDING_BERYL);
                      output.accept(ModBlocks.BERYL_BRICKS);
                      output.accept(ModBlocks.AMETHYST_BRICKS);
                      output.accept(ModBlocks.SELENITE_BRICKS);
                      output.accept(ModBlocks.SPINEL_BLOCK);
                      output.accept(ModBlocks.SPINEL_BRICKS);
                      output.accept(ModBlocks.BUDDING_SELENITE);
                      output.accept(ModBlocks.SALT_BLOCK);
                      output.accept(ModBlocks.SALT_BRICKS);
                      output.accept(ModBlocks.FLINT_BLOCK);
                      output.accept(ModBlocks.FLINT_BRICKS);
                      output.accept(ModBlocks.BUDDING_FLINT);
                      output.accept(ModBlocks.CHOCOLATE_DIAMOND_BLOCK);
                      output.accept(ModBlocks.CHOCOLATE_DIAMOND_BRICKS);
                      output.accept(ModBlocks.BUDDING_CHOCOLATE_DIAMOND);
                      output.accept(ModBlocks.FLUORITE_BLOCK);
                      output.accept(ModBlocks.FLUORITE_BRICKS);
                      output.accept(ModBlocks.BUDDING_FLUORITE);
                      output.accept(ModBlocks.BUDDING_SALT);
                      output.accept(ModBlocks.BUDDING_SPINEL);
                      output.accept(ModBlocks.SMALL_FLUORITE_BUD);
                      output.accept(ModBlocks.MEDIUM_FLUORITE_BUD);
                      output.accept(ModBlocks.LARGE_FLUORITE_BUD);
                      output.accept(ModBlocks.FLUORITE_CLUSTER);
                      output.accept(ModBlocks.SMALL_SALT_BUD);
                      output.accept(ModBlocks.MEDIUM_SALT_BUD);
                      output.accept(ModBlocks.LARGE_SALT_BUD);
                      output.accept(ModBlocks.SALT_CLUSTER);
                      output.accept(ModBlocks.SMALL_SELENITE_BUD);
                      output.accept(ModBlocks.MEDIUM_SELENITE_BUD);
                      output.accept(ModBlocks.LARGE_SELENITE_BUD);
                      output.accept(ModBlocks.SELENITE_CLUSTER);
                      output.accept(ModBlocks.SMALL_SPINEL_BUD);
                      output.accept(ModBlocks.MEDIUM_SPINEL_BUD);
                      output.accept(ModBlocks.LARGE_SPINEL_BUD);
                      output.accept(ModBlocks.SPINEL_CLUSTER);
                      output.accept(ModBlocks.SMALL_FLINT_BUD);
                      output.accept(ModBlocks.MEDIUM_FLINT_BUD);
                      output.accept(ModBlocks.LARGE_FLINT_BUD);
                      output.accept(ModBlocks.FLINT_CLUSTER);
                      output.accept(ModBlocks.SMALL_BERYL_BUD);
                      output.accept(ModBlocks.MEDIUM_BERYL_BUD);
                      output.accept(ModBlocks.LARGE_BERYL_BUD);
                      output.accept(ModBlocks.BERYL_CLUSTER);
                      output.accept(ModBlocks.SMALL_CHOCOLATE_DIAMOND_BUD);
                      output.accept(ModBlocks.MEDIUM_CHOCOLATE_DIAMOND_BUD);
                      output.accept(ModBlocks.LARGE_CHOCOLATE_DIAMOND_BUD);
                      output.accept(ModBlocks.CHOCOLATE_DIAMOND_CLUSTER);
                      output.accept(ModBlocks.CRACKED_BASALT_BRICKS);
                      output.accept(ModBlocks.CRACKED_CALCITE_BRICKS);










                      output.accept(ModBlocks.BASALT_BRICK_STAIRS);
                      output.accept(ModBlocks.CALCITE_BRICK_STAIRS);
                      output.accept(ModBlocks.GEODEPACK_BRICK_STAIRS);
                      output.accept(ModBlocks.CHOCOLATE_DIAMOND_BRICK_STAIRS);
                      output.accept(ModBlocks.AMETHYST_BRICK_STAIRS);
                      output.accept(ModBlocks.FLUORITE_BRICK_STAIRS);
                      output.accept(ModBlocks.SELENITE_BRICK_STAIRS);
                      output.accept(ModBlocks.SALT_BRICK_STAIRS);
                      output.accept(ModBlocks.FLINT_BRICK_STAIRS);
                      output.accept(ModBlocks.SPINEL_BRICK_STAIRS);
                      output.accept(ModBlocks.BERYL_BRICK_STAIRS);
                      output.accept(ModBlocks.CELESTINE_BRICK_STAIRS);


                      output.accept(ModBlocks.CALCITE_BRICK_SLAB);
                      output.accept(ModBlocks.BASALT_BRICK_SLAB);
                      output.accept(ModBlocks.GEODEPACK_BRICK_SLAB);
                      output.accept(ModBlocks.CHOCOLATE_DIAMOND_BRICK_SLAB);
                      output.accept(ModBlocks.AMETHYST_BRICK_SLAB);
                      output.accept(ModBlocks.FLUORITE_BRICK_SLAB);
                      output.accept(ModBlocks.SELENITE_BRICK_SLAB);
                      output.accept(ModBlocks.SALT_BRICK_SLAB);
                      output.accept(ModBlocks.FLINT_BRICK_SLAB);
                      output.accept(ModBlocks.SPINEL_BRICK_SLAB);
                      output.accept(ModBlocks.BERYL_BRICK_SLAB);
                      output.accept(ModBlocks.CELESTINE_BRICK_SLAB);


                        output.accept(ModBlocks.BASALT_BRICK_BUTTON);
                      output.accept(ModBlocks.CALCITE_BRICK_BUTTON);
                      output.accept(ModBlocks.GEODEPACK_BRICK_BUTTON);

                      output.accept(ModBlocks.BASALT_BRICK_PRESSURE_PLATE);
                      output.accept(ModBlocks.CALCITE_BRICK_PRESSURE_PLATE);
                      output.accept(ModBlocks.GEODEPACK_BRICK_PRESSURE_PLATE);

                      output.accept(ModBlocks.BASALT_BRICK_WALL);
                      output.accept(ModBlocks.CALCITE_BRICK_WALL);
                      output.accept(ModBlocks.GEODEPACK_BRICK_WALL);
                      output.accept(ModBlocks.SELENITE_BRICK_WALL);
                      output.accept(ModBlocks.SALT_BRICK_WALL);
                      output.accept(ModBlocks.CHOCOLATE_DIAMOND_BRICK_WALL);
                      output.accept(ModBlocks.FLUORITE_BRICK_WALL);
                      output.accept(ModBlocks.FLINT_BRICK_WALL);
                      output.accept(ModBlocks.SPINEL_BRICK_WALL);
                      output.accept(ModBlocks.BERYL_BRICK_WALL);
                      output.accept(ModBlocks.CELESTINE_BRICK_WALL);


                    }).build());



    public static void registerModCreativeModeTabs() {
        Geode.LOGGER.info("Registering Creative Mode Tabs for" + Geode.MOD_ID);
    }
}
