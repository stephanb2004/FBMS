package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.FrightsSignDisplayItem;

public class FrightsSignDisplayModel extends AnimatedGeoModel<FrightsSignDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(FrightsSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/frights2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FrightsSignDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/frights2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FrightsSignDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/frights.png");
	}
}
