package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.StEndoAnimatedDisplayItem;

public class StEndoAnimatedDisplayModel extends AnimatedGeoModel<StEndoAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StEndoAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/st_endo_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StEndoAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/st_endo_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StEndoAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/st_endo.png");
	}
}
