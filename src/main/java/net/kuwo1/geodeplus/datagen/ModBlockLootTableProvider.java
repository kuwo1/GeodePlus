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
        dropSelf(ModBlocks.CRACKED_BASALT_BRICKS);
        dropSelf(ModBlocks.CRACKED_CALCITE_BRICKS);




        this.add(ModBlocks.LARGE_BERYL_BUD,
                this.createSilkTouchDispatchTable(
                        ModBlocks.LARGE_BERYL_BUD,
                        this.applyExplosionDecay(ModBlocks.LARGE_BERYL_BUD, LootItem.lootTableItem(ModItems.BERYLSHARD)
                                .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE)))
                        )
                )
        );
       this.add(ModBlocks.CHOCOLATE_DIAMOND_CLUSTER,
               this.createSilkTouchDispatchTable(
                       ModBlocks.CHOCOLATE_DIAMOND_CLUSTER,
                       this.applyExplosionDecay(ModBlocks.CHOCOLATE_DIAMOND_CLUSTER, LootItem.lootTableItem(ModItems.CHOCOLATEDIAMONDSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.LARGE_CHOCOLATE_DIAMOND_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.LARGE_CHOCOLATE_DIAMOND_BUD,
                       this.applyExplosionDecay(ModBlocks.LARGE_CHOCOLATE_DIAMOND_BUD, LootItem.lootTableItem(ModItems.CHOCOLATEDIAMONDSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.MEDIUM_CHOCOLATE_DIAMOND_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.MEDIUM_CHOCOLATE_DIAMOND_BUD,
                       this.applyExplosionDecay(ModBlocks.MEDIUM_CHOCOLATE_DIAMOND_BUD, LootItem.lootTableItem(ModItems.CHOCOLATEDIAMONDSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.SMALL_CHOCOLATE_DIAMOND_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.SMALL_CHOCOLATE_DIAMOND_BUD,
                       this.applyExplosionDecay(ModBlocks.SMALL_CHOCOLATE_DIAMOND_BUD, LootItem.lootTableItem(ModItems.CHOCOLATEDIAMONDSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.BERYL_CLUSTER,
               this.createSilkTouchDispatchTable(
                       ModBlocks.BERYL_CLUSTER,
                       this.applyExplosionDecay(ModBlocks.BERYL_CLUSTER, LootItem.lootTableItem(ModItems.BERYLSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.MEDIUM_BERYL_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.MEDIUM_BERYL_BUD,
                       this.applyExplosionDecay(ModBlocks.MEDIUM_BERYL_BUD, LootItem.lootTableItem(ModItems.BERYLSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.SMALL_BERYL_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.SMALL_BERYL_BUD,
                       this.applyExplosionDecay(ModBlocks.SMALL_BERYL_BUD, LootItem.lootTableItem(ModItems.BERYLSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.FLINT_CLUSTER,
               this.createSilkTouchDispatchTable(
                       ModBlocks.FLINT_CLUSTER,
                       this.applyExplosionDecay(ModBlocks.FLINT_CLUSTER, LootItem.lootTableItem(ModItems.FLINTSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.LARGE_FLINT_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.LARGE_FLINT_BUD,
                       this.applyExplosionDecay(ModBlocks.LARGE_FLINT_BUD, LootItem.lootTableItem(ModItems.FLINTSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.MEDIUM_FLINT_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.MEDIUM_FLINT_BUD,
                       this.applyExplosionDecay(ModBlocks.MEDIUM_FLINT_BUD, LootItem.lootTableItem(ModItems.FLINTSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.SMALL_FLINT_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.SMALL_FLINT_BUD,
                       this.applyExplosionDecay(ModBlocks.SMALL_FLINT_BUD, LootItem.lootTableItem(ModItems.FLINTSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.SPINEL_CLUSTER,
               this.createSilkTouchDispatchTable(
                       ModBlocks.SPINEL_CLUSTER,
                       this.applyExplosionDecay(ModBlocks.SPINEL_CLUSTER, LootItem.lootTableItem(ModItems.SPINELSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.LARGE_SPINEL_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.LARGE_SPINEL_BUD,
                       this.applyExplosionDecay(ModBlocks.LARGE_SPINEL_BUD, LootItem.lootTableItem(ModItems.SPINELSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.MEDIUM_SPINEL_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.MEDIUM_SPINEL_BUD,
                       this.applyExplosionDecay(ModBlocks.MEDIUM_SPINEL_BUD, LootItem.lootTableItem(ModItems.SPINELSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.SMALL_SPINEL_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.SMALL_SPINEL_BUD,
                       this.applyExplosionDecay(ModBlocks.SMALL_SPINEL_BUD, LootItem.lootTableItem(ModItems.SPINELSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.LARGE_SELENITE_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.LARGE_SELENITE_BUD,
                       this.applyExplosionDecay(ModBlocks.LARGE_SELENITE_BUD, LootItem.lootTableItem(ModItems.SELENITESHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.MEDIUM_SELENITE_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.MEDIUM_SELENITE_BUD,
                       this.applyExplosionDecay(ModBlocks.MEDIUM_SELENITE_BUD, LootItem.lootTableItem(ModItems.SELENITESHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.SMALL_SELENITE_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.SMALL_SELENITE_BUD,
                       this.applyExplosionDecay(ModBlocks.SMALL_SELENITE_BUD, LootItem.lootTableItem(ModItems.SELENITESHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.SELENITE_CLUSTER,
               this.createSilkTouchDispatchTable(
                       ModBlocks.SELENITE_CLUSTER,
                       this.applyExplosionDecay(ModBlocks.SELENITE_CLUSTER, LootItem.lootTableItem(ModItems.SELENITESHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.FLUORITE_CLUSTER,
               this.createSilkTouchDispatchTable(
                       ModBlocks.FLUORITE_CLUSTER,
                       this.applyExplosionDecay(ModBlocks.FLUORITE_CLUSTER, LootItem.lootTableItem(ModItems.FLUORITESHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.LARGE_FLUORITE_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.LARGE_FLUORITE_BUD,
                       this.applyExplosionDecay(ModBlocks.LARGE_FLUORITE_BUD, LootItem.lootTableItem(ModItems.FLUORITESHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.MEDIUM_FLUORITE_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.MEDIUM_FLUORITE_BUD,
                       this.applyExplosionDecay(ModBlocks.MEDIUM_FLUORITE_BUD, LootItem.lootTableItem(ModItems.FLUORITESHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.SMALL_FLUORITE_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.SMALL_FLUORITE_BUD,
                       this.applyExplosionDecay(ModBlocks.SMALL_FLUORITE_BUD, LootItem.lootTableItem(ModItems.FLUORITESHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.SALT_CLUSTER,
               this.createSilkTouchDispatchTable(
                       ModBlocks.SALT_CLUSTER,
                       this.applyExplosionDecay(ModBlocks.SALT_CLUSTER, LootItem.lootTableItem(ModItems.SALTSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.LARGE_SALT_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.LARGE_SALT_BUD,
                       this.applyExplosionDecay(ModBlocks.LARGE_SALT_BUD, LootItem.lootTableItem(ModItems.SALTSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.MEDIUM_SALT_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.MEDIUM_SALT_BUD,
                       this.applyExplosionDecay(ModBlocks.MEDIUM_SALT_BUD, LootItem.lootTableItem(ModItems.SALTSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.SMALL_SALT_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.SMALL_SALT_BUD,
                       this.applyExplosionDecay(ModBlocks.SMALL_SALT_BUD, LootItem.lootTableItem(ModItems.SALTSHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.CELESTINE_CLUSTER,
               this.createSilkTouchDispatchTable(
                       ModBlocks.CELESTINE_CLUSTER,
                       this.applyExplosionDecay(ModBlocks.CELESTINE_CLUSTER, LootItem.lootTableItem(ModItems.CELESTINESHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.LARGE_CELESTINE_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.LARGE_CELESTINE_BUD,
                       this.applyExplosionDecay(ModBlocks.LARGE_CELESTINE_BUD, LootItem.lootTableItem(ModItems.CELESTINESHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.MEDIUM_CELESTINE_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.MEDIUM_CELESTINE_BUD,
                       this.applyExplosionDecay(ModBlocks.MEDIUM_CELESTINE_BUD, LootItem.lootTableItem(ModItems.CELESTINESHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));
       this.add(ModBlocks.SMALL_CELESTINE_BUD,
               this.createSilkTouchDispatchTable(
                       ModBlocks.SMALL_CELESTINE_BUD,
                       this.applyExplosionDecay(ModBlocks.SMALL_CELESTINE_BUD, LootItem.lootTableItem(ModItems.CELESTINESHARD)
                               .apply(ApplyBonusCount.addOreBonusCount(this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE))))
               ));





        dropSelf(ModBlocks.BASALT_BRICK_STAIRS);
        dropSelf(ModBlocks.CALCITE_BRICK_STAIRS);
        dropSelf(ModBlocks.GEODEPACK_BRICK_STAIRS);
        dropSelf(ModBlocks.CHOCOLATE_DIAMOND_BRICK_STAIRS);
        dropSelf(ModBlocks.AMETHYST_BRICK_STAIRS);
        dropSelf(ModBlocks.FLUORITE_BRICK_STAIRS);
        dropSelf(ModBlocks.SALT_BRICK_STAIRS);
        dropSelf(ModBlocks.SELENITE_BRICK_STAIRS);
        dropSelf(ModBlocks.FLINT_BRICK_STAIRS);
        dropSelf(ModBlocks.SPINEL_BRICK_STAIRS);
        dropSelf(ModBlocks.BERYL_BRICK_STAIRS);
        dropSelf(ModBlocks.CELESTINE_BRICK_STAIRS);

        add(ModBlocks.BASALT_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.CALCITE_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.GEODEPACK_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.CHOCOLATE_DIAMOND_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.AMETHYST_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.FLUORITE_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.SALT_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.SELENITE_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.FLINT_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.SPINEL_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.BERYL_BRICK_SLAB, this::createSlabItemTable);
        add(ModBlocks.CELESTINE_BRICK_SLAB, this::createSlabItemTable);

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
        dropSelf(ModBlocks.SPINEL_BRICK_WALL);
        dropSelf(ModBlocks.BERYL_BRICK_WALL);
        dropSelf(ModBlocks.CELESTINE_BRICK_WALL);

    }




}
