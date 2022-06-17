package net.movva.drinkymod.items.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class StarTrophyItem extends Item {
    public StarTrophyItem(Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
