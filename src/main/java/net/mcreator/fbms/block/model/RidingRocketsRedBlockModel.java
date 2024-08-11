package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RidingRocketsRedTileEntity;

public class RidingRocketsRedBlockModel extends AnimatedGeoModel<RidingRocketsRedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RidingRocketsRedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/riding_rockets.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RidingRocketsRedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/riding_rockets.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RidingRocketsRedTileEntity entity) {
		return new ResourceLocation("fbms", "textures/blocks/riding_rocket_red.png");
	}
}
