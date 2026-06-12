package net.kuwo1.geodeplus;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.kuwo1.geodeplus.datagen.ModBlockLootTableProvider;
import net.kuwo1.geodeplus.datagen.ModBlockTagsProvider;
import net.kuwo1.geodeplus.datagen.ModModelProvider;
import net.kuwo1.geodeplus.datagen.ModRecipeProvider;

public class GeodeDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var pack = fabricDataGenerator.createPack();

        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModBlockTagsProvider::new);
        pack.addProvider(ModBlockLootTableProvider::new);
        pack.addProvider(ModRecipeProvider::new);
	}
}
