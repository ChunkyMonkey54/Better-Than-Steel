package net.chunkymonkey.betterthansteel;

import net.chunkymonkey.betterthansteel.datagen.ModItemTagProvider;
import net.chunkymonkey.betterthansteel.datagen.ModModelProvider;
import net.chunkymonkey.betterthansteel.datagen.ModWorldGenerator;
import net.chunkymonkey.betterthansteel.world.ModConfiguredFeatures;
import net.chunkymonkey.betterthansteel.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class BetterThanSteelDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        // pack.addProvider(ModItemTagProvider::new);
        // pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModWorldGenerator::new);
	}

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
    }
}
