package net.chunkymonkey.betterthansteel;

import net.chunkymonkey.betterthansteel.block.ModBlocks;
import net.chunkymonkey.betterthansteel.datagen.ModModelProvider;
import net.chunkymonkey.betterthansteel.item.ModItemGroups;
import net.chunkymonkey.betterthansteel.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterThanSteel implements ModInitializer {
	public static final String MOD_ID = "betterthansteel";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}