package dev.swpie.titanessa.item;

import dev.swpie.titanessa.Titanessa;
import dev.swpie.titanessa.item.custom.CelestiumArmorItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Loads our items to Forge
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Titanessa.MOD_ID);

    public static final RegistryObject<Item> CELESTIUM_INGOT = ITEMS.register("celestium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CELESTIUM_CHUNK = ITEMS.register("celestium_chunk",
            () -> new Item(new Item.Properties()));

    // ARMOR
    public static final RegistryObject<Item> CELESTIUM_HELMET = ITEMS.register("celestium_helmet",
            () -> new CelestiumArmorItem(ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIUM_CHESTPLATE = ITEMS.register("celestium_chestplate",
            () -> new CelestiumArmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIUM_LEGGINGS = ITEMS.register("celestium_leggings",
            () -> new CelestiumArmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIUM_BOOTS = ITEMS.register("celestium_boots",
            () -> new CelestiumArmorItem(ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
