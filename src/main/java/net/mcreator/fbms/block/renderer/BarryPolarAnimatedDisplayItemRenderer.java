package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BarryPolarAnimatedDisplayModel;
import net.mcreator.fbms.block.display.BarryPolarAnimatedDisplayItem;

public class BarryPolarAnimatedDisplayItemRenderer extends GeoItemRenderer<BarryPolarAnimatedDisplayItem> {
	public BarryPolarAnimatedDisplayItemRenderer() {
		super(new BarryPolarAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(BarryPolarAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
