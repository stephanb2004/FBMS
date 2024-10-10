package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.JollyTheRatAnimatedDisplayItem;

public class JollyTheRatAnimatedDisplayModel extends AnimatedGeoModel<JollyTheRatAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(JollyTheRatAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/jolly_the_rat_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JollyTheRatAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/jolly_the_rat_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JollyTheRatAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/jolly_the_rat.png");
	}
}
