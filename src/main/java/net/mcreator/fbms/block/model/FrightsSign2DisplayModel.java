package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FrightsSign2DisplayItem;

public class FrightsSign2DisplayModel extends AnimatedGeoModel<FrightsSign2DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FrightsSign2DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/frights2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FrightsSign2DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/frights2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FrightsSign2DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/faz_bear_pizza_place.png");
	}
}
