package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RockStarFoxyDisplayItem;

public class RockStarFoxyDisplayModel extends AnimatedGeoModel<RockStarFoxyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RockStarFoxyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/rfoxyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarFoxyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/rfoxyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarFoxyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/rfoxyv2.png");
	}
}
