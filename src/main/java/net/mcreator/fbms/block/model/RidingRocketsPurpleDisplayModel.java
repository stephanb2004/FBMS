package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RidingRocketsPurpleDisplayItem;

public class RidingRocketsPurpleDisplayModel extends AnimatedGeoModel<RidingRocketsPurpleDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RidingRocketsPurpleDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/riding_rockets.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RidingRocketsPurpleDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/riding_rockets.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RidingRocketsPurpleDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/riding_rocket_purple.png");
	}
}
