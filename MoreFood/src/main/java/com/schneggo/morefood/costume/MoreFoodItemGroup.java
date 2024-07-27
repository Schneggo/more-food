package com.schneggo.morefood.costume;

import com.schneggo.morefood.MoreFood;
import com.schneggo.morefood.item.FoodItems;
import com.schneggo.morefood.item.ItemItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MoreFoodItemGroup {

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder().icon(() -> new ItemStack(FoodItems.FRIED_EGG)).displayName(Text.translatable("itemgroup.morefood_morefood_group"))
            .entries(((displayContext, entries) -> {
                entries.add(FoodItems.FRIED_EGG);
                entries.add(FoodItems.EGG_BREAD);

                entries.add(FoodItems.BACON_RAW);
                entries.add(FoodItems.BACON_COOKED);

                entries.add(ItemItems.COOKING_KNIFE);
            })).build();

    public static void addItemsToGroup()
    {
        Registry.register(Registries.ITEM_GROUP, Identifier.of("morefood", "morefood_group"), ITEM_GROUP);
    }

    public static void registerItemGroup()
    {
        addItemsToGroup();
        MoreFood.LOGGER.info("Registering " + MoreFood.MOD_ID);
    }
}
