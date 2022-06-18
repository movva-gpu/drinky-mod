package net.movva.drinkymod.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoneyBottleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.movva.drinkymod.DrinkyMod;
import net.movva.drinkymod.items.custom.DrinkItem;
import net.movva.drinkymod.items.custom.StarTrophyItem;

public class ModItems {

    public static final Item STAR_TROPHY;
    public static final Item ICED_TEA_BOTTLE;
    public static final Item COLA_DRINK_BOTTLE;
    public static final Item TEA_LEAF;

    static {
        STAR_TROPHY = registerItem("star_trophy", new StarTrophyItem(new FabricItemSettings().maxCount(1).group(ItemGroup.MISC).fireproof().rarity(Rarity.EPIC)));

        ICED_TEA_BOTTLE = registerItem("iced_tea_bottle", new DrinkItem(new FabricItemSettings().maxCount(16).group(ModItemGroups.COLD_DRINKS).food(ModFoodComponents.ICED_TEA_BOTTLE)));
        COLA_DRINK_BOTTLE = registerItem("cola_drink_bottle", new DrinkItem(new FabricItemSettings().maxCount(16).group(ModItemGroups.COLD_DRINKS).food(ModFoodComponents.COLA_DRINK_BOTTLE)));

        TEA_LEAF = registerItem("tea_leaf", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DrinkyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DrinkyMod.LOGGER.info("Registering Items for " + DrinkyMod.MOD_ID);
    }
}
