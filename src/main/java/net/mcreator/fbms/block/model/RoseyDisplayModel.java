package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RoseyDisplayItem;

public class RoseyDisplayModel extends AnimatedGeoModel<RoseyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RoseyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/rosey.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RoseyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/rosey.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RoseyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/rosey.png");
	}
}
