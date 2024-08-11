package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.HappYFrogAnimatedDisplayItem;

public class HappYFrogAnimatedDisplayModel extends AnimatedGeoModel<HappYFrogAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(HappYFrogAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/happyfroga.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(HappYFrogAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/happyfroga.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(HappYFrogAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/happyfrog.png");
	}
}
