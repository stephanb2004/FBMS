package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RockStarFoxyAnimatedTileEntity;

public class RockStarFoxyAnimatedBlockModel extends AnimatedGeoModel<RockStarFoxyAnimatedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockStarFoxyAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/rfoxyanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarFoxyAnimatedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/rfoxyanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarFoxyAnimatedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/rfoxyv2.png");
	}
}
