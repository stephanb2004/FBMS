package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RascDisplayModel;
import net.mcreator.fbms.block.display.RascDisplayItem;

public class RascDisplayItemRenderer extends GeoItemRenderer<RascDisplayItem> {
	public RascDisplayItemRenderer() {
		super(new RascDisplayModel());
	}

	@Override
	public RenderType getRenderType(RascDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
