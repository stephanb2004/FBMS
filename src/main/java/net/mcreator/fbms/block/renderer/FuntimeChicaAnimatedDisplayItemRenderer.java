package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.FuntimeChicaAnimatedDisplayModel;
import net.mcreator.fbms.block.display.FuntimeChicaAnimatedDisplayItem;

public class FuntimeChicaAnimatedDisplayItemRenderer extends GeoItemRenderer<FuntimeChicaAnimatedDisplayItem> {
	public FuntimeChicaAnimatedDisplayItemRenderer() {
		super(new FuntimeChicaAnimatedDisplayModel());
	}

	@Override
	public RenderType getRenderType(FuntimeChicaAnimatedDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
