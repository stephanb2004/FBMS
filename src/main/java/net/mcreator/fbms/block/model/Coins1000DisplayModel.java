package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.Coins1000DisplayItem;

public class Coins1000DisplayModel extends GeoModel<Coins1000DisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(Coins1000DisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/coins_1000.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Coins1000DisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/coins_1000.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Coins1000DisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/new.png");
	}
}
