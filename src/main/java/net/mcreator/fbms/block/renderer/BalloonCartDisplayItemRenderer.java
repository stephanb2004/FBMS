package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BalloonCartDisplayModel;
import net.mcreator.fbms.block.display.BalloonCartDisplayItem;

public class BalloonCartDisplayItemRenderer extends GeoItemRenderer<BalloonCartDisplayItem> {
	public BalloonCartDisplayItemRenderer() {
		super(new BalloonCartDisplayModel());
	}

	@Override
	public RenderType getRenderType(BalloonCartDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
