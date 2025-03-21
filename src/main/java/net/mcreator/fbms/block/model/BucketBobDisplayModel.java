package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BucketBobDisplayItem;

public class BucketBobDisplayModel extends GeoModel<BucketBobDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BucketBobDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/bucket_bob.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BucketBobDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/bucket_bob.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BucketBobDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/bucket_bob.png");
	}
}
