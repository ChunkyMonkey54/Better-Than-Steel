package net.chunkymonkey.betterthansteel.item;

import net.chunkymonkey.betterthansteel.BetterThanSteel;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STEEL_SCRAP = registerItem("steel_scrap", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));

    // Steel Tools
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel",
        new ShovelItem(ModToolMaterial.STEEL, 2f, -3f, new FabricItemSettings()));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe",
            new PickaxeItem(ModToolMaterial.STEEL, 1, -2.8f, new FabricItemSettings()));
    public static final Item STEEL_AXE = registerItem("steel_axe",
            new AxeItem(ModToolMaterial.STEEL, 6f, -3.1f, new FabricItemSettings()));
    public static final Item STEEL_HOE = registerItem("steel_hoe",
            new HoeItem(ModToolMaterial.STEEL, -2, -0.5f, new FabricItemSettings()));
    public static final Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterial.STEEL, 3, -2.4f, new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterThanSteel.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterThanSteel.LOGGER.info("Registering Mod Items for " + BetterThanSteel.MOD_ID);
    }
}
