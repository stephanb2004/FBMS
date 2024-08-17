package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.GtEndoAnimatedDisplayItem;

public class GtEndoAnimatedDisplayModel extends AnimatedGeoModel<GtEndoAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GtEndoAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/gtendo_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GtEndoAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/gtendo_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GtEndoAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/gt_endo.png");
	}
}
