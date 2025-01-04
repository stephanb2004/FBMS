package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RockStarFreddyDisplayItem;

public class RockStarFreddyDisplayModel extends AnimatedGeoModel<RockStarFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RockStarFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/rfreddyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockStarFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/rfreddyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockStarFreddyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/rockstar_freddy.png");
	}
}
