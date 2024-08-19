package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.Coins100DisplayItem;

public class Coins100DisplayModel extends AnimatedGeoModel<Coins100DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Coins100DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/coins_100.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Coins100DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/coins_100.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Coins100DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/new.png");
	}
}
