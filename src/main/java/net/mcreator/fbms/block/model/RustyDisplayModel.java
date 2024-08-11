package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.RustyDisplayItem;

public class RustyDisplayModel extends AnimatedGeoModel<RustyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(RustyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/rustyblock.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RustyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/rustyblock.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RustyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/rusty.png");
	}
}
