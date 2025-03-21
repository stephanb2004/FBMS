package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.GtEndoAnimatedDisplayModel;
import net.mcreator.fbms.block.display.GtEndoAnimatedDisplayItem;

public class GtEndoAnimatedDisplayItemRenderer extends GeoItemRenderer<GtEndoAnimatedDisplayItem> {
	public GtEndoAnimatedDisplayItemRenderer() {
		super(new GtEndoAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(GtEndoAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
