package dev.swpie.titanessa.item.client;

import dev.swpie.titanessa.item.custom.CelestiumArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CelestiumArmorRenderer extends GeoArmorRenderer<CelestiumArmorItem> {
    public CelestiumArmorRenderer() {
        super(new CelestiumArmorModel());
    }
}
