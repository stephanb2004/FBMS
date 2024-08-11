package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.GarfPlushDisplayItem;

public class GarfPlushDisplayModel extends AnimatedGeoModel<GarfPlushDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GarfPlushDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/garfield_plush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GarfPlushDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/garfield_plush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GarfPlushDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/thefuckingcatthatihate.png");
	}
}
