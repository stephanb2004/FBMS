package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DougTheDogAnimatedDisplayModel;
import net.mcreator.fbms.block.display.DougTheDogAnimatedDisplayItem;

public class DougTheDogAnimatedDisplayItemRenderer extends GeoItemRenderer<DougTheDogAnimatedDisplayItem> {
	public DougTheDogAnimatedDisplayItemRenderer() {
		super(new DougTheDogAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(DougTheDogAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
