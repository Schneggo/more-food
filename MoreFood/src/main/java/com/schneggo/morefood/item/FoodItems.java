package com.schneggo.morefood.item;

import com.schneggo.morefood.MoreFood;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FoodItems {


  public static final Item FRIED_EGG = registerItem("fried_egg", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F).build())));
  public static final Item EGG_BREAD = registerItem("egg_bread", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(6).saturationModifier(0.8F).build())));

  public static final Item BACON_RAW = registerItem("bacon_raw", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(1).saturationModifier(0.1F).snack().build())));
  public static final Item BACON_COOKED = registerItem("bacon_cooked", new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(2).saturationModifier(0.4F).snack().build())));

  private static Item registerItem(String name, Item item)
  {
      Identifier itemId = Identifier.of(MoreFood.MOD_ID, name);

      return Registry.register(Registries.ITEM, itemId, item);
  }

  public static void registerModItems()
  {
      MoreFood.LOGGER.info("Registering Mod Items for " + MoreFood.MOD_ID);
  }

}
