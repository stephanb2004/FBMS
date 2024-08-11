package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.BalloonCartTileEntity;

public class BalloonCartBlockModel extends AnimatedGeoModel<BalloonCartTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BalloonCartTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/balloon_cart.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BalloonCartTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/balloon_cart.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BalloonCartTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/cart.png");
	}
}
