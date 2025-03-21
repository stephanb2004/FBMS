package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.StEndoAnimatedDisplayModel;
import net.mcreator.fbms.block.display.StEndoAnimatedDisplayItem;

public class StEndoAnimatedDisplayItemRenderer extends GeoItemRenderer<StEndoAnimatedDisplayItem> {
	public StEndoAnimatedDisplayItemRenderer() {
		super(new StEndoAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(StEndoAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
