package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BarryPolarFixedDisplayModel;
import net.mcreator.fbms.block.display.BarryPolarFixedDisplayItem;

public class BarryPolarFixedDisplayItemRenderer extends GeoItemRenderer<BarryPolarFixedDisplayItem> {
	public BarryPolarFixedDisplayItemRenderer() {
		super(new BarryPolarFixedDisplayModel());
	}

	@Override
	public RenderType getRenderType(BarryPolarFixedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
