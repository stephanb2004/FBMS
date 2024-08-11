package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.LeftyAnimatedDisplayItem;

public class LeftyAnimatedDisplayModel extends AnimatedGeoModel<LeftyAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(LeftyAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/leftyv2animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LeftyAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/leftyv2animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LeftyAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/leftyv2.png");
	}
}
