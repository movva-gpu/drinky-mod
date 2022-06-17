package net.movva.drinkymod.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.movva.drinkymod.DrinkyMod;

public class ModBlocks {

    public static final Block TEA_GRASS_BLOCK = registerBlock("tea_grass_block",
            new Block(FabricBlockSettings.of(Material.PLANT).noCollision().nonOpaque().breakInstantly().sounds(BlockSoundGroup.GRASS)), ItemGroup.MISC);

    private static Block registerBlock(String name, Block block, ItemGroup itemgroup) {
        registerBlockItem(name, block, itemgroup);
        return Registry.register(Registry.BLOCK, new Identifier(DrinkyMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup itemGroup) {
        return Registry.register(Registry.ITEM, new Identifier(DrinkyMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(itemGroup)));
    }

    public static void registerModBlocks() {
        DrinkyMod.LOGGER.info("Registering ModBlocks for " + DrinkyMod.MOD_ID);
    }

}
