package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.Coins5DisplayItem;

public class Coins5DisplayModel extends AnimatedGeoModel<Coins5DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Coins5DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/coins_5.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Coins5DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/coins_5.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Coins5DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/new.png");
	}
}
