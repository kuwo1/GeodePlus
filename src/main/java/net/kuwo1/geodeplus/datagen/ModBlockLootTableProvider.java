package net.kuwo1.geodeplus.datagen;

import com.jcraft.jorbis.Block;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.kuwo1.geodeplus.Item.ModItems;
import net.kuwo1.geodeplus.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

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
        dropSelf(ModBlocks.CELESTINE_BRICKS);
        dropSelf(ModBlocks.BERYL_BLOCK);
        dropSelf(ModBlocks.BUDDING_BERYL);
        dropSelf(ModBlocks.BERYL_BRICKS);
        dropSelf(ModBlocks.AMETHYST_BRICKS);
        dropSelf(ModBlocks.SELENITE_BRICKS);
        dropSelf(ModBlocks.SPINEL_BLOCK);
        dropSelf(ModBlocks.SPINEL_BRICKS);
        dropSelf(ModBlocks.BUDDING_SELENITE);
        dropSelf(ModBlocks.SALT_BLOCK);
        dropSelf(ModBlocks.SALT_BRICKS);
        dropSelf(ModBlocks.FLINT_BLOCK);
        dropSelf(ModBlocks.FLINT_BRICKS);
        dropSelf(ModBlocks.BUDDING_FLINT);
        dropSelf(ModBlocks.CHOCOLATE_DIAMOND_BLOCK);
        dropSelf(ModBlocks.CHOCOLATE_DIAMOND_BRICKS);
        dropSelf(ModBlocks.BUDDING_CHOCOLATE_DIAMOND);
        dropSelf(ModBlocks.FLUORITE_BLOCK);
        dropSelf(ModBlocks.FLUORITE_BRICKS);
        dropSelf(ModBlocks.BUDDING_FLUORITE);
        dropSelf(ModBlocks.BUDDING_SALT);
        dropSelf(ModBlocks.BUDDING_SPINEL);

        add(ModBlocks.SMALL_CELESTINE_BUD, createOreDrop(ModBlocks.SMALL_CELESTINE_BUD, ModItems.CELESTINESHARD));
        dropOther(ModBlocks.MEDIUM_CELESTINE_BUD, ModItems.CELESTINESHARD);
        dropOther(ModBlocks.LARGE_CELESTINE_BUD, ModItems.CELESTINESHARD);
        dropOther(ModBlocks.CELESTINE_CLUSTER, ModItems.CELESTINESHARD);
        dropOther(ModBlocks.SMALL_SALT_BUD, ModItems.SALTSHARD);
        dropOther(ModBlocks.MEDIUM_SALT_BUD, ModItems.SALTSHARD);
        dropOther(ModBlocks.LARGE_SALT_BUD, ModItems.SALTSHARD);
        dropOther(ModBlocks.SALT_CLUSTER, ModItems.SALTSHARD);
        dropOther(ModBlocks.SMALL_FLUORITE_BUD, ModItems.FLUORITESHARD);
        dropOther(ModBlocks.MEDIUM_FLUORITE_BUD, ModItems.FLUORITESHARD);
        dropOther(ModBlocks.LARGE_FLUORITE_BUD, ModItems.FLUORITESHARD);
        dropOther(ModBlocks.FLUORITE_CLUSTER, ModItems.FLUORITESHARD);
        dropOther(ModBlocks.SELENITE_CLUSTER, ModItems.SELENITESHARD);
        dropOther(ModBlocks.SMALL_SELENITE_BUD, ModItems.SELENITESHARD);
        dropOther(ModBlocks.MEDIUM_SELENITE_BUD, ModItems.SELENITESHARD);
        dropOther(ModBlocks.LARGE_SELENITE_BUD, ModItems.SELENITESHARD);
        dropOther(ModBlocks.SMALL_SPINEL_BUD, ModItems.SPINELSHARD);
        dropOther(ModBlocks.MEDIUM_SPINEL_BUD, ModItems.SPINELSHARD);
        dropOther(ModBlocks.LARGE_SPINEL_BUD, ModItems.SPINELSHARD);
        dropOther(ModBlocks.SPINEL_CLUSTER, ModItems.SPINELSHARD);
        dropOther(ModBlocks.SMALL_FLINT_BUD, ModItems.FLINTSHARD);
        dropOther(ModBlocks.MEDIUM_FLINT_BUD, ModItems.FLINTSHARD);
        dropOther(ModBlocks.LARGE_FLINT_BUD, ModItems.FLINTSHARD);
        dropOther(ModBlocks.FLINT_CLUSTER, ModItems.FLINTSHARD);
        dropOther(ModBlocks.SMALL_BERYL_BUD, ModItems.BERYLSHARD);
        dropOther(ModBlocks.MEDIUM_BERYL_BUD, ModItems.BERYLSHARD);
        dropOther(ModBlocks.LARGE_BERYL_BUD, ModItems.BERYLSHARD);
        dropOther(ModBlocks.BERYL_CLUSTER, ModItems.BERYLSHARD);
        dropOther(ModBlocks.SMALL_CHOCOLATE_DIAMOND_BUD, ModItems.CHOCOLATEDIAMONDSHARD);
        dropOther(ModBlocks.MEDIUM_CHOCOLATE_DIAMOND_BUD, ModItems.CHOCOLATEDIAMONDSHARD);
        dropOther(ModBlocks.LARGE_CHOCOLATE_DIAMOND_BUD, ModItems.CHOCOLATEDIAMONDSHARD);
        dropOther(ModBlocks.CHOCOLATE_DIAMOND_CLUSTER, ModItems.CHOCOLATEDIAMONDSHARD);

        dropSelf(ModBlocks.MAGIC_BLOCK);


        dropSelf(ModBlocks.BASALT_BRICK_STAIRS);
        dropSelf(ModBlocks.CALCITE_BRICK_STAIRS);
        dropSelf(ModBlocks.GEODEPACK_BRICK_STAIRS);
        dropSelf(ModBlocks.CHOCOLATE_DIAMOND_BRICK_STAIRS);
        dropSelf(ModBlocks.AMETHYST_BRICK_STAIRS);
        dropSelf(ModBlocks.FLUORITE_BRICK_STAIRS);
        dropSelf(ModBlocks.SALT_BRICK_STAIRS);
        dropSelf(ModBlocks.SELENITE_BRICK_STAIRS);
        dropSelf(ModBlocks.FLINT_BRICK_STAIRS);

        add(ModBlocks.BASALT_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.CALCITE_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.GEODEPACK_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.CHOCOLATE_DIAMOND_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.AMETHYST_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.FLUORITE_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.SALT_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.SELENITE_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.FLINT_BRICK_SLAB, this::createSlabItemTable);

        dropSelf(ModBlocks.BASALT_BRICK_BUTTON);
        dropSelf(ModBlocks.CALCITE_BRICK_BUTTON);
        dropSelf(ModBlocks.GEODEPACK_BRICK_BUTTON);

        dropSelf(ModBlocks.BASALT_BRICK_PRESSURE_PLATE);
        dropSelf(ModBlocks.CALCITE_BRICK_PRESSURE_PLATE);
        dropSelf(ModBlocks.GEODEPACK_BRICK_PRESSURE_PLATE);

        dropSelf(ModBlocks.BASALT_BRICK_WALL);
        dropSelf(ModBlocks.CALCITE_BRICK_WALL);
        dropSelf(ModBlocks.GEODEPACK_BRICK_WALL);
        dropSelf(ModBlocks.SALT_BRICK_WALL);
        dropSelf(ModBlocks.SELENITE_BRICK_WALL);
        dropSelf(ModBlocks.CHOCOLATE_DIAMOND_BRICK_WALL);
        dropSelf(ModBlocks.FLUORITE_BRICK_WALL);
        dropSelf(ModBlocks.FLINT_BRICK_WALL);

    }




}
