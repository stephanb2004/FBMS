package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.GtEndoDisplayModel;
import net.mcreator.fbms.block.display.GtEndoDisplayItem;

public class GtEndoDisplayItemRenderer extends GeoItemRenderer<GtEndoDisplayItem> {
	public GtEndoDisplayItemRenderer() {
		super(new GtEndoDisplayModel());
	}

	@Override
	public RenderType getRenderType(GtEndoDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
