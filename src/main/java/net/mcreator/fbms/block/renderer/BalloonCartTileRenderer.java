package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BalloonCartBlockModel;
import net.mcreator.fbms.block.entity.BalloonCartTileEntity;

public class BalloonCartTileRenderer extends GeoBlockRenderer<BalloonCartTileEntity> {
	public BalloonCartTileRenderer() {
		super(new BalloonCartBlockModel());
	}

	@Override
	public RenderType getRenderType(BalloonCartTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
