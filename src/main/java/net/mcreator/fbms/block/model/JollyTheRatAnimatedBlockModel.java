package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.JollyTheRatAnimatedTileEntity;

public class JollyTheRatAnimatedBlockModel extends AnimatedGeoModel<JollyTheRatAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(JollyTheRatAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/jolly_the_rat_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JollyTheRatAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/jolly_the_rat_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JollyTheRatAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/jolly_the_rat.png");
	}
}
