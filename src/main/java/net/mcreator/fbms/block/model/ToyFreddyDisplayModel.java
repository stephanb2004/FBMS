package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.ToyFreddyDisplayItem;

public class ToyFreddyDisplayModel extends AnimatedGeoModel<ToyFreddyDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ToyFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/toyfreddyv2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ToyFreddyDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/toyfreddyv2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ToyFreddyDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/toyfreddyv2.png");
	}
}
