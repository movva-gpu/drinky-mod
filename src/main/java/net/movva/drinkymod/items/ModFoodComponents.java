package net.movva.drinkymod.items;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent ICED_TEA_BOTTLE;
    public static final FoodComponent COLA_DRINK_BOTTLE;

    static {
        ICED_TEA_BOTTLE = new FoodComponent.Builder().hunger(3).saturationModifier(1F).build();
        COLA_DRINK_BOTTLE = new FoodComponent.Builder().hunger(2).saturationModifier(0.45F).build();
    }

}
