package com.schneggo.morefood.item;

import com.schneggo.morefood.MoreFood;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemItems {

    public static final Item COOKING_KNIFE = registerItem("cooking_knife", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item)
    {
        var itemId = Identifier.of(MoreFood.MOD_ID, name);

        return Registry.register(Registries.ITEM, itemId, item);
    }

    public static void registerModItems()
    {
        MoreFood.LOGGER.info("Registerin Items " + MoreFood.MOD_ID);
    }

}
