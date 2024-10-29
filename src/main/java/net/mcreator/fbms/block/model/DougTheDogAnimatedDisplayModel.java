package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.DougTheDogAnimatedDisplayItem;

public class DougTheDogAnimatedDisplayModel extends AnimatedGeoModel<DougTheDogAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DougTheDogAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/dougthedog_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DougTheDogAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/dougthedog_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DougTheDogAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/dougthedog.png");
	}
}
