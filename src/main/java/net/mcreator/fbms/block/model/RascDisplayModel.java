package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RascDisplayItem;

public class RascDisplayModel extends AnimatedGeoModel<RascDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RascDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/rasc.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RascDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/rasc.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RascDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/rasc.png");
	}
}
