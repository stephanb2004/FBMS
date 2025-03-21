package net.mcreator.fbms.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.fbms.block.model.BucketBobBlockModel;
import net.mcreator.fbms.block.entity.BucketBobTileEntity;

public class BucketBobTileRenderer extends GeoBlockRenderer<BucketBobTileEntity> {
	public BucketBobTileRenderer() {
		super(new BucketBobBlockModel());
	}

	@Override
	public RenderType getRenderType(BucketBobTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
