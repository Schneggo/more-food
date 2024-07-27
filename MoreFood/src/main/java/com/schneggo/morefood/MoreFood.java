package com.schneggo.morefood;

import com.schneggo.morefood.costume.MoreFoodItemGroup;
import com.schneggo.morefood.item.FoodItems;
import com.schneggo.morefood.item.ItemItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreFood implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("morefood");
	public static final String MOD_ID = "morefood";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing mod");

		MoreFoodItemGroup.registerItemGroup();
		FoodItems.registerModItems();
		ItemItems.registerModItems();
	}
}