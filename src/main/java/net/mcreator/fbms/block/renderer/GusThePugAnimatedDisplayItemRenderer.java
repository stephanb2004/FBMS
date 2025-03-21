package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.GusThePugAnimatedDisplayModel;
import net.mcreator.fbms.block.display.GusThePugAnimatedDisplayItem;

public class GusThePugAnimatedDisplayItemRenderer extends GeoItemRenderer<GusThePugAnimatedDisplayItem> {
	public GusThePugAnimatedDisplayItemRenderer() {
		super(new GusThePugAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(GusThePugAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
