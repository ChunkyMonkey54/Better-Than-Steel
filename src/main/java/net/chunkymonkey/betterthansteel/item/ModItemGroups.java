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

                        // Gemstones
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.SAPPHIRE);
                    }).build());

    public static void registerItemGroups() {
        BetterThanSteel.LOGGER.info("Registering Item Groups for " + BetterThanSteel.MOD_ID);
    }
}
