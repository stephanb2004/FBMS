package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.JollyTheRatAnimatedDisplayItem;

public class JollyTheRatAnimatedDisplayModel extends GeoModel<JollyTheRatAnimatedDisplayItem> {
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
		return new ResourceLocation("fbms", "textures/block/jolly_the_rat.png");
	}
}
