package net.mcreator.fbms.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.fbms.entity.DFreddyEntity;

public class DFreddyModel extends GeoModel<DFreddyEntity> {
	@Override
	public ResourceLocation getAnimationResource(DFreddyEntity entity) {
		return new ResourceLocation("fbms", "animations/gasfreddy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DFreddyEntity entity) {
		return new ResourceLocation("fbms", "geo/gasfreddy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DFreddyEntity entity) {
		return new ResourceLocation("fbms", "textures/entities/" + entity.getTexture() + ".png");
	}

}
