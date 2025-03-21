package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.JollyTheRatAnimatedDisplayModel;
import net.mcreator.fbms.block.display.JollyTheRatAnimatedDisplayItem;

public class JollyTheRatAnimatedDisplayItemRenderer extends GeoItemRenderer<JollyTheRatAnimatedDisplayItem> {
	public JollyTheRatAnimatedDisplayItemRenderer() {
		super(new JollyTheRatAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(JollyTheRatAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
