package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RidingRocketsRedTileEntity;

public class RidingRocketsRedBlockModel extends GeoModel<RidingRocketsRedTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RidingRocketsRedTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/riding_rockets.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RidingRocketsRedTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/riding_rockets.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RidingRocketsRedTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/riding_rocket_red.png");
	}
}
