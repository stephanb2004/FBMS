package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RustyDisplayModel;
import net.mcreator.fbms.block.display.RustyDisplayItem;

public class RustyDisplayItemRenderer extends GeoItemRenderer<RustyDisplayItem> {
	public RustyDisplayItemRenderer() {
		super(new RustyDisplayModel());
	}

	@Override
	public RenderType getRenderType(RustyDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
