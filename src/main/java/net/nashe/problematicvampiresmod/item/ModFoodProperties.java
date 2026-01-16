package net.nashe.problematicvampiresmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties GARLIC = new FoodProperties.Builder().nutrition(1)
            .saturationModifier(0.45f).build();
}
