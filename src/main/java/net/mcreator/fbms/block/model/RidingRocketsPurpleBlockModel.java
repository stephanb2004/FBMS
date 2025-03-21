package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.entity.RidingRocketsPurpleTileEntity;

public class RidingRocketsPurpleBlockModel extends GeoModel<RidingRocketsPurpleTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(RidingRocketsPurpleTileEntity animatable) {
		return new ResourceLocation("fbms", "animations/riding_rockets.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RidingRocketsPurpleTileEntity animatable) {
		return new ResourceLocation("fbms", "geo/riding_rockets.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RidingRocketsPurpleTileEntity animatable) {
		return new ResourceLocation("fbms", "textures/block/riding_rocket_purple.png");
	}
}
