package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RockStarBonnieDisplayItem;

public class RockStarBonnieDisplayModel extends AnimatedGeoModel<RockStarBonnieDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RockStarBonnieDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/rbonnieblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarBonnieDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/rbonnieblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarBonnieDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/rbonnie.png");
	}
}
