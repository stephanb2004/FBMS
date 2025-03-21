package net.mcreator.fbms.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.block.display.BuffetEndoDisplayItem;

public class BuffetEndoDisplayModel extends GeoModel<BuffetEndoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BuffetEndoDisplayItem animatable) {
		return new ResourceLocation("fbms", "animations/polar_endo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BuffetEndoDisplayItem animatable) {
		return new ResourceLocation("fbms", "geo/polar_endo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BuffetEndoDisplayItem entity) {
		return new ResourceLocation("fbms", "textures/block/polars_endo.png");
	}
}
