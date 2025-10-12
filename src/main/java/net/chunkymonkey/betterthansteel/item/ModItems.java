package net.chunkymonkey.betterthansteel.item;

import net.chunkymonkey.betterthansteel.BetterThanSteel;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Steel
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

    // Steel Armor
    public static final Item STEEL_HELMET = registerItem("steel_helmet",
        new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item STEEL_BOOTS = registerItem("steel_boots",
            new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    // Misc Steel Items
    public static final Item STEEL_SHEARS = registerItem("steel_shears",
            new ShearsItem(new Item.Settings().maxDamage(2031)));
    public static final Item FLINT_AND_STEEL = registerItem("flint_and_steel",
            new FlintAndSteelItem(new Item.Settings().maxDamage(2031)));

    // Gemstones
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BetterThanSteel.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterThanSteel.LOGGER.info("Registering Mod Items for " + BetterThanSteel.MOD_ID);
    }
}
