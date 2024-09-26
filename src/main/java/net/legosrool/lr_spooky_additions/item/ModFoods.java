package net.legosrool.lr_spooky_additions.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BEECES_CUP = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.1f)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 200), 1.0f).build();

    public static final FoodProperties CHUCKLES_BAR = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.1f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200), 1.0f).build();

    public static final FoodProperties SCUTTLES = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.1f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 1.0f).build();

}
