package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.JollyTheRatDisplayItem;

public class JollyTheRatDisplayModel extends GeoModel<JollyTheRatDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(JollyTheRatDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/jolly_the_rat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(JollyTheRatDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/jolly_the_rat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(JollyTheRatDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/jolly_the_rat.png");
	}
}
