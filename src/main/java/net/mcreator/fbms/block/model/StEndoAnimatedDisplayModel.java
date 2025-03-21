package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.StEndoAnimatedDisplayItem;

public class StEndoAnimatedDisplayModel extends GeoModel<StEndoAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(StEndoAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/st_endo_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(StEndoAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/st_endo_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(StEndoAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/st_endo.png");
	}
}
