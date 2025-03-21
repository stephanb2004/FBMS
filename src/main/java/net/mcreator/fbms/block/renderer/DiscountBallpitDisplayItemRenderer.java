package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DiscountBallpitDisplayModel;
import net.mcreator.fbms.block.display.DiscountBallpitDisplayItem;

public class DiscountBallpitDisplayItemRenderer extends GeoItemRenderer<DiscountBallpitDisplayItem> {
	public DiscountBallpitDisplayItemRenderer() {
		super(new DiscountBallpitDisplayModel());
	}

	@Override
	public RenderType getRenderType(DiscountBallpitDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
