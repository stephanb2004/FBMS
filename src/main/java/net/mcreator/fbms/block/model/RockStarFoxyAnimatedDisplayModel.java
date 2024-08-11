package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RockStarFoxyAnimatedDisplayItem;

public class RockStarFoxyAnimatedDisplayModel extends AnimatedGeoModel<RockStarFoxyAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RockStarFoxyAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/rfoxyanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarFoxyAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/rfoxyanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarFoxyAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/rfoxyv2.png");
	}
}
