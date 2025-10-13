package net.chunkymonkey.betterthansteel.item;

import net.chunkymonkey.betterthansteel.BetterThanSteel;
import net.chunkymonkey.betterthansteel.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.text.Text;

public class ModItemGroups {
    public static final ItemGroup STEEL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BetterThanSteel.MOD_ID, "steel"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.steel"))
                    .icon(() -> new ItemStack(ModItems.STEEL_INGOT)).entries((displayContext, entries) -> {
                        // Steel
                        entries.add(ModItems.STEEL_SCRAP);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModBlocks.STEEL_BLOCK);

                        // Steel Tools
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_HOE);
                        entries.add(ModItems.STEEL_SWORD);

                        // Steel Armor
                        entries.add(ModItems.STEEL_HELMET);
                        entries.add(ModItems.STEEL_CHESTPLATE);
                        entries.add(ModItems.STEEL_LEGGINGS);
                        entries.add(ModItems.STEEL_BOOTS);

                        // Misc Steel Items
                        entries.add(ModItems.STEEL_SHEARS);
                        entries.add(ModItems.FLINT_AND_STEEL);

                        // Emerald Tools
                        entries.add(ModItems.EMERALD_SHOVEL);
                        entries.add(ModItems.EMERALD_PICKAXE);
                        entries.add(ModItems.EMERALD_AXE);
                        entries.add(ModItems.EMERALD_HOE);
                        entries.add(ModItems.EMERALD_SWORD);

                        // Ruby
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);

                        // Ruby Tools
                        entries.add(ModItems.RUBY_SHOVEL);
                        entries.add(ModItems.RUBY_PICKAXE);
                        entries.add(ModItems.RUBY_AXE);
                        entries.add(ModItems.RUBY_HOE);
                        entries.add(ModItems.RUBY_SWORD);

                        // Sapphire
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);

                        // Sapphire Tools
                        entries.add(ModItems.SAPPHIRE_SHOVEL);
                        entries.add(ModItems.SAPPHIRE_PICKAXE);
                        entries.add(ModItems.SAPPHIRE_AXE);
                        entries.add(ModItems.SAPPHIRE_HOE);
                        entries.add(ModItems.SAPPHIRE_SWORD);
                    }).build());

    public static void registerItemGroups() {
        BetterThanSteel.LOGGER.info("Registering Item Groups for " + BetterThanSteel.MOD_ID);
    }
}
