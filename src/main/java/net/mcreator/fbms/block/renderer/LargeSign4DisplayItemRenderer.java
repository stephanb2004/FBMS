package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.LargeSign4DisplayModel;
import net.mcreator.fbms.block.display.LargeSign4DisplayItem;

public class LargeSign4DisplayItemRenderer extends GeoItemRenderer<LargeSign4DisplayItem> {
	public LargeSign4DisplayItemRenderer() {
		super(new LargeSign4DisplayModel());
	}

	@Override
	public RenderType getRenderType(LargeSign4DisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
