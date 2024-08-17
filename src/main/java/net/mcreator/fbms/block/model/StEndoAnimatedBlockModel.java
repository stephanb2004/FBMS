package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.StEndoAnimatedTileEntity;

public class StEndoAnimatedBlockModel extends AnimatedGeoModel<StEndoAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(StEndoAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/st_endo_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StEndoAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/st_endo_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StEndoAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/st_endo.png");
	}
}
