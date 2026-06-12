package net.kuwo1.geodeplus.Item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.kuwo1.geodeplus.Geode;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item BASALTCLUMP = registerItem("basalt_clump", Item::new);
    public static final Item CALCITECLUMP = registerItem("calcite_clump", Item::new);




    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Geode.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Geode.MOD_ID, name)))));
    }

    public static void registerModItems() {
        Geode.LOGGER.info("Registering Mod Items for " + Geode.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(BASALTCLUMP);
            output.accept(CALCITECLUMP);

        });
    }
}
