package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.GusThePugAnimatedDisplayItem;

public class GusThePugAnimatedDisplayModel extends GeoModel<GusThePugAnimatedDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(GusThePugAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/gus_the_pug_animated.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GusThePugAnimatedDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/gus_the_pug_animated.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GusThePugAnimatedDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/gus_the_pug.png");
	}
}
