package net.movva.drinkymod.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.movva.drinkymod.DrinkyMod;

public class ModItems {
    public static final Item STAR_TROPHY = registerItem("star_trophy", new Item(new FabricItemSettings().maxCount(1).group(ItemGroup.MISC).fireproof().rarity(Rarity.EPIC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DrinkyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DrinkyMod.LOGGER.info("Registering Items for " + DrinkyMod.MOD_ID);
    }
}
