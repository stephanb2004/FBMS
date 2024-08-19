package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.Coins10000DisplayItem;

public class Coins10000DisplayModel extends AnimatedGeoModel<Coins10000DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Coins10000DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/coins_10000.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Coins10000DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/coins_10000.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Coins10000DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/coinbag.png");
	}
}
