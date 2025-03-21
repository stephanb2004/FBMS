package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.CeilingStageLightsDisplayModel;
import net.mcreator.fbms.block.display.CeilingStageLightsDisplayItem;

public class CeilingStageLightsDisplayItemRenderer extends GeoItemRenderer<CeilingStageLightsDisplayItem> {
	public CeilingStageLightsDisplayItemRenderer() {
		super(new CeilingStageLightsDisplayModel());
	}

	@Override
	public RenderType getRenderType(CeilingStageLightsDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
