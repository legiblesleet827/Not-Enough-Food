package net.legiblesleet827.morefood.setup;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RAW_CHICKEN_NUGGET = new FoodProperties.Builder().nutrition(1).saturationMod(1).build();
    public static final FoodProperties COOKED_CHICKEN_NUGGET = new FoodProperties.Builder().nutrition(2).saturationMod(2).build();
    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(1).saturationMod(1).build();
    public static final FoodProperties BURGER = new FoodProperties.Builder().nutrition(16).saturationMod(4).build();
}
