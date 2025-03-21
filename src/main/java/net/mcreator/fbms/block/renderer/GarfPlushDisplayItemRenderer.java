package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.GarfPlushDisplayModel;
import net.mcreator.fbms.block.display.GarfPlushDisplayItem;

public class GarfPlushDisplayItemRenderer extends GeoItemRenderer<GarfPlushDisplayItem> {
	public GarfPlushDisplayItemRenderer() {
		super(new GarfPlushDisplayModel());
	}

	@Override
	public RenderType getRenderType(GarfPlushDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
