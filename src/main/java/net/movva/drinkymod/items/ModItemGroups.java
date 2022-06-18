package net.movva.drinkymod.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {

    public static ItemGroup COLD_DRINKS;

    static {
        COLD_DRINKS = (new ItemGroup(8, "coldDrinks") {
            public ItemStack createIcon() {
                return new ItemStack(ModItems.ICED_TEA_BOTTLE);
            }
        }).setName("cold_drinks");
    }

}
