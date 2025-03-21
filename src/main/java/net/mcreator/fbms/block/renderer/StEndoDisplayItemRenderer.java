package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.StEndoDisplayModel;
import net.mcreator.fbms.block.display.StEndoDisplayItem;

public class StEndoDisplayItemRenderer extends GeoItemRenderer<StEndoDisplayItem> {
	public StEndoDisplayItemRenderer() {
		super(new StEndoDisplayModel());
	}

	@Override
	public RenderType getRenderType(StEndoDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
