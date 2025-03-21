package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.JollyTheRatDisplayModel;
import net.mcreator.fbms.block.display.JollyTheRatDisplayItem;

public class JollyTheRatDisplayItemRenderer extends GeoItemRenderer<JollyTheRatDisplayItem> {
	public JollyTheRatDisplayItemRenderer() {
		super(new JollyTheRatDisplayModel());
	}

	@Override
	public RenderType getRenderType(JollyTheRatDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
