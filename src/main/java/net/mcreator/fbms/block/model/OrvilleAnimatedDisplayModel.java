package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.OrvilleAnimatedDisplayItem;

public class OrvilleAnimatedDisplayModel extends AnimatedGeoModel<OrvilleAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(OrvilleAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/orvilleanimated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrvilleAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/orvilleanimated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrvilleAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/magicv2.png");
	}
}
