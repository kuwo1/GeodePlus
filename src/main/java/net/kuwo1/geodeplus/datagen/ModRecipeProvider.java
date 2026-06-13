package net.kuwo1.geodeplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.kuwo1.geodeplus.Item.ModItems;
import net.kuwo1.geodeplus.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
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

                shaped(RecipeCategory.MISC, ModBlocks.BASALT_BRICKS)
                        .pattern("BB")
                        .pattern("BB")
                        .define('B', ModItems.BASALTCLUMP)
                        .unlockedBy(getHasName(ModItems.BASALTCLUMP), has(ModItems.BASALTCLUMP))
                        .group("basalt")
                        .save(output);

                shaped(RecipeCategory.MISC,ModBlocks.CALCITE_BRICKS)
                        .pattern("CC")
                        .pattern("CC")
                        .define('C',ModItems.CALCITECLUMP)
                        .unlockedBy(getHasName(ModItems.CALCITECLUMP),has(ModItems.CALCITECLUMP))
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






            }
        };
    }

    @Override
    public String getName() {
        return "Geode Recipes";
    }
}
