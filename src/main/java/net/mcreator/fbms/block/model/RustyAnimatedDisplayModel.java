package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RustyAnimatedDisplayItem;

public class RustyAnimatedDisplayModel extends AnimatedGeoModel<RustyAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RustyAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/rustya.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RustyAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/rustya.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RustyAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/rusty.png");
	}
}