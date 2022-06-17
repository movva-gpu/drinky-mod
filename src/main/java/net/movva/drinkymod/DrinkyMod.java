package net.movva.drinkymod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.movva.drinkymod.blocks.ModBlocks;
import net.movva.drinkymod.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DrinkyMod implements ModInitializer {

	public static final String MOD_ID = "drinkymod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TEA_PLANT, RenderLayer.getCutout());

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
