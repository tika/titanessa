package dev.swpie.titanessa.item;

import dev.swpie.titanessa.Titanessa;
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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
