package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RidingRocketsRedDisplayItem;

public class RidingRocketsRedDisplayModel extends AnimatedGeoModel<RidingRocketsRedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RidingRocketsRedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/riding_rockets.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RidingRocketsRedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/riding_rockets.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RidingRocketsRedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/riding_rocket_red.png");
	}
}
