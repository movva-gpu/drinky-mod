package net.movva.drinkymod;

import net.fabricmc.api.ModInitializer;
import net.movva.drinkymod.blocks.ModBlocks;
import net.movva.drinkymod.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DrinkyMod implements ModInitializer {

	public static final String MOD_ID = "drinkymod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
