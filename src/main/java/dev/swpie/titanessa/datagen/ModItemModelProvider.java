package dev.swpie.titanessa.datagen;

import dev.swpie.titanessa.Titanessa;
import dev.swpie.titanessa.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Titanessa.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CELESTIUM_CHUNK);
        simpleItem(ModItems.CELESTIUM_INGOT);

        simpleItem(ModItems.CELESTIUM_HELMET);
        simpleItem(ModItems.CELESTIUM_CHESTPLATE);
        simpleItem(ModItems.CELESTIUM_LEGGINGS);
        simpleItem(ModItems.CELESTIUM_BOOTS);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Titanessa.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Titanessa.MOD_ID, "item/" + item.getId().getPath()));
    }
}
