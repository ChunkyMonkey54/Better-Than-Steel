package net.chunkymonkey.betterthansteel;

import net.chunkymonkey.betterthansteel.datagen.ModItemTagProvider;
import net.chunkymonkey.betterthansteel.datagen.ModModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BetterThanSteelDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModModelProvider::new);;
	}
}
