package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RockStarFreddyAnimatedDisplayItem;

public class RockStarFreddyAnimatedDisplayModel extends AnimatedGeoModel<RockStarFreddyAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RockStarFreddyAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/rfreddyanimatedv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarFreddyAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/rfreddyanimatedv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarFreddyAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/rockstarfreddyv2.png");
	}
}
