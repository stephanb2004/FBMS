package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RetroChicaAnimatedDisplayModel;
import net.mcreator.fbms.block.display.RetroChicaAnimatedDisplayItem;

public class RetroChicaAnimatedDisplayItemRenderer extends GeoItemRenderer<RetroChicaAnimatedDisplayItem> {
	public RetroChicaAnimatedDisplayItemRenderer() {
		super(new RetroChicaAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(RetroChicaAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
