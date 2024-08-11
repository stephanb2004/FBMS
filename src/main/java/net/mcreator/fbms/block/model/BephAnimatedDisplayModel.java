package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BephAnimatedDisplayItem;

public class BephAnimatedDisplayModel extends AnimatedGeoModel<BephAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BephAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/beph.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BephAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/beph.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BephAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/beph.png");
	}
}
