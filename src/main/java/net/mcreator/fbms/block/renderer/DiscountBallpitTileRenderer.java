package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.DiscountBallpitBlockModel;
import net.mcreator.fbms.block.entity.DiscountBallpitTileEntity;

public class DiscountBallpitTileRenderer extends GeoBlockRenderer<DiscountBallpitTileEntity> {
	public DiscountBallpitTileRenderer() {
		super(new DiscountBallpitBlockModel());
	}

	@Override
	public RenderType getRenderType(DiscountBallpitTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
