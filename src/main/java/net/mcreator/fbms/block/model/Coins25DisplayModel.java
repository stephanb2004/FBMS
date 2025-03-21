package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.Coins25DisplayItem;

public class Coins25DisplayModel extends GeoModel<Coins25DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Coins25DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/coins_25.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Coins25DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/coins_25.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Coins25DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/new.png");
	}
}
