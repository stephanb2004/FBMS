package net.mcreator.fbms.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.entity.DMangleEntity;

public class DMangleModel extends GeoModel<DMangleEntity> {
	@Override
	public ResourceLocation getAnimationResource(DMangleEntity entity) {
		return new ResourceLocation("fbms", "animations/dmangle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DMangleEntity entity) {
		return new ResourceLocation("fbms", "geo/dmangle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DMangleEntity entity) {
		return new ResourceLocation("fbms", "textures/entities/" + entity.getTexture() + ".png");
	}

}
