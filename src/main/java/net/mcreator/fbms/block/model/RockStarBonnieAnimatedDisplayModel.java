package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RockStarBonnieAnimatedDisplayItem;

public class RockStarBonnieAnimatedDisplayModel extends AnimatedGeoModel<RockStarBonnieAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RockStarBonnieAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/rbonniea.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarBonnieAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/rbonniea.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarBonnieAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/rbonnie.png");
	}
}
