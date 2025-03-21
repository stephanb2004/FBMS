package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.CeilingStageLightOrangeDisplayModel;
import net.mcreator.fbms.block.display.CeilingStageLightOrangeDisplayItem;

public class CeilingStageLightOrangeDisplayItemRenderer extends GeoItemRenderer<CeilingStageLightOrangeDisplayItem> {
	public CeilingStageLightOrangeDisplayItemRenderer() {
		super(new CeilingStageLightOrangeDisplayModel());
	}

	@Override
	public RenderType getRenderType(CeilingStageLightOrangeDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
