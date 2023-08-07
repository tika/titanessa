package dev.swpie.titanessa.item.client;

import dev.swpie.titanessa.Titanessa;
import dev.swpie.titanessa.item.custom.CelestiumArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CelestiumArmorModel extends GeoModel<CelestiumArmorItem> {
    @Override
    public ResourceLocation getModelResource(CelestiumArmorItem animatable) {
        return new ResourceLocation(Titanessa.MOD_ID, "geo/celestium_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CelestiumArmorItem animatable) {
        return new ResourceLocation(Titanessa.MOD_ID, "textures/armor/celestium_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CelestiumArmorItem animatable) {
        return new ResourceLocation(Titanessa.MOD_ID, "animations/celestium_armor.animation.json");
    }
}
