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
import net.minecraft.world.item.crafting.CookingBookCategory;
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
                        .define('B', Items.SMOOTH_BASALT)
                        .unlockedBy(getHasName(Items.SMOOTH_BASALT), has(Items.SMOOTH_BASALT))
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
                        .pattern("BB")
                        .pattern("BB")
                        .define('B',ModBlocks.GEODEPACK_BLOCK)
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
                shaped(RecipeCategory.MISC,ModBlocks.FLINT_BLOCK)
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
                shaped(RecipeCategory.MISC,ModBlocks.CHOCOLATE_DIAMOND_BRICKS, 4)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C',ModBlocks.CHOCOLATE_DIAMOND_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.CHOCOLATE_DIAMOND_BLOCK),has(ModBlocks.CHOCOLATE_DIAMOND_BLOCK))
                        .group("calcite")
                        .save(output, "chocolate_diamond_bricks");
                shaped(RecipeCategory.MISC,Items.FLINT)
                        .pattern("FF")
                        .define('F',ModItems.FLINTSHARD)
                        .unlockedBy(getHasName(ModItems.FLINTSHARD),has(ModItems.FLINTSHARD))
                        .group("calcite");
                shaped(RecipeCategory.MISC,ModBlocks.FLUORITE_BRICKS, 4)
                        .pattern("FF")
                        .pattern("FF")
                        .define('F',ModBlocks.FLUORITE_BLOCK)
                        .unlockedBy(getHasName(ModBlocks.FLUORITE_BLOCK),has(ModBlocks.FLUORITE_BLOCK))
                        .group("calcite")
                        .save(output, "fluorite_bricks");
                shaped(RecipeCategory.MISC,ModBlocks.FLUORITE_BLOCK)
                        .pattern("FF")
                        .pattern("FF")
                        .define('F',ModItems.FLUORITESHARD)
                        .unlockedBy(getHasName(ModItems.FLUORITESHARD),has(ModItems.FLUORITESHARD))
                        .group("calcite")
                        .save(output, "fluorite_block");
                shaped(RecipeCategory.MISC,ModItems.FLINTSHARD, 2)
                        .pattern("F")
                        .define('F',Items.FLINT)
                        .unlockedBy(getHasName(Items.FLINT),has(Items.FLINT))
                        .group("calcite")
                        .save(output, "flint_shard");

                oreSmelting(
                        List.of(ModBlocks.BASALT_BRICKS),
                        RecipeCategory.MISC,
                        CookingBookCategory.MISC,
                        ModBlocks.CRACKED_BASALT_BRICKS,
                        0.1f,
                        200,
                        "basalt_bricks_to_cracked_basalt_bricks"

                );
                oreSmelting(
                        List.of(ModBlocks.CALCITE_BRICKS),
                        RecipeCategory.MISC,
                        CookingBookCategory.MISC,
                        ModBlocks.CRACKED_CALCITE_BRICKS,
                        0.1f,
                        200,
                        "basalt_bricks_to_cracked_basalt_bricks"
                );



                stairBuilder(ModBlocks.BASALT_BRICK_STAIRS, Ingredient.of(ModBlocks.BASALT_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.BASALT_BRICKS),has(ModBlocks.BASALT_BRICKS))
                        .group("calcite")
                        .save(output);
                stairBuilder(ModBlocks.CALCITE_BRICK_STAIRS, Ingredient.of(ModBlocks.CALCITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.CALCITE_BRICKS),has(ModBlocks.CALCITE_BRICKS))
                        .group("calcite")
                        .save(output);
                stairBuilder(ModBlocks.GEODEPACK_BRICK_STAIRS, Ingredient.of(ModBlocks.GEODEPACK_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.GEODEPACK_BRICKS),has(ModBlocks.GEODEPACK_BRICKS))
                        .group("calcite")
                        .save(output);
                stairBuilder(ModBlocks.CHOCOLATE_DIAMOND_BRICK_STAIRS, Ingredient.of(ModBlocks.CHOCOLATE_DIAMOND_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.CHOCOLATE_DIAMOND_BRICKS),has(ModBlocks.CHOCOLATE_DIAMOND_BRICKS))
                        .group("calcite")
                        .save(output);
                stairBuilder(ModBlocks.AMETHYST_BRICK_STAIRS, Ingredient.of(ModBlocks.AMETHYST_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.AMETHYST_BRICKS),has(ModBlocks.AMETHYST_BRICKS))
                        .group("calcite")
                        .save(output);
                stairBuilder(ModBlocks.FLUORITE_BRICK_STAIRS, Ingredient.of(ModBlocks.FLUORITE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.FLUORITE_BRICKS),has(ModBlocks.FLUORITE_BRICKS))
                        .group("calcite")
                        .save(output);
                stairBuilder(ModBlocks.SALT_BRICK_STAIRS, Ingredient.of(ModBlocks.SALT_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.SALT_BRICKS),has(ModBlocks.SALT_BRICKS))
                        .group("calcite")
                        .save(output);
                stairBuilder(ModBlocks.SELENITE_BRICK_STAIRS, Ingredient.of(ModBlocks.SALT_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.SALT_BRICKS),has(ModBlocks.SALT_BRICKS))
                        .group("calcite")
                        .save(output);
                stairBuilder(ModBlocks.FLINT_BRICK_STAIRS, Ingredient.of(ModBlocks.FLINT_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.FLINT_BRICKS),has(ModBlocks.FLINT_BRICKS))
                        .group("calcite")
                        .save(output);
                stairBuilder(ModBlocks.SPINEL_BRICK_STAIRS, Ingredient.of(ModBlocks.SPINEL_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.SPINEL_BRICKS),has(ModBlocks.SPINEL_BRICKS))
                        .group("calcite")
                        .save(output);
                stairBuilder(ModBlocks.BERYL_BRICK_STAIRS, Ingredient.of(ModBlocks.BERYL_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.BERYL_BRICKS),has(ModBlocks.BERYL_BRICKS))
                        .group("calcite")
                        .save(output);
                stairBuilder(ModBlocks.CELESTINE_BRICK_STAIRS, Ingredient.of(ModBlocks.CELESTINE_BRICKS))
                        .unlockedBy(getHasName(ModBlocks.CELESTINE_BRICKS),has(ModBlocks.CELESTINE_BRICKS))
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
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BRICK_WALL, ModBlocks.SALT_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SELENITE_BRICK_WALL, ModBlocks.SELENITE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHOCOLATE_DIAMOND_BRICK_WALL, ModBlocks.CHOCOLATE_DIAMOND_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLUORITE_BRICK_WALL, ModBlocks.FLUORITE_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLINT_BRICK_WALL, ModBlocks.FLINT_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPINEL_BRICK_WALL, ModBlocks.SPINEL_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BERYL_BRICK_WALL, ModBlocks.BERYL_BRICKS);
                wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CELESTINE_BRICK_WALL, ModBlocks.CELESTINE_BRICKS);



                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BASALT_BRICK_SLAB, ModBlocks.BASALT_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICK_SLAB, ModBlocks.CALCITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GEODEPACK_BRICK_SLAB, ModBlocks.GEODEPACK_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHOCOLATE_DIAMOND_BRICK_SLAB, ModBlocks.CHOCOLATE_DIAMOND_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_BRICK_SLAB, ModBlocks.AMETHYST_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLUORITE_BRICK_SLAB, ModBlocks.FLUORITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BRICK_SLAB, ModBlocks.SALT_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SELENITE_BRICK_SLAB, ModBlocks.SELENITE_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLINT_BRICK_SLAB, ModBlocks.FLINT_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPINEL_BRICK_SLAB, ModBlocks.SPINEL_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BERYL_BRICK_SLAB, ModBlocks.BERYL_BRICKS);
                slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CELESTINE_BRICK_SLAB, ModBlocks.CELESTINE_BRICKS);








            }
        };
    }

    @Override
    public String getName() {
        return "Geode Recipes";
    }
}
