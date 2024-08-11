package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BucketBobTileEntity;

public class BucketBobBlockModel extends AnimatedGeoModel<BucketBobTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BucketBobTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/bucket_bob.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BucketBobTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/bucket_bob.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BucketBobTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/bucket_bob.png");
	}
}
