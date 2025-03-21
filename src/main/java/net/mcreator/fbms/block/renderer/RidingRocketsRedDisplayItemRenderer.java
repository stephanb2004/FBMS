package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.RidingRocketsRedDisplayModel;
import net.mcreator.fbms.block.display.RidingRocketsRedDisplayItem;

public class RidingRocketsRedDisplayItemRenderer extends GeoItemRenderer<RidingRocketsRedDisplayItem> {
	public RidingRocketsRedDisplayItemRenderer() {
		super(new RidingRocketsRedDisplayModel());
	}

	@Override
	public RenderType getRenderType(RidingRocketsRedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
