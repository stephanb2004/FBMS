package net.mcreator.fbms.block.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.DuckPondDisplayItem;

public class DuckPondDisplayModel extends AnimatedGeoModel<DuckPondDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(DuckPondDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/duck_pond.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DuckPondDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/duck_pond.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DuckPondDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/blocks/helpysoffice.png");
	}
}