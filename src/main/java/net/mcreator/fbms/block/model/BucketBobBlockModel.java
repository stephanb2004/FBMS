package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BucketBobTileEntity;

public class BucketBobBlockModel extends GeoModel<BucketBobTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BucketBobTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/bucket_bob.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BucketBobTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/bucket_bob.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BucketBobTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/bucket_bob.png");
	}
}
