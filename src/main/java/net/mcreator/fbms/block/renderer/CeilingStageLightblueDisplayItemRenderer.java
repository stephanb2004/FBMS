package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.CeilingStageLightblueDisplayModel;
import net.mcreator.fbms.block.display.CeilingStageLightblueDisplayItem;

public class CeilingStageLightblueDisplayItemRenderer extends GeoItemRenderer<CeilingStageLightblueDisplayItem> {
	public CeilingStageLightblueDisplayItemRenderer() {
		super(new CeilingStageLightblueDisplayModel());
	}

	@Override
	public RenderType getRenderType(CeilingStageLightblueDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
