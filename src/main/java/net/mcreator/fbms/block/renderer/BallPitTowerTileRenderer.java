package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BallPitTowerBlockModel;
import net.mcreator.fbms.block.entity.BallPitTowerTileEntity;

public class BallPitTowerTileRenderer extends GeoBlockRenderer<BallPitTowerTileEntity> {
	public BallPitTowerTileRenderer() {
		super(new BallPitTowerBlockModel());
	}

	@Override
	public RenderType getRenderType(BallPitTowerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
