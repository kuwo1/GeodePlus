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
                      output.accept(ModBlocks.GEODEPACK);
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

                      output.accept(ModBlocks.MAGIC_BLOCK);

                      output.accept(ModBlocks.BASALT_BRICK_STAIRS);
                      output.accept(ModBlocks.CALCITE_BRICK_STAIRS);
                      output.accept(ModBlocks.GEODEPACK_BRICK_STAIRS);
                      output.accept(ModBlocks.CHOCOLATE_DIAMOND_BRICK_STAIRS);
                      output.accept(ModBlocks.AMETHYST_BRICK_STAIRS);


                      output.accept(ModBlocks.CALCITE_BRICK_SLAB);
                      output.accept(ModBlocks.BASALT_BRICK_SLAB);
                      output.accept(ModBlocks.GEODEPACK_BRICK_SLAB);
                      output.accept(ModBlocks.CHOCOLATE_DIAMOND_BRICK_SLAB);
                      output.accept(ModBlocks.AMETHYST_BRICK_SLAB);

                      output.accept(ModBlocks.BASALT_BRICK_BUTTON);
                      output.accept(ModBlocks.CALCITE_BRICK_BUTTON);
                      output.accept(ModBlocks.GEODEPACK_BRICK_BUTTON);

                      output.accept(ModBlocks.BASALT_BRICK_PRESSURE_PLATE);
                      output.accept(ModBlocks.CALCITE_BRICK_PRESSURE_PLATE);
                      output.accept(ModBlocks.GEODEPACK_BRICK_PRESSURE_PLATE);

                      output.accept(ModBlocks.BASALT_BRICK_WALL);
                      output.accept(ModBlocks.CALCITE_BRICK_WALL);
                      output.accept(ModBlocks.GEODEPACK_BRICK_WALL);


                    }).build());



    public static void registerModCreativeModeTabs() {
        Geode.LOGGER.info("Registering Creative Mode Tabs for" + Geode.MOD_ID);
    }
}
