package net.kuwo1.geodeplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.kuwo1.geodeplus.Item.ModItems;
import net.kuwo1.geodeplus.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.apache.commons.codec.language.bm.Rule;
import org.intellij.lang.annotations.Identifier;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> GEODE_CRAFTED = List.of(ModItems.BASALTCLUMP, ModItems.CALCITECLUMP, ModBlocks.CELESTINE_BLOCK);


                shaped(RecipeCategory.MISC, ModBlocks.BASALT_BRICKS,4)
                        .pattern("BB")
                        .pattern("BB")
                        .define('B', Items.BASALT)
                        .unlockedBy(getHasName(Items.BASALT), has(Items.BASALT))
                        .group("basalt")
                        .save(output);

                shaped(RecipeCategory.MISC,ModBlocks.CALCITE_BRICKS, 4)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C',Items.CALCITE)
                        .unlockedBy(getHasName(Items.CALCITE),has(Items.CALCITE))
                        .group("calcite")
                        .save(output);

                shaped(RecipeCategory.MISC,ModBlocks.GEODEPACK_BRICKS)
                        .pattern("BC")
                        .pattern("CB")
                        .define('C',ModItems.CALCITECLUMP)
                        .define('B',ModItems.BASALTCLUMP)
                        .unlockedBy(getHasName(ModItems.CALCITECLUMP),has(ModItems.CALCITECLUMP))
                        .group("calcite")
                        .save(output, "geodepack_bricks");
                shaped(RecipeCategory.MISC,ModBlocks.BERYL_BLOCK)
                        .pattern("BB")
                        .pattern("BB")
                        .define('B',ModItems.BERYLSHARD)
                        .unlockedBy(getHasName(ModItems.BERYLSHARD),has(ModItems.BERYLSHARD))
                        .group("calcite")
                        .save(output, "beryl_block");
                shaped(RecipeCategory.MISC,ModBlocks.CELESTINE_BLOCK)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C',ModItems.CELESTINESHARD)
                        .unlockedBy(getHasName(ModItems.CELESTINESHARD),has(ModItems.CELESTINESHARD))
                        .group("calcite")
                        .save(output, "celestine_block");
                shaped(RecipeCategory.MISC,ModBlocks.CELESTINE_BRICKS, 4)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C',ModBlocks.CELESTINE_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.CELESTINE_BLOCK),has(ModBlocks.CELESTINE_BLOCK))
                        .group("calcite")
                        .save(output, "celestine_bricks");
                shaped(RecipeCategory.MISC,ModBlocks.BERYL_BRICKS, 4)
                        .pattern("BB")
                        .pattern("BB")
                        .define('B',ModBlocks.BERYL_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.BERYL_BLOCK),has(ModBlocks.BERYL_BLOCK))
                        .group("calcite")
                        .save(output, "beryl_bricks");
                shaped(RecipeCategory.MISC,ModBlocks.SELENITE_BLOCK)
                        .pattern("SS")
                        .pattern("SS")
                        .define('S',ModItems.SELENITESHARD)
                        .unlockedBy(getHasName(ModItems.SELENITESHARD),has(ModItems.SELENITESHARD))
                        .group("calcite")
                        .save(output, "selenite_block");
                shaped(RecipeCategory.MISC,ModBlocks.SELENITE_BRICKS, 4)
                        .pattern("SS")
                        .pattern("SS")
                        .define('S',ModBlocks.SELENITE_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.SELENITE_BLOCK),has(ModBlocks.SELENITE_BLOCK))
                        .group("calcite")
                        .save(output, "selenite_bricks");
                shaped(RecipeCategory.MISC,ModBlocks.SPINEL_BLOCK)
                        .pattern("SS")
                        .pattern("SS")
                        .define('S',ModItems.SPINELSHARD)
                        .unlockedBy(getHasName(ModItems.SPINELSHARD),has(ModItems.SPINELSHARD))
                        .group("calcite")
                        .save(output, "spinel_block");
                shaped(RecipeCategory.MISC,ModBlocks.SPINEL_BRICKS, 4)
                        .pattern("SS")
                        .pattern("SS")
                        .define('S',ModBlocks.SPINEL_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.SPINEL_BLOCK),has(ModBlocks.SPINEL_BLOCK))
                        .group("calcite")
                        .save(output, "spinel_bricks");
                shaped(RecipeCategory.MISC,ModBlocks.SALT_BLOCK)
                        .pattern("SS")
                        .pattern("SS")
                        .define('S',ModItems.SALTSHARD)
                        .unlockedBy(getHasName(ModItems.SALTSHARD),has(ModItems.SALTSHARD))
                        .group("calcite")
                        .save(output, "salt_block");
                shaped(RecipeCategory.MISC,ModBlocks.SALT_BRICKS, 4)
                        .pattern("SS")
                        .pattern("SS")
                        .define('S',ModBlocks.SALT_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.SALT_BLOCK),has(ModBlocks.SALT_BLOCK))
                        .group("calcite")
                        .save(output, "salt_bricks");
                shaped(RecipeCategory.MISC,ModBlocks.FLINT_BLOCK, 4)
                        .pattern("FF")
                        .pattern("FF")
                        .define('F',ModItems.FLINTSHARD)
                        .unlockedBy(getHasName(ModItems.FLINTSHARD),has(ModItems.FLINTSHARD))
                        .group("calcite")
                        .save(output, "flint_block");
                shaped(RecipeCategory.MISC,ModBlocks.FLINT_BRICKS, 4)
                        .pattern("FF")
                        .pattern("FF")
                        .define('F',ModBlocks.FLINT_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.FLINT_BLOCK),has(ModBlocks.FLINT_BLOCK))
                        .group("calcite")
                        .save(output, "flint_bricks");
                shaped(RecipeCategory.MISC,ModBlocks.CHOCOLATE_DIAMOND_BLOCK)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C',ModItems.CHOCOLATEDIAMONDSHARD)
                        .unlockedBy(getHasName(ModItems.CHOCOLATEDIAMONDSHARD),has(ModItems.CHOCOLATEDIAMONDSHARD))
                        .group("calcite")
                        .save(output, "chocolate_diamond_block");
                shaped(RecipeCategory.MISC,ModBlocks.CHOCOLATE_DIAMOND_BRICKS, 4)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C',ModBlocks.CHOCOLATE_DIAMOND_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.CHOCOLATE_DIAMOND_BLOCK),has(ModBlocks.CHOCOLATE_DIAMOND_BLOCK))
                        .group("calcite")
                        .save(output, "chocolate_diamond_bricks");


                stairBuilder(ModBlocks.BASALT_BRICK_STAIRS, Ingredient.of(ModBlocks.BASALT_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.BASALT_BRICKS),has(ModBlocks.BASALT_BRICKS))
                        .group("calcite")
                        .save(output);
                stairBuilder(ModBlocks.CALCITE_BRICK_STAIRS, Ingredient.of(ModBlocks.CALCITE_BRICK_STAIRS))
                        .unlockedBy(getHasName(ModBlocks.CALCITE_BRICKS),has(ModBlocks.CALCITE_BRICKS))
                        .group("calcite")
                        .save(output);
                stairBuilder(ModBlocks.GEODEPACK_BRICK_STAIRS, Ingredient.of(ModBlocks.GEODEPACK_BRICK_STAIRS))
                        .unlockedBy(getHasName(ModBlocks.GEODEPACK_BRICKS),has(ModBlocks.GEODEPACK_BRICKS))
                        .group("calcite")
                        .save(output);
                stairBuilder(ModBlocks.CHOCOLATE_DIAMOND_BRICK_STAIRS, Ingredient.of(ModBlocks.CHOCOLATE_DIAMOND_BRICK_STAIRS))
                        .unlockedBy(getHasName(ModBlocks.CHOCOLATE_DIAMOND_BRICKS),has(ModBlocks.CHOCOLATE_DIAMOND_BRICKS))
                        .group("calcite")
                        .save(output);
                stairBuilder(ModBlocks.AMETHYST_BRICK_STAIRS, Ingredient.of(ModBlocks.AMETHYST_BRICK_STAIRS))
                        .unlockedBy(getHasName(ModBlocks.AMETHYST_BRICKS),has(ModBlocks.AMETHYST_BRICKS))
                        .group("calcite")
                        .save(output);
                buttonBuilder(ModBlocks.BASALT_BRICK_BUTTON, Ingredient.of(ModBlocks.BASALT_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.BASALT_BRICKS),has(ModBlocks.BASALT_BRICKS))
                        .group("calcite")
                        .save(output);
                buttonBuilder(ModBlocks.CALCITE_BRICK_BUTTON, Ingredient.of(ModBlocks.CALCITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.CALCITE_BRICKS),has(ModBlocks.CALCITE_BRICKS))
                        .group("calcite")
                        .save(output);
                buttonBuilder(ModBlocks.GEODEPACK_BRICK_BUTTON, Ingredient.of(ModBlocks.GEODEPACK_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.GEODEPACK_BRICKS),has(ModBlocks.GEODEPACK_BRICKS))
                        .group("calcite")
                        .save(output);

                pressurePlate(ModBlocks.BASALT_BRICK_PRESSURE_PLATE, ModBlocks.BASALT_BRICKS);
                pressurePlate(ModBlocks.CALCITE_BRICK_PRESSURE_PLATE, ModBlocks.CALCITE_BRICKS);
                pressurePlate(ModBlocks.GEODEPACK_BRICK_PRESSURE_PLATE, ModBlocks.GEODEPACK_BRICKS);

                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASALT_BRICK_WALL, ModBlocks.BASALT_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_WALL, ModBlocks.CALCITE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GEODEPACK_BRICK_WALL, ModBlocks.GEODEPACK_BRICKS);


                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASALT_BRICK_SLAB, ModBlocks.BASALT_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GEODEPACK_BRICK_SLAB, ModBlocks.GEODEPACK_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHOCOLATE_DIAMOND_BRICK_SLAB, ModBlocks.CHOCOLATE_DIAMOND_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_BRICK_SLAB, ModBlocks.AMETHYST_BRICKS);







            }
        };
    }

    @Override
    public String getName() {
        return "Geode Recipes";
    }
}
