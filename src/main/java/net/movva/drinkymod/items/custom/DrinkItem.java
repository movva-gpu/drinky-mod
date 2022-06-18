package net.movva.drinkymod.items.custom;

import net.minecraft.item.HoneyBottleItem;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class DrinkItem extends HoneyBottleItem {
    public DrinkItem(Settings settings) {
        super(settings);
    }

    @Override
    public SoundEvent getDrinkSound() {
        return SoundEvents.ENTITY_GENERIC_DRINK;
    }

    @Override
    public SoundEvent getEatSound() {
        return SoundEvents.ENTITY_GENERIC_DRINK;
    }
}
