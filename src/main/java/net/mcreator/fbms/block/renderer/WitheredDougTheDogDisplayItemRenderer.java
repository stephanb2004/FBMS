package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.WitheredDougTheDogDisplayModel;
import net.mcreator.fbms.block.display.WitheredDougTheDogDisplayItem;

public class WitheredDougTheDogDisplayItemRenderer extends GeoItemRenderer<WitheredDougTheDogDisplayItem> {
	public WitheredDougTheDogDisplayItemRenderer() {
		super(new WitheredDougTheDogDisplayModel());
	}

	@Override
	public RenderType getRenderType(WitheredDougTheDogDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
